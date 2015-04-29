package easy.problem1_20;

/**
 * Created by Adam on 2015/4/24.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveLinkListElements {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) {
            head = head.next;
        }
        ListNode currentNode = head;
        while(currentNode !=null && currentNode.next != null){
            if(currentNode.next.val==val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }

        }
        return head;

    }
}
