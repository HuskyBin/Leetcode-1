package _0201_0250._202_Happy_Number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 8/5/2017.
 */
class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  void testIsHappy() throws Exception {
    assertTrue(solution.isHappy(19));
  }

  @Test
  void test887() throws Exception {
    assertFalse(solution.isHappy(887));
  }

}
