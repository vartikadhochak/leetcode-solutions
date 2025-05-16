---------------------------------------------------------Day-1-----------------------------------------------------------

                                                PROBLEM 1: REVERSE LINKED LIST

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

---------------------------------------------------------Day-2------------------------------------------------------------

                                        PROBLEM 1: MIDDLE OF THE LINKED LIST

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]

Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

Explanation:
mergeTwoLists → Merges two sorted linked lists into one sorted list.
main → Builds two sample sorted lists, merges them, and prints the result.

                                            PROBLEM 2: ADD DIGITS

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1

EXPLANATION:
addDigits → Repeatedly sums the digits of num until a single-digit number is left.
main → Tests the method with an example (38) and prints the result.

---------------------------------------------------------Day-3-----------------------------------------------------------

                                            PROBLEM 1: MERGE TWO SORTED LISTS

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:  
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

EXPLANATION:
mergeTwoLists → Merges two sorted linked lists into one sorted list using a dummy node.
main → Builds two example lists, merges them, and prints the result.

                                                PROBLEM 2: PERFECT NUMBER

A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true

Example 2:
Input: num = 7
Output: false

Constraints:
1 <= num <= 108

EXPLANATION:
checkPerfectNumber → Checks if a number equals the sum of its proper divisors (excluding itself).
main → Tests the method with an example (28) and prints whether it’s a perfect number.

---------------------------------------------------------Day-4-----------------------------------------------------------

                                            PROBLEM 1: LINKED LIST CYCLE

Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true

Example 2:
Input: head = [1,2], pos = 0
Output: true

Constraints:
The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

EXPLANATION:
hasCycle → Uses Floyd’s Tortoise and Hare (slow/fast pointers) to detect if the linked list has a cycle.
main → Builds a list with a cycle (links last node back to an earlier node) and checks if the method correctly detects it.

                                            PROBLEM 2: PALINDROME NUMBER

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false

Constraints:
-231 <= x <= 231 - 1

EXPLANATION:
isPalindrome → Reverses half of the number and compares it to the other half to check for a palindrome.
main → Tests the method with an example (121) and prints whether it’s a palindrome.

---------------------------------------------------------Day-5-----------------------------------------------------------

                                        PROBLEM 1: Palindrome Linked List

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

                                            Problem 2: VALID PERFECT SQUARE

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

---------------------------------------------------------Day-6-----------------------------------------------------------

                                                PROBLEM 3: HAPPY NUMBER

A happy number is a number defined by the following process:
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

                                    Problem 4: REMOVE LINKED LIST ELEMENT

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
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

---------------------------------------------------------Day-7-----------------------------------------------------------

                                                PROBLEM 1: ROTATE LIST

Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 \* 109

EXPLANATION:
1.rotateRight: The core function that rotates the list right by k positions.
2.printList: A helper method to print the linked list for visual verification.
3.main: Creates a sample linked list [1, 2, 3, 4, 5], rotates it by 2 and then by 4, printing the results after each rotation.

                                                PROBLEM 2: PLUS ONE

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

EXPLANATION:
1.plusOne → Adds one to the array, handling carry-over properly; if needed, it creates a new array when all digits are 9.
2.main → Runs example cases and prints both input and output arrays.

---------------------------------------------------------Day-8-----------------------------------------------------------

                                           PROBLEM 1: ODD EVEN LINKED LIST

Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Example 1:  
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:  
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

Constraints:
The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106

EXPLANATION:
odd and even are pointers to traverse the odd and even nodes respectively.
evenHead is stored to reconnect the end of the odd list to the beginning of the even list.
The loop updates odd and even to skip nodes appropriately.
After traversal, we reconnect the odd list to the even list.

                                       PROBLEM 2:EXCEL SHEET COLUMN NUMBER

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28

Example 1:
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].

EXPLANATION:
For "AB":
'A' → 1 → 1 \* 26 = 26
'B' → 2 → 26 + 2 = 28

---------------------------------------------------------Day-9-----------------------------------------------------------

                                    PROBLEM 1: SWAPPING NODES IN A LINKED LIST

You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Constraints:
The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100

EXPLANATION:
Traverse once to get length n.
Traverse again to find first and second.
Swap their values.
This works in O(n) time and O(1) space → optimal.

                                       PROBLEM 2: Nth DIGIT

Given an integer n, return the nth digit of the infinite integer sequence [1, 2,3, 4, 5, 6, 7, 8, 9, 10, 11, ...].

Example 1:
Input: n = 3
Output: 3

Example 2:
Input: n = 11
Output: 0

Constraints:
1 <= n <= 231 - 1

EXPLANATION:
1.Find the digit length (d) where the n-th digit lies.We subtract the counts until n fits into a digit length.

