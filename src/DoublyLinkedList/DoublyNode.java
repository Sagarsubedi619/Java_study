package DoublyLinkedList;

public class DoublyNode {
    int Data;
    DoublyNode Next;
    DoublyNode Previous;
public DoublyNode(int data){
    this.Data=data;
}
    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public DoublyNode getNext() {
        return Next;
    }

    public void setNext(DoublyNode next) {
        Next = next;
    }

    public DoublyNode getPrevious() {
        return Previous;
    }

    public void setPrevious(DoublyNode previous) {
        Previous = previous;
    }

    @Override
    public String toString() {
        return "Data: "+this.Data;
    }
}
