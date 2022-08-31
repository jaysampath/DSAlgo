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
    //recursive approach
    public ListNode reverseKGroup(ListNode head, int k) {
        
        //end case
        if(head==null)
            return null;
        
        //need not reverse if there are no k nodes present.
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size<k)
            return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count =0;
        while(count++<k && curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(next!=null){
            head.next = reverseKGroup(next,k);
        }
        return prev;
    }
}
