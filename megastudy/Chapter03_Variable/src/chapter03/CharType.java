package chapter03;

/**
 * <h1>char 자료형</h1>
 *
 * char 자료형을 정수형으로 분류하긴 했지만, 문자형으로 분류하는 경우도 있다.
 * 정수형처럼 연산이 가능한데, 이유는 내부적으로 문자에 해당하는 코드를 정수로 저장하고 있기 때문이다.
 *
 * 'A' = 65, 'a' = 97
 *
 * @author Kyle
 * @since 2026. 06. 16.
 */
public class CharType {

    public static void main(String[] args) {

        char a = 'A';
        System.out.println("a: " + a);  // a: A

        int b = a;
        System.out.println("b: " + b);  // b: 65

        char c = 66;
        System.out.println("c: " + c);  // c: B

        int d = a + b;
        System.out.println("d: " + d);  // d: 130
    }
}
