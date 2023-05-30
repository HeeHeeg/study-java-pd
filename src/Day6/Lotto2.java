package Day6;

import java.util.Stack;

public class Lotto2 {
    // 재귀 함수를 사용해서
    // Set 사용하지 말고
    // 로또 번호를 만들어 보자. 0 *45 +1  <= Math.random() * 45 +1 < 1 * 45 +1
    // ((int) (Math.random() * 45) +1
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < 7; i++) {
            stack.add(i);
        }
//        lotto(1);
    }


//    static void lotto(int i) {
//        if (i > 7) return;
//        lotto((int) (Math.random() * 45) + 1);
//        System.out.println(i);
//    }
}