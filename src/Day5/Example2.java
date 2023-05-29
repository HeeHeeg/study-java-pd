package Day5;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {

        Map<String, List<Person2>> map = new HashMap<>();        // List<Person>> -> 리스트에 사람을 넣어주는 것.
//        List<Person2> person2 = new ArrayList<Person2>();
//        List<Person2> person3 = new ArrayList<Person2>();
//        person2.add(new Person2("박씨",20));
//        person2.add(new Person2("김씨", 25));
//        person3.add(new Person2("이씨", 22));
//        map.put("서울", person2);                                // put이 추가하는것. "서울"을 추가하기 위해 put을 해준다.
//        map.put("부산", person3);
//        System.out.println(map);
        List<Person2> getList = map.getOrDefault("서울", new ArrayList<>());                         // 업데이트 가능하게 한 것. 리스트에 없으면 빈 리스트를 만들어주고, 있는것에 추가?할 수 있도록
        List<Person2> getList2 = map.getOrDefault("부산", new ArrayList<>());
        List<Person2> getList3 = map.getOrDefault("대전", new ArrayList<>());
        List<Person2> getList4 = map.getOrDefault("제주", new ArrayList<>());
        getList.add(new Person2("박씨", 20));
        getList.add(new Person2("김씨", 25));
        getList2.add(new Person2("이씨", 29));
        getList3.add(new Person2("도씨", 30));
        getList4.add(new Person2("류씨", 35));
        map.put("서울", getList);
        map.put("부산", getList2);
        map.put("대전", getList3);
        map.put("제주", getList4);
        System.out.println(map);



//         List<Person> list = new ArrayList<Person>(); // 이걸로 개별 사람을 만들어주는 것이다.
//         이렇게 하나씩 하기보다 (사람 종류가 추가될 수 있으니 ) 위에처럼 해야함.
//         map.add(new Person("김씨", 20));
//
    }


}
class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}