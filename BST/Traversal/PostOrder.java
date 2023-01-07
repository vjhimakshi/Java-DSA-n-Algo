package BST.Traversal;
import BST.Node;
import java.util.*;

public class PostOrder {
    
    //Recursive Approach
    public static void postOrderRecursive(Node root){
        if(root == null ){
            return;
        }

        postOrderRecursive(root.getLeft());
        postOrderRecursive(root.getRight());
        System.out.print(root.getData()+" ");
    }

    //Iterative Approach (with 2 stack)
    public static void postOrderIterative2(Node root){
        Stack<Node> currSt =new Stack<>();
        Stack<Node> prev =new Stack<>();
        return;

    }

    //Iterative Approach (with 1 stack)
    public static void postOrderIterative1(Node root){
        return;
    }
}
