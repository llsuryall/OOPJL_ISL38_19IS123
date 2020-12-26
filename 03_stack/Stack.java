public class Stack{
	private int capacity;
	private int[] ar;
	private int top;
	public Stack(int capacity){
		if(capacity>0){
			this.capacity=capacity;
		}
		else{
			this.capacity=10;
			System.out.println("Invalid capacity of stack! Capacity set to default value "+this.capacity);
		}
		this.ar=new int[capacity];
		this.top=-1;
		System.out.println("Stack having a capacity of "+this.capacity+" was created");
	}
	public void push(int data){
		if(this.top<this.capacity-1){
			this.ar[++top]=data;
			System.out.println(data+" was pushed into the stack");
		}
		else{
			System.out.println("The stack is full! Cannot push "+data);
		}
	}
	public void pop(){
		if(this.top<=-1){
			System.out.println("The stack is empty cannot pop!");
		}
		else{
			System.out.println(ar[top]+" was poppped out of the stack!");
			this.top--;
		}
	}
	public void display(){
		System.out.println("The elements of the stack are ");
		for(int i=0;i<=top;i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
	}
}
