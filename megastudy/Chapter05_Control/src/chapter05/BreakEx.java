package chapter05;

/**
 * <h1>반복문의 중지</h1>
 * <p>
 * 반복문이 실행되는 도중 특정 조건에 따라 반복이 중지되도록 해야되는 경우가 발생할 수 있는데, 이때 break와 continue를 사용한다.
 * break문은 이름 그대로 반복문을 아예 중지할 때 사용한다.
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 21.
 */
public class BreakEx {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // 반복문 중지
            }
            System.out.println(i);
        }
    }
}
