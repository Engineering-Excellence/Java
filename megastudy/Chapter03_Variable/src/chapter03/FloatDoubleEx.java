package chapter03;

/**
 * <h1>실수형</h1>
 *
 * 실수 자료형은 float과 double 두 가지가 있는데, 소수점이 있는 수를 저장할 때 사용한다.
 * float의 크기는 4byte, double은 이름 그대로 두 배이기 때문에 8byte를 사용한다.
 *
 * @author Kyle
 * @since 2026. 06. 16.
 */
public class FloatDoubleEx {

    public static void main(String[] args) {

        float f = 3.141592653589793f;
        double d = 3.141592653589793d;

        System.out.println("float: " + f);  // float: 3.1415927
        System.out.println("double: " + d);  // double: 3.141592653589793

        double d2 = 3.141592653589793;  // double 리터럴은 기본적으로 double 타입이므로 d를 생략할 수 있다.
        System.out.println("double: " + d2);  // double: 3.141592653589793
    }
}
