public class main{
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){   //1st half of butterfly pattern outer loop
            for(int j=1;j<=i;j++){ //print *
                System.out.print("*");
            }
            for(int j=1;j<=(2*(n-i));j++){ //print spaces using formula 2*(n-i)
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){        //print *
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){ //2nd half of butterfly pattern inverted outer loop                
            for(int j=1;j<=i;j++){ //print *
                System.out.print("*"); 
            }
            for(int j=1;j<=(2*(n-i));j++){  //print spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){  //print *
                System.out.print("*");
            }
            System.out.println(); //for next line
        }
    }
    public static void main(String[] args){
        butterfly(4);
    }
}
