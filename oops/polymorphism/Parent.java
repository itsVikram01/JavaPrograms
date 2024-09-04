package java_codes.oops.polymorphism;

public class Parent extends Animal {
    public static void main(String[] args) { // Method hiding of Animal class static main() method in Parent class
        System.out.println("Hiding Animal static main(String[] args) method with Parent static main(String[] args) method");
    }
    public static void main(int[] args) { // Overloading of static main() method is possible in same class
        System.out.println("Overloading Parent static main(String[] args) method with Parent static main(int[] args)");
    }
    @Override
    public void makeSound() { // Overriding
        System.out.println("Overriding Animal makeSound() method with Parent makeSound() method");
    }
    public static void display() { // Parent static display() method
        System.out.println("Parent class static display() method");
    }
}
