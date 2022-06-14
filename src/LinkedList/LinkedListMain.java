package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListImp demo1=new LinkedListImp();
        demo1.createHead(10);
        demo1.createHead(20);
        demo1.createHead(30);
        demo1.createHead(40);
        demo1.createHead(90);
        demo1.createHead(80);
        demo1.createHead(70);
        System.out.println(demo1);
    }
}
