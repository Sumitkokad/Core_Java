
/*
  
    *
   * *
  *   *
 *******


*/



public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if(k==1||k==(2*i-1)||i==n){   //i==n for last bottom border
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            
           System.out.println(); 
           
        }
       
    }
}
