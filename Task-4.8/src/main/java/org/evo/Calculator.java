package org.evo;

public class Calculator {
    Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public String calc(double a, double b) {
        return String.valueOf(operation.getResult(a, b));
    }
}
