package java_codes.interfaces.functionalInterface.callable;

import java.util.concurrent.*;

class FactorialTask implements Callable<Integer> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}