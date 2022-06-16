package DoublyLinkedList;

import LinkedList.LinkedListImp;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
       DoublyLinkedListImp demo1=new DoublyLinkedListImp();
       InsertionSortInDLL sortdemo=new InsertionSortInDLL();
       demo1.InsertAtHead(10);
        demo1.InsertAtHead(20);
        demo1.InsertAtHead(30);
        demo1.InsertAtHead(40);
        //System.out.println(demo1);
       var x=sortdemo.sort(demo1);

       while (x.head.getNext()!=null){

           System.out.println(x.head.getNext());
       }

    }
}
