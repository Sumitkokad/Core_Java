public class main{
    public static boolean palindrome(String str){
      
        for(int i=0;i<str.length()/2;i++){
              int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
               return false;
            }
        
    }
    return true;
        }
    
    public static void main(String args[]){
        String str="noon";
       boolean check=palindrome(str);
       if(check=false){
           System.out.println("The string is not palindrome");
       }
       else{
           System.out.println("The string is palindrome");
       }
    }
}
