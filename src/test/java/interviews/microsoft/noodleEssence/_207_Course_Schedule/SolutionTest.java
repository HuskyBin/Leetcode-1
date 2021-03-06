package interviews.microsoft.noodleEssence._207_Course_Schedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void testPossible() throws Exception {
    assertTrue(solution.canFinish(2, new int[][]{{1, 0}}));
  }

  @Test
  void testImpossible() throws Exception {
    assertFalse(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
  }

}