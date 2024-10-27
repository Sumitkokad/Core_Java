public class main{
    public static void main(String args[]){
        int matrix[][]= { {1,4,9},{11,4,3},{2,2,3} };
        int sum=0;
        int rowIndex=1;
        for(int i=0;i<matrix[rowIndex].length;i++){
            sum+=matrix[rowIndex][i];
        }
        System.out.println("The sum is "+sum);
    }
}
