# Palindrome Linked List

**LeetCode:** #234  
**Difficulty:** Easy  
**Pattern:** Linked List / Two Pointers

## Problem

Given the head of a singly linked list, determine whether the linked list is a palindrome.

A palindrome is a sequence that reads the same forward and backward.

## Approach

Use the slow and fast pointer technique to find the middle of the linked list.

Then reverse the second half of the linked list.

Compare the first half with the reversed second half node by node.

If all corresponding values are equal, the linked list is a palindrome. Otherwise, it is not.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)
