# Best Time to Buy and Sell Stock

- **Problem:** Best Time to Buy and Sell Stock
- **Difficulty:** Easy
- **Language:** Java
- **Platform:** LeetCode
- **Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Problem Description

Given an array of stock prices, find the maximum profit possible by buying on one day and selling on a later day.

If no profit is possible, return 0.

## Approach

I used the Single Pass approach.

1. Initialize `minPrice` with the first stock price.
2. Initialize `maxProfit` to 0.
3. Traverse the remaining prices.
4. Calculate the profit using the current price minus the minimum price.
5. Update the maximum profit if a better profit is found.
6. Update the minimum price whenever a lower price is found.

## Complexity Analysis

- **Time Complexity:** O(n) — The array is traversed once.
- **Space Complexity:** O(1) — Only two additional variables are used.

## Local Test Cases

| Test | Input | Expected Output |
|---|---|---|
| 1 | [7,1,5,3,6,4] | 5 |
| 2 | [7,6,4,3,1] | 0 |
| 3 | [1,2] | 1 |
| 4 | [5] | 0 |

## Result

- Local testing: Passed
- LeetCode submission: Accepted
- Language: Java

## What I Learned

I learned how to solve an array problem efficiently using a single traversal and how to track the minimum value and maximum profit.
