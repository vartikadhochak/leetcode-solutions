// LLCycle.java

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LLCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // reached end, no cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true; // slow and fast met, cycle exists
    }

    public static void main(String[] args) {
        LLCycle solution = new LLCycle();

        // Create list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: link -4 back to node 2
        head.next.next.next.next = head.next;

        boolean hasCycle = solution.hasCycle(head);

        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does NOT have a cycle.");
        }
    }
}
