package _0701_0750._714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setup() {
    solution = new Solution();
  }

  @Test
  void testOnlineCase1() {
    final int[] prices = {1, 3, 2, 8, 4, 9};
    assertEquals(8, solution.maxProfit(prices, 2));
  }

}