/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int count = 0;
        ListNode countnode = head;
        ListNode dummy = head;

        while (countnode != null) {
            countnode = countnode.next;
            count++;
        }

        int half = count / 2;

        ListNode part1 = head;

        for (int i = 1; i < half; i++) {
            part1 = part1.next;
        }

        ListNode part2 = part1.next;
        part1.next = null;

        // Reverse second half
        ListNode prev = null;
        ListNode curr = part2;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        part2 = prev;

        int maxest = 0;

        // Calculate twin sums
        for (int i = 0; i < half; i++) {
            int value1 = dummy.val;
            int value2 = part2.val;

            maxest = Math.max(maxest, value1 + value2);

            dummy = dummy.next;
            part2 = part2.next;
        }

        return maxest;
    }
}