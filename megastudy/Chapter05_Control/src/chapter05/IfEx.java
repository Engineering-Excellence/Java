package chapter05;

/**
 * <h1>if문</h1>
 * <p>
 * if 뒤의 괄호 안에 있는 조건식을 확인해서 이 조건식을 확인해서 이 조건식이 참(true)이라면 중괄호{} 블록 안의 실행문이 실행되고,
 * 그렇지 않다면(false) if문의 블럭 밑으로 넘어가며 다음 프로그램으로 실행되게 된다.
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 06.
 */
public class IfEx {

    public static void main(String[] args) {
        int score = 70;

        System.out.println("시험 시작");
        if (score >= 60) {
            System.out.println("합격입니다.");
        }
        System.out.println("시험 종료");
    }
}
