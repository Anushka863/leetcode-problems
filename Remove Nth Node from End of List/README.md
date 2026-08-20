# Remove Nth Node From End of List

**LeetCode:** #19  
**Difficulty:** Medium  
**Pattern:** Linked List / Two Pointers

## Problem

Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Approach

Use two pointers, `fast` and `slow`.

First, move the `fast` pointer `n` nodes ahead. Then move both `fast` and `slow` together until `fast` reaches the end of the list.

At this point, `slow` is positioned just before the node that needs to be removed. We can remove that node by changing the `next` pointer.

A dummy node is used to handle the case where the first node itself needs to be removed.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)
