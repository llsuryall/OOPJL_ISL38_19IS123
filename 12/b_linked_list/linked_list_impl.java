import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

class linked_list_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=0;String temp="";
		System.out.print("Enter no. of names - ");
		n=sc.nextInt();
		sc.nextLine();
		LinkedList<String> arr=new LinkedList<String>();
		if(n>0){
			for(int i=0;i<n;i++){
				System.out.print("Enter name "+(i+1)+" - ");
				temp=sc.nextLine();
				arr.add(temp);
			}
			Iterator<String> it=arr.iterator();
			String cur="";
			System.out.println("Names with length less than 5 - ");
			while(it.hasNext()){
				cur=it.next();
				if(cur.length()<5){
					System.out.print(cur+", ");
				}
			}
			System.out.print("\b\b  \n");
		}
		else{
			System.out.println("Invalid Input!");
		}
	}
}
