class ReverseStr{
	static String s="";
	static int i;
	static String st="";
	
	public String rev(String str){
		i=str.length()-1;
		for(int j=i;j>=0;j--){
			reverse(str.charAt(j));
		}	
	return st;
	}
	
	public static void reverse(char c){
		 
		 if(c==' '){
			 add(s+" ");
		 }else
			 s=c+s;
	}
	public static void add(String s){
		
		st=st+s;
		s="";
	}
}