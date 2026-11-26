# Valid Parentheses

## Problem
Given a string containing parentheses characters `()`, `{}`, and `[]`, determine whether the brackets are valid and correctly balanced.

## Approach
Used a Stack data structure.

1. Create an empty stack.
2. Traverse each character in the string.
3. If it is an opening bracket, push it onto the stack.
4. If it is a closing bracket, check whether the stack is empty.
5. Pop the top element and verify that it matches the closing bracket.
6. At the end, the stack must be empty for the string to be valid.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Local Test Cases
| Test | Expected Output |
|---|---|
| `()` | true |
| `()[]{}` | true |
| `(]` | false |
| `([)]` | false |
| `{[]}` | true |
| `(` | false |

## LeetCode Result
**Status:** Accepted

Screenshot: `08-result.png`