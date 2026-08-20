# Find Missing and Repeated Values

**LeetCode:** #2965  
**Difficulty:** Easy  
**Pattern:** Math / Array

## Problem

You are given an `n x n` grid containing integers from `1` to `n²`.

Exactly one number appears twice in the grid, while one number from the range `1` to `n²` is missing.

Return an array containing the repeated number and the missing number.

## Approach

Calculate the actual sum and the actual sum of squares of all elements in the grid.

Also calculate the expected sum and expected sum of squares of the numbers from `1` to `n²`.

Let:
- `a` = repeated number
- `b` = missing number

Using the difference between the actual and expected sums:

`actual_sum - expected_sum = a - b`

Using the difference between the sums of squares:

`actual_sq_sum - expected_sq_sum = a² - b²`

Since:

`a² - b² = (a + b)(a - b)`

We can find `a + b` and then solve for both the repeated and missing numbers.

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
