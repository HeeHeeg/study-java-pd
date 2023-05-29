package Day2;

public class Banking2 {
    public static void main(String[] args) {
        //Q1. 지불해야 하는 값이 4720일 때, 10원, 50원, 100원, 500원 동전으로 동전의 수가 가장 적게 지불하게끔 구현해보아라.
        int money = 4720;

        int[] mon = {10, 50, 100, 500};

        for (int i = money; i > 0; i++) {
            if (money % 500 < 500 ){
                System.out.println(i);
            }
        }
    }
}
