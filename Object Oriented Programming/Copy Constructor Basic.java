public class Main {
    public static void main(String args[]) {
        // Creating an object and initializing fields
        Hello s1 = new Hello();
        s1.name = "sumit";
        s1.roll = 123;

        // Creating an object using a parameterized constructor
        Hello s2 = new Hello(124);

        // Using the copy constructor
        Hello s3 = new Hello(s1);
        System.out.println("s3: Name = " + s3.name + ", Roll = " + s3.roll);
    }
}

class Hello {
    String name;
    int roll;
    int password;

    // Default constructor
    Hello() {
        System.out.println("Default constructor called");
    }

    // Copy constructor
    Hello(Hello s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        System.out.println("Copy constructor called: Name = " + name + ", Roll = " + roll);
    }

    // Constructor with String parameter
    Hello(String name) {
        this.name = name;
        System.out.println("String constructor called: Name = " + name);
    }

    // Constructor with int parameter
    Hello(int rll) {
        this.roll = rll;
        System.out.println("Integer constructor called: Roll = " + roll);
    }
}
