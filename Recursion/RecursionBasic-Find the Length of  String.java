public class Main{
    public static int length(String str){
        if(str==null){  // if null string
            return 0;
        }
        return str.length(); // The Length is total number of characters present in the string
    }
    public static void main(String args[]){
        String str="ABCD";
        System.out.println("The length of string is "+length(str));
    }
}
