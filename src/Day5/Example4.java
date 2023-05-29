package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {
        //정렬() -> 코테때도 중요

        Map<String, List<Person4>> map = new HashMap<>();
        List<Person4> cel = new ArrayList<Person4>();
        cel.add(new Person4(1, "박", 20));
        cel.add(new Person4(2, "김", 30));
        cel.add(new Person4(3, "이", 40));
        cel.add(new Person4(4, "권", null));
        System.out.println(cel);


//        String excel = "수\t이름\t나이\n" +
//                "1\t박\t20\n" +
//                "2\t김\t30\n" +
//                "3\t이\t40\n" +
//                "4\t권\t비공개\n";

        //Q. 위에있는 파일을 객체화 시켜라.
//   ex) [{number:1, name:박, age:20},
//        {number:2, name:김, age:30},
//        {number:3, name:이, age:40},
//        {number:4, name:권, age:null}]

        //Q2.  객체화 시켜라.
//        String excel2 = "수\t상호명\t좌표\t지역\n" +
//                "1\t피자\t37.01,127.01\t대구\n" +
//                "2\t치킨\t37.03,127.02\t대전\n" +
//                "3\t햄버거\t37.13,127.02\t서울\n" +
//                "4\t감자탕\t36.13,127.02\t부산";
//        List<Person4> cel2 = new ArrayList<Person4>();






    }
}
class Person4 {
    private int no;
    private String name;
    private Integer age;

    public Person4(int no, String name, Integer age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
