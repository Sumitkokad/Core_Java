public class Main {
    public static void main(String args[]) {
        // Creating objects using various constructors
        P1 n = new P1(); // Non-parameterized constructor
        P1 n2 = new P1("sk"); // Constructor with String parameter
        System.out.println(n2); // Printing the object n2
        P1 n1 = new P1(4); // Constructor with int parameter
        System.out.println(n1); // Printing the object n1
        P1 n3 = new P1("abc", 4); // Constructor with both String and int parameters
        System.out.println(n3); // Printing the object n3
    }
}

class P1 {
    String name;
    int roll;

    // Non-parameterized constructor
    P1() {
        System.out.println("Non-parameterized constructor");
    }

    // Constructor with String parameter
    P1(String name) {
        this.name = name;
        System.out.println("String constructor called: name = " + name);
    }

    // Constructor with int parameter
    P1(int r) {
        this.roll = r;
        System.out.println("Integer constructor called: roll = " + roll);
    }

    // Constructor with both String and int parameters
    P1(String n, int a) {
        this.name = n;
        this.roll = a;
        System.out.println("Both parameters constructor called: name = " + n + ", roll = " + a);
    }

    // Overriding toString() for meaningful output
    @Override
    public String toString() {
        return "P1{name='" + name + "', roll=" + roll + "}";
    }
}
