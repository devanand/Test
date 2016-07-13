package org.test;

import java.util.HashMap;

class Node {
	
	public Node(int data) {
		this.data = data;
	}
	
	Node left;
	int data;
	Node right;
}
public class BinarySearchTree {

	Node root = new Node(2);
	
	public void build() {
		root.left = new Node(1);
		root.right = new Node(3);
	}
	
	public void printTree() {
		printTree(root);
		System.out.println();
	}
	public void printTree(Node node) {
		if (node == null) return;
		printTree(node.left);
		System.out.print(node.data+"\t");
		printTree(node.right);
	}
	
	public void insertElement(Node root, Node newNode) {
		if(root == null) root = newNode;
		
		if(newNode.data < root.data) {
			if(root.left == null) {
				root.left = newNode;
			} else {
				insertElement(root.left, newNode);
			}
		} else {
			if(root.right == null) {
				root.right = newNode;
			} else {
				insertElement(root.right, newNode);
			}
		}
	}
	
	public void insertElement1(Node root, Node node) {

		if(node.data<root.data) {
			while(root.left != null) {
				root = root.left;
			}
			
			root = node;  
		} else {
			while(root.right != null) {
				root = root.right;
			}
			root = node;  
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();
		t.build();
		t.insertElement1(t.root, new Node(4));
		t.insertElement1(t.root, new Node(-1));
		t.printTree();
		
	}
}
