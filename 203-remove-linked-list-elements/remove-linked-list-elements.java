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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        ListNode temp = head;
        if(head == null) return null;
        if(temp.next == null && temp.val == val) return null;
        while(temp.next != null){
            if(temp.val == val){
                prev.next = temp.next;
            }
            else{
            prev = prev.next;}
            temp = temp.next;
        }
        if(temp.val == val ){
            prev.next = null;
        }
        return dummy.next;
    }
}