2.Find the actual number where the digit is located.Once we know the digit length d,
The starting number = start = 10^(d - 1)
Offset index = index = (n - 1) / d
Actual number = start + index

3.Find the digit inside the number.We can convert the number to a string and pick the digit:
digit index = (n - 1) % d

---------------------------------------------------------Day-10-----------------------------------------------------------

                                              PROBLEM 1: DELETE MIDDLE NODE

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.  
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

Example 1:
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]

Example 2:
Input: head = [1,2,3,4]
Output: [1,2,4]

Constraints:
The number of nodes in the list is in the range [1, 10^5].
1 <= Node.val <= 10^5

EXPLANATION:
We want to delete the middle node from the linked list.We can find the middle node using the slow and fast pointer technique:
slow moves 1 step at a time.
fast moves 2 steps at a time.
When fast reaches the end, slow will be at the middle.
Once we find the middle node, we need to remove it by adjusting the next pointer of the previous node.

For input [1,3,4,7,1,2,6], slow will point at 7 at the end of the loop.
prev will point at 4.
We skip the middle node: prev.next = slow.next → link 4 to 1.

                                       PROBLEM 2: BULB SWITCHER

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
Return the number of bulbs that are on after n rounds.

Example 1:
Input: n = 3
Output: 1

Example 2:
Input: n = 0
Output: 0

Constraints:
0 <= n <= 10^9

EXPLANATION:
Each bulb is toggled once for every factor (divisor) of its position.
_ Most numbers have an even number of factors(divisors come in pairs),so bulbs will end up being toggled an even number of times → off.
_ Only perfect squares have an odd number of factors,so only bulbs in perfect square positions remain on. \* The number of bulbs that remain on is equal to the number of perfect squares less than or equal to n → that is integer part of sqrt(n).

---------------------------------------------------------Day-11-----------------------------------------------------------

                                   PROBLEM 1:remove-nth-node-from-end-of-list

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

EXPLANATION:
We use a dummy node to handle edge cases easily (like removing the head node).
We use two pointers (first and second) to create a gap of n nodes.
Once first reaches the end, second will be just before the node we want to remove.
We adjust second.next to skip the target node.

                                       PROBLEM 2: FACTORIAL TRAILING ZEROES

Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n _ (n - 1) _ (n - 2) _ ... _ 3 _ 2 _ 1.

Example 1:
Input: n = 3
Output: 0

Example 2:
Input: n = 5
Output: 1

Constraints:
0 <= n <= 10^4

EXPLANATION:
Trailing zeroes in a factorial come from factors of 10.
Each 10 is formed by a pair of 2 and 5.
Since there are always more 2’s than 5’s, the number of 5’s determines the number of trailing zeroes.

So, for every multiple of 5, we get one factor of 5. For every multiple of 25, we get an extra factor(because
25=5^2), and so on.We can repeatedly divide n by 5, 25, 125, etc., and sum the results.

We keep dividing n by 5, adding the quotient to count.
This counts how many factors of 5 are in n!.

---------------------------------------------------------Day-12-----------------------------------------------------------

                                   PROBLEM 1:INSERT GCD IN LINKED LIST

Given the head of a linked list head, in which each node contains an integer value.
Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
Return the linked list after insertion.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]

Example 2:
Input: head = [7]
Output: [7]

Constraints:
The number of nodes in the list is in the range [1, 5000].
1 <= Node.val <= 1000

EXPLANATION:
1.Start from the head of the linked list and traverse while current.next is not null.
2.For every pair of adjacent nodes (current and current.next):Compute gcd(current.val, current.next.val).
3.Create a new node with the GCD value.
4.Insert this new node between current and current.next.
5.Move the pointer two steps ahead to skip the newly inserted node and repeat the process.

Use the Euclidean algorithm to compute GCD efficiently.

                                       PROBLEM 2: COUNT ODD NUMBERS

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1:
Input: low = 3, high = 7
Output: 3

Example 2:
Input: low = 8, high = 10
Output: 1

Constraints:
0 <= low <= high <= 10^9

EXPLANATION:
Count how many odd numbers are from 1 to high: this is (high + 1) / 2.
Count how many odd numbers are from 1 to low - 1: this is (low) / 2.
The difference gives the count of odd numbers in the inclusive range [low, high].
This avoids any loops and works in constant time.

---------------------------------------------------------Day-13-----------------------------------------------------------

                               PROBLEM 1:remove-duplicates-from-sorted-list-ii

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:
Input: head = [1,1,1,2,3]
Output: [2,3]

Constraints:
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

EXPLANATION:
1.Dummy Node: ListNode dummy = new ListNode(0, head);
Used a dummy node to handle edge cases where the head itself might be a duplicate.
prev starts at dummy.

2.Loop Through the List: while (head != null)
We check for duplicates with: if (head.next != null && head.val == head.next.val)

