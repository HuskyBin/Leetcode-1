package _001_050._047_Permutations_II;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhiwei.xin
 * @version 1.0 on 2/26/17.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testWithUnique() throws Exception {
    final List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 2, 3));
    expected.add(Arrays.asList(1, 3, 2));
    expected.add(Arrays.asList(2, 1, 3));
    expected.add(Arrays.asList(2, 3, 1));
    expected.add(Arrays.asList(3, 1, 2));
    expected.add(Arrays.asList(3, 2, 1));

    final List<List<Integer>> actual = solution.permuteUnique(new int[] {1, 2, 3});

    System.out.println(actual);
//    assertEquals(expected.size(), actual.size());

//    assertEquals(new HashSet<>(expected), new HashSet<>(actual));
  }

}