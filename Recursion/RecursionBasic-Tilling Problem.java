public class Main{
    public static int Tillingproblem(int n){// 2 x n is my floor size
       //base case
       if(n==0||n==1){
           return 1;
       }
       
       //vertical choice
       int verticaltiles=Tillingproblem(n-1);
       
       //horizontal choice
       int horizontaltiles=Tillingproblem(n-2);
       
       int totaltiles=verticaltiles+horizontaltiles;
       return totaltiles;
    }
    public static void main(String args[]){
        System.out.println("The number of possible ways to place tile in board is :- "+ Tillingproblem(4));
    }
}
