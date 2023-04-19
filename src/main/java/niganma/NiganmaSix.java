package niganma;

public class NiganmaSix {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        while (root !=null){
            if (root.left==null){
                root=root.right;
            }else{
                TreeNode pre=root.left;
                while (pre.right!=null){
                    pre=pre.right;
                }
                //将原来的左子树接到右子树节点
                pre.right=root.right;
                //将左子树接到右子树节点
                root.right=root.left;
                root.left=null;
                //考虑下一个节点
                root=root.right;
            }
        }
    }
}
