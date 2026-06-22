package chapter04;

/**
 * <h1>산술연산</h1>
 * <p>
 * 산술연산은 사칙연산에 나머지 연산이 추가된 연산이다.
 * 기본자료형 중 논리자료형(boolean)을 제외한 모든 기본 자료형의 연산이 가능하며,
 * 주의할 점은 연산의 결과가 대입되는 변수에 자료형의 범위가 초과되는 경우 에러가 발생하니 주의하자.
 * 산술 연산은 연산되는 데이터(값)의 자료형 중에서 더 큰 자료형으로 자동 형변환을 해서 수행하며 결과도 더 큰 자료형으로 리턴되고,
 * int 보다 작은 자료형의 산술연산은 int로 변환해서 수행한다.
 *
 * @author Kyle
 * @since 2026. 06. 21.
 */
public class OpEx2 {

    public static void main(String[] args) {
        int a = 5 + 5;
        System.out.println("5 + 5 = " + a);     // 10 출력

        int b = a - 5;
        System.out.println("10 - 5 = " + b);    // 5 출력

        int c = b * 2;
        System.out.println("5 * 2 = " + c);     // 10 출력

        int d = c / 5;
        System.out.println("10 / 5 = " + d);    // 2 출력

        // 나머지 연산
        int e = 10 % 3;     // 10 나누기 3의 결괏값은 몫이 3, 나머지 1
        System.out.println("10 % 3 = " + e);
    }
}
