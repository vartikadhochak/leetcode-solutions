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
Input:
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
Output:
[null,null,null,null,-3,null,0,-2]

Constraints:
-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 \* 104 calls will be made to push, pop, top, and getMin

EXPLANATION:
1.Copy the value of the next node into the node to be deleted.
2.Change the next pointer of the node to point to node.next.next
3.The next node is now no longer referenced and will be garbage collected if there are no other references to it.

                                               PROBLEM 2: Two-Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Example 2:
Input: nums = [3,2,4], target = 
Output: [1,2]

Constraints:
•2 <= nums.length <= 104
•-109 <= nums[i] <= 109
•-109 <= target <= 109

EXPLANATION:
•We use a HashMap to store numbers and their indices as we iterate.
•For each number nums[i], we calculate complement = target - nums[i].
•If the complement exists in the map, we've found the pair → return their indices.
•Otherwise, store nums[i] in the map.

---------------------------------------------------------Day-18-----------------------------------------------------------

                                 PROBLEM 1: Implement-queue-using-stack

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:
void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.

Notes:
You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.

Example 1:
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Constraints:
1 <= x <= 9
At most 100 calls will be made to push, pop, peek, and empty.
All the calls to pop and peek are valid.

EXPLANATION:

🔹 Push: Always push into inStack.
🔹 Pop/Peek: If outStack is empty, transfer all elements from inStack to outStack.
🔹 Empty: Return true if both stacks are empty.


                                               PROBLEM 2: Contains-Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109

EXPLANATION:
🔹 Use a HashSet to store elements as we iterate through the array.
🔹 If an element is already in the set, return true (duplicate found).
🔹 If we finish the loop without finding a duplicate, return false.

---------------------------------------------------------Day-19-----------------------------------------------------------

                                            PROBLEM 1: Valid-Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

EXPLANATION:
🔹 The isValid method uses a stack to track opening brackets.
🔹 For every closing bracket, it checks if it matches the last opening bracket.
🔹 If all brackets match correctly and the stack is empty at the end, the string is valid.
🔹 The main method tests some example inputs and prints whether each string is valid or not.


                              PROBLEM 2: Best-Time-To-Buy-And-Sell-Stocks

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0

Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104

EXPLANATION:
🔹 The maxProfit method finds the maximum profit by keeping track of the minimum buying price seen so far.
🔹 It updates the max profit by comparing current profit possibilities (price - minPrice).
🔹 The main method tests the solution with example inputs and prints the maximum profit.


---------------------------------------------------------Day-20-----------------------------------------------------------

                                PROBLEM 1: Find-Greatest-Common-Divisor-Of-Array 

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
Input: nums = [2,5,6,9,10]
Output: 2

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1

Constraints:
2 <= nums.length <= 1000
1 <= nums[i] <= 1000

Explanation:
🔹 Loop through the array to find the minimum and maximum elements.
🔹 Use a helper function (Euclidean algorithm) to compute the GCD of those two numbers.
🔹 Return the result.

                        PROBLEM 2: Evaluate-reverse-polish-notation

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
Evaluate the expression. Return an integer that represents the value of the expression.
Note that:
The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 
Example 1:
Input: tokens = ["2","1","+","3","*"]
Output: 9

Example 2:
Input: tokens = ["4","13","5","/","+"]
Output: 6

Constraints:
1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].         

Explanation:
🔹 Initialize an empty stack to store integers.
🔹 Loop through each token in the input array:
•If it's a number, convert it to an integer and push it onto the stack.
•If it's an operator (+, -, *, /):
a. Pop the top two numbers from the stack
•The second popped is the left operand
•The first popped is the right operand.
b.Perform the operation.
c.Push the result back onto the stack.
🔹 After the loop, the result is the only number left in the stack. Return it.

---------------------------------------------------------Day-21-----------------------------------------------------------

                                PROBLEM 1:Pascals-Triangle-ii

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Constraints:
0 <= rowIndex <= 33

EXPLANATION:
🔹 To get the rowIndex-th row:
Start with [1].
🔹 Use the formula: res[i] = res[i] * (rowIndex - i + 1) / i to compute the next elements iteratively.


                                    PROBLEM 2:Valid-Parenthesis-String

Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
The following rules define a valid string:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "(*)"
Output: true

Constraints:
1 <= s.length <= 100
s[i] is '(', ')' or '*'.

EXPLANATION:
🔹 Use two counters:
low = min open parentheses possible.
high = max open parentheses possible.

