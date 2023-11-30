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
		// if value < root data
		if ((root.getdata().compareTo(value)) > 0)
			root.setleft(insert(root.getleft(), value));

		// if value > root data
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
	 * @description: Method to traverse BST in inorder traversal(left,root,right)
	 * 
	 * @param: root, s
	 * 
	 * @return: void
	 */
	void inorderTraversal(INode<T> root) {
		if (root == null)
			return;

		System.out.println();
		inorderTraversal(root.getleft());
		System.out.println("Node->" + root.getdata());
		inorderTraversal(root.getright());

	}

	/*
	 * @description: Method to search data in BST
	 * 
	 * @param: root, data
	 * 
	 * @return: root
	 */
	INode<T> searchData(INode<T> root, T data) {

		if (root == null || root.getdata() == data)
			return root;

		if ((root.getdata().compareTo(data)) < 0)
			return searchData(root.getright(), data);

		return searchData(root.getleft(), data);
	}

	/*
	 * @description: Method to find the height of BST
	 * 
	 * @param: root
	 * 
	 * @return: int
	 */

	public int height(INode<T> root) {

		if (root == null) {
			return 0;
		}

		return 1 + Math.max(height(root.getleft()), height(root.getright()));
	}

	/*
	 * @description: Method to call height function of BST
	 * 
	 * @param: void
	 * 
	 * @return: int
	 */

	public int heightBST() {
		return height(root);
	}

	/*
	 * @description: Method to call search function in BST
	 * 
	 * @param: val
	 * 
	 * @return: root
	 */
	INode<T> search(T val) {
		return searchData(root, val);
	}

	/*
	 * @description: Method to call traversal function BST
	 * 
	 * @param: void
	 * 
	 * @return: void
	 */
	void display() {
		inorderTraversal(root);
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
	 * @description: Method to call size function of BST
	 * 
	 * @param: void
	 * 
	 * @return: size
	 */
	int sizeofBST() {
		return size(root);

	}

}
