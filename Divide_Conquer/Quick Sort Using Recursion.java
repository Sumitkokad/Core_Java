 /*   
         Quick sort tree structure         
                  
                  [9,8,7,6,5,4,3,2,1]
                               |
                              (1)---------pivot element
                               |
                -------------------------------------------------
                |                                               |
subarray --------  []                             [8,7,6,5,4,3,2,9]
                                                       |
                                                      (9) ---------pivot element
                                                       |
                         ------------------------------------------------
                         |                                              |
                        [8,7,6,5,4,3,2]                               []
                                  |
                                 (2) ---------pivot element
                                  |
                 --------------------------------------
                 |                                    |
                []                          [8,7,6,5,4,3]
                                                   |
                                                  (3) ---------pivot element
                                                   |
                               ---------------------------------
                               |                               |
                              []                      [8,7,6,5,4]
                                                           |
                                                          (4) ---------pivot element
                                                           |
                                         ---------------------------------
                                         |                               |
                                        []                        [8,7,6,5]
                                                                   |
                                                                  (5) ---------pivot element
                                                                   |
                                                 -------------------------------
                                                 |                             |
                                                []                        [8,7,6]
                                                                           |
                                                                          (6) ---------pivot element
                                                                           |
                                                           ------------------------
                                                           |                      |
                                                          []                  [8,7]
                                                                                 |
                                                                                (7) ---------pivot element
                                                                                 |
                                                                     -------------------
                                                                     |                 |
                                                                    []               [8]




the final output-
1 2 3 4 5 6 7 8 9

*/
//Quick sort code
public class Main{
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        Quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Quick(int arr[],int si,int ei){
        if(si>=ei){
            return ;
            
        }
        int pivotidx=partition(arr,si,ei);
        Quick(arr,si,pivotidx-1);
        Quick(arr,pivotidx+1,ei);
        
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;
    }
    
}

                          
