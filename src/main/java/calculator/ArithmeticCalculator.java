package src.main.java.calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {
    private int a;
    private int b;
    private char operator;
    private final Queue<Double> queue;

    public ArithmeticCalculator(Queue<Double> queue) {
        this.queue = queue;
    }

    public double operate () throws BadException{
        double result = 0;

        switch (this.operator) {
            case '+':
                result = AddOperator.operator(this.a, this.b);
                break;
            case '-':
                result = SubtractOperator.operator(this.a, this.b);
                break;
            case '*':
                result = MultiplyOperator.operator(this.a, this.b);
                break;
            case '/':
                result = DivideOperator.operator(this.a, this.b);
                break;
            case '%':
                result = ModOperator.operator(this.a, this.b);
            default:
                System.out.println("잘못된 입력입니다.");
        }

       queue.add(result);

        return result;
    }

    public int getA () {
        return a;
    }
    public int getB () {
        return b;
    }
    public char getOperator () {
        return operator;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }


}
