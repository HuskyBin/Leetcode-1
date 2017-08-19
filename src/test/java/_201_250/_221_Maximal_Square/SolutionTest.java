package _201_250._221_Maximal_Square;

import org.junit.Before;
import org.junit.Test;

import utils.TwoDimensionArray;

import static org.junit.Assert.*;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 8/15/2017.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testOnlineCase() throws Exception {
    final char[][] board = TwoDimensionArray.getCharBoard(new String[] {
      "10100", "10111", "11111", "10010"
    });

    assertEquals(4, solution.maximalSquare(board));
  }
}
