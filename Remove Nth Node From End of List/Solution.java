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
        //Approach 1:
        //Find the size of the list. traverse till size-n-1 node
        //delete the next node

        // int size = 0;
        // ListNode temp = head;
        // while(temp!=null) {
        //     temp=temp.next;
        //     size++;
        // }

        // int targetPrev = size-n-1;
        // if(targetPrev==-1) {
        //     return head.next;
        // }
        // temp = head;
        // int k = 0;
        // while(k < targetPrev) {
        //    temp = temp.next;
        //    k++;
        // }

        // temp.next = temp.next.next;


        // return head;

        //End of approach 1


        //Approach 2:
        //using two pointers and a single traversal
        ListNode slow = head;
        ListNode fast = head;

        //move the fast pointer n positions
        int k = 0;
        while(k < n) {
            fast = fast.next;
            k++;
        }

        if(fast==null) {
            return head.next;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
