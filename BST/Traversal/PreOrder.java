package BST.Traversal;
import BST.Node;

public class PreOrder{

    public static void preOrderRecursive(Node root){

        if(root == null){
            return;
        }
        
        System.out.print(root.getData() + " ");
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());

    }
}