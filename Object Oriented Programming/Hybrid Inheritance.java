public class Animal{
    public static void main(String args[]){
     shark lami=new shark();
     lami.sharpteeth();
     dog muku=new dog();
     muku.run();
     peacock rani=new peacock();
     rani.dance();
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
class reptiles{
    void  crawling(){
        System.out.println("crawls");

    }
}

class shark extends Fish{
    void sharpteeth(){
        System.out.println("it has sharp teeth");
    }
}
class dog extends Mammals{
    void run(){
        System.out.println("he can run");
    }
}
class peacock extends birds{
    void dance(){
        System.out.println("he can dance ");

    }
}

class snake extends reptiles{
  void bite(){
    System.out.println("he can bite");
  }
}
