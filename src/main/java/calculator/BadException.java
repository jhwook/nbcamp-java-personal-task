package src.main.java.calculator;

public class BadException extends Exception{
    public BadException () {
        super("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
    }
}
