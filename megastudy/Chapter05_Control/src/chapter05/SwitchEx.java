package chapter05;

import java.util.Scanner;

/**
 * <h1>switch문</h1>
 * <p>
 * switch문도 if문과 같이 조건문 중 하나지만,
 * 조건식의 결과(true/false) 여부에 따라 중괄호 블록 내부의 실행문이 실행되는 것이 아니라,
 * 변수의 값에 따라 실행문을 선택하게 되는 구문이다.
 * </p>
 *
 * @author Kyle
 * @since 2026. 07. 11.
 */
public class SwitchEx {

    public static void main(String[] args) {
        System.out.print("점수를 입력하세요.: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        /*
        switch (score / 10) {
            case 9, 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        */

        // Enhanced Switch (Java 14 이상)
        char grade = switch (score / 10) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println("학점은 " + grade + "입니다.");
    }
}
