package chapter04;

/**
 * <h1>연산자 우선순위</h1>
 * <p>
 * 1 (괄호)
 * 2 증감(++, --), 부호(+, -), 비트(~), 논리(!)
 * 3 산술(*, /, %)
 * 4 쉬프트(<<, >>, >>>)
 * 5 비교(>, >=, <, <=)
 * 6 비교(==, !=)
 * 7 비트논리(&)
 * 8 비트논리(^)
 * 9 비트논리(|)
 * 10 논리(&&)
 * 11 논리(||)
 * 12 조건(? :)
 * 13 대입(+=, -=, *=, /=...)
 *
 * @author Kyle
 * @since 2026. 07. 03.
 */
public class OpEx9 {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;

        // * 연산이 먼저 실행됨
        System.out.println(a + b * c);

        // 괄호로 묶어 우선순위를 높여줌
        System.out.println((a + b) * c);
    }
}
