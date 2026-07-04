package chapter04;

/**
 * <h1>연습문제 05</h1>
 * <p>
 * 입력된 연도가 윤년인지 아닌지 판단하는 코드
 *
 * @author Kyle
 * @since 2026. 07. 04.
 */
public class Exercise5 {

    public static void main(String[] args) {
        int year = 2026;

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // 4의 배수이면서 100의 배수가 아니거나, 400의 배수

        // 윤년이면 true, 윤년이 아니면 false
        System.out.println(leapYear);
    }
}
