package niganma;

public class NiganmaSeven {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        TreeNode root3=new TreeNode(root1.val+root2.val);
        root3.left=mergeTrees(root1.left,root2.left);
        root3.right=mergeTrees(root1.right,root2.right);
        return root3;
    }
}
