package com.bridgelabs.BST;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		// Use case-1
		tree.addData(56);
		tree.addData(30);
		tree.addData(70);

		System.out.println("Size of tree: " + tree.sizeofBST());

		tree.display();
	}

}
