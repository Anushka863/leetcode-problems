# Best Time to Buy and Sell Stock

**LeetCode:** #121  
**Difficulty:** Easy  
**Pattern:** Array / Greedy

## Problem

You are given an array `prices` where `prices[i]` represents the price of a stock on the ith day.

You want to maximize your profit by choosing one day to buy the stock and a different day in the future to sell it.

Return the maximum profit you can achieve. If no profit is possible, return `0`.

## Approach

Keep track of the minimum stock price seen so far.

For each price:
- If the current price is smaller than the minimum price, update the minimum price.
- Otherwise, calculate the profit by subtracting the minimum price from the current price.
- Keep track of the maximum profit.

This allows us to find the maximum possible profit in one pass through the array.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)
