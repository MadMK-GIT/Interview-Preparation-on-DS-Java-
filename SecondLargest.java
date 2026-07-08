//using TreeSet getting inputs(used to sort the data defaultly).
//converted into array.
//then getting second largest using index value.

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Arrays;
class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> a=new TreeSet<>();
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        
        System.out.println("Printing Datas from Tree set");
        System.out.println(a);
        
        int arr[]=new int[8];
        int m=0;
        for(int i:a){
            arr[m++]=i;
        }
        System.out.println("Printing datas that are in Arrays");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Second Largest Element");
        System.out.println(arr[arr.length-2]);
            
    }
}
