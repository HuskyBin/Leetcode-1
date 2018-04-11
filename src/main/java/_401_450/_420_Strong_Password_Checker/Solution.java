package _401_450._420_Strong_Password_Checker;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  /**
   * A password is considered strong if below conditions are all met:
   * It has at least 6 characters and at most 20 characters.
   * It must contain at least one lowercase letter, at least one uppercase letter, and at least one digit.
   * It must NOT contain three repeating characters in a row ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
   * Write a function strongPasswordChecker(s), that takes a string s as input, and return the MINIMUM change required to make s a strong password. If s is already strong, return 0.
   *
   * @param s
   * @return
   */
  public int strongPasswordChecker(String s) {
    final char[] sChars = s.toCharArray();

    final List<List<Integer>> repetitionCount = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      repetitionCount.add(new ArrayList<>());
    }

    final int l = s.length();
    int toAdd = Math.max(6 - l, 0), toDelete = Math.max(l - 20, 0), actualAdd = 0, actualDelete = 0, actualReplace = 0,
        needUpper = 1, needLower = 1, needDigit = 1;

    // step 1: Do repetition counts
    for (int start = 0; start < sChars.length; ) {
      int end = start;
      while (end < sChars.length && sChars[end] == sChars[start]) {
        end++;
      }
      start = end;
      final int len = end - start;
      if (len >= 3) {
        repetitionCount.get(len % 3).add(len);
      }
      if (Character.isDigit(sChars[start])) {
        needDigit = 0;
      } else if (Character.isLowerCase(sChars[start])) {
        needLower = 0;
      } else if (Character.isUpperCase(sChars[start])) {
        needUpper = 0;
      }
    }

    // debug only
    System.out.println(repetitionCount);


    for (int i = 0; i < repetitionCount.size(); i++) {
      final List<Integer> repetition = repetitionCount.get(i);
      for (int j = 0; j < repetition.size(); j++) {
        int countOfJ = repetition.get(j);
        if (i < 2) {
          if (actualAdd < toAdd) {
            actualAdd++;
            countOfJ -= (i + 1);
          }

          if (actualDelete < toDelete) {
            actualDelete += i + 1;
            countOfJ -= (i + 1);
          }
        }
        actualReplace += countOfJ / 3;
      }
    }

    if (toDelete > actualDelete) {
      actualReplace += Math.max(0, actualReplace - (toDelete - actualDelete) / 3);
    } else {
      // todo: add more example here
      actualReplace += actualDelete - toDelete; // it can only add 1 or 2
    }
    // https://leetcode.com/problems/strong-password-checker/discuss/91004/Java-O(n)-Greedy-solution-with-super-clear-explanation
    return 0;
  }


}
