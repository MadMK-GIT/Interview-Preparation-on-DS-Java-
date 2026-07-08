//Frequency Count using HashMap
import java.util.HashMap;
public class FrequencyCount
{
	public static void main(String[] args) {
	    HashMap<Character,Integer> map=new HashMap<>();
	    
	    for(char c:"apple".toCharArray()){
	        
	        map.put(c,map.getOrDefault(c,0)+1);
	        
	    }
	    
	    System.out.println(map);
	}
}
