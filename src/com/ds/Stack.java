package com.ds;

public class Stack {

		
		Node head;   

		class Node{
			Node next;
			int data;

		
			
			public Node(int data) {     
				super();
				this.next = next;
				this.data = data;
			}
		}
		
		
		public void push(int data)    
		 {
			 Node newNode = new Node(data);
			 newNode.next = head;
			 head = newNode;
		 }
		
		public void print()   
		 {			 
			 Node temp = head;
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
		
	}