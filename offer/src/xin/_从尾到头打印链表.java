package xin;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Laurus
 * @Description
 * @ClassName _从尾到头打印链表
 * @date 2023-08-25 16:24
 */

 public class _从尾到头打印链表 {

    public static int[] reversePrint(ListNode head) {
        //递归
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        res(head,arrayList);
        System.out.println(arrayList);
        return null;
    }

    public static void  res(ListNode head,ArrayList arrayList){
        if(head.next == null){
            arrayList.add(head.val);
            return;
        }
        else {
            res(head.next,arrayList);
            arrayList.add(head.val);
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        reversePrint(listNode);
    }
}
