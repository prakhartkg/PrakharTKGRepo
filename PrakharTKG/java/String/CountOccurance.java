public class CountOccurance{
	static int count;
	public int count(String str,char ch){
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==ch){
				count++;
			}
		return count;	
	}
	
}