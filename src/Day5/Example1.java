package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      //객체 : person {name, age}
        Map<String, String> map = new HashMap();  // 키타입, 밸류타입. dict(사전)같은 것.
//        map.put("banana", "바나나"); //키를 통해 벨류를 가져온다. - 사전에 banan를 검색하면 바나나를 출력하듯이 나오도록 입력.키에 있는 벨류를 반환한다.
//        map.get("banana");
//        map.put("banana", "노란 바나나"); //이렇게 하면 위에 입력한 "바나나"가 아니라 "노란 바나나가" 덮어씌여서 출력된다.
//        map.get("banana");
//        System.out.println(map.put("banana", "바나나"));       // 처음엔 banana에 아무것도 없으니까 null이 나옴. /여기서 '바나나'를 넣어줌
//        System.out.println(map.get("banana"));               // 이제 "바나나"가 나옴
//        System.out.println(map.put("banana", "노란 바나나"));   // 여기서 바나나가 출력되고 - 노란바나나로 입력됨
//        System.out.println( map.get("banana"));             // 노란 바나나로 바껴서 출려된느 것을 볼 수 있음.
        map.put("kim", "20 서울시 취업준비생(백수)");             //띄어쓰기로 나눠놓았다. 이부분은 스트링 공부한느거당!
        // 질문- 키를 알 수 있나?
        for (String key:map.keySet()) System.out.println(key);   //-> 이렇게 하면 banana가 나옴.  key를 알 수 있음.
        String person = map.get("kim");
        String[] sp = person.split("시");                //" " -> 띄어쓰기로 자르겠다. " 시 " 라고 입력하면 '시'를 만났을 때 띄어써서 출력된다.
        for (String str : sp) System.out.println(str);



    }
}
