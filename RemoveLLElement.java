class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveLLElement {

    // Function to remove all occurrences of val from the linked list
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node before the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Use a current pointer to traverse
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with value == val
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        
        // Return the new head (might have changed)
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Print the original list
        System.out.print("Original list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // Remove elements with value 6
        RemoveLLElement solution = new RemoveLLElement();
        head = solution.removeElements(head, 6);

        // Print the modified list
        System.out.print("Modified list: ");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
