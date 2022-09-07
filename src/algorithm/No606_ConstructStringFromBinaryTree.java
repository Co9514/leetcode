package algorithm;

import structure.TreeNode;

public class No606_ConstructStringFromBinaryTree {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root == null) return null;
        sb.append(root.val);
        if(root.left == null && root.right != null){
            sb.append("()");
        }else if(root.left != null) {
            sb.append('(');
            tree2str(root.left);
            sb.append(')');
        }
        if(root.right != null) {
            sb.append('(');
            tree2str(root.right);
            sb.append(')');
        }
        return sb.toString();
    }
}
