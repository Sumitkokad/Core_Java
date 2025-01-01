/*Method Overloading is a feature of object-oriented programming that allows a class to have multiple 
methods with the same name but different parameters (type, number, or order). It enables a single method
name to perform different functionalities depending on the input arguments.*/

class Adding{
    public static void main(String args[]){
    Calculator sum=new Calculator();
    System.out.println("Sum of 3 and 4: " + sum.sum(3, 4));
    System.out.println("Sum of 3.5 and 4.5: " + sum.sum(3.5f, 4.5f));
    System.out.println("Sum of 1, 2, and 3: " + sum.sum(1, 2, 3));
    System.out.println("Sum of 1, 2, 3, and 4: " +sum.sum(1, 2, 3, 4));
    }
}
class Calculator{
   int sum(int a, int b){
     return a+b;
    }
    float sum(float a,float b){
    return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

}
