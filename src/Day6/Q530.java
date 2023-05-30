package Day6;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Q530 {
    public static void main(String[] args) {
//        Set  Queue  Stack final
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Member> set = new HashSet<>();
//        순서 x , 중복 x
//        에러 종류  error warning
        set.add(new Member("1", "1"));
        set.add(new Member("1", "2"));
        set.add(new Member("2", "3"));
        for (Member p : set) {          //2.new 여서 정확히는 각자 주소가 같으지만 set이 중복이 안되니까 같은 것으로 보고 1이 나오는 것이다.
            System.out.println(p);
        }
//        set.add(1);
//        set.add(2);
        System.out.println(set.size());         //1. 이게 Person이 몇개 있는지 나타내주는 것.
//
//        for (Integer i : set) {
//            System.out.printf("%4.2f 입니다. %d %s\n",
//                    (float) i * 8000, i, "ㅛㅛㅛㅛ");
//        }
    }
}

final class Person {
    private final Integer num;
    private final String name;

    public Person(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(num, person.num) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}

class Member extends Object {
    private String id;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Member(String id, String password) {
        this.id = id;
        this.password = password;

    }
}
