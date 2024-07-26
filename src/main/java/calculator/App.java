package src.main.java.calculator;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> resultQueue = new LinkedList<>();
        Calculator calculator = new Calculator(resultQueue);

        while (true) {
            System.out.println("원의 넓이 계산 : circleArea / 사칙연산 : operate");
            String choose = sc.next();
            double result = 0;

            if(Objects.equals(choose, "circleArea")){
                System.out.println("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();
                result = calculator.calculateCircleArea(radius);
            } else if (Objects.equals(choose, "operate")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
                char operator = sc.next().charAt(0);

                calculator.setA(num1);
                calculator.setB(num2);
                calculator.setOperator(operator);

                result = calculator.calculate(num1, num2, operator);
            }



            System.out.println("결과: " + result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if(Objects.equals(remove, "remove")) calculator.removeResult();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if(Objects.equals(inquiry, "inquiry")) calculator.inquiryResults();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if(Objects.equals(exit, "exit")) break;
        }
    }
}
