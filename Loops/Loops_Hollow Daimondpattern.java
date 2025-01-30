
/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/



public class Main{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if(k==1||k==(2*i-1)||2==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            
           System.out.println(); 
           
        }
       for(int i=0;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(" ");
           }
           for(int k=i;k<=(i);k++){
               System.out.print("*");
           }
           
            for(int p=i;p<n;p++){
                System.out.print(" ");
            }
           
            for(int x=i;x<n;x++){
                if(x==3){
                System.out.print("*");
            }
            else{System.out.print(" ");
            }
            }
           System.out.println();
       }
    }
}
