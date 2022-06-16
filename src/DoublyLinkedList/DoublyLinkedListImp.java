package DoublyLinkedList;

import LinkedList.Node;

public class DoublyLinkedListImp {
    DoublyNode head;


    public void InsertAtHead(int Data){
        DoublyNode newNode= new DoublyNode(Data);
        newNode.setNext(head);
        if(head!=null){
            head.setPrevious(newNode);
        }
        head=newNode;

    }


    @Override
    public String toString() {
        String result="{";
       DoublyNode currentHead=this.head;
        while(currentHead!=null){
            result+= currentHead+" ,";
            currentHead=currentHead.getNext();
        }
        result+="}";
        return  result;
    }


}
