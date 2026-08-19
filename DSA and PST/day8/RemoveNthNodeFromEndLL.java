package day8;

public class RemoveNthNodeFromEndLL {
    public static ListNode remove(ListNode head, int pos){
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode start = prev,end = prev;
        for(int ind=0;ind<=pos;ind++) end = end.next;
        while(end!=null){
            start=start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return prev.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        ListNode reversed = remove(head,2);
        CRUDLinked.read(reversed);
        head = new ListNode(1);
        reversed = remove(head,1);
        CRUDLinked.read(reversed);
        head = new ListNode(10);
        head.next = new ListNode(20);
        reversed = remove(head,1);
        CRUDLinked.read(reversed);
    }
}
