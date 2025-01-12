public class Recursion{
    public static void printdecreament(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdecreament(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printdecreament(n);
    }
}
