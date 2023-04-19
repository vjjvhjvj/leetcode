package niganma;

public class NiganmaEight {
    public static void main(String[] args) {

    }

    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }

    private int depth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=depth(root.left);
        int r=depth(root.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }
}
