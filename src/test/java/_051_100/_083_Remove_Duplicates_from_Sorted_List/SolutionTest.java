package _051_100._083_Remove_Duplicates_from_Sorted_List;

import org.junit.Before;
import org.junit.Test;

import utils.ListNode;
import utils.Util;

import static org.junit.Assert.assertEquals;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 5/19/2017.
 */
public class SolutionTest {
  private Solution solution;
  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testNoDup() throws Exception {
    final int[] input = new int[] {1, 2, 3, 4, 5};
    final ListNode head = Util.getListOfNodes(input);
    final ListNode expected = Util.getListOfNodes(input);
    assertEquals(expected, solution.deleteDuplicates(head));
  }

  @Test
  public void testLeadingDup() throws Exception {
    final int[] input = new int[] {1, 1, 1, 2, 3};
    final ListNode head = Util.getListOfNodes(input);
    final ListNode expected = Util.getListOfNodes(new int[] {1, 2, 3});
    assertEquals(expected, solution.deleteDuplicates(head));
  }

  @Test
  public void testTailingDup() throws Exception {
    final int[] input = new int[] {1, 2, 3, 3, 3};
    final ListNode head = Util.getListOfNodes(input);
    final ListNode expected = Util.getListOfNodes(new int[] {1, 2, 3});
    assertEquals(expected, solution.deleteDuplicates(head));
  }

  @Test
  public void testContiousDup () throws Exception {
    final int[] input = new int[] {2, 2, 3, 3};
    final ListNode head = Util.getListOfNodes(input);
    final ListNode actual = solution.deleteDuplicates(head);
    assertEquals(Util.getListOfNodes(new int[] {2, 3}), solution.deleteDuplicates(head));
  }
}
