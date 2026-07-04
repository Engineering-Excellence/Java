package chapter04;

/**
 * <h1>연습문제 07</h1>
 * <p>
 * 십의 자리 이하를 버리는 코드를 작성하라.
 *
 * @author Kyle
 * @since 2026. 07. 05.
 */
public class Exercise7 {

    public static void main(String[] args) {
        int number = 1234;
        int result = number / 100 * 100; // 십의 자리 이하를 버리기 위해 100으로 나눈 후 다시 100을 곱함
//        int result = number - number % 100; // 십의 자리 이하를 버리기 위해 100으로 나눈 나머지를 빼줌
        System.out.println("십의 자리 이하를 버린 수: " + result);
    }
}
