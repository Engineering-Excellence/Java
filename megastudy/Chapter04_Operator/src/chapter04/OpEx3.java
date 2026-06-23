package chapter04;

/**
 * <h1>증감연산</h1>
 * <p>
 * 증감연산은 변수에만 사용할 수 있다.
 * 증감연산은 두가지 종류가 있는데, 연산자가 변수 앞에 있으면 전위연산, 뒤에 있으면 후위연산이다.
 *
 * @author Kyle
 * @since 2026. 06. 23.
 */
public class OpEx3 {

    public static void main(String[] args) {
        int a = 10;
        int b = ++a;    // b = 11
        System.out.println("전위연산 결과: " + b);

        int x = 10;
        int y = x++;    // y = 10, x = 11
        System.out.println("후위연산 결과: " + y);
        System.out.println("x: " + x);
    }
}
