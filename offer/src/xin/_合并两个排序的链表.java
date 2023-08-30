package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _合并两个排序的链表
 * @date 2023-08-25 18:22
 */
public class _合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode pre = listNode;
        while (l1!=null && l2!=null){
            if(l1.val>= l2.val){
                listNode.next = l2;
                l2 = l2.next;
                listNode = listNode.next;
            }else {
                listNode.next = l1;
                l1 = l1.next;
                listNode = listNode.next;
            }
        }
        if(l1 == null){
            listNode.next = l2;
        }else {
            listNode.next = l1;
        }
        return pre.next;
    }
}
