package Day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//      set Queue Stack
//        String str = "";
//        final float pie = 3.14f;
//        final Integer i = 0;     // i = 1; -> 에러. 이렇게 final은 재선언이 안된다.
//        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        //=> 순서는 없다. 중복x  // 에러 종류 error(빨감. 돌아가지도 않음),  warning(노란것. 뭔가 이상하니 고치라는 뜻)
        set.add(1);
        set.add(2);
        set.add(1);                                  // 1에 노란게 떠있는건 워닝? 이다.
        System.out.println(set.size());             //중복이 없기 때문에 2만 출력된다.

        for (Integer i : set                  //순서없는것은 foreach로 찍으면됨. 이렇게 하면 2, 1, 2가 모두 출려됨.
        ) {
            System.out.printf("%f 입니다. %d %s%n", (float) i, i, "ㅎㅎㅎㅎ");          // 2 1 2 모두 출력
        }

    }
}

/*
//final class Person { // 여기에 붙인 final을 붙이는건 이 클래스에 더 변화가 없다라는 의미. final이 붙으면 상속될 수 없다. 최종 클래스이기 때문.
//    private final Integer num;  //-> final이기 때문에 넣을수가 없으니 무조건 null이라 에러가 뜬다.
//
//    private final String name;  // 이런 필드에 final을 붙이는건 여기 필드에서 더이상 변화가 없다는 의미를 나타내는 것이다.
//    // 세터를 쓰지 않게 만들겠다면 이렇게 final을 붙이면 된다.
//
//    public Person(Integer num, String name) {
//        this.num = num;
//        this.name = name;
//
//    }
//}*/
