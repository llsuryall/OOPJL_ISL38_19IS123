class stack_impl{
	public static void main(String args[]){
		System.out.print("Stack 1-");
		Stack mystack1=new Stack(20);
		System.out.print("Stack 2-");
		Stack mystack2=new Stack(3);
		System.out.println("Stack 1-");
		mystack1.push(10);
		mystack1.push(20);
		mystack1.push(240);
		mystack1.push(2460);
		mystack1.push(207);
		mystack1.pop();
		System.out.println("Displaying Stack 1-");
		mystack1.display();
		System.out.println("Stack 2-");
		mystack2.pop();
		mystack2.push(3244);
		mystack2.push(356722);
		mystack2.push(34);
		mystack2.push(76);
		System.out.println("Displaying Stack 2-");
		mystack2.display();
	}
}
