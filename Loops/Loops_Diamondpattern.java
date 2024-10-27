public class main{
    public static void Diamond(int n){
        for(int i=1;i<=n;i++){ //first half of pattern outer loop
            for(int j=1;j<=(n-i);j++){  //print spaces
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i-1)+1);j++){ //print * using logic(2*(i-1)+1)
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){ //second half of pattern outer loop (mirror image of pattern)
            for(int j=1;j<=(n-i);j++){  //print spaces
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i-1)+1);j++){ //print * using logic(2*(i-1)+1)
                System.out.print("*");
            }
            System.out.println(); //next line
        }
    }
    
    public static void main(String[] args){
        Diamond(4); //calling function 
    }
}