🔹 For each character:
( → both low and high increase.
) → both low and high decrease.
* → low--, high++ (i.e., can act as ), (, or nothing).
If high < 0 at any point → invalid.
If low < 0 → reset to 0 (because * can be nothing).

---------------------------------------------------------Day-22-----------------------------------------------------------

                           PROBLEM 1: Minimum-Remove-to-make-Valid-Parentheses

Given a string s of '(' , ')' and lowercase English characters.
Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
Formally, a parentheses string is valid if and only if:
It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 
Example 1:
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"

Example 2:
Input: s = "a)b(c)d"
Output: "ab(c)d"

Constraints:
1 <= s.length <= 10^5
s[i] is either '(' , ')', or lowercase English letter.

Explanation:

🔹 First Pass (Left to Right):
Track open parentheses count.
Keep appending characters to sb:
If (, increment open and add it. 
If ), only add if open > 0, and decrement open.
Otherwise (letters), always add.

🔹 Second Pass (Right to Left):
Iterate backwards through the valid partial string sb.
If extra '(' are left (open > 0), skip them.
Reverse the result to restore original order.

🔹 Return the Result:
The reversed and cleaned string is returned.


                                      PROBLEM 2: Majority-Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 10^9

Explanation:

🔹 Initialization:
count = 0: keeps track of the balance.
candidate = 0: stores the current potential majority element.

🔹 Loop Through Array:
If count == 0, update the candidate to the current number.
If the current number is equal to candidate, increment the count.
Otherwise, decrement the count.

🔹 Return:
The element stored in candidate at the end is the majority element.
 

---------------------------------------------------------Day-23-----------------------------------------------------------

                                           PROBLEM 1: Longest-valid-parentheses

Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

Example 1:
Input: s = "(()"
Output: 2

Example 2:
Input: s = ")()())"
Output: 4

Constraints:
0 <= s.length <= 3 * 104
s[i] is '(', or ')'.

Explanation:

🔹 We use a stack to store indices of unmatched '('.
🔹 Start by pushing -1 as a base index.
🔹 When encountering '(', push its index.
🔹 When encountering ')', pop the top:
If stack is empty after popping, push current index as base.
If not empty, update maxLength using current index and top of stack.


                                                PROBLEM 2: Search-insert-position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

Explanation:
🔹 Initialize left = 0, right = nums.length
🔹 Use binary search to find the first position where nums[mid] >= target
🔹 This works because the array is sorted

---------------------------------------------------------Day-24-----------------------------------------------------------

                                           PROBLEM 1: Move-zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1  

Explanation:
🔹 Use two pointers.
🔹 Move non-zero elements to the front.
🔹 Fill the rest of the array with zeroes.

                                           PROBLEM 2: Basic Calculator

Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:
Input: s = "1 + 1"
Output: 2

Example 2:
Input: s = " 2-1 + 2 "
Output: 3

Constraints:
1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.                                            

Explanation:
🔹 Use a stack to keep track of intermediate results and signs.
🔹 Handle + and - by keeping a sign variable.
🔹 Push current result and sign onto the stack when encountering (.
🔹 Pop and evaluate on encountering ).

---------------------------------------------------------Day-25-----------------------------------------------------------

                                       PROBLEM 1: Implement-stack-using-queues

Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:
void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.

Notes:
You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 
Example 1:
Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Constraints:
1 <= x <= 9
At most 100 calls will be made to push, pop, top, and empty.
All the calls to pop and top are valid.   

Explanation:
•push(x): Enqueue to q2, then move all elements from q1 to q2. Swap q1 and q2.
•pop(): Dequeue from q1 (since top is always at front).
•top(): Peek the front of q1.
•empty(): Return q1.isEmpty().

Time Complexity:
•push: O(n)
•pop, top, empty: O(1)

                                    PROBLEM 2: Rotate-array
                                    
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 10^5
 
Explanation:
To rotate the array to the right by k steps:
•Reverse the whole array.
•Reverse the first k elements.
•Reverse the rest.
•Use k %= nums.length to handle k larger than array size.

Time Complexity:
O(n)

Space Complexity:
O(1)


---------------------------------------------------------Day-26-----------------------------------------------------------

                                       PROBLEM 1: Find-first-and-last-position-of-element-in-sorted-array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

Explanation:
Binary Search :
Use binary search twice:
First to find the first occurrence of the target.
Second to find the index just after the last occurrence.
Subtract 1 from the second result to get the actual last index.
Verify that the target exists in the resulting range.


                            PROBLEM 2: Binary-tree-inorder-traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,2,6,5,7,1,3,9,8]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 
