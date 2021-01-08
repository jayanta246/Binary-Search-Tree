package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Search_Tree 
{
	//Insert a Node into a BST
	public TreeNode insertNode(TreeNode root, int data)
	{
		TreeNode node=new TreeNode(data);
		if(root==null)
		{
			return node;
		}
		
		if(node.getData()<=root.getData())
		{
			root.setLeftChild(insertNode(root.getLeftChild(),data));
		}
		else
		{
			root.setRightChild(insertNode(root.getRightChild(),data));
		}
		return root;
	}
	
	//Breadth-first-traversal of a tree
	public void breadth_First_Traversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		Queue<TreeNode>queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			TreeNode temp=queue.remove();
			System.out.println(temp);
			
			if(temp.getLeftChild()!=null)
			{
				queue.add(temp.getLeftChild());
			}
			if(temp.getRightChild()!=null)
			{
				queue.add(temp.getRightChild());
			}
		}
		System.out.println("Null");
	}
	
	//Depth_First_Traversal
	public void pre_Order_Traversal(TreeNode root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			pre_Order_Traversal(root.getLeftChild());
			pre_Order_Traversal(root.getRightChild());
		}
	}
	
	//In-Order Traversal
	public void in_Order_Traversal(TreeNode root)
	{
		if(root!=null)
		{
			in_Order_Traversal(root.getLeftChild());
			System.out.println(root.getData());
			in_Order_Traversal(root.getRightChild());
		}
	}
	
	//Post-order Traversal
	public void post_Order_Traversal(TreeNode root)
	{
		if(root!=null)
		{
			post_Order_Traversal(root.getLeftChild());
			post_Order_Traversal(root.getRightChild());
			System.out.println(root.getData());
		}
	}
	
	//Find the Minimum value present in a BST
	public int find_Min_Value(TreeNode root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		if(root.getLeftChild()==null)
		{
			return root.getData();
		}
		return find_Min_Value(root.getLeftChild());
	}
	
	//Find Maximum value present in a BST
	public int find_Max_Value(TreeNode root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		if(root.getRightChild()==null)
		{
			return root.getData();
		}
		return find_Max_Value(root.getRightChild());
	}
	
	//Max Depth of a BST
	public int max_Depth(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.getLeftChild()==null && root.getRightChild()==null)
		{
			return 0;
		}
		
		int leftDepth= 1+ max_Depth(root.getLeftChild());
		int rightDepth=1+max_Depth(root.getRightChild());
		return Math.max(leftDepth, rightDepth);
		
	}
	
	//Mirror of a BST
	public void mirror(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		mirror(root.getLeftChild());
		mirror(root.getRightChild());
		TreeNode Temp=root.getLeftChild();
		root.setLeftChild(root.getRightChild());
		root.setRightChild(Temp);
	}
}
