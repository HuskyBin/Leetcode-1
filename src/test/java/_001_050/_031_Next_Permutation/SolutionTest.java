package _001_050._031_Next_Permutation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jacka
 * @version 1.0 on 1/31/2017.
 */
public class SolutionTest {
  private Solution solution;
  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testWithRegularElement() throws Exception {
    final int[] input = new int[] {1, 4, 6, 5, 3, 2};
    solution.nextPermutation(input);
    final int[] result = new int[] {1, 5, 2, 3, 4, 6};
    assertArrayEquals(result, input);
  }

  @Test
  public void testWithDuplicatedElement() throws Exception {
    final int[] input = new int[] {1, 5, 1};
    solution.nextPermutation(input);
    final int[] result = new int[] {5, 1, 1};
    assertArrayEquals(result, input);
  }

}