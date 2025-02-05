/*
A B C D E D C B A 
A B C D C B A 
A B C B A 
A B A 
A 

*/


public class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j)+" ");
                
            }
            for(int j=i-2;j>=0;j--){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
