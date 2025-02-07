/*
 Binary search in a rotated sorted array using recursion

Target=0

                       search(arr, 0, 0, 9) → mid = 4 (arr[4] = 1)
                            |
           -----------------------------------
           |                                 |
  (Left Side Search)                  (Right Side Search - Not Taken)
  search(arr, 0, 0, 3) → mid = 1 (arr[1] = 8)
           |
  -------------------------
  |                        |
  (Left Side - Not Taken)   search(arr, 0, 2, 3) → mid = 2 (arr[2] = 9)
                                 |
                        --------------------
                        |                  |
              (Left - Not Taken)   search(arr, 0, 3, 3) → mid = 3 (arr[3] = 0) → Found!


*/




public class Main{
    public static int search(int arr[],int target,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        //kam
        int mid=si+(ei-si)/2;
        //case 1
        if(arr[mid]==target){
            return mid;
            
        }
        if(arr[si]<=arr[mid]){
          if(arr[si]<=target&&target<=arr[mid]){
              return search(arr,target,si,mid-1);
          }  
          
          else{
           return search(arr,target,mid+1,ei);
           
          }
          
        }
        else{
            if(arr[mid]<=target&&target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,9,0,1,2,3,4,5,6};
    int idx=search(arr,0,0,arr.length-1);
    System.out.print(idx);
    }
}
