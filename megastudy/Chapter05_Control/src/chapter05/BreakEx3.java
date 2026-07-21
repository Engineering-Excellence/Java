package chapter05;

public class BreakEx3 {

    public static void main(String[] args) {
        // 반복문에 레이블을 붙여서 break문이 어느 반복문을 중지할지 지정할 수 있다.
        target:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break target;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
