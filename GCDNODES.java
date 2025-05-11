public class GCDNODES {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Method to insert GCD nodes between adjacent nodes
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);
            ListNode gcdNode = new ListNode(gcdValue);
            gcdNode.next = current.next;
            current.next = gcdNode;
            current = gcdNode.next;
        }

        return head;
    }

    // Euclidean algorithm to calculate GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    // Helper to build a linked list from an array
    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] input = {18, 6, 10, 3};
        ListNode head = buildList(input);

        System.out.println("Original List:");
        printList(head);

        head = insertGreatestCommonDivisors(head);

        System.out.println("Modified List with GCD nodes:");
        printList(head);
    }
}
