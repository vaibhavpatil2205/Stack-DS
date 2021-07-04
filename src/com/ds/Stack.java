package com.ds;

public class Stack {

		
		Node top;     

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
			 newNode.next = top;
			 top = newNode;
		 }
		
		public void peek()     
		{
			if(top==null){
				System.out.println("Stack is Underflow");
			}
			else{
				System.out.println("Peak element is"+top.data);		
				}
		}
		
		public void pop()          
		{
			while(top!=null) {
			if(top==null){
				System.out.println("Stack is Underflow");
			}
			else
			{
				System.out.println("deleted element is"+top.data);		
				top=top.next;
			}		
		}
		}
			
		
		public void print() 
		 {			 
			 Node temp = top;
			 
			 if(temp==null)
			 {
				 System.out.println("Stack is empty");
			 }
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
		
}