package chapter04;

/**
 * <h1>논리연산</h1>
 * <p>
 * 논리연산의 개념은 수학에서 논리연산과 동일하다.
 * 논리곱(AND), 논리합(OR), 배타적 논리합(XOR), 논리부정(NOT) 4가지가 있으며,
 * 연산의 대상이 되는 피연산자, 연산의 결과 모두 boolean 자료형만 가능하다.
 *
 * @author Kyle
 * @since 2026. 06. 25.
 */
public class OpEx5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // AND 연산
        System.out.println("a > b && a == 10: " + (a > b && a == 10));  // true
        System.out.println("a > b && a == b: " + (a > b && a == b));    // false

        // OR 연산
        System.out.println("a > b || a == b: " + (a > b || a == b));    // true
        System.out.println("a < b || a == b: " + (a < b || a == b));    // false

        // XOR 연산
        System.out.println("a > b ^ a == 10: " + (a > b ^ a == 10));  // false
        System.out.println("a > b ^ a == b: " + (a > b ^ a == b));    // true

        // NOT 연산
        System.out.println("!(a > b): " + !(a > b));  // false
        System.out.println("!(a < b): " + !(a < b));  // true
    }
}
