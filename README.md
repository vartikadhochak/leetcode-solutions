Day-1:
PROBLEM: REVERSE LINKED LIST
Given the head of a singly linked list, reverse the list, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

Explanation:
reverseList → Iteratively reverses the linked list by changing each node’s next pointer to point backward.
printList → Prints all node values in order.
main → Builds a sample list 1 → 2 → 3 → 4 → 5, prints it, reverses it, and prints the reversed list.

PROBLEM 2: MISSING NUMBER
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2

Example 2:
Input: nums = [0,1]
Output: 2

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique

Explanation:
missingNumber → Calculates the expected sum (0 to n) and subtracts the actual sum to find the missing number.
main → Tests the method with an example array and prints the result.

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


Problem 3:A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false
 
Constraints:
1 <= n <= 231 - 1

Explanation:
The common approach is to use a HashSet to keep track of numbers we’ve already seen.
If we ever see the same number again, we are in a loop.
1.HashSet seen: Keeps track of numbers we’ve already processed.
2.Loop condition: Continue until we hit 1 or detect a repeat.
3.getNext helper: Computes the sum of the squares of the digits.

Problem 4:Given the head of a linked list and an integer val, remove all the nodes of the linked list that has 
Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Constraints:
The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50

Explanation:
ListNode Class: Defines a simple linked list node with an integer value (val) and a reference to the next node (next).
removeElements Method: This method removes all nodes with the given value val from the linked list.
main Method:
A linked list 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 is created.
The original list is printed.
The removeElements method is called to remove all nodes with the value 6.
The modified list is printed, showing the result after the removal.