package com.san.datastructure.btree;

import java.util.Stack;

public class BinaryTree {

	
	private static TreeNode root;
	
	public void createBinaryTree() {
		
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		
	}
	
	//PreOrder BinaryTree travesal
	
	
	//1.Visit the root Node. 2.Traverse the left sub tree in pre order fashion.
	//3.Traverse the right sub tree in pre order fashion.
	
	//Recursion
	public void preOrder(TreeNode root) {
		
		if(root ==null) {
			return;
		}
		
		System.out.print(root.data + "->");
		preOrder(root.left);
		preOrder(root.right);
		
	}

	//Iterative way
	public void preOrderIterative(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ->");
			
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			
			if(temp.left !=null) {
				stack.push(temp.left);
			}
			
		}
		
		
	}
	
	
	
	//2.In Order Binary Tree
	//1.Traverse the left subtree in in order fashion
	//2.Visit the root node
	//3.Traverse the right subtree in in order fashion
	
	//Recursive
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.data + " - >");
		inOrder(root.right);
	}
	
	//Iterative
	public void inOrderIterative(TreeNode root) {
		if(root == null) {
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		BinaryTree btree = new BinaryTree();
		btree.createBinaryTree();
		
		btree.preOrder(root);
		
		System.out.println();
		
		btree.preOrderIterative(root);
		
	}
	
	
	
}
