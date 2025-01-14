public class Main{
    
    public static int fibonacci(int n){
        // we can also use this method for base case 
        /* if(n==0){
            return 0;
            
        }
        if(n==1){
            return 1;
        }
        
        */
         
        // But this is more effective  
        if(n==0||n==1){
            return n;
        }
        int fn1=fibonacci(n-1);  //calculate fn-1
        int fn2=fibonacci(n-2);  //calculate fn-2
        int fn=fn1+fn2;          //calculate fn
        return fn;
    }
    public static void main(String args[]){
        int n=26;
        System.out.println(fibonacci(n));
    }
}
