package _0451_0500._465_Optimal_Account_Balancing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void testOnlineCase1() throws Exception {
    final int[][] trans = {{0, 1, 10}, {2, 0, 5}};
    assertEquals(2, solution.minTransfers(trans));
  }

  @Test
  void testOnlineCase2() throws Exception {
    final int[][] trans = {{0, 1, 10}, {1, 0, 1}, {1, 2, 5}, {2, 0, 5}};
    assertEquals(1, solution.minTransfers(trans));
  }

  @Test
  void testDfs() throws Exception {
    final List<Integer> debt = new ArrayList<>(List.of(5, 4, 3, -10, -2));
    assertEquals(4, solution.dfs(debt, 0, 0));

  }

  @Test
  void testFailedCase1() throws Exception {
    final int[][] trans = {{2, 0, 5}, {3, 4, 4}};
    assertEquals(2, solution.minTransfers(trans));
  }

}