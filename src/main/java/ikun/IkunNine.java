package ikun;

public class IkunNine {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        rec(root.left,root.right);
        return flag;
    }
    boolean flag=true;

    public void rec(TreeNode left,TreeNode right){
        if(left ==null || right==null){
            if (!(left ==null && right==null)) flag=false;
            return;
        }
        if(left.val != right.val){
            flag=false;
            return;
        }
        rec(left.right,right.left);
        rec(left.left,right.right);
    }
}
