package chapter04;

/**
 * <h1>연습문제 06</h1>
 * <p>
 * 가게에서 물건을 구매하고 금액을 지불하려고 한다.
 * 지불해야 할 금액이 187,000원인데, 5만원권과 1만원권, 5천원권, 1천원권 지폐를 가장 적은 지폐수량으로 지불하는 코드를 작성하시오.
 *
 * @author Kyle
 * @since 2026. 07. 05.
 */
public class Exercise6 {

    public static void main(String[] args) {
        int price = 187000;

        int fiftyThousandWon = price / 50000;
        System.out.println("5만원권: " + fiftyThousandWon + "장");

        int tenThousandWon = (price % 50000) / 10000;
        System.out.println("1만원권: " + tenThousandWon + "장");

        int fiveThousandWon = (price % 10000) / 5000;
        System.out.println("5천원권: " + fiveThousandWon + "장");

        int oneThousandWon = (price % 5000) / 1000;
        System.out.println("1천원권: " + oneThousandWon + "장");
    }
}
