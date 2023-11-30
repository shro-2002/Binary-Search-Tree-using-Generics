package com.bridgelabs.BST;

public interface INode<T extends Comparable<T>> {

	T getdata();

	INode<T> getleft();

	INode<T> getright();

	void setdata(T data);

	void setleft(INode<T> left);

	void setright(INode<T> right);

}
