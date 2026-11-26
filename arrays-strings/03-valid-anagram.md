# Valid Anagram

- **Problem:** Valid Anagram
- **Difficulty:** Easy
- **Language:** Java
- **Platform:** LeetCode
- **Link:** https://leetcode.com/problems/valid-anagram/

## Problem Description

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

## Approach

I used the Sorting Approach.

1. Check whether both strings have the same length.
2. Convert both strings into character arrays.
3. Sort both character arrays.
4. Compare the sorted arrays.
5. If they are equal, return true; otherwise, return false.

## Complexity Analysis

- **Time Complexity:** O(n log n) because both arrays are sorted.
- **Space Complexity:** O(n) for the character arrays.

## Local Test Cases

| Test | Input | Expected Output |
|---|---|---|
| 1 | "listen", "silent" | true |
| 2 | "rat", "car" | false |
| 3 | "a", "a" | true |
| 4 | "ab", "a" | false |

## Result

- Local testing: Passed
- LeetCode submission: Accepted
- Language: Java

## What I Learned

I learned how to convert strings into character arrays, sort them, and compare them to check whether two strings are anagrams.
