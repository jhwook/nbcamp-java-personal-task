package src.main.java.calculator;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Queue<Double> resultQueue = new LinkedList<>();
        Calculator calculator = new Calculator(resultQueue);

        while (true) {
            System.out.println("원의 넓이 계산 : circleArea / 사칙연산 : operate");
            String choose = sc.next();
            double result = 0;

            if(Objects.equals(choose, "circleArea")){
                System.out.println("원의 반지름을 입력하세요: ");
                calculator.setRadius(sc.nextInt());
                result = calculator.calculateCircleArea();
            } else if (Objects.equals(choose, "operate")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                calculator.setA(sc.nextInt());
                System.out.print("두 번째 숫자를 입력하세요: ");
                calculator.setB(sc.nextInt());

                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
                calculator.setOperator(sc.next().charAt(0));


                result = calculator.calculate();
            }



            System.out.println("결과: " + result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(Objects.equals(sc.next(), "remove")) calculator.removeResult();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(Objects.equals(sc.next(), "inquiry")) calculator.inquiryResults();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(Objects.equals(sc.next(), "exit")) break;
        }
    }
}
