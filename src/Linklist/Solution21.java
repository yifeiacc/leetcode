package Linklist;

import java.util.List;

/**
 * Created by yifei on 17/7/31.
 */
public class Solution21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while( l1 != null || l2 != null){
            if(l1 == null){
                dummy.next = l2;
                return head.next;
            }if(l2 == null){
                dummy.next = l1;
                return  head.next;
            }
            if(l1.val > l2.val){
                dummy.next = l2;
                l2 = l2.next;
            }else {
                dummy.next = l1;
                l1 = l1.next;
            }
            dummy = dummy.next;

        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(4);
        ListNode c1 = new ListNode(5);
        ListNode d1 = new ListNode(6);
        ListNode e1 = new ListNode(7);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        a = mergeTwoLists(a,a1);
        while(a != null){
            System.out.println(a.val);
            a = a.next;
        }

    }
}
