package java_codes.oops.polymorphism.methodhiding;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main main method ");

        /* private or static method can't be overridden but here we override the static main method. But Actually it is not overriding it is Data Hiding */

        // Parent class reference variable referencing a Parent class object
        Parent parent = new Child();
        parent.main(new String[0]); // Parent main method

        // Parent class reference variable referencing a Child class object
        Parent parent1 = new Child();
        parent1.main(new String[0]); // Parent main method

        // Child class reference variable referencing a Child class object
        Child child = new Child();
        child.main(new String[0]); // Child main method

        // Child class reference variable referencing a Parent class object
        /*Child child1 = new Parent();*/ // Child class reference variable referencing a Parent class object not possible

    }
}
