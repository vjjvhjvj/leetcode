public class Demo7 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Demo.ListNode result=new Demo.ListNode(0,head);
        int length = getLength(result);
        Demo.ListNode cur=result;
        for(int i=0;i<length-n+1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        Demo.ListNode ans=result.next;
        return ans;
    }
    public int getLength(Demo.ListNode head){
        int length=0;
        while(head!=null){
            ++length;
            head=head.next;
        }
        return length;
    }
}
