package easy.problem1_20;

/**
 * Created by Adam on 2015/4/24.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class IntersectionOfTwoLinkLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = 0;
        int lB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA != null){
            lA++;
            curA = curA.next;
        }
        while(curB != null){
            lB++;
            curB = curB.next;
        }
        ListNode secondA = headA;
        ListNode secondB = headB;

        if(lA > lB){
            for(int i=0;i<lA-lB;i++){
                secondA = secondA.next;
            }
        }else{
            for(int i=0;i<lB-lA;i++){
                secondB = secondB.next;
            }
        }

        while(secondA != null){
            if(secondA.val == secondB.val){
                return secondA;
            }
            secondA = secondA.next;
            secondB = secondB.next;
        }
        return null;
    }
}
