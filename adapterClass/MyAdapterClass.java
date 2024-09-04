package java_codes.adapterClass;

/* Adapter class is a class which provide empty implementation of every method present in interface. */
public class MyAdapterClass  implements MyInterface {
    @Override
    public void m1() {}

    @Override
    public void m2() {}

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return MyInterface.super.multiply(a, b);
    }
}
