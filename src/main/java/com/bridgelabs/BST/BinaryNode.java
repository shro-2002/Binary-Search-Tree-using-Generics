package com.bridgelabs.BST;

public class BinaryNode<T extends Comparable<T>> implements INode<T> {
	private T data;
	private INode<T> left;
	private INode<T> right;

	public BinaryNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	@Override
	public T getdata() {
		return data;
	}

	@Override
	public INode<T> getleft() {
		return left;
	}

	@Override
	public INode<T> getright() {
		return right;
	}

	@Override
	public void setleft(INode<T> left) {
		this.left = left;
	}

	@Override
	public void setright(INode<T> right) {
		this.right = right;

	}

	@Override
	public void setdata(T data) {
		this.data = data;

	}

}
