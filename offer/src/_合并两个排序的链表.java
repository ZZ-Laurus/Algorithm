public class _合并两个排序的链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dum = new ListNode(0);
        ListNode cur = dum;
        while (l1!=null && l2!=null){
            if(l1.val < l2.val){
                dum.next = l1;
                dum = l1;
                l1 = l1.next;
            }else {
                dum.next = l2;
                dum = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            dum.next = l2;
        }else {
            dum.next = l1;
        }
        return cur.next;
    }

}
