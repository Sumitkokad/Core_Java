import java.util.Scanner;


 public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            
        }

        

        System.out.println("count of vowels is :"+count);

        sc.close();
    }
}
