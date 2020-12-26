import java.util.Scanner;

class string_lib_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single line of text for string str1-");
		String str1=sc.nextLine();
		System.out.println("Enter a single word for string str2-");
		String str2=sc.next();
		System.out.println("Enter another word for string str3-");
		String str3=sc.next();
		System.out.print("Enter 2 +ve no.s whose sum is smaller than "+str1.length()+" - ");
		int n=sc.nextInt(),m=sc.nextInt();
		String res=String_lib.extract(str1,n,m);
		int count=0;
		if(res!=null){
			System.out.println("Outputting "+m+" letters of str1 starting from index "+n+" -\n\""+res+"\"");
		}
		count=String_lib.count(str1,str2);
		if(count!=-1){
			System.out.println("No of occurences of str2 in str1 = "+count);
		}
		res=String_lib.replace_str(str1,str2,str3);
		if(res!=null){
			System.out.println("Replacing all occurences of str2 in str1 with str3 -\n\""+res+"\"");
		}
		res=String_lib.sort(str2);
		if(res!=null){
			System.out.println("Sorting str2 letters alphabetically -\n\""+res+"\"");
		}
		System.out.println("The string str2 and str3 are "+(String_lib.compare(str2,str3)?"":"not ")+"equal");
		System.out.println("Concatenation str2 and str3 -\n\""+String_lib.concat(str2,str3)+"\"");
	}
}
