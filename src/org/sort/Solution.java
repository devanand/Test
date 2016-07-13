package org.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static void levelOrder(Node root){
	      List<Node> l = Collections.singletonList(root);
	      while(l != null ) {
	    	  if(l.isEmpty()) break;
	    	  List <Node> k = new LinkedList<Node>();
	          for(Node n:l) {
	          System.out.print(n.data+" ");
	          
	          if(n.left != null) {
	              k.add(n.left);
	          }
	          if(n.right != null) {
	              k.add(n.right);
	          }
	        }
	        l = k;
	      }
	      System.out.println(Integer.MAX_VALUE);
	    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}