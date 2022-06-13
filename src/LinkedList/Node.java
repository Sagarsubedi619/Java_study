package LinkedList;

public class Node {
    int Data;
    Node NextNode;
    public Node(int Data){
        this.Data=Data;
    }
    public int getData() {
        return Data;
    }
    public void setData(int data) {
        this.Data=data;
    }
    public Node getNextNode() {
        return NextNode;
    }
    public void setNextNode(Node nextNode) {
        NextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: "+this.Data;
    }
}
