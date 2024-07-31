package src.main.java.calculator;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 계산 결과를 저장할 queue 생성
        Queue<Double> resultQueue = new LinkedList<>();
        // 계산 결과를 저장하는 Calculator 클래스 생성
        Calculator calculator = new Calculator(resultQueue);
        // 사칙연산 기능을 담당하는 ArithmeticCalculator 클래스 생성
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(resultQueue);
        // 원 넓이 계산을 담당하는 CircleCalculator 클래스 생성
        CircleCalculator circleCalculator = new CircleCalculator(resultQueue);

        // exit를 입력받기 전까지 무한히 반복
        while (true) {
            System.out.println("원의 넓이 계산 : circleArea / 사칙연산 : operate");
            String choose = sc.next();
            // 계산 결과를 저장할 변수 result 생성
            double result = 0;

            // 원 넓이 계산
            if(Objects.equals(choose, "circleArea")) {
                System.out.println("원의 반지름을 입력하세요: ");
                // CircleCalculator 클래스의 radius 설정
                circleCalculator.setRadius(sc.nextInt());
                // CircleCalculator 클래스의 operate 메소드로 원 넓이 계산 후 결과 저장
                result = circleCalculator.operate();
            }
            // 사칙연산 수행
            else if (Objects.equals(choose, "operate")) {
                // 첫 번째 수, 두 번째 수, 연산 기호 입력받아 ArithmeticCalculator 클래스의 a, b, operator 설정
                System.out.print("첫 번째 숫자를 입력하세요: ");
                arithmeticCalculator.setA(sc.nextInt());
                System.out.print("두 번째 숫자를 입력하세요: ");
                arithmeticCalculator.setB(sc.nextInt());

                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
                arithmeticCalculator.setOperator(sc.next().charAt(0));

                // ArithmeticCalculator 클래스의 operate 메소드로 사칙연산 수행 후 결과 저장
                result = arithmeticCalculator.operate();
            }

            System.out.println("결과: " + result);
            // remove 입력받아 Calculator 클래스의 연산 결과 삭제 메소드
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(Objects.equals(sc.next(), "remove")) calculator.removeResult();

            // inquiry 입력받아 Calculator 클래스의 연산 결과 조회 메소드
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(Objects.equals(sc.next(), "inquiry")) calculator.inquiryResults();

            // exit 입력 받아 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(Objects.equals(sc.next(), "exit")) break;
        }
    }
}
