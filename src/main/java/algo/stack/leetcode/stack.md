# Stack

This topic requires further effort.

Push when you want to postpone a decision.
Pop when you are ready to resume it.

Parentheses ()
•	Push ( → “I’m waiting for a )”
•	Pop on ) → “Expectation fulfilled”

## Binary Tree traversal

- Inorder Traversal (Left,Root,Right)
- Preorder Traversal (Root,Left,Right)
- Postorder Traversal (Left,Right,Root)

```java
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);

            curr = curr.right;
        }
        return result;
    }
```