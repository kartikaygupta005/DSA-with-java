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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head.next;
        ListNode prev = null;

        while (head != null && head.next != null) {

            ListNode change = head.next;
            ListNode node = head;

            node.next = change.next;
            change.next = node;

            if (prev != null) {
                prev.next = change;
            }

            prev = node;
            head = node.next;
        }

        return dummy;
    }
}