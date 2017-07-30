package Linklist;

/**
 * Created by yifei on 30/07/17.
 */
public class Solution24 {
    public static ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode CurNode = head.next;
        ListNode PreNode = head;
        head = head.next;

        while(CurNode != null && PreNode != null){
            PreNode.next = CurNode.next;
            CurNode.next = PreNode;
            if(PreNode.next == null||PreNode.next.next == null){
                break;
            }
            CurNode = PreNode;
            PreNode = PreNode.next;
            CurNode.next = PreNode.next;
            CurNode = PreNode.next;
        }
        return  head;

    }
}
