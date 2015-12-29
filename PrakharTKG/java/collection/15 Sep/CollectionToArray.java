import java.util.*;
class CollectionToArray{
	public static void main(String...args){
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		String[] str = list.toArray(new String[list.size()]);
		for(int i=0;i<str.length;i++)
		System.out.println(str[i]);
	}
	  
	  
}