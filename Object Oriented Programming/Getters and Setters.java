/*Getters and Setters are methods used to access and modify private fields of a class. They follow the principle of encapsulation, which protects the fields from direct access.

1] Getter: Retrieves (gets) the value of a private field. (return the value)
2] Setter: Updates (sets) the value of a private field.   (modify the value)

this keyword-It is used to refer to the current object

*/

public class Main{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("blue");
        p1.settip(4);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
    }
}
class Pen{
   private String color;
   private int tip;
    String getcolor(){  //these are getters
        return this.color;
    }
    int gettip(){    //these are getters
        return this.tip;
    }
    void setcolor(String color){  //these are setters
       this.color=color;
    }
    void settip(int tip){     //these are setters
        this.tip=tip;
    }
}