Explanation:
Recursive Inorder Traversal:
Traverse the left subtree.
Visit the current node (add its value to result).
Traverse the right subtree.
This mimics the left-root-right order used in inorder traversal.

---------------------------------------------------------Day-27-----------------------------------------------------------

                                       PROBLEM 1: Path-sum

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false

Constraints:
The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000  

Explanation:

At each node:
• Subtract the node’s value from targetSum.
• If it’s a leaf node and the remaining target is zero, return true.
• Recursively check the left and right subtrees with the updated sum.

If we never find such a path, return false.

                                    PROBLEM 2: Maximum-subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6

Example 2:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 10^4        

Explanation:

Initialize:
currentSum = 0
maxSum = Integer.MIN_VALUE

Traverse the array:
• At each index, set currentSum = max(num, currentSum + num)
• Update maxSum = max(maxSum, currentSum)

Return maxSum

---------------------------------------------------------Day-28-----------------------------------------------------------

                              PROBLEM 1: Number-of-subarrays-with-lcm-equal-to-k

Given an integer array nums and an integer k, return the number of subarrays of nums where the least common multiple of the subarray's elements is k.
A subarray is a contiguous non-empty sequence of elements within an array.
The least common multiple of an array is the smallest positive integer that is divisible by all the array elements.

Example 1:
Input: nums = [3,6,2,7,1], k = 6
Output: 4

Example 2:
Input: nums = [3], k = 2
Output: 0

Constraints:
1 <= nums.length <= 1000
1 <= nums[i], k <= 1000

Explanation:

🔹 Try all subarrays nums[i..j]
🔹 Compute LCM from i to j
🔹 If it exceeds k, break early
🔹 If it's equal to k, increment count

                              PROBLEM 2: Minimum-depth-of-binary-tree

Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 
Constraints:
The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000

Explanation:

🔹 Use BFS (Breadth-First Search) to find the first leaf node because it's the shortest path by level order.
🔹 If root is null, return 0.
🔹 Do a level-order traversal using a queue.
🔹 As soon as a leaf node is found, return its depth.

---------------------------------------------------------Day-29-----------------------------------------------------------

                              PROBLEM 1: kth-largest-element-in-an-array

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 
Constraints:
1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104   
                           
Explanation:

QuickSelect – an optimized selection algorithm similar to QuickSort.

🔹 Choose a pivot (first element in this implementation).
🔹 Partition the array into elements < pivot and > pivot.
🔹 Recursively apply QuickSelect on the relevant partition depending on the target index.
🔹 Stop when the pivot is at the target index.



                              PROBLEM 2: sum-of-left-leaves

Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24

Example 2:
Input: root = [1]
Output: 0
 
Constraints:
The number of nodes in the tree is in the range [1, 1000].
-1000 <= Node.val <= 1000

Explanation:

Using Breadth-First Search (BFS) and store whether each node is a left child.

🔹 Use a queue of (TreeNode, isLeft) pairs.
🔹 Traverse the tree level by level.
🔹 For each node, check if it’s a left leaf (isLeft = true, no children), then add its value to the result.
🔹 Enqueue children accordingly and tag them as left/right.

---------------------------------------------------------Day-30-----------------------------------------------------------

                              PROBLEM 1: Finding-the-duplicate-number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.  

Explanation:

🔹 Floyd’s Tortoise and Hare (Cycle Detection)
Treat the array like a linked list:

🔹 Each index points to nums[index], so you move through the array as if it's a linked structure.
🔹 Use two pointers:
• slow moves one step at a time.
• fast moves two steps.
🔹 First phase:
Let them move until they meet inside the cycle.
🔹 Second phase:
Reset one pointer to the start.

🔹 Move both one step at a time. The point where they meet again is the duplicate number (start of the cycle).

                              PROBLEM 2: Diameter-of-binary-tree

Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

Example 1:
Input: root = [1,2,3,4,5]
Output: 3

Example 2:
Input: root = [1,2]
Output: 1

Constraints:
The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100                              

Explanation:
🔹 Post-order DFS
• Use a recursive function to find the depth (height) of each subtree.
• While doing this:

🔹 For every node, calculate leftHeight + rightHeight, which is the longest path through that node.
🔹 Track the maximum of all such paths — that’s your diameter.
🔹 The function returns the depth, but updates the global diameter as it goes.

---------------------------------------------------------Day-31-----------------------------------------------------------

                            PROBLEM 1: Maximum depth of a binary tree

Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

