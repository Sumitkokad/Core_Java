public class Oop{
    public static void main(String args[]){
  Queen Q=new Queen();
  Q.moves();
  Haati H=new Haati();
  H.moves(); 
  King K=new King();
  K.moves();
    }
}

interface Cheesplayer{
 void moves();
}
class Queen implements Cheesplayer{
 public void moves(){
    System.out.println("up-down,left-right,diagonal(in all four direction)");
 }
}
class Haati{
public void moves(){
    System.out.println("up-down,left-right");
}
}
class King{
public void moves(){
    System.out.println("moves only 1 house");
}
}
