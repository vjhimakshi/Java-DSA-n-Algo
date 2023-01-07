package BST.Traversal;
import BST.Node;
import java.util.*;

public class InOrder {
    
    //Recursive approach
    public static void inOrderRecursive(Node root){
        if(root == null){
            return;
        }

        inOrderRecursive(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrderRecursive(root.getRight());
    }

    //Iterative approach
    public static void inOrderIterative(Node root){
        Stack<Node> st=new Stack<>();
        Node curr = root;

        while(curr!= null || !st.isEmpty()){
            while(curr !=null){
                st.add(curr);
                curr= curr.getLeft();
            }
            curr= st.pop();
            System.out.print(curr.getData() + " ");
            curr=curr.getRight();
        }

    }


}
