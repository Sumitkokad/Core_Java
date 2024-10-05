public class main{
    public static void KadanesAlgo(int numbers[]){
        int currsum=0;
        boolean allzeros=true; 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=0){  //special case if all array element is zero 
                allzeros=false;
            }
            currsum=currsum+numbers[i];
            if(currsum<0){  //if currsum is negative then currsum is zero
                currsum=0;
                
                
            
            }
            max=Math.max(currsum,max);  //compare max and currsum
        }
        if(allzeros){
            System.out.println("-1");  //if all elements is negative then return -1 
        }
        else{
        System.out.println("the maximum sum is : "+max); 
    }
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,3,5,6};
        KadanesAlgo(numbers);
    }
}
