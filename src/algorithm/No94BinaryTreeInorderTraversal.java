package algorithm;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No94BinaryTreeInorderTraversal {
    List<Integer> orderList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return orderList;
        }
        inorderTraversal(root.left);
        orderList.add(root.val);
        inorderTraversal(root.right);
        return orderList;
    }
}
