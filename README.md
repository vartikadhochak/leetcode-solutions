Problem 1: Palindrome Linked List
Problem Statement:Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward

Example:
Input:head = [1,2,2,1]
Output:true

Input:head = [1,2]
Output:false

Constraints:
The number of nodes in the list is in the range [1, 10^5].
0 <= Node.val <= 9.

Solution Explanation:
Fast & Slow Pointer: We use two pointers: one that moves at double the speed (fast pointer) to find the middle of the list, and another that moves one step at a time (slow pointer).
Reversal of the Second Half: After finding the middle, we reverse the second half of the linked list.
Comparison: We then compare the nodes in the first half with the nodes in the reversed second half.
Time Complexity: O(n), where n is the number of nodes in the list. We traverse the list once to find the middle, reverse the second half, and then compare both halves.
Space Complexity: O(1), as we only use a few pointers to solve the problem, no extra space is needed.

Problem 2: Perfect Square
Problem Statement:
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of some other integer.

Example:
Input:num = 16
Output:true

Input:num = 14
Output:false

Constraints:1 <= num <= 2^31 - 1.

Solution Explanation:
Binary Search: We use binary search to efficiently check if the integer square root of num exists. We perform the search between 2 and num / 2, as the square root of a number is always less than or equal to num / 2 for numbers greater than 1.
Square Comparison: At each step, we calculate the square of the mid-point and compare it with num. If the square equals num, it's a perfect square. If not, we adjust the search range based on whether the square is too small or too large.

Time Complexity: O(log n), where n is the input number. Binary search reduces the search space by half at each step.
Space Complexity: O(1), as we only use a constant amount of space for the algorithm (pointers and variable)
