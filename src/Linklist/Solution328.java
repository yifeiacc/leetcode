package Linklist;

/**
 * Created by yifei on 29/07/17.
 */
public class Solution328 {
    public static ListNode oddEvenList(ListNode head) {
        ListNode PreOdd = head;
        ListNode PreEven = head.next;
        ListNode CurNode = head.next.next;
        ListNode EvenHead = head.next;
        ListNode NextNode = null;
        int n = 3;
        while (CurNode != null){
            NextNode = CurNode.next;
            if( n % 2 == 0){
                PreEven.next = CurNode;
                PreEven = CurNode;
            }else {
                PreOdd.next = CurNode;
                PreOdd = CurNode;
            }
            CurNode = NextNode;
            n++;
        }
        PreOdd.next = EvenHead;
        return head;

    }public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a = oddEvenList(a);
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

    }

}
