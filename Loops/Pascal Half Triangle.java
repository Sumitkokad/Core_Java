
/*


1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
1 6 15 20 15 6 1 

  



formula-tocalculate pascal triangle-      C(i,j)=i!/j!(i−j)!      in coding language- [ number = number * (i - j) / (j + 1)]
*/




public class Main {
    public static void main(String args[]) {
        int n = 7;

        for (int i = 1; i <= n; i++) {  // 1-based indexing
            int number = 1;
            for (int j = 1; j <= i; j++) {  // 1-based indexing
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
