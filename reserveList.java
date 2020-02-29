public class reserveList {
    public ListNode ReverseList(ListNode head) {
        ListNode result=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=result;
            result=cur;
            cur=next;
        }
        return result;
    }
}