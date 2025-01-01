public class Animal{
    public static void main(String args[]){
       Fish shark=new Fish();
       shark.eat();
       Mammals dog=new Mammals();
       dog.breath();
       birds cannary=new birds();
       cannary.fly();
    }
}
class Animals{  // single base clas and multiple derived class 
    void breath(){
        System.out.println("breaths");
    }
    void eat(){
        System.out.println("eats");
    }
    void drink(){
        System.out.println("drinks");
    }
    void sleep(){
        System.out.println("sleeps");
    }

}
class Fish extends Animals{
    void swim(){
        System.out.println("swims");
    }
    void fins(){
     System.out.println("it has fins");
    }

    
}
class Mammals extends Animals{
  void legs(){
    System.out.println("it has legs");
  }
  void tail(){
    System.out.println("it has tail");
  }

}

class birds extends Animals{
    void fly(){
        System.out.println("it can fly");
    }
}
