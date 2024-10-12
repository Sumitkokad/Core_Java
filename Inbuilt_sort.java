import java.util.Arrays;
 
// This is the inbuilt method to sort an array
public class main{
public static void print(int numbers[]){
    for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
}
    public static void main(String args[]){
        int numbers[]={5,43,2,12};
        Arrays.sort(numbers);
        print(numbers);
        
    }
}
