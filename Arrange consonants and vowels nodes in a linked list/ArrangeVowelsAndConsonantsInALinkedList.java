public class ArrangeVowelsAndConsonantsInALinkedList {

    class ListNode {
        char data;
        ListNode next;

        public ListNode(char data) {
            this.data = data;
            next = null;
        }
    }

    ListNode head;

    public void push(char newData) {
        ListNode newNode = new ListNode(newData);
        newNode.next = head;
        head = newNode;
    }

    public ListNode arrangeVowelsAndConsonants(ListNode head, int size) {
        // This DUMMY node is needed if in case the first node itself is not a vowel
        ListNode DUMMY = new ListNode('-');
        DUMMY.next = head;
        ListNode temp = DUMMY;
        ListNode lastNode = findLastNode(head);
        // Iterate the whole LinkedList
        int i =0;
        while (i++ < size) {
            if (isVowel(temp.next.data)) {
                temp = temp.next;
            } else {
                // add this consonant to the end
                ListNode cons = temp.next;
                temp.next = temp.next.next; // a e
                lastNode.next = cons; // i b c
                lastNode = lastNode.next; // c
                lastNode.next = null;  // c null
            }
        }
        return DUMMY.next;
    }

    private static ListNode findLastNode(ListNode head) {
        while(head.next != null) {
            head = head.next;
        }
        return head;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        ArrangeVowelsAndConsonantsInALinkedList object = new ArrangeVowelsAndConsonantsInALinkedList();
        char[] arr = {'a', 'b', 'c', 'e', 'x', 'o', 'i'};
        for (char ch : arr)
            object.push(ch);

        System.out.println("Given List : ");
        object.printList(object.head);
        ListNode result = object.arrangeVowelsAndConsonants(object.head, arr.length);
        System.out.println("After Rearranging :");
        object.printList(result);
    }

    private void printList(ListNode result) {
        while (result.next != null) {
            System.out.print(result.data +" -> ");
            result = result.next;
        }
        System.out.print(result.data);
        System.out.println();
    }
}
