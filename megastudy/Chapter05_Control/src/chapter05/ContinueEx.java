package chapter05;

public class ContinueEx {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;  // 반복문의 다음 단계로 넘어감(해당 반복문만 중지)
            }
            System.out.println(i);
        }
    }
}
