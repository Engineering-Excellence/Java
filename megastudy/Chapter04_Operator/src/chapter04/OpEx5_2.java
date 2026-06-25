package chapter04;

public class OpEx5_2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // & 연산
        System.out.println(a == b & test());    // 비트 연산 &의 경우 test() 메서드가 항상 호출됨

        // && 연산
        System.out.println(a == b && test());   // 논리 연산 &&의 경우 test() 메서드가 필요에 따라 호출됨 -> 왼쪽 피연산자가 false이면 오른쪽 피연산자는 호출되지 않음
    }

    public static boolean test() {
        System.out.println("test() 메서드 호출");
        return true;
    }
}
