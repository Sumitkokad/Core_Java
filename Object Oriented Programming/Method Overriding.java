/*Method Overriding is a feature in object-oriented programming where a subclass provides a specific implementation of a
 method that is already defined in its parent class. The overridden method in the child class must have the same name, 
 parameters, and return type (or a covariant return type) as the method in the parent class. */


public class Twowheeler{
    public static void main(String args[]){
    Bike Bullet = new Bike();  // when i call the class Bike the funtion in class Bike is run insted of Motorcycle known as Function overriding
    Bullet.runs();
    }
}
class Motorcycle{
 void runs(){
    System.out.println("Motorcycle is running");  // It has second priority 
 }  

}
class Bike extends Motorcycle{
void runs(){
    System.out.println("Bike  is running ");  // It has first priority
}
}
