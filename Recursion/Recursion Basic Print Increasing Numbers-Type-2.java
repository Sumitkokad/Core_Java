public class Main{
    public static void PrintIncreasing(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintIncreasing(n+1);
    }
    public static void main(String args[]){
        int n=1;
        PrintIncreasing(n);
    }
}
