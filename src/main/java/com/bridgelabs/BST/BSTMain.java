package com.bridgelabs.BST;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		// Use case-2
		tree.addData(56);
		tree.addData(30);
		tree.addData(70);
		tree.addData(22);
		tree.addData(40);
		tree.addData(60);
		tree.addData(95);
		tree.addData(11);
		tree.addData(65);
		tree.addData(3);
		tree.addData(16);
		tree.addData(63);
		tree.addData(67);

		System.out.println("Size of tree: " + tree.sizeofBST());
		System.out.println("Height of tree: " + tree.heightBST());

		// use case-3
		if (tree.search(65) == null)
			System.out.print("Not Found");
		else
			System.out.print("Found: " + tree.search(63).getdata());

		tree.display();
	}

}
