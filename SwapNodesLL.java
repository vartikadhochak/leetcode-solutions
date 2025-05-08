public class SwapNodesLL {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode current = head;
        
        // Step 1: count total nodes
        while (current != null) {
            n++;
            current = current.next;
        }
        
        // Step 2: find k-th node from start
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        // Step 3: find k-th node from end
        ListNode second = head;
        for (int i = 1; i < n - k + 1; i++) {
            second = second.next;
        }
        
        // Step 4: swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Helper function to create linked list from array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Example 1: head = [1,2,3,4,5], k = 2
        int[] values = {1, 2, 3, 4, 5};
        int k = 2;
        
        ListNode head = createList(values);
        System.out.print("Original List: ");
        printList(head);
        
        head = swapNodes(head, k);
        
        System.out.print("After Swapping: ");
        printList(head);
    }
}
