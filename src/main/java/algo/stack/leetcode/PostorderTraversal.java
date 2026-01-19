package algo.stack.leetcode;

import leetcode.stack.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode peek = stack.peek();
                // if right child exists and not processed yet, go right
                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    // both children done → visit
                    result.add(peek.val);
                    lastVisited = stack.pop();
                }
            }
        }
        return result;
    }
}
