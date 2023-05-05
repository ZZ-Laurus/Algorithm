public class _链表中倒数第k个节点 {

    public ListNode getKthFromEnd(ListNode head, int k) {

         int count = 0;
         ListNode cur = head;
         while (cur!=null){
             count++;
             cur = cur.next;
         }
         cur = head;
        for (int i = 0; i < count-k; i++) {
            cur = cur.next;
        }
        return cur;
    }

}
