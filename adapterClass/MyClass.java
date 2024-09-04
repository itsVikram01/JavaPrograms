package java_codes.adapterClass;

/* we have to provide implementation of every method of interface in every class which implements Interface. */
public class MyClass implements MyInterface {
    public void m1(){
        System.out.println("m1() method impl");
    }
    public void m2(){
        System.out.println("m2() method impl");
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return MyInterface.super.multiply(a, b);
    }
}