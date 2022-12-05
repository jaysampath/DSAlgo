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
    public boolean isPalindrome(ListNode head) {
        //find the middle element
        //reverse it from there
        //compare the two halfs

        ListNode fast = head;
        ListNode slow = head;

        //find middle
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //in case of odd
        if(fast!=null) {
            slow = slow.next;
        }

        //reverse the list after the slow
        ListNode pointer2 = reverseSecondHalf(slow);
        ListNode pointer1 = head;

        while(pointer2 != null) {
            if(pointer1.val != pointer2.val) {
               return false;
            }
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }

        return true;
    }

    public ListNode reverseSecondHalf(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
