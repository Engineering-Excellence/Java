package chapter03;

/**
 * <h1>상수와 리터럴</h1>
 * <p>
 * 상수란 값을 한 번 저장하면 변경할 수 없는 수, 즉 항상 같은 수이다.
 * 상수로 선언하려면 변수 앞에 final이라는 키워드를 사용한다.
 * <p>
 * 리터럴(literal)은 소스상에서 직접 입력된 값을 뜻한다.
 * <p>
 * 그 외 제어문자라는 것이 있는데, 다른 말로 escape 문자라고도 한다.
 * 이 제어문자는 원래 문자 자체의 의미와 별개로 새로운 의미가 부여된 문자로, 문자열 내에서 특별한 용도로 사용된다.
 *
 * @author Kyle
 * @since 2026. 06. 19.
 */
public class EscapeEx {

    public static void main(String[] args) {
        String greet = "안녕하세요,\n저는 \"홍길동\"입니다.";
        String greet2 = "\t반갑습니다.";

        System.out.println(greet);
        System.out.println(greet2);
    }
}
