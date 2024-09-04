package java_codes.adapterClass;

/* Interface are collection of abstract methods and constant fields which are any Service Requirement Specification(SRS).
It does not provide implementation of any methods.
To define an interface in java we use "interface" keyword followed by interface name. */

public interface MyInterface {
    int myConstant = 20; // public static final but not abstract(because abstract is not applicable for variables)

    void m1(); // public and abstract
    void m2(); // public and abstract



    // If we not apply @FunctionalInterface then we can use default and static method in interface
    int add(int a, int b);

    // Default method
    default int multiply(int a, int b) {
        return a * b;
    }

    // Static method
    static int subtract(int a, int b) {
        return a - b;
    }
}
