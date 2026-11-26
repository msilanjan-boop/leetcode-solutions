# 09. Reverse Linked List

**LeetCode Problem:** 206 – Reverse Linked List

**Difficulty:** Easy

**Language:** Java

**Topic:** Linked List

## Problem Description

Given the head of a singly linked list, reverse the list and return the reversed list.

## Approach: Iterative Method

I used three pointers:

- `prev`: Stores the previous node.
- `current`: Points to the current node.
- `nextNode`: Temporarily stores the next node.

The algorithm changes the direction of each node's `next` pointer until the entire linked list is reversed.

## Java Solution

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}
```

## Example

**Input:**

`1 -> 2 -> 3 -> 4 -> 5 -> NULL`

**Output:**

`5 -> 4 -> 3 -> 2 -> 1 -> NULL`

## Complexity Analysis

- **Time Complexity:** O(n) – Each node is visited exactly once.
- **Space Complexity:** O(1) – Only three pointers are used; no extra data structure is required.

## Test Result

- Local Java execution: Passed
- LeetCode Submission: Accepted

## Screenshot

See `09-result.png` in this folder for the LeetCode Accepted screenshot.

## Key Learning

I learned how to reverse a singly linked list using pointer manipulation without creating a new linked list.
