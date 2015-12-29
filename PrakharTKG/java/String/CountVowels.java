class CountVowels{
	int vowel=0;
	int cons=0;
	
	public void countMethod(String se){
		String s=se;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowel++;
			else if(s.charAt(i)==' '){}
			else
				cons++;
		}
		
		System.out.println("Vowels"+vowel);
		
		System.out.println("Consonants"+cons);
		
	}
}