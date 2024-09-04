package java_codes.oops.polymorphism.methodoverloading;

public class Main {

    static{
        System.out.println("static block");
    }

    public static void main(String[] args) {

        System.out.println("main method");


        /* Overloading of main method */

        Parent parent = new Parent();
        parent.main(new int[0]); // Parent main method overloading

        // Parent class reference variable referencing a Child class object
        Parent parent1 = new Child();
        parent1.main(new float[0]); // Parent main method overloading

        // Child class reference variable referencing a Child class object
        Child child = new Child();
        child.main();   // Child main method overloading

        // Child class reference variable referencing a Parent class object
        /*Child child1 = new Parent();*/ // Child class reference variable referencing a Parent class object not possible

    }
}