3.Skip Duplicates:
int duplicateVal = head.val;
while (head != null && head.val == duplicateVal)
head = head.next;
If duplicates are found, skip all nodes with the same value.

4.Remove Duplicates: prev.next = head;
After skipping duplicates, we point prev.next to the next distinct node.

5.Move Pointers:If no duplicates, move both prev and head forward.

                                    PROBLEM 2: sign-of-the-product-of-an-array

Implement a function signFunc(x) that returns:
1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.
Return signFunc(product).

Example 1:
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1

Example 2:
Input: nums = [1,5,0,2,-3]
Output: 0

Constraints:
1 <= nums.length <= 1000
-100 <= nums[i] <= 100

EXPLANATION:
Instead of multiplying all elements (which can cause overflow), observe:
If 0 is in the array → return 0
Count how many negative numbers:
If the count is even, product is positive → return 1
If the count is odd, product is negative → return -1

---------------------------------------------------------Day-14-----------------------------------------------------------

                                    PROBLEM 1: PARTITION LIST

Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Example 2:
Input: head = [2,1], x = 2
Output: [1,2]

Constraints:
The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200

EXPLANATION:

1.Use two dummy nodes to build two lists: before for nodes < x and after for nodes >= x.
2.Traverse the original list and append nodes to respective lists.
3.Join the two lists at the end.

                                       PROBLEM 2: REVERSE INTEGER

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Constraints:
-231 <= x <= 231 - 1

EXPLANATION:

1.Extract the last digit using x % 10.
2.Build the reversed number by result = result \* 10 + digit.
3.Before every multiplication, check for overflow to avoid exceeding Integer.MAX_VALUE or going below Integer.MIN_VALUE.

---------------------------------------------------------Day-15-----------------------------------------------------------

                                    PROBLEM 1: Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

EXPLANATION:
1.Use a dummy node to simplify the construction of the result list.
2.Traverse both linked lists (l1 and l2) simultaneously.
3.At each step, add values from both nodes and carry from the previous step.
4.Create a new node with the digit part (sum % 10) and move the carry forward (sum / 10).
5.At the end, if there’s a non-zero carry, add a final node.

                                       PROBLEM 2: Excel Sheet Column Title

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Constraints:
1 <= columnNumber <= 231 - 1

EXPLANATION:
1.Use a StringBuilder to construct the result in reverse.
2.While the column number is greater than 0:
i.Subtract 1 to adjust for 1-based indexing.
ii.Find the character for (columnNumber - 1) % 26.
iii.Append corresponding character ('A' + remainder).
iv.Divide the number by 26 to move to the next digit.
3.Reverse the result at the end.

----------------------------------------------------------Day-16-----------------------------------------------------------

                                    PROBLEM 1: Delete-node-in-a-linked-list

There is a singly-linked list head and we want to delete a node node in it.You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.

Custom testing:
For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.

Example 1:
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]

Example 2:
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]

Constraints:
The number of the nodes in the given list is in the range [2, 1000].
-1000 <= Node.val <= 1000
The value of each node in the list is unique.
The node to be deleted is in the list and is not a tail node.

EXPLANATION:
1.Copy the value of the next node into the node to be deleted.
2.Change the next pointer of the node to point to node.next.next.
3.The next node is now no longer referenced and will be garbage collected if there are no other references to it.

                                    PROBLEM 2: Sum-Of-Square-Numbers

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:
Input: c = 5
Output: true

Example 2:
Input: c = 3
Output: false

Constraints:
0 <= c <= 231 - 1

EXPLANATION:
1.Let a = 0 and b = (int)Math.sqrt(c)
2.While a <= b:Calculate sum = a*a + b*b
a.If sum == c, return true
b.If sum < c, increase a
c.Else decrease b
3.If no such pair is found, return false

---------------------------------------------------------Day-17-----------------------------------------------------------

                                                  PROBLEM 1: Min-Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the MinStack class:
•MinStack() initializes the stack object.
•void push(int val) pushes the element val onto the stack.
•void pop() removes the element on the top of the stack.
•int top() gets the top element of the stack.
•int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
Output
[null,null,null,null,-3,null,0,-2]

Constraints:
-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 \* 104 calls will be made to push, pop, top, and getMin

EXPLANATION:
1.Copy the value of the next node into the node to be deleted.
2.Change the next pointer of the node to point to node.next.next.
3.The next node is now no longer referenced and will be garbage collected if there are no other references to it.

                                    PROBLEM 2: Two-Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

EXPLANATION:
•We use a HashMap to store numbers and their indices as we iterate.
•For each number nums[i], we calculate complement = target - nums[i].
•If the complement exists in the map, we've found the pair → return their indices.
•Otherwise, store nums[i] in the map.
