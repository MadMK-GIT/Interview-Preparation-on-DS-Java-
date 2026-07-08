import java.util.TreeSet;
import java.util.Arrays;
class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,1,10,9,7,5};
        
        //converting arrays to TreeSet
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        
        //Converting TreeSet to Arrays
        int m=0;
        int []arr2=new int[arr.length];
        for(int i:set){
            arr2[m++]=i;
        }
        
        
        int target=9;
        int s=0;
        int e=arr2.length;
        while(s<=e){
            int mid=(s+e)/2;
            
            if(arr2[mid]==target){
                System.out.println("Found ! ! "+arr2[mid] );
                break;
            }
            else if(target>arr2[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        
        
    }
}
