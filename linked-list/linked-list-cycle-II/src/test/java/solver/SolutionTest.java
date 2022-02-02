package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void detectCycleTest1() {
        ListNode node4 = new ListNode(-4, null);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(3, node2);
        node4.next = node2;

        AssertionsForInterfaceTypes.assertThat(solution.detectCycle(head)).isEqualTo(node2);
    }

    @Test
    public void detectCycleTest2() {
        ListNode node2 = new ListNode(2, null);
        ListNode head = new ListNode(1, node2);
        node2.next = head;

        AssertionsForInterfaceTypes.assertThat(solution.detectCycle(head)).isEqualTo(head);
    }

    @Test
    public void detectCycleTest4() {
        ListNode node2 = new ListNode(2, null);
        ListNode head = new ListNode(1, node2);

        AssertionsForInterfaceTypes.assertThat(solution.detectCycle(head)).isNull();
    }

    @Test
    public void detectCycleTest3() {
        ListNode head = new ListNode(1, null);
        AssertionsForInterfaceTypes.assertThat(solution.detectCycle(head)).isNull();
    }
}
