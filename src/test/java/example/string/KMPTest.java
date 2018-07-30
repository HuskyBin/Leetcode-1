package example.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KMPTest {

  private KMP solution;

  @BeforeEach
  void setup() {
    solution = new KMP();
  }

  // ----- test of substring -------------------
  @Test
  void testSubstring1() {
    final String haystack = "hello", needle = "ll";
    assertEquals(2, solution.substring(haystack, needle));
  }

  @Test
  void testSubstring2() {
    final String haystack = "aaaaa", needle = "bba";
    assertEquals(-1, solution.substring(haystack, needle));
  }

  // ----- getNext(final String pattern) --------
  @Test
  void testGetNext1() {
    final String p = "ABCDABD";
    final int[] expected = {-1, 0, 0, 0, 0, 1, 2};
    final int[] actual = KMP.getNext(p);
//    System.out.println(Arrays.toString(actual));
    assertArrayEquals(expected, actual);
  }

  @Test
  void testGetNext2() {
    final String p = "ABCDABCDABD";
    final int[] expected = {-1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6};
    final int[] actual = KMP.getNext(p);
//    System.out.println(Arrays.toString(actual));
    assertArrayEquals(expected, actual);
  }

  @Test
  void testGetNext3() {
    final String p = "";
    final int[] expected = {};
    final int[] actual = KMP.getNext(p);
//    System.out.println(Arrays.toString(actual));
    assertArrayEquals(expected, actual);
  }

}