package chapter03;

/**
 * <h1>변수의 범위(scope)</h1>
 * <p>
 * 변수를 선언하면 사용 가능한 범위가 존재한다.
 * 이를 scope라고 하며, 자바에서는 프로그램 실행 단위를 블록단위로 구분하는데 이 블록을 나누는 기준이 {}(중괄호)이다.
 *
 * @author Kyle
 * @since 2026. 06. 20.
 */
public class ScopeEx {  // 1. 클래스 블럭

    int no; // 1-1. 클래스 블럭 내에서 사용 가능한 변수

    public static void main(String[] args) {    // 2. main 메서드 블럭
        String name;    // 2-1. main 메서드 블럭 내에서 사용 가능한 변수

        if (true) {
            // 메서드 블럭 안에서 선언한 변수 사용 가능
            name = "홍길동";

            // if문 블럭 안에서 변수 선언
            String email = "hong@test.com";
        }

        // if문 블럭 밖에서 email 변수를 사용하면 에러 발생;
//        email = "hong@test.com";
    }
}
