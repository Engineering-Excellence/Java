package chapter03;

/**
 * <h1>참조자료형</h1>
 *
 * 참조자료형(Reference Type)은 기본자료형과 다르게 값을 직접 저장하는 것이 아니라, 메모리에 저장된 위치정보를 저장하고 있다.
 * 배열, 클래스, 인터페이스가 참조자료형에 속하는데, 기본자료형 외 모든 자료형들이 참조자료형에 속한다.
 * 클래스나 인터페이스는 개발자가 직접 만들 수 있는 자료형이라서 사용자 정의 자료형이라고도 부른다.
 *
 * @author Kyle
 * @since 2026. 06. 17.
 */
public class StringEx {

    public static void main(String[] args) {

        String name;    // 문자열 변수 선언
        name = "홍길동";   // 변수 초기화
        String name2 = "홍길동";  // 변수 선언과 동시에 초기화
        String name3 = null;    // null로 초기화 => 참조형 변수는 null로 초기화하는 것을 권장
        String name4 = "";  // 빈 문자열로 초기화 => null과는 다르다. null은 참조형 변수가 객체를 참조하지 않는 상태를 의미하지만, 빈 문자열은 길이가 0인 문자열 객체를 참조하는 상태를 의미한다.

        System.out.println("name2=" + name2);   // name2=홍길동
        System.out.println("name3=" + name3);   // name3=null
        System.out.println("name4=" + name4);   // name4=
    }
}
