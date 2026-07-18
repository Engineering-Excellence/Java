package chapter05;

/**
 * <h1>do~while문</h1>
 * <p>
 * do {
 *     실행문;    // 최소 한 번은 실행
 * } while (조건식);
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 18.
 */
public class DoWhileEx {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        do {
            sum += i;
            i++;
        } while (i <= 100);

        System.out.println("1부터 100까지의 합: " + sum);
    }
}
