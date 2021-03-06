package _0301_0350._324_Wiggle_Sort_II;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 9/3/2017.
 */
class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void testFailedCase() throws Exception {
    final int[] input = {1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2};
    solution.wiggleSort(input);
    assertTrue(isValidWiggle(input));
  }

  @Test
  void testFailedCase2() throws Exception {
    final int[] input = {1};
    solution.wiggleSort(input);
    assertTrue(isValidWiggle(input));
  }

  @Test
  void testFailedCase3() throws Exception {
    final int[] input = {4, 5, 5, 6};
    solution.wiggleSort(input);
    assertTrue(isValidWiggle(input));
  }

  private boolean isValidWiggle(int[] nums) {
    for (int i = 1; i < nums.length; i += 2) {
      if (nums[i] <= nums[i - 1] || (i + 1 < nums.length && nums[i] <= nums[i + 1])) {
        System.out.println(Arrays.toString(nums));
        return false;
      }
    }
    return true;
  }
}
