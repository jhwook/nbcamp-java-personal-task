package src.main.java.calculator;

public class ArithmeticCalculator  {
    public double operate (int a, int b, char operator) throws BadException{
        double result = 0;

        switch (operator) {
            case '+':
                result = AddOperator.operator(a, b);
                break;
            case '-':
                result = SubtractOperator.operator(a, b);
                break;
            case '*':
                result = MultiplyOperator.operator(a, b);
                break;
            case '/':
                result = DivideOperator.operator(a, b);
                break;
            case '%':
                result = ModOperator.operator(a, b);
            default:
                System.out.println("잘못된 입력입니다.");
        }
//        result = operation.operate(this.a, this.b);
        return result;
    }


}
