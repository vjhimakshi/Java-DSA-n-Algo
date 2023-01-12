package Grind75.Week1;

public class InvertBT {

    //Recursive
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        // invertTree(root.left);
        // TreeNode temp=root.left;
        // root.left=root.right;
        // invertTree(root.right);
        // root.right=temp;

        TreeNode left=invertTree(root.left);
        TreeNode right =invertTree(root.right);
        root.left=right;
        root.right=left;

        return root;
    }

    //Iterative
    
}
