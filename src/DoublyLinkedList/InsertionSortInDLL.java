package DoublyLinkedList;

public class InsertionSortInDLL {
    public DoublyLinkedListImp sort(DoublyLinkedListImp aDoublyLinkedList){
        DoublyNode currentNode=aDoublyLinkedList.head;
        while (currentNode.getNext()!=null){
            DoublyNode nextNode=currentNode.getNext();
            if(currentNode.getData()>nextNode.getData()){
                int temp=currentNode.getData();
                currentNode.setData(nextNode.getData());
                nextNode.setData(temp);
                nextNode.setNext(currentNode);
                nextNode.setPrevious(currentNode.getPrevious());
                aDoublyLinkedList.head=nextNode;


            }
        }
        return aDoublyLinkedList;
    }
}
