package ikun;

public class IkunEleven {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        rec(root);
        return root;
    }

    public void rec(TreeNode t){
        if(t==null) return;
        //交换左右子树
        TreeNode temp=null;
        t.right=temp;
        t.right=t.left;
        t.left=temp;
        //左右子树交换
        rec(t.left);
        rec(t.right);
    }
}
