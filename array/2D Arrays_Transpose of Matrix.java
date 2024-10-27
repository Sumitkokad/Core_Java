public class main{
public static void print(int arr[][]){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
}
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};
        int row=2;
        int col=3;
        int trans[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("The original matrix is =>");
        print(arr);
        System.out.println("The transpose matrix is =>");
        print(trans);
    }
}
