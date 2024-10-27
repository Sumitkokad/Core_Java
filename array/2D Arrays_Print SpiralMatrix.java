// SPIRAL MATRIX
public class main{
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //Top boundary
            // J is used for column
            
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //Right boundary
            //i is used for row
            
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //Bottom boundary
           
            for(int j=endcol-1;j>=startcol;j--){
                //Special case if the matrix has odd number of rows and column
                
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }  
            //Left boundary
            
            for(int i=endcol-1;i>=startcol+1;i--){
              //Special case if the matrix has odd number of rows and column  
                
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(matrix);
    }
}
