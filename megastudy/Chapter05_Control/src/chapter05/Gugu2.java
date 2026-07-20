package chapter05;

/**
 * <h1>구구단 출력</h1>
 *
 * @author Kyle
 * @since 2026. 07. 20.
 */
public class Gugu2 {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("[" + i + "단]");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
