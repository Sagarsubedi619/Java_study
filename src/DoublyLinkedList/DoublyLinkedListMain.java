package DoublyLinkedList;

import LinkedList.LinkedListImp;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
       DoublyLinkedListImp demo1=new DoublyLinkedListImp();
       demo1.InsertAtHead(10);
        demo1.InsertAtHead(20);
        demo1.InsertAtHead(30);
        demo1.InsertAtHead(40);
       /* demo1.InsertAtTail(15);
        demo1.InsertAtTail(25);
        demo1.InsertAtTail(35);
        demo1.InsertAtTail(45);*/
        System.out.println(demo1);
    }
}
