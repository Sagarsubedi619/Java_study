package BinarySearchTree;

public class TreeNode {
    public TreeNode(int data){
        this.data=data;
    }
    public int getData() {
        return data;
    }

    private int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode find(int data){
        if(this.data==data){
            return this;
        }
        if(data<this.data && leftChild!=null){
            return leftChild.find(data);
        }
        if(rightChild!=null){
            return rightChild.find(data);
        }
        return null;
    }

    public void insert(int data){
        if(data>=this.data){
            if(this.rightChild==null) {
                this.rightChild = new TreeNode(data);

            }
            else{rightChild.insert(data);}
        }
        else{
            if(this.leftChild==null){
            this.leftChild=new TreeNode(data);}
            else{
            leftChild.insert(data);}
        }
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
