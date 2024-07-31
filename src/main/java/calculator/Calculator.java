package src.main.java.calculator;

import java.util.Queue;

public class Calculator {
    private Queue<Double> queue;

    public Calculator(Queue<Double> queue) {
        this.queue = queue;
    }

    public Calculator() {
    }

    // 연산 결과 삭제 메소드
    public void removeResult() {
        this.queue.poll();
    }

    // 연산 결과 조회 메소드
    public void inquiryResults() {
        System.out.println(queue);
    }

}


