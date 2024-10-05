import java.util.*;
public class main{
    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end =numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
             if(numbers[mid]<key){
                start=mid+1;  //right side
            }
            else{
                end=mid-1; //left side
            }
        }
            return -1;
        
    
    }
    public static void main(String[] args){
      int numbers[]={1,2,3,4,6};
      int key=4;
      int result=binarysearch(numbers,key);
      if(result==-1){
          System.out.println("The key "+key+" not found");
      }
      else{
          System.out.println("the key " +numbers[result]+" found at index "+result);
      }
    }
}
