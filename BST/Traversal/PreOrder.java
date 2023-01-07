package BST.Traversal;
import java.util.Stack;

import BST.Node;

public class PreOrder{

    //Recursive approach
    public static void preOrderRecursive(Node root){

        if(root == null){
            return;
        }
        
        System.out.print(root.getData() + " ");
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());

    }

    //Iterative approach
    public static void preOrderIterative(Node root){
        Stack<Node> st =new Stack<>();
        Node curr =root;
        st.add(curr);
        while(!st.isEmpty()){
             curr = st.pop();
             System.out.print(curr.getData() + " ");

             if(curr.getRight() !=null) st.add(curr.getRight());
             if(curr.getLeft() !=null) st.add(curr.getLeft());
            
        }
    }
}