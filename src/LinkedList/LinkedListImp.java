package LinkedList;

public class LinkedListImp {
    Node head;

    public void createHead(int data){
        Node newNode=new Node(data);
        newNode.setNextNode(head);
        head=newNode;
    }

    @Override
    public String toString() {
        String result="{";
   Node current=this.head;

   while(current!=null){
       result+= current.toString()+" ,";
       current=current.getNextNode();
   }
   result+="}";
  return  result;
    }
}
