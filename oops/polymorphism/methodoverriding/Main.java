package java_codes.oops.polymorphism.methodoverriding;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound(); // Animal makeSound method

        Cat cat = new Cat();
        cat.makeSound(); // Cat makeSound method : Meow!

        Dog dog = new Dog();
        dog.makeSound(); // Dog makeSound method : Woof!

    }
}
