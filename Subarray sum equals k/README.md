# Subarray Sum Equals K

**LeetCode:** #560  
**Difficulty:** Medium  
**Pattern:** Prefix Sum / Hash Map

## Problem

Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum is equal to `k`.

A subarray is a contiguous part of the array containing at least one element.

## Approach

Use the **Prefix Sum and Hash Map** technique.

Maintain a `prefix_sum` that stores the sum of elements from the beginning of the array up to the current position.

For every element:

`prefix_sum = prefix_sum + num`

If:

`prefix_sum - k`

already exists in the Hash Map, it means there are previous prefix sums that can form a subarray with sum equal to `k`.

The Hash Map stores each prefix sum along with the number of times it has occurred.

Initially, we put:

`map.put(0, 1)`

This handles the case where a subarray starting from index `0` has sum equal to `k`.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)
