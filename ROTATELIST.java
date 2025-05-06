// ROTATELIST.java

public class ROTATELIST {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Compute the length of the list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Make it a circular list
        tail.next = head;

        // Step 3: Find the new tail: (length - k % length - 1)th node
        // and the new head: (length - k % length)th node
        int rotations = k % length;
        int stepsToNewTail = length - rotations;
        ListNode newTail = tail;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        // Step 4: Break the circle
        newTail.next = null;

        return newHead;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ROTATELIST solution = new ROTATELIST();

        // Create a linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        solution.printList(head);

        // Rotate the list by 2
        ListNode rotatedHead = solution.rotateRight(head, 2);

        System.out.println("List after rotating by 2:");
        solution.printList(rotatedHead);

        // Rotate the list by 4
        rotatedHead = solution.rotateRight(rotatedHead, 4);

        System.out.println("List after rotating by 4:");
        solution.printList(rotatedHead);
    }
}
