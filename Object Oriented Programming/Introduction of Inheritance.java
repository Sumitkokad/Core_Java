public class Animal{
    public static void main(String args[]){
         Fish shark=new Fish();  //create an object to access the properties of class 
         shark.eat();

}
}
class Animals{   // parent class has properties
 String color;
 String name;
 int numbers;
 void eat(){
    System.out.println("Eats");

 }
 void fly(){
    System.out.println("Flies");
 }
 void runs(){
  System.out.println("runs");

 }

}
class Fish extends Animals{ //chile class inherits the properties of parent class 

                            // parent class-Animals
                            //child class-Fish

  int fins;
  void swim(){
    System.out.println("swims");
  }
}
