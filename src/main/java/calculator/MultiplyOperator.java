package src.main.java.calculator;

public class MultiplyOperator {
    public static double operator(int a, int b) throws BadException{
        if (b == 0) throw new BadException();
        return a * b;
    }
}
