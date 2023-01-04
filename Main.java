import javax.sound.sampled.SourceDataLine;

import BST.BuildTree;
import BST.Node;
import BST.Traversal.*;
import java.util.*;

public class Main {

    public static void main(String args[]){
        int[] nodes = {1, 2, 3, 4 , -1 ,6 ,-1, -1, 7, -1, 8, -1, -1,9,-1,-1,10,-1,-1};
        Node root = BuildTree.buildTree(nodes);
        
        System.out.println();
        System.out.print("Tree root ");
        System.out.println(root.getData());
        
        System.out.print("Pre Order Traversal ");
        PreOrder.preOrderRecursive(root);
    }
    
}
