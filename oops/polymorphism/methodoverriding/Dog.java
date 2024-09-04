package java_codes.oops.polymorphism.methodoverriding;

public class Dog extends Animal {

    // Overridden method
    @Override
    public void makeSound() {
        System.out.println("Dog makeSound method : Woof!");
    }

}
