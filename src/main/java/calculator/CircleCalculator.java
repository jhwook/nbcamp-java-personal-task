package src.main.java.calculator;

import java.util.Queue;

public class CircleCalculator extends Calculator{
    static final double PI = 3.14;
    private final Queue<Double> queue;
    private double radius;

    public CircleCalculator(Queue<Double> queue) {
        this.queue = queue;
    }

    public double operate () {
        queue.add(PI * this.radius * this.radius);
        return PI * this.radius * this.radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
