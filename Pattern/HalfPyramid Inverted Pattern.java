/*  Code Explanation
Outer Loop (for(int i=1; i<=n; i++)):

Handles the rows of the pyramid.
It runs n times, starting from i = 1 and ending at i = n.
Inner Loop (for(int j=i; j<=n; j++)):

Handles the columns, i.e., the number of stars to be printed in each row.
Starts from j = i and ends at j = n.
System.out.print("*");:

Prints a single * without moving to the next line.
System.out.println();:

Moves to the next line after the inner loop finishes printing all stars for the current row.
Dry Run (Step-by-Step Execution)
Input: n = 4
Initial State
Outer loop variable: i (row number).
Inner loop variable: j (column number).
Start with i = 1 (row 1).
Step 1 (Outer Loop, i = 1):
Inner Loop (j = i to n):

j = 1, print *
j = 2, print *
j = 3, print *
j = 4, print *
Inner loop ends. System.out.println() moves to the next line.

Row 1 Output: ****

Step 2 (Outer Loop, i = 2):
Inner Loop (j = i to n):

j = 2, print *
j = 3, print *
j = 4, print *
Inner loop ends. System.out.println() moves to the next line.

Row 2 Output: ***

Step 3 (Outer Loop, i = 3):
Inner Loop (j = i to n):

j = 3, print *
j = 4, print *
Inner loop ends. System.out.println() moves to the next line.

Row 3 Output: **

Step 4 (Outer Loop, i = 4):
Inner Loop (j = i to n):

j = 4, print *
Inner loop ends. System.out.println() moves to the next line.

Row 4 Output: *

Final Output
The output after all iterations is:

markdown
Copy
Edit
****
***
**
*
Key Concepts Demonstrated
Outer and Inner Loops:

Outer loop controls the rows (i), inner loop controls the columns (j).
Dynamic Range in Inner Loop:

Inner loop starts from i and goes up to n, ensuring fewer stars are printed in subsequent rows.
Printing in the Same Line:

System.out.print("*"); is used to print stars in a single row.
Row Transition:

System.out.println(); moves to the next line after the stars for the current row are printed.*/





public class Main{
    public static void Pyramidepattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        Pyramidepattern(4);
    }
}
