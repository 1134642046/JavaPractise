package niuke;

import java.util.ArrayList;
import java.util.List;

class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

public class offer_3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        int i, j;
        List list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        for (i = 0; listNode != null; i++) {
            list.add(listNode);
            listNode = listNode.next;
        }
        for (j = i-1; j > 0; j--) {
            int a = ((ListNode)list.get(j)).val;
            list2.add(a);
        }
        return list2;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode ll = listNode;
        for (int i = 2; i < 10; i++) {
            ListNode n = new ListNode(i);
            listNode.next = n;
            listNode = n;
        }
        ArrayList <Integer> list = printListFromTailToHead(ll);
        System.out.println(list);
    }
}
