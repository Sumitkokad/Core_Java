public class Oop{
    public static void main(String args[]){
     Horse h=new Horse(); 
     System.out.println(h.color);



    }
}
class Animal{   //parent class
   String color;
   
     Animal(){
    System.out.println("Animal constructor is called");
   }
}
class Horse extends Animal{

 Horse(){
    super();  //called the immediate parent class
    super.color="brown";
    System.out.println("Horse constructor is called");
 }
}