Constraints:
The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100

Explanation:
🔹 Use recursion (DFS) to traverse the tree.
🔹 At each node, compute the maximum depth of its left and right subtrees.
🔹 Add 1 to the maximum of those two depths to account for the current node.
🔹 Base Case:
If the node is null, return 0 (no depth).
🔹 Formula: maxDepth(node) = 1 + max(maxDepth(node.left), maxDepth(node.right))

                            PROBLEM 2: Flipping an image

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

Constraints:
n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.

Explanation:
🔹 Loop through each row of the matrix.
🔹 Use two pointers (left and right) to reverse the row while inverting the bits at the same time:
Swap and invert: 0 → 1, 1 → 0
Use XOR (^ 1) for inversion (0^1 = 1, 1^1 = 0)
🔹 Continue until left >= right.
🔹 This combines flipping and inverting in a single pass with O(1) extra space.


---------------------------------------------------------Day-32-----------------------------------------------------------

                            PROBLEM 1: Rotate-image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000

Explanation:
🔹 Transposing swaps elements at (i, j) with (j, i).
🔹 Reversing a row swaps elements from both ends inward.


                          PROBLEM 2: Binary-tree-level-order-traversal 

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000                          

Explanation:

🔹 If the tree is empty (root == null), return an empty list.
🔹 Initialize a queue and add the root.
🔹 While the queue is not empty: Get the number of nodes at the current level.
🔹 Loop through these nodes:Poll each node, add its value to a temporary list.
🔹 Add the node's children (if any) to the queue.
🔹 Add the temporary list to the result list.

---------------------------------------------------------Day-33-----------------------------------------------------------

                            PROBLEM 1: Binary Tree Right Side View

Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:
Input: root = [1,2,3,4,null,null,null,5]
Output: [1,3,4,5]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100             

Explanation:

🔹 Use level order traversal (BFS) with a queue.
🔹 At each level, capture the last node, which is visible from the right side.



                            PROBLEM 2: Lexicographically Smallest Palindrome

You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.
Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
Return the resulting palindrome string.

Example 1:
Input: s = "egcfe"
Output: "efcfe"

Example 2:
Input: s = "abcd"
Output: "abba"

Constraints:
1 <= s.length <= 1000
s consists of only lowercase English letters.

Explanation:

🔹 Use two pointers (i from start, j from end).
🔹 If characters differ, replace the bigger one with the smaller to: Make it a palindrome.
🔹 Ensure lexicographically smallest outcome.
🔹 Do it only if characters differ to minimize operations.

---------------------------------------------------------Day-34-----------------------------------------------------------

                    PROBLEM 1: Flatten-binary-tree-into-a-linked-list

Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 
Example 1:
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

Example 2:
Input: root = []
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100

Explanation: 

Reverse Preorder Traversal:
🔹 We use a reverse preorder traversal (i.e., right → left → root) because it helps us build the linked list backward.
🔹 Traverse the right subtree first.
🔹 Then traverse the left subtree.
🔹 Modify current node:
Set node.right = prev (the last visited node).
Set node.left = null
Update prev = node

                       PROBLEM 2: Length-of-the-last-word

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s 

Explanation: 

🔹 Trim the input to remove leading/trailing spaces.
🔹 Traverse from the end and count characters until you hit a space.
🔹 Stop when you’ve counted a word.

---------------------------------------------------------Day-35-----------------------------------------------------------

                          PROBLEM 1: Number-of-segments-in-a-string

Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.

Example 1:
Input: s = "Hello, my name is John"
Output: 5

Example 2:
Input: s = "Hello"
Output: 1
 
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.

Explanation: 

🔹Use split(" ") to separate words.
🔹Filter out empty segments.

                     PROBLEM 2: Lowest-common-ancestor-of-a-binary-tree

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3

Example 2:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5

Constraints:
The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the tree.

Explanation: 

🔹 If root is null, return null.
🔹 If root is either p or q, return root.
🔹 Recurse for left and right subtrees.
🔹 If both return non-null, current root is LCA.
🔹 Otherwise, return the non-null child.


---------------------------------------------------------Day-36-----------------------------------------------------------

                          PROBLEM 1: Reverse-vowel-in-the-string

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"

Example 2:
Input: s = "leetcode"
Output: "leotcede"

Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

Explanation:

🔹 Use two pointers (left and right) starting from both ends.
🔹 Move inward until both pointers point to vowels.
🔹 Swap those vowels.
🔹 Repeat until the pointers meet


                          PROBLEM 2: sum-root-to-leaf numbers

