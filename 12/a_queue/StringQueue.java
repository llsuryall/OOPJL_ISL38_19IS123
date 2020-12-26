import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class StringQueue{
	ArrayList<String> arr;
	public StringQueue(){
		this.arr=new ArrayList<String>();
	}
	public boolean insert_rear(String som){
		this.arr.add(som);
		return true;
	}
	public boolean remove_front(){
		if(!this.arr.isEmpty()){
			arr.remove(0);
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		Iterator it=arr.iterator();
		while(it.hasNext()){
			System.out.print("\""+it.next()+"\" ");
		}
		System.out.println();
	}
	public void delete(){
		arr.clear();
		arr=null;
		System.gc();
	}
}
