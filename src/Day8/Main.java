package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //데이터는 원본 유지하고 새로운걸 만들어야 한다.
        //불변성
        list.add(1);
        list.add(2);
        list.add(3);
        //만약 list * 2한 데이터를 요구한다면?  아래처럼 하면 된다.
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i) * 2);
        }
        System.out.println(list);
        System.out.println(list2);
        // 이렇게 쓰는게 불편해서 stream이 나왔다.
        //map 길이 같은 리스트를 만드는 것.
        List<Integer> collect = list.stream().map(el ->  //map(a->)익명함수를 만드는것.
                el * 2                                      // el ->하나씩 꺼내서 보여줌.
        ).collect(Collectors.toList());                     //여기서 다시 배열에 넣어주는 것.
        System.out.println(collect);                        //그래서 배열로 나옴

    }
}
