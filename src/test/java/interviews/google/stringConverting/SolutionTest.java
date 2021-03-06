package interviews.google.stringConverting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 1/11/2018.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testOnline1() throws Exception {
    final int num = 123;
    final String pattern = "012X456789";
    assertEquals("12X", solution.stringConvert(num, pattern));
  }

  @Test
  public void testOnline2() throws Exception {
    final int num = 255;
    final String pattern = "0123456789ABCDEF";
    assertEquals("FF", solution.stringConvert(num, pattern));
  }

  @Test
  public void testOnline3() throws Exception {
    final int num = 7;
    final String pattern = "01";
    assertEquals("111", solution.stringConvert(num, pattern));
  }

  @Test
  public void testOnline4() throws Exception {
    final int num = 7;
    final String pattern = "AB";
    assertEquals("BBB", solution.stringConvert(num, pattern));
  }
}
