package day8;

public class MergeSortedLL {
    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode trav = head;
        while (l1!=null&&l2!=null) {
            if(l1.data<=l2.data)
                {trav.next=l1;l1=l1.next;}
            else {trav.next=l2;l2=l2.next;}
            trav=trav.next;
        }
        if(l1!=null)trav.next = l1;
        if(l2!=null)trav.next = l2;
        return head.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode sorted = merge(list1, list2);
        while(sorted!=null){
            System.out.println(sorted.data);
            sorted=sorted.next;
        }
    }
}
