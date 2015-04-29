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
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode current = fakeHead;

        while(l1!=null || l2!=null){
            if(l1==null|| l2!=null && l2.val<l1.val){
                current.next = l2;
                l2=l2.next;
            }else{
                current.next = l1;
                l1=l1.next;
            }
        }
        return fakeHead.next;

    }
}
