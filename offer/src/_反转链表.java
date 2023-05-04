import java.awt.*;

/**
 * @author Laurus
 * @Description
 * @ClassName _反转链表
 * @date 2023-05-04 22:23
 */
public class _反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur =temp;
        }
        return pre;
    }
}