You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.
For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.
 
Example 1:
Input: root = [1,2,3]
Output: 25

Example 2:
Input: root = [4,9,0,5,1]
Output: 1026

Constraints:
The number of nodes in the tree is in the range [1, 1000].
0 <= Node.val <= 9
The depth of the tree will not exceed 10.

Explanation:

🔹 Use DFS (Depth First Search) to traverse each root-to-leaf path.
🔹 While going down, keep a running pathSum.
🔹 Multiply previous sum by 10 and add the current node's value.
🔹 If you reach a leaf node, return the pathSum.

---------------------------------------------------------Day-37-----------------------------------------------------------

                          PROBLEM 1:  First Palindromic String in an Array

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

Example 1:
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"

Example 2:
Input: words = ["notapalindrome","racecar"]
Output: "racecar"

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.

Explanation:

To find the first palindromic string in an array, we simply iterate through each word and check whether it is a palindrome. A palindrome reads the same forwards and backwards, so we use a two-pointer approach: one pointer starts at the beginning of the word and the other at the end. We move them inward while comparing characters. If all characters match, the word is a palindrome. As soon as we find the first such word, we return it immediately. If no palindrome is found after checking all words, we return an empty string. This solution is efficient and operates in linear time relative to the total number of characters in the array.

                          PROBLEM 2: Zigzag Level Order Traversal of Binary Tree

Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100

Explanation:

To find the first palindromic string in an array, we simply iterate through each word and check whether it is a palindrome. A palindrome reads the same forwards and backwards, so we use a two-pointer approach: one pointer starts at the beginning of the word and the other at the end. We move them inward while comparing characters. If all characters match, the word is a palindrome. As soon as we find the first such word, we return it immediately. If no palindrome is found after checking all words, we return an empty string. This solution is efficient and operates in linear time relative to the total number of characters in the array.


---------------------------------------------------------Day-38-----------------------------------------------------------

                          PROBLEM 1: valid-palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: s = "race a car"
Output: false

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

Explanation:

Two pointers walk toward the centre. Each step ignores non-alphanumeric characters, then compares the remaining pair case-insensitively; a single mismatch ends the loop early. Every character is visited at most once, so the method runs in O(n) time and O(1) extra space.


                          PROBLEM 2: search-in-the-binary-tree 

You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []
 
Constraints:
The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107

Explanation:

The BST property lets us discard half the tree at every step: values smaller than the current node must lie left, larger ones right. The recursion therefore narrows the search path in O(h) time where h is the tree height, and uses only the call-stack for space.

---------------------------------------------------------Day-39-----------------------------------------------------------

                     PROBLEM 1: Remove All Adjacent Duplicates in String

You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"

Example 2:
Input: s = "azxxzy"
Output: "ay"
 
Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.

Explanation:

Scan the string once, use a stack (or StringBuilder acting as one). Push each char; if the top is the same as the incoming char, pop instead of pushing—effectively “cancelling” both. At the end, the stack holds the answer.
Iterate over s, append to a StringBuilder if it’s empty or last char differs; otherwise deleteCharAt(len-1) to pop.
Time/Space complexity:O(n) time, O(n) auxiliary space (worst case no removals).


                          PROBLEM 2: insert-into-a-binary-search-tree

You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

Example 1:
Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]

Example 2:
Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]

Constraints:
The number of nodes in the tree will be in the range [0, 104].
-108 <= Node.val <= 108
All the values Node.val are unique.
-108 <= val <= 108
It's guaranteed that val does not exist in the original BST.

Explanation:

Walk down the tree using BST rules: values < node.val go left, otherwise right. 
When you hit null, create the new node and link it.
A simple recursive helper (or iterative loop) suffices because each decision narrows the search space.
Time/Space complexity:O(h) time, O(h) recursion stack; h is tree height ( O(log n) for balanced, O(n) worst-case skew).

---------------------------------------------------------Day-40-----------------------------------------------------------

                     PROBLEM 1: Rotate-String

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false
 
Constraints:
1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.

Explanation:

To determine if string s can become goal by rotating it, observe that any number of left shifts on s is just rotating characters to the end. If you concatenate s + s (e.g., "abcdeabcde"), all possible rotated versions of s appear as substrings in this combined string. So, we simply check if goal exists as a substring of s + s. If it does, s can be rotated to match goal. This solution runs in O(n) time and uses O(1) extra space.


                     PROBLEM 2: Lowest-common-ancestor 

Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6

Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2

