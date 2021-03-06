package interviews.microsoft._001_Two_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionITest {
  private static final int[] TWO_ELEMS = new int[]{1, 2};
  private static final int[] WEB_REF = new int[]{2, 7, 11, 15};
  private static final int[] THREE_ELEM = new int[]{3, 2, 4};

  @Test
  void twoSumWithTwoElems() {
    assertArrayEquals(new int[]{0, 1}, new SolutionI().twoSum(TWO_ELEMS, 3));
  }

  @Test
  void twoSumWithWebRef() {
    assertArrayEquals(new int[]{0, 1}, new SolutionI().twoSum(WEB_REF, 9));
  }

  @Test
  void twoSumWithThreeElems() {
    assertArrayEquals(new int[]{1, 2}, new SolutionI().twoSum(THREE_ELEM, 6));
  }
}