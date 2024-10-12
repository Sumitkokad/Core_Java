import java.util.*;
public class ma{
    public static void bubblesort(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[]={9,8,7,6,5,4,3,2,1};
        bubblesort(numbers);
        printarr(numbers);
    }
}