Constraints:
The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the BST.

Explanation:

In a Binary Search Tree (BST), the Lowest Common Ancestor (LCA) of two nodes p and q is the node where the paths to p and q split. Thanks to BST properties, we can find the LCA by comparing node values:
If both p and q are less than the current node, LCA lies in the left subtree.
If both are greater, LCA is in the right subtree.
If one is on each side (or matches the current node), then the current node is the LCA.
This approach is efficient and runs in O(h) time, where h is the height of the tree.


---------------------------------------------------------Day-41-----------------------------------------------------------

                     PROBLEM 1: Longest-common-prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

Explanation:

Let prefix = strs[0].
For each next word:
While the word does not start with prefix, drop the last char of prefix.
If prefix becomes empty, there is no common prefix.
Whatever is left in prefix is the answer.

                     PROBLEM 2: Delete-node-in-a-bst

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:
Search for a node to remove.
If the node is found, delete the node.
 
Example 1:
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]

Example 2:
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]

Constraints:
The number of nodes in the tree is in the range [0, 104].
-105 <= Node.val <= 105
Each node has a unique value.
root is a valid binary search tree.
-105 <= key <= 105

Explanation:

To delete a node from a Binary Search Tree (BST), we follow a standard three-step process based on the node's structure:
Search Phase: We recursively search for the node to delete using BST properties—if the key is less than the current node’s value, we go to the left subtree; if greater, we go to the right.

Deletion Phase:

Case 1 (Leaf Node): If the node has no children, we return null to delete it.
Case 2 (One Child): If the node has only one child, we return that child to replace the current node.
Case 3 (Two Children): This is the tricky part. We find the inorder successor of the node (the smallest node in the right subtree), copy its value to the node we want to delete, and then recursively delete the successor node from the right subtree.
This approach ensures the BST properties are preserved after deletion.

---------------------------------------------------------Day-42-----------------------------------------------------------

                     PROBLEM 1: Validate-binary-search-tree

Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [2,1,3]
Output: true

Example 2:
Input: root = [5,1,4,null,null,3,6]
Output: false

Constraints:
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1                

Explanation:

To check if a binary tree is a valid BST, we recursively verify that every node’s value lies within a valid range. For the root, the range is from Long.MIN_VALUE to Long.MAX_VALUE. For each left child, the upper bound becomes the parent’s value, and for the right child, the lower bound becomes the parent’s value. If any node violates this range, the tree is not a BST.

                     PROBLEM 2: Reverse-words-in-a-string

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"


Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

Explantion:

The solution trims the input string to remove leading/trailing spaces and splits it using split("\\s+") to handle multiple spaces. It then appends the words in reverse order using a loop. This ensures that extra spaces are removed, and only a single space separates the words in the output.

---------------------------------------------------------Day-43-----------------------------------------------------------

                     PROBLEM 1: kth-smallest-element-in-a-bst

Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 
Constraints:
The number of nodes in the tree is n.
1 <= k <= n <= 104
0 <= Node.val <= 104

Explanation:

Because an in-order traversal of a Binary Search Tree visits nodes in strictly ascending order, we can walk the tree left-root-right and stop as soon as we have visited k nodes—the value at that moment is exactly the k-th smallest. Recursion (or an explicit stack) keeps track of the path; its depth never exceeds the tree height, so the extra memory is O(h), where h ≤ n.

Time / Space O(k + h) in the worst case (⩽ O(n)), O(h) extra space.
 
                     PROBLEM 2: zigzag-conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
 
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

Constraints:
1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000 

Explanation:

Visualise the zigzag as cycling downwards through the rows then diagonally back to the top: row indices follow a periodic “v-shape” 0→1→…→numRows-1→numRows-2→…→1→0→… We stream each character of the input string into an array of StringBuilders at the current row index, flipping direction at the top and bottom. Finally we concatenate the builders row by row to obtain the required reading order.

Time / Space O(n) time and O(n) extra space (for the row buffers).


---------------------------------------------------------Day-44-----------------------------------------------------------

                     PROBLEM 1: Maximum-number-of-vowels-in-a-substring-of-given-length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:
Input: s = "abciiidef", k = 3
Output: 3

Example 2:
Input: s = "aeiou", k = 2
Output: 2

Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length

Explanation:

We use a sliding window approach of size k. As we move the window forward through the string s, we increase the vowel count for the incoming character and decrease it for the outgoing one. At each step, we track the maximum number of vowels in any window of length k. This ensures O(n) time and O(1) space using a Set for vowel lookup

                     PROBLEM 2: Convert-sorted-list-to-binary-search-tree

Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

