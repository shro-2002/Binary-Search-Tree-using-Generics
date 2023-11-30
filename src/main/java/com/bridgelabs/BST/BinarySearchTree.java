package com.bridgelabs.BST;

/*
 * @description: Binary Search Tree using Generics
 * 
 * @Class Variables: root
 * 
 * @Class Methods: insert, addData, inorderTraversal, searchData, search, display, size, size1
 */
public class BinarySearchTree<T extends Comparable<T>> {
	private INode<T> root;

	/*
	 * @description: Constructor to initialize root
	 * 
	 * @param: void
	 * 
	 * @return: void
	 */
	public BinarySearchTree() {
		this.root = null;
	}

	/*
	 * @description: Method to insert data in BST
	 * 
	 * @param: root, value
	 * 
	 * @return: root
	 */
	INode<T> insert(INode<T> root, T value) {
		if (root == null) {
			root = new BinaryNode<T>(value);
			return root;
		}

		if ((root.getdata().compareTo(value)) > 0)
			root.setleft(insert(root.getleft(), value));
		else if (((root.getdata().compareTo(value)) < 0))
			root.setright(insert(root.getright(), value));

		return root;

	}

	/*
	 * @description: Method to add data in BST
	 * 
	 * @param: value
	 * 
	 * @return: void
	 */
	void addData(T value) {
		root = insert(root, value);
	}

	/*
	 * @description: Method to traverse BST in inorder traversal
	 * 
	 * @param: root, s
	 * 
	 * @return: void
	 */
	void inorderTraversal(INode<T> root, String s) {
		if (root == null)
			return;

		inorderTraversal(root.getleft(), "left->");
		System.out.println("Node->" + "at " + s + root.getdata());
		inorderTraversal(root.getright(), "right");

		System.out.println();

	}

	/*
	 * @description: Method to search data in BST
	 * 
	 * @param: root, data
	 * 
	 * @return: root
	 */
	INode<T> searchData(INode<T> root, T data) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.getdata() == data)
			return root;

		// Key is greater than root's key
		if ((root.getdata().compareTo(data)) < 0)
			return searchData(root.getright(), data);

		// Key is smaller than root's key
		return searchData(root.getleft(), data);
	}

	/*
	 * @description: Method to call search data in BST
	 * 
	 * @param: val
	 * 
	 * @return: root
	 */
	INode<T> search(T val) {
		return searchData(root, val);
	}

	/*
	 * @description: Method to display BST
	 * 
	 * @param: void
	 * 
	 * @return: void
	 */
	void display() {
		inorderTraversal(root, "root");
	}

	/*
	 * @description: Method to find size of BST
	 * 
	 * @param: root
	 * 
	 * @return: size
	 */
	int size(INode<T> root) {
		if (root == null)
			return 0;
		else
			return (size(root.getleft()) + 1 + size(root.getright()));
	}

	/*
	 * @description: Method to find size of BST
	 * 
	 * @param: void
	 * 
	 * @return: size
	 */
	int sizeofBST() {
		return size(root);

	}

}
