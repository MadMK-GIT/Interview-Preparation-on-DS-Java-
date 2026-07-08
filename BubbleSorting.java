//Bubble Sorting

import java.util.Arrays;
class BubbleSorting {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,1,6,9,};
        
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
