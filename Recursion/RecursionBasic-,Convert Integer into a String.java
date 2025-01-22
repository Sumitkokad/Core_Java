/*   You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.  */

public class Main{
    public static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"}; //This is a static array named digits that holds the textual representation of digits 0 to 9.
    public static void printdigits(int numbers){
        if(numbers==0){ //In this code zero always appears in last not first
            return ;
        }
        int lastdigit=numbers%10; // finding lastdigit
        printdigits(numbers/10);  //recursive call for remaining numbers
        //The function calls itself with numbers / 10 (integer division) to process the remaining digits of the number.
        System.out.print(digits[lastdigit]+" ");
        
    }
    public static void main(String args[]){
        printdigits(1234);
        System.out.println();
    }
}
