/*

Let's trace the execution for a few iterations:

Call	Output	Explanation
fun(1,0)	*	row > col → Print *, call fun(1,1)
fun(1,1)	\n	row == col → Move to new line, call fun(2,0)
fun(2,0)	*	row > col → Print *, call fun(2,1)
fun(2,1)	*	row > col → Print *, call fun(2,2)
fun(2,2)	\n	row == col → Move to new line, call fun(3,0)
fun(3,0)	*	row > col → Print *, call fun(3,1)
fun(3,1)	*	row > col → Print *, call fun(3,2)
fun(3,2)	*	row > col → Print *, call fun(3,3)
fun(3,3)	\n	row == col → Move to new line, call fun(4,0)
This pattern continues until row == 6, at which point the function terminates.
*/

public class Main{
    public static void main(String args[]){
     fun(1,0);        
    }
    public static void fun(int row,int col){
        if(row==6){
            return ;
            
        }
        if(row>col){
            System.out.print("*");
            fun(row,col+1);
        }
        else{
            System.out.println();
            fun(row+1,0);
        }
    }
}

