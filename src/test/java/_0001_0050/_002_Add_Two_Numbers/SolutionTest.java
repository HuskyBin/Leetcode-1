package _0001_0050._002_Add_Two_Numbers;

import org.junit.Test;
import utils.ListNode;
import utils.ListNodes;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 2017/1/7.
 */
public class SolutionTest {

  private static final ListNode NUM_432 = ListNodes.getListOfNodes(new int[]{2, 3, 4});

  private static final ListNode NUM_768 = ListNodes.getListOfNodes(new int[]{8, 6, 7});

  private static final ListNode NUM_38 = ListNodes.getListOfNodes(new int[]{8, 3});

  @Test
  public void addTwoNumbers() throws Exception {
    Solution solution = new Solution();
    assertEquals(ListNodes.getListOfNodes(new int[]{0, 0, 2, 1}),
        solution.addTwoNumbers(NUM_432, NUM_768));
    assertEquals(ListNodes.getListOfNodes(new int[]{0, 7, 4}),
        solution.addTwoNumbers(NUM_432, NUM_38));

  }

}
