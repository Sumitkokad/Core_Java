//CREATION OF 2D ARRAY
import java.util.*;
public class main{
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
    // WE USE THE VALUE OF ROWS AND COLUMNS BY SPECIFYING THE VALUE OF N=ROWS AND M=COLUMNS LIKE THIS=>
            // int n=3,m=3; 
            //AND ALSO SPECIFY LIKE THIS=>
            int n=matrix.length,m=matrix[0].length;    

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the input numbers :");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
