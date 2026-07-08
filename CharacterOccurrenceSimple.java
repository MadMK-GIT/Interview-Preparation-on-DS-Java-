//Character Occurence
public class CharacterOccurrenceSimple 
{
	public static void main(String[] args) {
	    
	    String str1="programming";
	    String str2="";
	    
	    for(char a1:str1.toCharArray()){
	        
	        if(str2.indexOf(a1)==-1){
	            int count=0;
	            for(char a2:str1.toCharArray()){
	                if(a1==a2){
	                    count++;
	                }
	            }
	            System.out.println(a1+" =>  "+count);
	            str2+=a1;
	        }
	        
	    }	
	}
}
