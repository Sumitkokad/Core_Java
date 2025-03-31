public class Main{
    public static void main(String args[]){
        
    System.out.println(fun("applbcx"));
        
    }
    public static String fun(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")&&!str.startsWith("apple")){
            return fun(str.substring(3));
        }
        else{
            return str.charAt(0)+fun(str.substring(1));
        }
    }
}
