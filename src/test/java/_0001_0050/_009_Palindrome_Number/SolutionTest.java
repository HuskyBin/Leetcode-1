package _0001_0050._009_Palindrome_Number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 2017/1/13.
 */
class SolutionTest {

  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void testMinValue() throws Exception {
    assertFalse(solution.isPalindrome(Integer.MIN_VALUE));
  }

  @Test
  void testMaxValue() throws Exception {
    assertFalse(solution.isPalindrome(Integer.MAX_VALUE));
  }

  @Test
  void testZero() throws Exception {
    assertTrue(solution.isPalindrome(0));
  }

  @Test
  void testSingleDigit() throws Exception {
    assertTrue(solution.isPalindrome(1));
  }

  @Test
  void testTwoDigits() throws Exception {
    assertTrue(solution.isPalindrome(11));
  }

  @Test
  void testThreeDigits() throws Exception {
    assertTrue(solution.isPalindrome(121));
  }

  @Test
  void testFourDigits() throws Exception {
    assertTrue(solution.isPalindrome(1221));
  }
}