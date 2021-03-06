package _0051_0100._090_Subsets_II;

import java.util.*;

/**
 * @author jacka
 * @version 1.0 on 5/29/2017.
 */
public final class SolutionI implements Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> res = new HashSet<>();
    res.add(new ArrayList<>());
    subsets(res, nums, 0);
    return new ArrayList<>(res);
  }

  private void subsets(Set<List<Integer>> result, int[] nums, int index) {
    if (index != nums.length) {
      Set<List<Integer>> newResult = new HashSet<>();
      for (List<Integer> child : result) {
        List<Integer> childCopy = new ArrayList<>(child);
        childCopy.add(nums[index]);
        newResult.add(childCopy);
      }
      result.addAll(newResult);
      subsets(result, nums, index + 1);
    }
  }
}
