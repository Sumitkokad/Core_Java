public class main{
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        for(int i=0;i<numbers.length;i++){  //outer loop
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){   //inner loop
                System.out.print("("+curr+ ","+numbers[j]+")");
            }
            System.out.println();  //next line
        }
    }
}
