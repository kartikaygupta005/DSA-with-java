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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        int count = 1;

        // Move prev to the node before left
        while (count < left) {
            prev = prev.next;
            count++;
        }

        ListNode head2 = prev.next;
        ListNode tail2 = head2;

        // Move tail2 to right
        while (count < right) {
            tail2 = tail2.next;
            count++;
        }

        ListNode after = tail2.next;

        // Reverse the sublist
        ListNode previous = after;
        ListNode current = head2;

        while (current != after) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // Connect before and after
        prev.next = tail2;

        return dummy.next;
    }
}