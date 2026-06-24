package chapter04;

/**
 * <h1>비교연산</h1>
 * <p>
 * 비교연산은 두 항의 관계를 나타내는 연산자로 크기를 비교하거나 같은지 여부를 비교하는 연산이다.
 *
 * @author Kyle
 * @since 2026. 06. 24.
 */
public class OpEx4 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a <= b: " + (a <= b));  // false
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true

        boolean c = a == b;  // c 변수에 결괏값 대입
        System.out.println("c: " + c);  // false
        boolean d = c == false;  // d 변수에 결괏값 대입
        System.out.println("d: " + d);  // true
    }
}
