package src.main.java.calculator;

import java.util.Queue;

public class Calculator {
    private int a;
    private int b;
    private char operator;
    private final Queue<Double> queue;
    private final double PI = 3.14;
    static double radius;

    public Calculator(Queue queue) {
        this.queue = queue;
    }
    public double calculate(int a, int b, char operator) throws BadException {
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                this.queue.add(result);
                break;
            case '-':
                result = a - b;
                this.queue.add(result);
                break;
            case '*':
                result = a * b;
                this.queue.add(result);
                break;
            case '/':
                if (b == 0) throw new BadException();
                else {
                    result = a / b;
                    this.queue.add(result);
                }
                break;
            default:
                System.out.println("잘못된 입력입니다.");



        }
        return result;
    }

    public double calculateCircleArea (double radius) {
        double result = 0;
        result = PI * radius * radius;
        this.queue.add(result);
        return result;
    }

    public void removeResult() {
        this.queue.poll();
    }

    public void inquiryResults() {
        System.out.println(queue);
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
    public double getRadius () {
        return radius;
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
    public void setRadius(double radius) {
        this.radius = radius;
    }
}


