package interviews.linkedin._160_Intersection_of_Two_Linked_Lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.ListNode;
import utils.ListNodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  void testOnlineCase() {
    ListNode headA = ListNodes.getListOfNodes(new int[]{1, 2, 3, 4, 5});
    ListNode headB = ListNodes.getListOfNodes(new int[]{-1, -2, -3});
    headB.next.next.next = headA.next.next;
    assertEquals(headA.next.next, solution.getIntersectionNode(headA, headB));
  }

}