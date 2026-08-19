package day8;

public class AddTwoNumInLL {
    public static ListNode add(ListNode l1, ListNode l2){
        ListNode prev = new ListNode(0);
        ListNode trav = prev;
        int carry=0, sum=0;
        while(l1!=null||l2!=null||carry!=0){
            sum=carry;
            if(l1!=null){sum+=l1.data;l1=l1.next;}
            if(l2!=null){sum+=l2.data;l2=l2.next;}
            carry = sum/10;
            trav.next = new ListNode(sum%10);
            trav=trav.next;
        }
        return prev.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        ListNode cumulative = add(head1,head2);
        CRUDLinked.read(cumulative);
        head1 = new ListNode(1);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(7);
        head2 = new ListNode(4);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(6);
        cumulative = add(head1,head2);
        CRUDLinked.read(cumulative);
    }
}
