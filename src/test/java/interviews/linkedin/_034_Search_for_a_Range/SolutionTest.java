package interviews.linkedin._034_Search_for_a_Range;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jacka
 * @version 1.0 on 10/16/2017.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testOnlineCase() throws Exception {
    final int[] input = {2, 2};
    assertArrayEquals(new int[] {0, 1}, solution.searchRange(input, 2));
  }

  @Test
  public void testFailedCase() throws Exception {
    final int[] input = {1};
    assertArrayEquals(new int[] {0, 0}, solution.searchRange(input, 1));
  }
}
