package chapter05;

/**
 * <h1>중첩 반복문</h1>
 * <p>
 * 중첩 반복문은 반복문 블록 안에 반복문이 존재하는 경우이다.
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 20.
 */
public class Gugu {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("i =" + i + ", j = " + j);
            }
            System.out.println();
        }
    }
}
