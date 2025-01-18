public class Main{
    public static int solve(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
            
        }
        return solve(arr,key,i+1);
        
    }
    
    public static void main(String args[]){
        
        int arr[]={1,2,3,4,5,6,7};
        int key=3;
       System.out.println(solve(arr,key,0));
    }
}
