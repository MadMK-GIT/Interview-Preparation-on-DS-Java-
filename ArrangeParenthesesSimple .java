//sorting Parenthesis
import java.util.Arrays;
public class ArrangeParenthesesSimple
{
	public static void main(String[] args) {
	    String p = "(()) ((())) ()";
	    
	    String arr[]=p.split(" ");
	    
	    //bubble sorting
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i].length() > arr[j].length()){
	                String temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	   // for(String s:arr){
	   //     System.out.println(s);
	   // }
		
	}
}
