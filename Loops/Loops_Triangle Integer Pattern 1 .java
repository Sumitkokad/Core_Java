/*

     1
    232
   34543
  4567654
 567898765

*/


public class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for( int k=i;k<=(2*i-1);k++){
                System.out.print(k);
            }
            for( int k=(2*i-1)-1;k>=i;k--){
                System.out.print(k);
            }
            
            
            System.out.println();
        }
    }
}




/*for( int k=i;k<=(2*i-1);k++){
                System.out.print(k);
            }
            for( int k=(2*i-1)-1;k>=i;k--){
                System.out.print(k);
            }  In this concept reversing same loop 1 for ascending order and 2 for dscending order */
