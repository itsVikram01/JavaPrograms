package java_codes.java8.defaultAndStaticMethodInInterface;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    // Can override default method if needed
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method");
    }

    public static void main(String[] args) {
        MyInterfaceImpl obj = new MyInterfaceImpl();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }

}
