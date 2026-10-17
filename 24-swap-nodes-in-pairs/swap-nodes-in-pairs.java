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
        if(head == null || head.next == null) return head;
        ListNode prev = new ListNode(0) , dummy = prev;
        prev.next = head;
        while(prev.next != null && prev.next.next != null){
            ListNode a = prev.next  , b = a.next ;
            a.next = b.next;
            b.next = a;
            prev.next = b;
            prev = a;
        }
        return dummy.next;

        
    }
}