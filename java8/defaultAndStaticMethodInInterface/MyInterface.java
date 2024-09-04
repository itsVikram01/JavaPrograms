package java_codes.java8.defaultAndStaticMethodInInterface;

public interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is the default method implementation");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in an interface");
    }

}
