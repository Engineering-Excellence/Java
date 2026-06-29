package chapter04;

/**
 * <h1>삼항연산</h1>
 * <p>
 * 3개의 항으로 이루어진, 특정 조건식에 따라 조건이 참이냐 거짓이냐에 따라 다르게 실행할 수 있는 연산이다.
 *
 * @author Kyle
 * @since 2026. 06. 29.
 */
public class OpEx7 {

    public static void main(String[] args) {
        int score = 80;
        String pass = score >= 60 ? "합격" : "불합격";
        System.out.println(pass);
    }
}