Example 1:
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]

Example 2:
Input: head = []
Output: []

Constraints:
The number of nodes in head is in the range [0, 2 * 104].
-105 <= Node.val <= 105

Explanation:

To convert a sorted singly linked list into a height-balanced BST, we use a slow and fast pointer approach to find the middle node, which will become the root. We recursively build left and right subtrees from the left and right halves of the list. The function convert(start, end) processes each segment, and the middle becomes the node of current subtree. This ensures logarithmic height and balanced nature, with O(n log n) time complexity due to list traversal in each level.


---------------------------------------------------------Day-45-----------------------------------------------------------

                     PROBLEM 1: Find-the-town-judge

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

Constraints:
1 <= n <= 1000
0 <= trust.length <= 104
trust[i].length == 2
All the pairs of trust are unique.
ai != bi
1 <= ai, bi <= n

Explanation:

We maintain a trust score for each person.
If person a trusts person b, then:
Decrease a's trust score by 1 (since they trust someone — they can't be the judge),
Increase b's trust score by 1 (since someone trusts them — possibly the judge).
At the end, the judge will have a trust score of n - 1, and have trusted nobody (i.e., they didn't lose any points).


                     PROBLEM 2: Greatest-common-divisor-of-strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Constraints:
1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.

Explanation:

If two strings can be constructed by repeating the same substring, then their GCD string will also divide both.
If str1 + str2 != str2 + str1, that means they don’t share a common pattern → return "".
Otherwise, use the GCD of their lengths to get the substring.

---------------------------------------------------------Day-46-----------------------------------------------------------

                     PROBLEM 1: Find Center of Star Graph

There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

Example 1:
Input: edges = [[1,2],[2,3],[4,2]]
Output: 2

Example 2:
Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1

Constraints:
3 <= n <= 105
edges.length == n - 1
edges[i].length == 2
1 <= ui, vi <= n
ui != vi
The given edges represent a valid star graph.

Explanation:

Since the center node is common in all edges, we can determine it by checking the first two edges.
The node that appears in both the first edge (edges[0]) and the second edge (edges[1]) must be the center.
For example, if the first edge is [1, 2] and the second edge is [2, 3], the common node 2 is the center.
This approach works because the center is the only node shared across all edges, making it easy to identify with just two comparisons. The time complexity is O(1) since we only examine the first two edges, regardless of the graph size.

                     PROBLEM 2: Prime Number of Set Bits

Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.
Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101, which has 3 set bits.
 
Example 1:
Input: left = 6, right = 10
Output: 4

Example 2:
Input: left = 10, right = 15
Output: 5

Constraints:
1 <= left <= right <= 106
0 <= right - l

Explanation:

Iterate through each number in the range [left, right].
For each number, compute its set bits using Integer.bitCount(), a fast built-in method in Java.
Check if the count of set bits is a prime number using a helper function isPrime().
If it is prime, increment the result count.

---------------------------------------------------------Day-47-----------------------------------------------------------

                     PROBLEM 1: Number of Set Bit

Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

Example 1:
Input: n = 11
Output: 3

Example 2:
Input: n = 128
Output: 1

Constraints:
1 <= n <= 231 - 1

Explanation:

The problem requires counting the number of 1s (set bits) in the binary representation of a given integer. We can achieve this by repeatedly checking the least significant bit (LSB) of the number and right-shifting the number until it becomes zero. Each time the LSB is 1, we increment our count.

Explanation:

Initialization: We start with a count set to zero.
Loop: While the number n is not zero:
Check LSB: We use n & 1 to check the least significant bit. If it's 1, we increment the count.
Right Shift: We then right-shift n by 1 bit to process the next bit. We use the unsigned right shift operator >>> to handle negative numbers correctly.
Return: The count of set bits is returned after the loop exits.

          PROBLEM 2:  Number of Substrings Containing All Three Characters

Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1:
Input: s = "abcabc"
Output: 10

Example 2:
Input: s = "aaacb"
Output: 3

Constraints:
3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.

Explanation:

Hamming Weight: The first problem is straightforward, using bit manipulation to count set bits efficiently. The unsigned right shift ensures correct handling of negative numbers.

Substring Count: The second problem leverages the sliding window technique to efficiently count valid substrings by maintaining a window that contains all three characters, thus optimizing the solution from O(n^2) to O(n).

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

---------------------------------------------------------Day-48-----------------------------------------------------------

                     PROBLEM 1: Hamming-distance

Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2

Example 2:
Input: x = 3, y = 1
Output: 1

Constraints:
0 <= x, y <= 231 - 1

Explanation:

The Hamming distance between two integers is the number of positions at which the corresponding bits are different. To compute this, we first perform a bitwise XOR operation between the two numbers. The XOR operation results in a number where each bit is set to 1 if the corresponding bits of x and y are different. Then, we count the number of 1 bits in the resulting number using Integer.bitCount(), which gives us the Hamming distance. For example, 1 (0001) XOR 4 (0100) gives 5 (0101), which has two 1 bits, so the Hamming distance is 2.


                     PROBLEM 2: Check-if-it-is-a-good-array

Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.

Return True if the array is good otherwise return False.

Example 1:
Input: nums = [12,5,7,23]
Output: true

Example 2:
Input: nums = [29,6,10]
Output: true

Constraints:
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9                                          

Explanation:

An array is considered "good" if the greatest common divisor (GCD) of all its elements is 1. This is based on the mathematical property that if the GCD of the array elements is 1, there exists a linear combination of the elements (with integer coefficients) that sums to 1. The solution iterates through the array, computing the GCD of all elements incrementally. If at any point the GCD becomes 1, it returns true immediately. If the loop completes without the GCD becoming 1, it returns false. For example, the GCD of [12, 5, 7, 23] is 1, so the array is good. The gcd method uses the Euclidean algorithm to compute the GCD efficiently.

---------------------------------------------------------Day-49-----------------------------------------------------------

                     PROBLEM 1: Count-Prime

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4

Example 2:
Input: n = 0
Output: 0

Constraints:
0 <= n <= 5 * 106

Explanation :

This algorithm counts all prime numbers less than a given integer n efficiently using the Sieve of Eratosthenes. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. The approach works by iteratively marking the multiples of each prime number starting from 2.

Initialization: A boolean array isPrime of size n is created, where each index initially assumes true (indicating a potential prime).

Base Cases: 0 and 1 are explicitly set to false since they are not primes.

Marking Non-Primes: For each number i starting from 2 up to √n, if i is still marked as prime, all its multiples (i*i, i*i + i, ...) are marked as non-prime (false).

Counting Primes: Finally, the algorithm counts all remaining true values in the array, which represent prime numbers.

This method efficiently eliminates non-prime numbers in O(n log log n) time, making it much faster than checking each number individually


                     PROBLEM 2: Single-Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once

Explanation :

Given an array where every element appears twice except one, this algorithm finds the unique number using the bitwise XOR operation. XOR (^) has two key properties:

Cancellation Property: a ^ a = 0 (XORing a number with itself cancels it out).

Identity Property: a ^ 0 = a (XORing with zero leaves the number unchanged).

Initialization: Start with a variable index set to 0.

Iterate Through Array: For each number in the array, perform index ^= num.

Result: After processing all numbers, duplicates cancel out (a ^ a = 0), leaving only the unique number (0 ^ unique = unique).

This approach runs in O(n) time with O(1) space, making it optimal for the problem constraints.

---------------------------------------------------------Day-50-----------------------------------------------------------

                     PROBLEM 1: Break-a-palindrome

Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.

Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, a has a character strictly smaller than the corresponding character in b. For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, and 'c' is smaller than 'd'.

Example 1:
Input: palindrome = "abccba"
Output: "aaccba"

Example 2:
Input: palindrome = "a"
Output: ""
 
Constraints:

1 <= palindrome.length <= 1000
palindrome consists of only lowercase English letters

Explanation :

There are one of 2 states:

If the characer is not an 'a,' change it to be an 'a' to break the palindrome and make it lexiographically smaller
if all the characters are 'a' change the last letter to be a 'b' to break the palindrome, and since it's the last letter, increasing it to a 'b' will minimize the increase in lexicographical order.
PROCESS
We do this by converting the string into a char[] array. Note, we only need to iterate until arr.length/2 because it is guaranteed that anything afterwards is a repetition of the characters we have already encountered. Also, arr.length/2 avoids the error of changing the center character in an odd-lengthed string, which has no effect on it.

EX: "aabaa" -> "aaaaa" is still a palindrome | therefore, arr.length/2, which is 2, will not reach the middle character.
EX: "aaaaa" -> "aaaab" is the smallest. We need to change the LAST non-a because anything else will be larger ( "aaaba" > "aaaab" in the dictionary)