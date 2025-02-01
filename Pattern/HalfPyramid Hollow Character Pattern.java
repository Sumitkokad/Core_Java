/*
1
12
1 3
1  4
12345


*/

public class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3)){
                    System.out.print(" ");
                }
                else{
                System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
