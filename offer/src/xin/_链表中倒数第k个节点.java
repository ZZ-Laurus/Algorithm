package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _链表中倒数第k个节点
 * @date 2023-08-25 18:12
 */
public class _链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count  = 0;
        ListNode temp = head;
        while (temp.next!= null){
            count++;
            temp = temp.next;
        }
        for (int i = 0; i <= count-k; i++) {
            head = head.next;
        }
        return head;
    }
}
