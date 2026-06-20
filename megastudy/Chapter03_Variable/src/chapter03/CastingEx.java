package chapter03;

/**
 * <h1>형변환(casting)</h1>
 * <p>
 * 기본자료형들은 boolean(논리) 자료형을 제외한 나머지 모든 자료형들은 서로 형변환이 가능하다.
 * 형변환은 자동(묵시적) 형변환과 강제(명시적) 형변환 두가지로 나눠질 수 있다.
 * 작은 크기의 자료형은 큰 크기를 가진 자료형에 저장될 때 자동 형변환이 일어난다.
 *
 * @author Kyle
 * @since 2026. 06. 20.
 */
public class CastingEx {

    public static void main(String[] args) {
        // 자동 형변환 예시
        int number = 10;    // int 자료형

        long number2 = number;  // 자동 형변환 int < long

        System.out.println(number2);
    }
}
