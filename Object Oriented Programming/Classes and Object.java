/*Class Pen:

Defines the blueprint of the object. 
It has:
Two fields: color (of type String) and tip (of type int).
Two methods: setcolor and settip to modify the fields.


Object p1:

Created with: Pen p1 = new Pen();
p1 is an instance of the Pen class.
It has its own copy of the color and tip fields.
You can modify and access its fields and methods using the dot operator (p1.setcolor, p1.settip, p1.color, etc.).

Actions Performed on p1:
p1.setcolor("blue");:
Calls the setcolor method on the object p1 to set its color field to "blue".
p1.settip(5);:
Calls the settip method on the object p1 to set its tip field to 5.
System.out.println(p1.color);:
Accesses the color field of p1 and prints "blue".
System.out.println(p1.tip);:
Accesses the tip field of p1 and prints 5.
*/

public class Main{
public static void main(String args[]){
    Pen p1= new Pen();
    p1.setcolor("blue");
    p1.settip(5);
    System.out.println(p1.color);
    System.out.println(p1.tip);
}
}
    class Pen{
        String color;
        int tip;
        void setcolor(String changecolor){
            color=changecolor;
        }
        void settip(int changetip){
            tip=changetip;
        }
    }
