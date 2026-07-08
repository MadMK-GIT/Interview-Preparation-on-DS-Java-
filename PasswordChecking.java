//Password checking

import java.util.Scanner;
class PasswordChecking {
    
    public static boolean validPass(String s){
        //to check length
        if(s.length()<8 || s.length()>20){
            return false;
        }
        
        boolean special=false;
        boolean capital=false;
        boolean number=false;
        for(char c:s.toCharArray()){
        //to check space
            if(c==' '){
                return false;
            }
        //to check special characters
            if(!(c>='a' && c<='z') && !(c>='A' && c<='Z') && !(c>='0' && c<='9')){
                special= true;
            }
        //to check Capital Letters
        if(c>='A' && c<='Z'){
            capital= true;
        }
        //to check numbers
        if(c>='0' && c<='9'){
            number=true;
        }
        }
        return special&&capital&&number;
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.next();
        
        if(validPass(password)){
            System.out.println("Password Valid ! ! !");
        }
        else{
            System.out.println("Invalid ! ! !");
        }
    }
}
