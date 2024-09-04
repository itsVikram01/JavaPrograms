package java_codes.interfaces.functionalInterface.customFunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.greet("Alice");
    }
}
