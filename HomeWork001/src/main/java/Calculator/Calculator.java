package Calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i*i1;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend / divisor;
    }

    public double calculateDiscount(double sum, double percent){
        if (sum < 0){
            throw new ArithmeticException("Значение суммы отрицательное");
        }else if (percent < 0){
            throw new ArithmeticException("Значение процента отрицательное");
        }
        return sum-sum*percent/100;
    }

}