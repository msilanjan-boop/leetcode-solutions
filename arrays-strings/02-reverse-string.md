# Reverse String

- **Problem:** Reverse String
- **Difficulty:** Easy
- **Language:** Java
- **Platform:** LeetCode
- **Link:** https://leetcode.com/problems/reverse-string/

## Problem Description

Write a function that reverses a character array in-place.

## Approach

I used the Two Pointer approach.

1. Initialize `left` at the beginning of the array.
2. Initialize `right` at the end of the array.
3. Swap the characters at both positions.
4. Move `left` forward and `right` backward.
5. Continue until both pointers meet.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1) auxiliary space.

## Local Test Cases

| Test | Input | Expected Output |
|---|---|---|
| 1 | ['h','e','l','l','o'] | ['o','l','l','e','h'] |
| 2 | ['H','a','n','n','a','h'] | ['h','a','n','n','a','H'] |
| 3 | ['a'] | ['a'] |

## Result

- Local testing: Passed
- LeetCode submission: Accepted
- Language: Java

## What I Learned

I learned the Two Pointer technique and how to reverse an array in-place without using another array.
