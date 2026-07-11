package chapter05;

public class SwitchExStr {

    public static void main(String[] args) {
        String addr = "서울";

        /*
        // switch문은 정수형, 문자형, 문자열형(Java 1.7 이상) 변수만 사용할 수 있다.
        switch (addr) {
            case "서울":
                System.out.println("우리 집은 서울입니다.");
                break;
            case "부산":
                System.out.println("우리 집은 부산입니다.");
                break;
            case "제주":
                System.out.println("우리 집은 제주입니다.");
                break;
            default:
                System.out.println("주소 없음");
        }
        */

        // Enhanced Switch (Java 14 이상)
        switch (addr) {
            case "서울" -> System.out.println("우리 집은 서울입니다.");
            case "부산" -> System.out.println("우리 집은 부산입니다.");
            case "제주" -> System.out.println("우리 집은 제주입니다.");
            default -> System.out.println("주소 없음");
        }
    }
}
