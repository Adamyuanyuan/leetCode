package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {

    // iterative solution
    public ListNode reverseListIterative(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode current = head.next;
        head.next = null;
        while(current != null){
            ListNode next = current.next;
            current.next = head;
            head = current;
            current = next;
        }
        return head;
    }

    // recursive solution
    public ListNode reverseList(ListNode head) {

        return reverseListRecursive(head,null);
    }

    private ListNode reverseListRecursive(ListNode head,ListNode newHead){
        if(head==null){
            return newHead;
        }
        ListNode next = head.next;
        head.next=newHead;
        return reverseListRecursive(next,head);
    }

}
