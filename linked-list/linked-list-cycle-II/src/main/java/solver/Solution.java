package solver;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        fast = fast.next;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}