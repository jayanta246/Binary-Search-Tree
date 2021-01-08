package com.bst;

public class TreeNode 
{
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data)
	{
		super();
		this.data=data;
	}

	public int getData()
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public TreeNode getLeftChild() 
	{
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) 
	{
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild()
	{
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) 
	{
		this.rightChild = rightChild;
	}

	@Override
	public String toString()
	{
		return String.valueOf(data);
	}
	
	
}
