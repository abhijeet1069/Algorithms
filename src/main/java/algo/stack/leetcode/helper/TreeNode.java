package algo.stack.leetcode.helper;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(this, sb, "", true);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb,
                             String prefix, boolean isTail) {

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ");

        if (node == null) {
            sb.append("null\n");
            return;
        }

        sb.append(node.val).append("\n");

        // Always print BOTH children
        String childPrefix = prefix + (isTail ? "    " : "│   ");

        buildString(node.left, sb, childPrefix, false);
        buildString(node.right, sb, childPrefix, true);
    }
}