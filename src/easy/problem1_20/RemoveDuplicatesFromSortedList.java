package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current = head;
        ListNode next = head.next;
        while(next!=null){
            if(current.val==next.val){
                next=next.next;
                current.next=next;
            }else{
                current=current.next;
                next=next.next;
            }
        }
        return head;
    }
}
