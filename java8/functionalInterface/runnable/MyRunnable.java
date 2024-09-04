package java_codes.java8.functionalInterface.runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}