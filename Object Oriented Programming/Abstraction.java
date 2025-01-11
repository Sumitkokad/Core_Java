public class Oop{
public static void main(String args[]){
  

   Horse ponny=new Horse();
   ponny.eat();
   ponny.walk();
   System.out.println(ponny.color);  //default color present in Animal class using constructor
   ponny.changecolor();              //this is how to call the constructoe
   System.out.println(ponny.color);
   Chicken pipi=new Chicken();
   pipi.eat();
   pipi.walk(); 


}

}
abstract class Animal{
    String color;
    Animal(){
   color="brown";
  }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();   /*these is abstract function we cannot assign or return any 
                              value in same class it only says each class has walk function but the value is depend
                              on that specific class */

    
}
class Horse extends Animal{
  
    void walk(){
        System.out.println("Horse walks");
    }
    void changecolor(){
        color="black";
    }

}
class Chicken extends Animal{
    void walk(){
        System.out.println("chicken walks");
    }
}
