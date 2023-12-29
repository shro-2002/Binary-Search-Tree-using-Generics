# Binary Search Tree (BST) with Generics

This project implements a Binary Search Tree (BST) in Java using generics. The BST is designed to work with any comparable data type.

## Table of Contents

- [About Binary Search Tree](#about-binary-search-tree)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Use Cases](#use-cases)
  - [UC_1_Create_BST_Using_INode](#uc-1-create-bst-using-inode)
  - [UC_2_Check_if_All_Nodes_are_Inserted_using_Size_Method](#uc-2-check-if-all-nodes-are-inserted-using-size-method)
  - [UC_3_Search_Method_To_Find_Data_in_Binary_Tree](#uc-3-search-method-to-find-data-in-binary-tree)

## About Binary Search Tree

A Binary Search Tree is a data structure that maintains sorted data and provides efficient search, insertion, and deletion operations. Each node in the tree has at most two children, referred to as the left child and the right child.

## Project Structure

The project is organized into the following components:

- **INode Interface:** Represents the interface for the nodes of the BST.
- **BinaryNode Class:** Implements the INode interface to create binary tree nodes.
- **BinarySearchTree Class:** Implements the Binary Search Tree with generic support for any comparable data type.
- **BSTMain Class:** Contains the main method with sample use cases.

## Usage

To use the Binary Search Tree in your Java project, follow these steps:

1. Clone the repository.
2. Import the necessary classes into your project.
3. Create an instance of the `BinarySearchTree` class with the desired data type.
4. Use the `addData` method to insert elements into the BST.
5. Utilize other methods such as `sizeofBST`, `heightBST`, and `search` as needed.

## Use Cases

### [UC_1_Create_BST_Using_INode](https://github.com/shro-2002/Binary-Search-Tree-using-Generics/tree/UC_1_Create_BST_Using_INode)

This use case involves creating a Binary Search Tree (BST) using the INode interface. Nodes with various data values are inserted into the tree to simulate different scenarios. This showcases the fundamental process of constructing a BST.

### [UC_2_Check_if_All_Nodes_are_Inserted_using_Size_Method](https://github.com/shro-2002/Binary-Search-Tree-using-Generics/tree/UC_2_Check_if_All_Nodes_are_Inserted_using_Size_Method)

In this use case, the focus is on verifying if all nodes have been successfully inserted into the Binary Search Tree. The sizeofBST method is utilized to determine the size of the tree, providing insight into the effectiveness of the insertion process.

### [UC_3_Search_Method_To_Find_Data_in_Binary_Tree](https://github.com/shro-2002/Binary-Search-Tree-using-Generics/tree/UC_3_Search_Method_To_Find_Data_in_Binary_Tree)

The third use case demonstrates the practical application of the search method. It showcases how to find specific data within the Binary Tree. If the data is found, it prints a success message; otherwise, it indicates that the data is not present in the tree. This use case highlights the search functionality of the Binary Search Tree.


