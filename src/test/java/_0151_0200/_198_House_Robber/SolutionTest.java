package _0151_0200._198_House_Robber;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 8/4/2017.
 */
class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  void testEmpty() {
    final int[] input = new int[]{};
    assertEquals(0, solution.rob(input));
  }

  @Test
  void testOne() {
    final int[] input = new int[]{1};
    assertEquals(1, solution.rob(input));
  }

  @Test
  void testTwo() {
    final int[] input = new int[]{1, 2};
    assertEquals(2, solution.rob(input));
  }


  @Test
  void testThree() {
    final int[] input = new int[]{1, 2, 3};
    assertEquals(4, solution.rob(input));
  }

  @Test
  void test131() {
    final int[] input = new int[]{1, 3, 1};
    assertEquals(3, solution.rob(input));
  }
}
