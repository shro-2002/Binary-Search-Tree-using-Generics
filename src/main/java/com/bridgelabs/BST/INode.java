package com.bridgelabs.BST;

/*
 * @ Description: interface for the Node class of Generic type
 * 
 * @Methods: Getters and Setters for the data, left and right node
 */
public interface INode<T extends Comparable<T>> {

	/*
	 * @Description: To get the data of the node
	 * 
	 * @param: None
	 * 
	 * @return: T data of the node
	 */
	T getdata();

	/*
	 * @Description: To get the left node of the node
	 * 
	 * @param: None
	 * 
	 * @return: INode<T> left node of the node
	 */
	INode<T> getleft();

	/*
	 * @Description:To get the right node of the node
	 * 
	 * @param: None
	 * 
	 * @return: INode<T> right node of the node
	 */
	INode<T> getright();

	/*
	 * @Description: To set the data of the node
	 * 
	 * @param: T data of the node
	 * 
	 * @return: None
	 */
	void setdata(T data);

	/*
	 * @Description:To set the left node of the node
	 * 
	 * @param: INode<T> left node of the node
	 * 
	 * @return: None
	 */
	void setleft(INode<T> left);

	/*
	 * @Description:To set the right node of the node
	 * 
	 * @param: INode<T> right node of the node
	 * 
	 * @return: None
	 */
	void setright(INode<T> right);

}
