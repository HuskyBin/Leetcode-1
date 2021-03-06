package interviews.linkedin._015_3Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  private static final int[] ARRAY_1 = new int[]{1, 2, 3, 4, 5};
  private static final int[] ARRAY_2 = new int[]{-4, -1, -1, 0, 1, 2};
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void threeSum() throws Exception {
    final List<List<Integer>> expected = List.of(
        List.of(-1, 0, 1),
        List.of(-1, -1, 2)
    );
    final List<List<Integer>> actual = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    assertEquals(expected.size(), actual.size());
    assertEquals(new HashSet<>(expected), new HashSet<>(actual));
  }

  @Test
  void threeSumWithDipAnsSymmetric() throws Exception {
    List<List<Integer>> sampleAnswer = new ArrayList<>();
    sampleAnswer.add(Arrays.asList(-4, 2, 2));
    sampleAnswer.add(Arrays.asList(-2, -2, 4));
    sampleAnswer.add(Arrays.asList(-1, -1, 2));
    sampleAnswer.add(Arrays.asList(-2, 1, 1));
    sampleAnswer.add(Arrays.asList(-2, 0, 2));
    sampleAnswer.add(Arrays.asList(-1, 0, 1));
    sampleAnswer.add(Arrays.asList(-4, 0, 4));
    assertEquals(
        new HashSet<>(sampleAnswer),
        new HashSet<>(solution.threeSum(new int[]{-4, -2, -2, -1, -1, 0, 1, 1, 2, 2, 4}))
    );
  }
}