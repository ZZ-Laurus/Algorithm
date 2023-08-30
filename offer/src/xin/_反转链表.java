package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _反转链表
 * @date 2023-08-25 18:15
 */
public class _反转链表 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
