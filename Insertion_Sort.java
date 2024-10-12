public class main{
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[]={5,4,3,2,1};
        insertionsort(numbers);
        printarr(numbers);
    }
}
