class DelMiddle {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: only one node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            prev = slow;        // store the node before slow
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        prev.next = slow.next;

        return head;
    }

    // Helper function to print the list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DelMiddle solution = new DelMiddle();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        solution.printList(head);

        // Deleting the middle node
        head = solution.deleteMiddle(head);

        System.out.println("List after deleting middle node:");
        solution.printList(head);
    }
}
