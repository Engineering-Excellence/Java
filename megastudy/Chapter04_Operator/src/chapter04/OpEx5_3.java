package chapter04;

public class OpEx5_3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // & 연산
//        System.out.println(b > 0 & (a / b > 0));    // Exception in thread "main" java.lang.ArithmeticException: / by zero

        // && 연산
        System.out.println(b > 0 && (a / b > 0));   // false (방어코드: 왼쪽 피연산자가 false이므로 오른쪽 피연산자는 호출되지 않음)
    }
}
