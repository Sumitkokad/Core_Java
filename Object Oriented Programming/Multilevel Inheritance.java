public class Animal{
    public static void main(String args[]){
    Dog muku=new Dog();
    muku.eat();
    muku.breath();
    muku.legs=4;
    System.out.println(muku.legs);
    muku.runs="yes-runs";
    System.out.println(muku.runs);

    muku.breed="Germanshapherd";
    System.out.println(muku.breed);
    
    muku.tail="yes-tail";
    System.out.println(muku.tail);


    }
}
class Animals{
void eat(){
    System.out.println("eat");
}
void breath(){
    System.out.println("breath");
}
void color(){
    System.out.println("color");
}

}
class Mammmal extends Animals{
int legs;
String tail;
String runs;
}
class Dog extends Mammmal{
    String breed;
}
