package java_codes.oops.polymorphism;


public class Child extends Parent {
    // Static method can not overrided but it can use concept method hiding
    public static void main(String[] args) { // Method hiding of Parent static main() method with Child static main() method
        System.out.println("Hiding Parent static main(String[] args) method with Child static main(String[] args) method");
    }
    public static void display() { // Method hiding of Parent static display() method with Child static display() method
        System.out.println("Hiding Parent static display() method with Child static display() method");
    }

    // Overloading of static main() method is possible in same class
    public static void main(Float[] args) {
        System.out.println("Overloading Parent static main(String[] args) method with Child static main(Float[] args)");
    }
    public static void main() {
        System.out.println("Overloading Child static main(float[] args) method with Child static main() ");
    }

    // Overriding
    @Override
    public void makeSound() {
        System.out.println("Overriding Parent makeSound() method with Child makeSound() method");
    }
}
