/*

3
44
555
6666
555
44
3


*/



class Main {
    public static void main(String[] args) {
        int n=4;int x=2;
        for(int i=1;i<=n;i++){
            x++;
            for(int j=1;j<=i;j++){
                System.out.print(x);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            x--;
        for(int j=i+1;j<=n;j++){
            System.out.print(x);
        }    
        System.out.println();
        }
        
    }
}
