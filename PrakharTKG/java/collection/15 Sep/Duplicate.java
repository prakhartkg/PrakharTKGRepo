
import java.util.*;

 
public class Duplicate{
 
    public void duplicateCharacter(String str){
         
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(dupMap.get(ch)+" Times "+ch);
            }
        }
    }
     
    public static void main(String a[]){
        Duplicate duplicate= new Duplicate();
        duplicate.duplicateCharacter("sskdhiokkkiokkwweeyemytlpmueqa");
    }
}