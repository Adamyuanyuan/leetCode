package easy.problem1_20;

/**
 * Created by Adam on 2015/4/29.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode before = head;
        ListNode second = head;

        for(int i=0;i<n;i++){
            second = second.next;
            //if(second==null){return null}
        }
        if(second==null){
            return head.next;
        }

        while(second.next!=null){
            before = before.next;
            second = second.next;
        }

        before.next = before.next.next;
        return head;
    }
}
