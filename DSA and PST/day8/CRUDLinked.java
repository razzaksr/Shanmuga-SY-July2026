package day8;

public class CRUDLinked {
    ListNode head;
    public void insert(int value){
        ListNode node = new ListNode(value);
        if(head==null) head=node;
        else{
            ListNode trav = head;
            while(trav.next!=null)trav = trav.next;
            trav.next = node;
        }
        System.out.println(value+" added into linkedlist");
    }
    public static void read(ListNode head){
        ListNode trav = head;
        while(trav!=null){
            System.out.print(trav.data+"->");
            trav = trav.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CRUDLinked crud = new CRUDLinked();
        crud.insert(42);crud.insert(91);
        crud.insert(36);crud.insert(16);
        crud.insert(19);crud.read(crud.head);
    }
}
