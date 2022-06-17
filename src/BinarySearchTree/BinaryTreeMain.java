package BinarySearchTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree demo1=new BinaryTree();
        demo1.insert(6);
        demo1.insert(5);
        demo1.insert(4);

        System.out.println(demo1.find(4));

    }
}
