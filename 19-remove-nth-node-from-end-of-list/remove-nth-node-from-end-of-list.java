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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        if(head.next == null && n == 1) return null;
        ListNode temp = head , first = head;
        int count = n ;
        while(count != 0 ){
            temp = temp.next;
            count--;}
        if(temp == null) return head.next;
        while(temp.next != null){
            first = first.next;
            temp = temp.next;
        }
        if(n == 1){
            first.next = null;
            return head;
        }
        first.next =  first.next.next;
        return head;
    }
}