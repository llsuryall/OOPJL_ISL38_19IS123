//for all position parameters index of string starts from 0
class String_lib{
	public static String extract(String str,int n,int m){
		if((n>-1) && (m>0) && (n+m)<=str.length()){	
			return str.substring(n,n+m);
		}
		else{
			System.out.println("Invalid parameters!");
			return null;
		}
	}
	public static int count(String text,String word){
		if(text!=null && word!=null){
			int count=0;
			boolean flag=true;
			for(int i=0;i<text.length();i++){
				flag=true;
				for(int j=0;j<word.length();j++){
					if(text.charAt(i+j)!=word.charAt(j)){
						flag=false;
						break;
					}
				}
				if(flag){
					count++;
				}
			}
			return count;
		}
		else{
			return -1;
		}
	}
	public static char[] bubble_sort_char_array(char[] ar){
		int n=ar.length;
		char temp=0;
		while(n>0){
			for(int i=0;i<n-1;i++){
				if(Character.toLowerCase(ar[i+1])<Character.toLowerCase(ar[i])){
					temp=ar[i+1];
					ar[i+1]=ar[i];
					ar[i]=temp;
				}
			}
			n--;
		}
		return ar;
	}
	public static String replace_str(String text,String org,String rpl){
		if(text!=null && rpl!=null){
			return text.replace(org,rpl);
		}
		else{
			return null;
		}
	}
	public static String sort(String str){
		if(str!=null){
			return new String(String_lib.bubble_sort_char_array(str.toCharArray()));
		}
		else{
			return null;
		}
	}
	public static boolean compare(String s1,String s2){
		if(s1!=null && s2!=null){
			return s1.toLowerCase().equals(s2.toLowerCase());
		}
		else{
			return false;
		}
	}
	public static String concat(String s1,String s2){
		if(s1!=null && s2!=null){
			return s1+s2;
		}
		else{
			return null;
		}
	}
}
