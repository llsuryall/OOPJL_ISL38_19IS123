import java.util.Scanner;

class string_queue_impl{
	public static void main(String args[]){
		StringQueue sq=new StringQueue();
		short inp=-1;String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Insert Rear | 2-Remove Front | 3-Display | 4-Delete & Exit");
		while(inp!=4){
			System.out.print("->");
			inp=sc.nextShort();
			temp=sc.nextLine();
			switch(inp){
				case 1:
					System.out.print("Enter the string to insert - ");
					temp=sc.nextLine();
					sq.insert_rear(temp);
					break;
				case 2:
					if(!sq.remove_front()){
						System.out.println("The queue is empty!");
					}
					break;
				case 3:
					sq.display();
					break;
				case 4:
					sq.delete();
					System.out.println("Deleted the queue! Now exitting...");
					break;
				default:
					System.out.println("Give right input!");
			}
		}
	}
}
