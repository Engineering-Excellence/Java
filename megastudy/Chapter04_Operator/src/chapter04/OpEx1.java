package chapter04;

/**
 * <h1>대입연산</h1>
 * <p>
 * 연산이란 데이터를 처리하고 결과를 산출하는 작업을 의미한다.
 * 연산은 연산의 대상이 되는 피연산자와 연산기호를 뜻하는 연산자로 이루어진다.
 * 피연산자는 데이터의 값(리터럴 값 또는 변수)이며, 연산자와 함께 나열된 식을 연산식이라고 한다.
 *
 * @author Kyle
 * @since 2026. 06. 21.
 */
public class OpEx1 {

    public static void main(String[] args) {
        int number1 = 10;
        System.out.println("number1 = 10 -> " + number1);   // 10 출력

        number1 += 10;  // 더하고 대입
        System.out.println("number1 += 10 -> " + number1);  // 20 출력

        number1 -= 10;  // 빼고 대입
        System.out.println("number1 -= 10 -> " + number1);  // 10 출력

        number1 *= 2;   // 곱하고 대입
        System.out.println("number1 *= 2 -> " + number1);   // 20 출력

        number1 /= 2;   // 나누고 대입
        System.out.println("number1 /= 2 -> " + number1);   // 10 출력

        number1 %= 3;   // 나머지 대입
        System.out.println("number1 %= 3 -> " + number1);   // 1 출력
    }
}
