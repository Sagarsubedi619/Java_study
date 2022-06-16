package DoublyLinkedList;

import LinkedList.Node;

public class DoublyLinkedListImp {
    DoublyNode head;
    DoublyNode tail;

    public void InsertAtHead(int Data){
        DoublyNode newNode= new DoublyNode(Data);
        newNode.setNext(head);
        head=newNode.getNext();
    }
    public void InsertAtTail(int Data){
        DoublyNode newNode=new DoublyNode(Data);
        newNode.setPrevious(tail);
        tail=newNode.getPrevious();
    }

    @Override
    public String toString() {
        String result="{";
       DoublyNode currentHead=this.head;
        while(currentHead!=null){
            result+= currentHead.toString()+" ,";
            currentHead=currentHead.getNext();
        }
        result+="}";
        return  result;
    }


}
