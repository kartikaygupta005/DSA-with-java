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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ){
            return head ;
        }
        int count = 1 ;
        ListNode counter = head ; 
        while(counter.next != null ){
            count++;
            counter = counter.next;
        }
        k = k % count ;
        for(int  i = 0 ; i < k ; i++){
            ListNode secondlast = head ;
            ListNode last = head.next ;
            while(last.next != null ){
                secondlast = last  ; 
                last = last.next ;
            }
            secondlast.next = null ;
            last.next = head ; 
            head = last;
        }
        return head ;
        
    }
}