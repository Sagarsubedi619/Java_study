package BinarySearchTree;

public class BinaryTree {
    TreeNode rootNode;

    public void insert(int data){
        if(this.rootNode==null){
            this.rootNode=new TreeNode(data);
        }
        else{
            rootNode.insert(data);
            System.out.println("Succesfully inserted..");
        }

    }

    public int find(int data){
        if (this.rootNode!=null){
            int x=0;
            x=rootNode.find(data).getData();
            return x;

        }
        else {
            return 0;
        }
    }
}
