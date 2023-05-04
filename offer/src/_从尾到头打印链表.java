/**
 * @author Laurus
 * @Description
 * @ClassName _从头到尾打印链表
 * @date 2023-05-04 22:07
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



public class _从尾到头打印链表 {

    public int[] reversePrint(ListNode head) {
//        if(head == null){
//            return new int[0];
//        }
//        int count = 0;
//        Stack<ListNode> stack = new Stack<>();
//        while (head!=null){
//            stack.add(head);
//            head = head.next;
//            count++;
//        }
//        int[] nums = new int[count];
//        for (int i = 0; i < count; i++) {
//            nums[i] = stack.pop().val;
//        }
//        return nums;

        recur(head);
        return res;
    }

    //递归写法
    int[] res;
    //用来计入重入次数
    int count;
    //数组下标
    int index = 0;
    private void recur(ListNode head) {
        //结束条件
        if(head == null){
            //
            res = new int[count];
            return;
        }
        count++;
        recur(head.next);
        res[index++] = head.val;
    }





}
