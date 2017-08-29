package _251_300._267_Palindrome_Permutation_II;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 8/29/2017.
 */
public class SolutionTest {
  private Solution solution;
  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testEvenDup() throws Exception {
    final String s = "aabb";
    final Set<String> expected = new HashSet<>();
    expected.add("abba");
    expected.add("baab");
    final List<String> actual = solution.generatePalindromes(s);
    assertEquals(expected.size(), actual.size());
    assertEquals(expected, new HashSet<>(actual));
  }
  @Test
  public void testOddDup() throws Exception {
    final String s = "aaabaaa";
    final Set<String> expected = new HashSet<>();
    expected.add("aaabaaa");
    final List<String> actual = solution.generatePalindromes(s);
    assertEquals(expected.size(), actual.size());
    assertEquals(expected, new HashSet<>(actual));
  }

}
