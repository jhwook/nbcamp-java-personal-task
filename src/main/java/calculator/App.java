package src.main.java.calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0);

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : " + num1 + operator + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과 : " + num1 + operator + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(STR."결과 : \{num1}\{operator}\{num2} = \{result}");
                    break;
                case '/':
                    if (num2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    else {
                        result = num1 / num2;
                        System.out.println("결과 : " + num1 + operator + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String str = sc.next();
            if(Objects.equals(str, "exit")) break;
        }
    }
}
