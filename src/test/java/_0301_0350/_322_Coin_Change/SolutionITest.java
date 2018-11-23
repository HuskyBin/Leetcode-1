package _0301_0350._322_Coin_Change;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 9/25/2017.
 */
class SolutionITest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new SolutionI();
  }

  @Test
  void testOnlineCase1() throws Exception {
    final int[] coins = {1, 2, 5};
    assertEquals(3, solution.coinChange(coins, 11));
  }

  @Test
  void testOnlineCase2() throws Exception {
    final int[] coins = {2};
    assertEquals(-1, solution.coinChange(coins, 3));
  }

}
