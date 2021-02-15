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
    public int getDecimalValue(ListNode head) {
        int p=0,res=0;
        if( head.next==null)
            return head.val;
        Stack<Integer> s = new Stack<>();
       while(head!=null)
       {
           s.push(head.val);
           head=head.next;
           
       }
        int i=0,q=0;
        while(s.size()!=0)
        {
            p=s.pop();
            q= (int)Math.pow(2,i);
            res = res + (p*q);
            i++;
        }
       return res; 
    }
}
