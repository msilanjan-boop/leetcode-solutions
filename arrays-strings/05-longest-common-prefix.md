# Longest Common Prefix

- **Problem:** Longest Common Prefix
- **Difficulty:** Easy
- **Language:** Java
- **Platform:** LeetCode
- **Link:** https://leetcode.com/problems/longest-common-prefix/

## Problem Description

Write a function to find the longest common prefix string among an array of strings. If there is no common prefix, return an empty string.

## Approach

I used the Horizontal Scanning approach.

1. Take the first string as the initial prefix.
2. Compare it with every remaining string.
3. If a string does not start with the current prefix, remove the last character.
4. Continue until the prefix matches or becomes empty.
5. Return the final prefix.

## Complexity Analysis

- **Time Complexity:** O(n × m), where n is the number of strings and m is the maximum string length.
- **Space Complexity:** O(m) for the prefix string operations.

## Local Test Cases

| Test | Input | Expected Output |
|---|---|---|
| 1 | ["flower","flow","flight"] | "fl" |
| 2 | ["dog","racecar","car"] | "" |
| 3 | ["apple","application","apply"] | "appl" |
| 4 | ["abc"] | "abc" |

## Result

- Local testing: Passed
- LeetCode submission: Accepted
- Language: Java

## What I Learned

I learned how to compare multiple strings and find their common prefix using string methods such as `startsWith()` and `substring()`.
