import javax.sound.sampled.SourceDataLine;

import BST.BuildTree;
import BST.Node;
import BST.Traversal.*;
import java.util.*;
import Concepts.*;
import Concepts.Stacks.NearestGreater;
import Concepts.Stacks.NearestSmallest;
import Concepts.Stacks.StockSpan;

public class Main {

    public static void main(String args[]){
        int[] nodes = {1, 2, 3, 4 , -1 ,6 ,-1, -1, 7, -1, 8, -1, -1,9,-1,-1,10,-1,-1};
        Node root = BuildTree.buildTree(nodes);
        
        // System.out.println();
        // System.out.print("Tree root ");
        // System.out.println(root.getData());
        
        // //Pre Order Traversal
        // System.out.print("Pre Order Traversal Recursive ");
        // PreOrder.preOrderRecursive(root);
        
        // System.out.println();
        // System.out.print("Pre Order Traversal Iterative ");
        // PreOrder.preOrderIterative(root);

        // //In Order Traversal
        // System.out.println();
        // System.out.print("In Order Traversal Recursive ");
        // InOrder.inOrderRecursive(root);
        
        // System.out.println();
        // System.out.print("In Order Traversal Iterative ");
        // InOrder.inOrderIterative(root);

        // //Post Order Traversal
        // System.out.println();
        // System.out.print("Post Order Traversal Recursive ");
        // PostOrder.postOrderRecursive(root);
        
        // System.out.println();
        // System.out.print("Post Order Traversal Iterative ");
        // PostOrder.postOrderIterative1(root);

        // System.out.println();
        // System.out.print("Post Order Traversal Iterative ");
        // PostOrder.postOrderIterative2(root);


        //Stack
        // int[] nums ={4,5,2,10,8};

        // System.out.println();
        // int[] finalRes= NearestGreater.nearestGreaterRight(nums);
        // System.out.print("Nearest Greater element to right ");
        // for(int num: finalRes){
        //     System.out.print(num +" ");
        // }

        // System.out.println();
        // int[] finalResSmall= NearestSmallest.nearestSmallestLeft(nums);
        // System.out.print("Nearest Smallest element to left ");
        // for(int num: finalResSmall){
        //     System.out.print(num +" ");

        //Stock Span
        System.out.println();
        int[] nums ={100,80,60,70,60,75,85};
        int[] finalRes= StockSpan.stockSpan(nums);
        System.out.print("Stock Span ");
        for(int num: finalRes){
            System.out.print(num +" ");
        }
    }
    
}
