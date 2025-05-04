public class PalindromeLinkedList {

    // ListNode class to define the linked list structure
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    // Method to check if a linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // A single node is a palindrome
        
        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, current = slow;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a test case: 1 -> 2 -> 2 -> 1 (Palindrome)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        
        PalindromeLinkedList solution = new PalindromeLinkedList();
        boolean result = solution.isPalindrome(head);
        
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
