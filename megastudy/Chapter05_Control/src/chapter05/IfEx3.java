package chapter05;

/**
 * <h1>중첩 if문</h1>
 * <p>
 * if문의 중괄호 블록 안에 또 다른 if문이 포함되는 것을 중첩 if문이라고 한다.
 * 안쪽의 if문은 바깥쪽의 if문의 조건식이 true인 경우에만 실행된다.
 * </p>
 *
 * @author Kyle
 * @since 2026. 07.09.
 */
public class IfEx3 {

    public static void main(String[] args) {
        int math = 90;
        int eng = 95;

        if (math >= 60) {
            if (eng >= 60) {
                System.out.println("통과");
            }
        } else {
            System.out.println("탈락");
        }
    }
}
