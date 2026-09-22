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
// class Solution {
//     public ListNode insertionSortList(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         Listnode current = head ; 
//         ListNode prev = new ListNode(null);
//         ListNode next_node = new ListNode();
//         while (current){
//             prev = prev.next ; 
//             while(prev.next && prev.mext.val < current.val){
//                 prev = prev.next ; 
//             }
//             curr.next = prev.next ; 
//             prev.next = current ;
//             current = new_node ;  
//         }
//         return dummy.next ;         
//     }
// }
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            ListNode prev = dummy;
            
            // Find the correct position to insert the current node
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            
            // Insert current node into the sorted part
            current.next = prev.next;
            prev.next = current;
            
            // Move to the next node in the original list
            current = nextNode;
        }
        
        return dummy.next;
    }
}
