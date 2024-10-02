public class main{
    public static void function(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){ 
        int numbers[]={1,2,3,4,5};
        function(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
