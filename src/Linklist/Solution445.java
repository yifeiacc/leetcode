package Linklist;

import Linklist.ListNode;

/**
 * Created by yifei on 29/07/17.
 */

public class Solution445 {
    public static ListNode reverse(ListNode CurNode) {
        ListNode PreNode = null;
        while (CurNode != null) {
            ListNode NextNode = CurNode.next;
            CurNode.next = PreNode;
            PreNode = CurNode;
            CurNode = NextNode;
        }
        return PreNode;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode rl = new ListNode(1);
        ListNode q = rl;
        int n = 0;
        int r = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                r = l1.val + l2.val + n;
                //System.out.println(r);
                l1 = l1.next;
                l2 = l2.next;

            } else if (l1 == null) {
                r = l2.val + n;
                l2 = l2.next;
                //System.out.println(r);
            } else {
                r = l1.val + n;
                l1 = l1.next;
                //System.out.println(r);
            }
            if (r >= 10) {
                r = r % 10;
                n = 1;
            } else {
                n = 0;
            }
            rl.next = new ListNode(r);
            rl = rl.next;
            //System.out.println(1);

        }
        if (n == 1) {
            q.next = reverse(q.next);
            return q;
        }
        return reverse(q.next);

    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode a1 = new ListNode(9);
        ListNode b1 = new ListNode(2);
        ListNode c1 = new ListNode(0);
        a.next = b;
        b.next = c;
        a1.next = b1;
        b1.next = c1;

        c = addTwoNumbers(a,a1);
        System.out.println(c.val);
        System.out.println(c.next.val);
        System.out.println(c.next.next.val);
        System.out.println(c.next.next.next.val);

    }

}
