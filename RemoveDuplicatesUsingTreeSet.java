//using TreeSet removing duplicates in arrays

import java.util.TreeSet;
public class RemoveDuplicatesUsingTreeSet
{
	public static void main(String[] args) {
	    String arr[] = {"a", "y", "x", "a", "b", "x"};
		TreeSet<String> t=new TreeSet<>();
		
		for(String s:arr){
		    t.add(s);
		}
		System.out.println(t);
		
	}
}
