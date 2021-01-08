package com.bst;

public class BST_Main 
{

	public static void main(String[] args) 
	{
		Binary_Search_Tree bst=new Binary_Search_Tree ();
		TreeNode root=null;
		root=bst.insertNode(root, 25);
		root=bst.insertNode(root, 20);
		root=bst.insertNode(root, 15);
		root=bst.insertNode(root, 27);
		root=bst.insertNode(root, 30);
		root=bst.insertNode(root, 29);
		root=bst.insertNode(root, 26);
		root=bst.insertNode(root, 22);
		root=bst.insertNode(root, 22);
		root=bst.insertNode(root, 32);
		
		System.out.println("Breadth First Traversal");
		bst.breadth_First_Traversal(root);
		System.out.println("************************");
		
		System.out.println("pre-oreder-traversal");
		bst.pre_Order_Traversal(root);
		System.out.println("************************");
		
		System.out.println("in-order traversal");
		bst.in_Order_Traversal(root);
		System.out.println("************************");
		
		System.out.println("post-order traversal");
		bst.post_Order_Traversal(root);
		System.out.println("************************");
		
		System.out.println("Min value");
		System.out.println(bst.find_Min_Value(root));
		System.out.println("************************");
		
		System.out.println("find max value");
		System.out.println(bst.find_Max_Value(root));
		System.out.println("************************");
		
		System.out.println("max depth");
		System.out.println(bst.max_Depth(root));
		System.out.println("************************");
		
		System.out.println("mirror");
		bst.mirror(root);
		System.out.println("************************");
		
		

	}

}
