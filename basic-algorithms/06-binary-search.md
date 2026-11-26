# Binary Search

## Problem
Given a sorted array of integers and a target value, return the index of the target. If the target does not exist, return -1.

## Approach
Used Binary Search to efficiently find the target.

1. Set `left` to the first index and `right` to the last index.
2. Calculate the middle index.
3. If the middle element equals the target, return its index.
4. If the middle element is smaller than the target, search the right half.
5. Otherwise, search the left half.
6. If the target is not found, return -1.

## Complexity Analysis
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

## Local Test Cases
| Test | Expected Output |
|---|---|
| Target 9 in [-1, 0, 3, 5, 9, 12] | 4 |
| Target 2 in [-1, 0, 3, 5, 9, 12] | -1 |
| Target 5 in [5] | 0 |
| Target 1 in [1, 3, 5, 7, 9] | 0 |

## LeetCode Result
**Status:** Accepted

Screenshot: `06-result.png`