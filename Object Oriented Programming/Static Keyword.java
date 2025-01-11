public class Oop{
    public static void main(String args[]){
    Student s1=new Student();
    s1.schoolname="ABC";   //once the value is set for all function it use same value we required to change if necessary 
    System.out.println("s1 Schoolname" +s1.schoolname);
    Student s2=new Student();
    System.out.println("s2 Schoolname"+ s2.schoolname);
    }
}
class Student{
    String name;
    int rollno;
    static String schoolname;   //default value
    void setname(String newname ){
     this.name=newname;
    }
    String getname(){
       return name;
       }
}
