package stack;

public class MyStack {
	 static int capacity;
	 static int top;
	 static int arr[];
	 
	 MyStack(int capacity) //Parameterized Constructor
	 {
		 this.capacity=capacity;
		 arr=new int[capacity];
		 top=-1;
	 }
	 public static void push(int x)
	 {
		 if(top==capacity-1) {
			System.out.println("Stack Overflow!");
		 } else {
			 top++;
			arr[top]=x;
		 }
			 
	 }
	 public static void pop()
	 {
		 if(top==-1) {
			System.out.println("Stack Underflow");
		 } else {
			 System.out.println("Popped element:"+arr[top]);
			 top--;
			 }
	 }
	 public static void peek()
	 {
		 System.out.println("Top:"+arr[top]);
	 }
	 public static void main(String args[])
	 {
		 new MyStack(5);
		 push(12);
		 push(45);
		 push(100);
		 push(1);
		 push(-9);
		 pop();
		 peek();
		 
	 }
	 

}
