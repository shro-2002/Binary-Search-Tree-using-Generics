package com.bridgelabs.BST;

/*
 * @Description - To create a Binary Node of Generic type which implements INode interface
 * 
 * @Properties: data, left, right
 * 
 * @Behaviour - getdata(), getleft(), getright(), setleft(), setright(), setdata()
 */
public class BinaryNode<T extends Comparable<T>> implements INode<T> {
	private T data;
	private INode<T> left;
	private INode<T> right;

	/*
	 * @Description - Constructor to initialize the data
	 * 
	 * @param: T data
	 * 
	 * @return: void
	 */

	public BinaryNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/*
	 * @Description - To get the data of the node
	 * 
	 * @param: None
	 * 
	 * @return: T data of the node
	 */
	@Override
	public T getdata() {
		return data;
	}

	/*
	 * @Description - To get the left node of the node
	 * 
	 * @param: None
	 * 
	 * @return: INode<T> left of the node
	 */
	@Override
	public INode<T> getleft() {
		return left;
	}

	/*
	 * @Description - To get the right node of the node
	 * 
	 * @param: None
	 * 
	 * @return: INode<T> right of the node
	 */
	@Override
	public INode<T> getright() {
		return right;
	}

	/*
	 * @Description - To set the left node of the node
	 * 
	 * @param: INode<T> left of the node
	 * 
	 * @return: void
	 */
	@Override
	public void setleft(INode<T> left) {
		this.left = left;
	}

	/*
	 * @Description - To set the right node of the node
	 * 
	 * @param: INode<T> right of the node
	 * 
	 * @return: void
	 */

	@Override
	public void setright(INode<T> right) {
		this.right = right;

	}

	/*
	 * @Description - To set the data of the node
	 * 
	 * @param: T data of the node
	 * 
	 * @return: void
	 */
	@Override
	public void setdata(T data) {
		this.data = data;

	}

}
