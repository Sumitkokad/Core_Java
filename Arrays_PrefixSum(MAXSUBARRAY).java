public class main{
    public static void prefixsum(int numbers[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        //length of prefix array is same as numbers array
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0]; //copy 0th index as it is
        for(int i=1;i<numbers.length;i++){
           prefix[i]= prefix[i-1]+numbers[i]; 
           //calculating prefix array (index)
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                //calculating elements in prefix array
                currsum=start==0 ? prefix[end]:prefix[end]-prefix[start-1]; 
                if(max<currsum){
                    max=currsum;
                }
            }
        }
        System.out.println("max sum is : "+max); 
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        prefixsum(numbers);
    }
}
