
/*  
                            subset("", "abc")
                        /             \
          subset("", "bc")         subset("a", "bc")
           /         \                /         \
  subset("", "c")  subset("b", "c")  subset("a", "c")  subset("ab", "c")
   /       \        /       \        /       \        /       \
subset("", "") subset("c", "") subset("b", "") subset("bc", "") 
subset("a", "") subset("ac", "") subset("ab", "") subset("abc", "")


    
    */

public class Main{
  public static void main(String args[]){
  
subset("","abc");
}
    public static void subset(String p,String up){

        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subset(p,up.substring(1));
    subset(p+ch,up.substring(1));
        
        
    }
    
}
