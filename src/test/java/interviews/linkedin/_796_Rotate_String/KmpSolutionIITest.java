package interviews.linkedin._796_Rotate_String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KmpSolutionIITest {
  private Solution solution;

  @BeforeEach
  void setup() {
    solution = new KmpSolutionII();
  }

  @Test
  void testEmpty() {
    final String A = "", B = "";
    assertTrue(solution.rotateString(A, B));
  }

  @Test
  void testOnlineCase1() {
    final String A = "abcde", B = "cdeab";
    assertTrue(solution.rotateString(A, B));
  }

  @Test
  void testOnlineCase2() {
    final String A = "abcde", B = "abced";
    assertFalse(solution.rotateString(A, B));
  }

  @Test
  void testOnlineCase3() {
    final String A = "vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg",
        B = "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf";
    assertTrue(solution.rotateString(A, B));
  }

  // test of getNext()
  @Test
  void testGetNextAbcabcd() {
    final String pattern = "abcabcd";
    final int[] next = KmpSolutionII.getNext(pattern),
        expected = {-1, 0, 0, 0, 1, 2, 3};
    assertArrayEquals(expected, next);
  }

}