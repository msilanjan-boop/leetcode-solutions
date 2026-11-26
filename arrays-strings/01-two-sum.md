# Two Sum

- **Problem:** Two Sum
- **Difficulty:** Easy
- **Language:** Java
- **Platform:** LeetCode
- **Link:** https://leetcode.com/problems/two-sum/

## Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers whose sum equals the target.

## Approach

I used the Brute Force approach.

1. Use the first loop to select an element.
2. Use the second loop to select another element after it.
3. Check whether their sum equals the target.
4. If the sum matches, return both indices.

## Complexity Analysis

- **Time Complexity:** O(n²) — Two nested loops check pairs of elements.
- **Space Complexity:** O(1) auxiliary space — No additional data structure is used.

## Local Test Cases

| Test | Input | Expected Output |
|---|---|---|
| 1 | nums = [2,7,11,15], target = 9 | [0,1] |
| 2 | nums = [3,2,4], target = 6 | [1,2] |
| 3 | nums = [3,3], target = 6 | [0,1] |

## Result

- Local testing: Passed
- LeetCode submission: Accepted
- Language: Java

## What I Learned

I learned how to use nested loops to find pairs of elements in an array and return their indices. I also practised Java arrays and methods.
