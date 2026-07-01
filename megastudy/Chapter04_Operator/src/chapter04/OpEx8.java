package chapter04;

/**
 * <h1>문자열연산</h1>
 * <p>
 * 문자열도 연산이 가능하지만, + 연산자만 사용 가능하며, 문자열과 문자열을 연결해주는 연산이다.
 *
 * @author Kyle
 * @since 2026. 07. 02
 */
public class OpEx8 {

    public static void main(String[] args) {
        String name = "홍길동";
        System.out.println("안녕하세요 " + name + "입니다.");

        int height = 180;
        System.out.println("저의 키는 " + height + "cm입니다.");

//        String weight = 75.5;   // 컴파일 에러 발생(문자자료형 변수에는 숫자 대입 못 함)
        String weight = 75.5 + "";
        System.out.println("저의 몸무게는 " + weight + "kg입니다.");

        int ageInt = 30;    // 정수
        String ageStr = "30";   // 문자열
        System.out.println("저의 나이는 " + ageInt + "살입니다.");
        System.out.println("저의 나이는 " + ageStr + "살입니다.");
    }
}
