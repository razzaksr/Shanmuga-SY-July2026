package day8;

public class ReverseLL {
    public static ListNode reverse(ListNode head){
        ListNode prev= null, trav = head;
        while(trav!=null){
            ListNode forward = trav.next;
            trav.next = prev;
            prev= trav;
            trav=forward;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        ListNode reversed = reverse(head);
        CRUDLinked.read(reversed);
    }
}
