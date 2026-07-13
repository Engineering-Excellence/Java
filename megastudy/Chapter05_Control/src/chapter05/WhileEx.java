package chapter05;

/**
 * <h1>while문</h1>
 * <p>
 * while (조건식) {
 *     실행문;    // 조건식이 true인 경우에만 실행
 * }
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 13.
 */
public class WhileEx {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1부터 100까지의 합: " + sum);
    }
}
