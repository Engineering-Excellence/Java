package chapter04;

/**
 * <h1>비트연산</h1>
 * <p>
 * 비트연산은 비트단위로 연산하는 것을 말하며, 비트(bit)는 0과 1로 이루어진 컴퓨터에서 데이터를 다루는 최소단위이다.
 * 자바의 자료형 중 0과 1로 나타낼 수 있는 정수 자료형만 비트연산이 가능하다. 따라서, 실수 타입은 비트연산이  불가능하다.
 *
 * @author Kyle
 * @since 2026. 06. 28.
 */
public class OpEx6 {

    public static void main(String[] args) {
        System.out.println("2: " + Integer.toBinaryString(2));  // 10진수 2를 2진수로 변환
        System.out.println("3: " + Integer.toBinaryString(3));  // 10진수 3을 2진수로 변환

        // 비트 논리연산
        System.out.println("2&3: " + (2 & 3));
        System.out.println("2|3: " + (2 | 3));
        System.out.println("2^3: " + (2 ^ 3));
        System.out.println("~3: " + ~3);

        // 첫자리는 부호를 나타내는 비트를 포함하여 모든 비트를 반대로 변환
        System.out.println("~3을 이진수로: " + Integer.toBinaryString(~3));

        // ~3의 2진수값의 길이
        // 첫자리는 부호를 나타내는 비트, 나머지 31자리로 정수자료형을 메모리에 저장
        System.out.println("~3의 2진수값의 길이: " + Integer.toBinaryString(~3).length());
        System.out.println(Integer.MAX_VALUE);  // 정수자료형의 최댓값 (2의 31승 - 1)
        System.out.println(Integer.parseInt("1111111111111111111111111111100", 2) - Integer.MAX_VALUE - 1);
    }
}
