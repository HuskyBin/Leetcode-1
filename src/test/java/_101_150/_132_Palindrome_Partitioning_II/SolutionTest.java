package _101_150._132_Palindrome_Partitioning_II;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 7/3/2017.
 */
public class SolutionTest {
  private Solution solution;
  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testaab() throws Exception {
    final String s = "aab";
    assertEquals(1, solution.minCut(s));
  }

  @Test
  public void testbb() throws Exception {
    final String s = "bb";
    assertEquals(0, solution.minCut(s));
  }

  @Test
  public void testEmpty() throws Exception {
    final String s = "";
    assertEquals(0, solution.minCut(s));
  }
}