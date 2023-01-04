package BST;

public class Node {

    int data;
    Node left;
    Node right;

    Node(int val){
        this.data = val;
        this.left =null;
        this.right =null;
    }
    
    public int getData(){
        return this.data;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setData(int dataVal){
        this.data =dataVal;
    }
}
