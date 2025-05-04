package CalculatorWithFunctionalInterfaces;

@FunctionalInterface
public interface MathOperation {
    double calculate(double a, double b);
}
