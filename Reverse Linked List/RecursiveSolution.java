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
class RecursiveSolution {
    public ListNode reverseList(ListNode head) {
        //recurvie apporach
        return recursiveReverse(head, null);
    }

    public ListNode recursiveReverse(ListNode head, ListNode prev) {
        if(head==null) {
            return prev;
        }
        ListNode next = head.next;
        head.next = prev;
        return recursiveReverse(next, head);
    }
}
