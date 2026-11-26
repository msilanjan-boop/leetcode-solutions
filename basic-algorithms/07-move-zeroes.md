# Move Zeroes

## Problem
Move all zeroes in an array to the end while maintaining the relative order of non-zero elements.

## Approach
Used the Two-Pointer technique.

1. Create a variable `position` starting at 0.
2. Traverse the array.
3. Whenever a non-zero element is found, place it at `position`.
4. Increase `position`.
5. Fill all remaining positions with zeroes.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Local Test Cases
| Test | Expected Output |
|---|---|
| [0, 1, 0, 3, 12] | [1, 3, 12, 0, 0] |
| [0, 0, 1] | [1, 0, 0] |
| [1, 2, 3] | [1, 2, 3] |
| [0, 0, 0] | [0, 0, 0] |

## LeetCode Result
**Status:** Accepted

Screenshot: `07-result.png`