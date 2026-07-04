package chapter04;

/**
 * <h1>연습문제 03</h1>
 * <p>
 * 한 반에 27명인 학급이 있다.
 * 미술 수업을 위해 색연필을 5다스를 받았다면, 각 학생에게 나누어 줄 수 있는 색연필 수와
 * 나눠주고 남은 색연필 수를 출력하는 프로그램을 작성하고자 한다.
 *
 * @author Kyle
 * @since 2026. 07. 04.
 */
public class Exercise3 {

    public static void main(String[] args) {
        int colorPen = 5 * 12;  // 한 다스는 12개
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        System.out.println("학생당 나눠가지는 색연필 수: " + divColorPen);

        int remainColorPen = colorPen % studentCount;
        System.out.println("똑같이 나눠가지고 남은 색연필 수: " + remainColorPen);
    }
}
