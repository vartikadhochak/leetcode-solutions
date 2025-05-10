class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemNthEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases (e.g., removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize two pointers starting at dummy
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move 'first' pointer n+1 steps ahead to create a gap of n nodes
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both pointers forward until 'first' reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // 'second' is now before the node to be deleted; skip it
        second.next = second.next.next;
        
        // Return the modified list
        return dummy.next;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Create sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2; // Remove 2nd node from end (which is 4)
        
        RemNthEnd solution = new RemNthEnd();
        
        System.out.print("Original list: ");
        solution.printList(head);
        
        ListNode newHead = solution.removeNthFromEnd(head, n);
        
        System.out.print("Modified list after removing " + n + "th node from end: ");
        solution.printList(newHead);
    }
}
