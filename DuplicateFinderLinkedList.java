//Finding Duplicates using Linked List
import java.util.LinkedList;
public class DuplicateFinderLinkedList
{
	public static void main(String[] args) {
	    String arr[] = {"a", "y", "x", "a", "b", "x"};
		
		LinkedList<String> l=new LinkedList<>();
		
		System.out.println("The Duplicates are : ");
		for(String o:arr){
		    if(l.contains(o)){
		        System.out.println(o);
		    }else{
		        l.add(o);
		    }
		}
		
	}
}
