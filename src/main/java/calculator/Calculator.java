package src.main.java.calculator;

import java.util.Queue;

public class Calculator {
    private int a;
    private int b;
    private char operator;
    private Queue<Double> queue;

    private final double PI = 3.14;
    private double radius;

    private final ArithmeticCalculator calculate = new ArithmeticCalculator();
    private final CircleCalculator calculateCircleArea = new CircleCalculator();

    public Calculator(Queue<Double> queue) {
        this.queue = queue;
    }

    public double calculate () throws Exception {
        double result = this.calculate.operate(a, b, operator);
        this.queue.add(result);
        return result;
    }

    public double calculateCircleArea () {
        double result = this.calculateCircleArea.operate(radius);
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}


