package niuke;

import java.util.ArrayList;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class offer14 {

    public static ListNode FindKthToTail(ListNode head,int k) {
        int count = 0;
        ListNode p1 = head;//第一个指针，找到第k个数
        ListNode p2 = null;//第二个指针，第一个指针找到k之后指向头节点
        if(k == 0){
            return null;
        }
        for (int i = 1;p1 != null; i++) {
            if (i > k){
                p2 = p2.next;
                p1 = p1.next;
            }else if (i == k){
                p2 = head;
                p1 = p1.next;
            }else{
                p1 = p1.next;
            }
        }

        return p2;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode ll = listNode;
        Solution s = new Solution();
        for (int i = 2; i < 10; i++) {
            ListNode n = new ListNode(i);
            listNode.next = n;
            listNode = n;
        }
        ListNode list = FindKthToTail(ll,10);
        System.out.println(list);
    }

}
