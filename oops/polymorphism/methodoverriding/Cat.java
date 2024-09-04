package java_codes.oops.polymorphism.methodoverriding;

public class Cat extends Animal {

    // Overridden method
    @Override
    public void makeSound() {
        System.out.println("Cat makeSound method : Meow!");
    }
}
