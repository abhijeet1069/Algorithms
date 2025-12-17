package skeina.ds.bst;

public class BST<T extends Number & Comparable<T>> {

	public static class Node<T> {
		public T item;
		public Node<T> parent;
		public Node<T> left;
		public Node<T> right;

		public Node(T item) {
			this.item = item;
		}

		@Override
		public String toString() {
			return String.valueOf(item);
		}
	}

	private Node<T> root;
	private int size = 0;

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		return size;
	}

	public Node<T> getRoot() {
		return root;
	}

	public Node<T> search(T key) {
		Node<T> x = root;
		while (x != null) {
			int cmp = key.compareTo(x.item);
			if (cmp == 0)
				return x;
			x = (cmp < 0) ? x.left : x.right;
		}
		return null;
	}

	public Node<T> minimum(Node<T> node) {
		if (node == null)
			return null;
		while (node.left != null)
			node = node.left;
		return node;
	}

	public Node<T> maximum(Node<T> node) {
		if (node == null)
			return null;
		while (node.right != null)
			node = node.right;
		return node;
	}

	public Node<T> insert(T key) {
		Node<T> newNode = new Node<>(key);
		Node<T> parent = null;
		Node<T> current = root;

		while (current != null) {
			parent = current;
			int cmp = key.compareTo(current.item);
			if (cmp < 0)
				current = current.left;
			else
				current = current.right;
		}

		newNode.parent = parent;
		if (parent == null)
			root = newNode;
		else if (key.compareTo(parent.item) < 0)
			parent.left = newNode;
		else
			parent.right = newNode;
		size++;
		return newNode;

	}

	public void print() {
		if (root == null) {
			System.out.println("(empty)");
			return;
		}
		print(root, "", true);
	}

	private void print(Node<T> node, String prefix, boolean isTail) {
		System.out.println(prefix + (isTail ? "└── " : "├──") + node);

		// Collect children (left, right)
		Node<T>[] children = getChildren(node);

		for (int i = 0; i < children.length; i++) {
			boolean last = (i == children.length - 1);
			print(children[i], prefix + (isTail ? "    " : "│   "), last);
		}
	}

	@SuppressWarnings("unchecked")
	private Node<T>[] getChildren(Node<T> node) {
		// dynamically return non-null children
		if (node.left != null && node.right != null)
			return new Node[] { node.left, node.right };
		else if (node.left != null)
			return new Node[] { node.left };
		else if (node.right != null)
			return new Node[] { node.right };
		else
			return new Node[0];
	}

	public boolean delete(Node<T> node) {
		if (node == null)
			return false;

		// no left child -> replace node with its right child
		if (node.left == null)
			transplant(node, node.right);

		// no right child -> replace node with its left child
		else if (node.right == null)
			transplant(node, node.left);

		// both children exist -> replace with in-order successor
		else {
			Node<T> succ = minimum(node.right);

			if (succ.parent != node) {
				// Move successor up: replace successor with its right child
				transplant(succ, succ.right);

				// Attach node's right subtree to successor
				succ.right = node.right;
				if (succ.right != null)
					succ.right.parent = succ;
			}
			// Replace node with successor
			transplant(node, succ);

			// Attach node's left subtree to successor
			succ.left = node.left;
			if (succ.left != null)
				succ.left.parent = succ;
		}
		size--;

		// Clear removed node's pointers
		node.parent = node.left = node.right = null;
		return true;
	}

	private void transplant(Node<T> target, Node<T> replacement) {
		if (target == null)
			return;

		// target is root
		if (target.parent == null)
			root = replacement;

		// target is a left child
		else if (target == target.parent.left)
			target.parent.left = replacement;

		else
			target.parent.right = replacement;

		if (replacement != null)
			replacement.parent = target.parent;
	}
	
	/**
	 * Returns the inorder successor of the given node, or null if it has none.
	 */
	public Node<T> successor(Node<T> node) {
	    if (node == null) return null;

	    // Case 1: right subtree exists → successor is leftmost node in right subtree
	    if (node.right != null) {
	        return minimum(node.right);
	    }

	    // Case 2: no right subtree → go up until we find a node that's a left child
	    Node<T> current = node;
	    Node<T> parent = current.parent;

	    while (parent != null && current == parent.right) {
	        current = parent;
	        parent = parent.parent;
	    }

	    return parent; // may be null if node is the largest
	}
	
	public int sum() {
		return sumAllNodes(root);
	}
	
	private int sumAllNodes(Node<T> node) {
		if(node == null)
			return 0;
		return node.item.intValue() + 
				sumAllNodes(node.left) + 
				sumAllNodes(node.right);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 13, 12, 3, 2, 12, 4 };
		BST<Integer> bst = new BST<>();
		for (int x : arr)
			bst.insert(x);
		bst.print();
	}
}
