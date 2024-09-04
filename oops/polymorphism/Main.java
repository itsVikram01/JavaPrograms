package java_codes.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main main method ");

        System.out.println("");
        Parent parent = new Parent();
        Parent parentChild =new Child();
        Child child = new Child();
        /*Child childParent = new Parent();*/ // Child class reference variable referencing a Parent class object not possible
        Animal animal = new Animal();

        parent.main(new String[0]); // Parent static main(String[] args) method
        parentChild.main(new String[0]); // Parent static main(String[] args) method
        parentChild.display(); // Parent class static display() method
        animal.makeSound(); // Animal makeSound() method

        //Overloading
        System.out.println("");
        System.out.println("Overloading :");
        parent.main(new int[0]); // Overloading Parent static main(String[] args) method with Parent static main(int[] args)
        child.main(new Float[0]); // Overloading Parent static main(String[] args) method with Child static main(Float[] args)
        child.main();   // Overloading Child static main(float[] args) method with Child static main()

        //Overriding
        System.out.println("");
        System.out.println("Overriding :");
        parent.makeSound(); // Overriding Animal makeSound() method with Parent makeSound() method
        parentChild.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method
        child.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method

        // Method hiding using class name
        System.out.println("");
        System.out.println("Method hiding using Class name :");
        Child.main(new String[0]);  // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method
        Child.display(); // Hiding Parent static display() method with Child static display() method

        // Method hiding using object
        System.out.println("");
        System.out.println("Method hiding using object :");
        child.main(new String[0]); // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method

    }
}
