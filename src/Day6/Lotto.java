package Day6;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
//        0 *45 +1  <= Math.random() * 45 +1 < 1 * 45 +1
//        1 <= number < 46 // 위에와 같은것. 이건 코딩아 아니라 수학..
//        6개 중복 x
//        Math.random() * 45 + 1 double -> 정수로 나오게해야함. 중복이 없으려면 set을 사용해야 한다.
//        /0.
//        1.set의 사이즈가 6이 될때까지
//        2.number를 만들자
//        2-1. Math.random() * 45 + 1 double -> int
//        3.그 다음 출력하자.
//        5개 만들기.
        Set<Integer> set = new HashSet<>();         //0.
        while (set.size() != 6) {                   //1. set의 사이즈가 6이 될 때까지.
            set.add((int) (Math.random() * 45 + 1));
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}


//        for (int i = 1; i < 7; i++) {   // 이렇게 아님.. 중복인지 알 수 없음. 1 2 3 3 4 5 이럴수도 있지만 6번 돌고 끝나버림.
//        System.out.println((int) (Math.random() * 45 + 1));

//        }
//            System.out.println(set.size());
/*
        for (Integer j : set                  //순서없는것은 foreach로 찍으면됨. 이렇게 하면 2, 1, 2가 모두 출려됨.
        ) {
            System.out.printf("%d", j);          // 2 1 2 모두 출력
        }*/
//    }
//}

