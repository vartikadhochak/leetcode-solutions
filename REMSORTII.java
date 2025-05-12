class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class REMSORTII {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            // Check if it's a duplicate
            if (head.next != null && head.val == head.next.val) {
                int duplicateVal = head.val;
                while (head != null && head.val == duplicateVal) {
                    head = head.next; // Skip all duplicates
                }
                prev.next = head; // Remove them
            } else {
                prev = head;
                head = head.next;
            }
        }

        return dummy.next;
    }

    // Helper to print list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Input: [1,2,3,3,4,4,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                      new ListNode(3, new ListNode(4, new ListNode(4,
                      new ListNode(5)))))));

        ListNode result = deleteDuplicates(head);
        System.out.print("Output: ");
        printList(result); // Expected: 1 -> 2 -> 5
    }
}
