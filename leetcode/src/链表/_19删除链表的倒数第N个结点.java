package 链表;

/**
 * @author Laurus
 * @Description
 * @ClassName _19删除链表的倒数第N个结点
 * @date 2023-09-21 17:00
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class _19删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode cur = head;
        ListNode pre = head;
        while (head.next!=null){
            count++;
            head = head.next;
        }
        for (int i = 0; i < count-n-1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
        int count = 1;
        ListNode cur = head;
        while (head.next!=null){
            count++;
            head = head.next;
        }
        for (int i = 0; i < count-2; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
}
