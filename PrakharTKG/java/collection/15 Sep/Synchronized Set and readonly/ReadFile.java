import java.util.*;
import java.io.*;
class ReadFile{
	public static void main(String...args){
	Scanner sc = null;
	Map<String, Integer> dupMap = new HashMap<String, Integer>();
    try {
        sc = new Scanner(new File("TextFile.txt"));
    } catch (FileNotFoundException e) {
        System.out.println("File Not Found"); 
    }
    while (sc.hasNextLine()) {
            Scanner s = new Scanner(sc.nextLine());
        while (s.hasNext()) {
             String ch=s.next();
			 if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
           
        }
    }
	
	 Set<String> keys = dupMap.keySet();
        for(String ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.printf("%-15s %-7s %d",ch,"-------",dupMap.get(ch));
				System.out.println();
            }
        }
	}
}