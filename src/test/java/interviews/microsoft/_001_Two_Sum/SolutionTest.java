package interviews.microsoft._001_Two_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  private static final int[] TWO_ELEMS = new int[]{1, 2};
  private static final int[] WEB_REF = new int[]{2, 7, 11, 15};
  private static final int[] THREE_ELEM = new int[]{3, 2, 4};

  @Test
  void twoSumWithTwoElems() throws Exception {
    assertArrayEquals(new int[]{0, 1}, new Solution().twoSum(TWO_ELEMS, 3));
  }

  @Test
  void twoSumWithWebRef() throws Exception {
    assertArrayEquals(new int[]{0, 1}, new Solution().twoSum(WEB_REF, 9));
  }

  @Test
  void twoSumWithThreeElems() throws Exception {
    assertArrayEquals(new int[]{1, 2}, new Solution().twoSum(THREE_ELEM, 6));
  }
}