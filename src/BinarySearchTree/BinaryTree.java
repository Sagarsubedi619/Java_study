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

    public TreeNode find(int data){
        if (this.rootNode!=null){

            return rootNode.find(data);


        }
        else {
            return null;
        }
    }

    public void Delete(int data){
        TreeNode itemsToDelete=rootNode.find(data);
        itemsToDelete.Delete();
    }
}
