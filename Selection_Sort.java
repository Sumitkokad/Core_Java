public class main{

public static void selectionsort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
               /*  swaping is in outer loop because to reduce the unexcepted swapping and time complexity so swapping is done in outer loop the created minpos is compare with the first element as arr[i]. */
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
}
public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    System.out.println();  //nextline
}

public static void main(String[] args){
        int numbers[]={5,4,3,3,1};
        selectionsort(numbers);
        printarr(numbers);
    }
    
    
}
