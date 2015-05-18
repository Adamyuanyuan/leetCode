package medium.problem1_20;

/**
 * Created by Adam on 2015/5/18.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

//altering the nodes' values is a better way, hahahhaha...
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode preMiddle = slow;
        ListNode preCurrent = slow.next;

        while(preCurrent.next!=null){
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            preMiddle.next = current;
            current.next = preMiddle.next;
        }

        slow = head;
        fast = preMiddle.next;
        while(slow!=preMiddle){
            preMiddle.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = preMiddle.next;
        }

    }

}
