package Day6;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        //정렬() -> 코테때도 중요
        Map<String, List<Person0>> map = new HashMap<>();
        String excel = "수\t이름\t나이\n" +
                "1\t박\t20\n" +
                "2\t김\t30\n" +
                "3\t이\t40\n" +
                "4\t권\t비공개\n";
//        \n - 쪼갠다. row나누기
        String[] arr = excel.split("\n");               //1.
        //각 줄에 \t 쪼갠다. 컬럼? 나누
        List<String[]> list = new ArrayList<>();                //3.
        for (int i = 1; i < arr.length; i++) {                     //2.
            list.add(arr[i].split("\t"));                   //4.
        }
//      6. 넣고 출력하기만 하면 된다.기(list.get(1)));
        List<Person0> answer = new ArrayList<Person0>();
        for (int i = 0; i < list.size(); i++) {
            String[] get = list.get(i);
            Person0 person0 = new Person0(Integer.parseInt(get[0]),
                    get[1],
                    get[2]
            );
            answer.add(person0);
        }
        //7. 출력 하니 주소값이 나와서 toString 처리해준다.
        System.out.println(answer);

    }
}

class Person0 { //5.데이터를 담을 클래스를 만든다.
    private int num;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person0{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                "\n";       // 맨 뒤에 한줄 띄어쓰도록 하는 것. ''이거는 문자 하나만 담기기 때문에 ""이렇게 문자열로 해줘야 한다.

    }

    public Person0(int num, String name, String age) {
        if (!age.equals("비공개")) this.age = Integer.parseInt(age);
        this.name = name;
        this.num = num;


    }
}


//Q. 위에있는 파일을 객체화 시켜라.
//   ex) [{number:1, name:박, age:20},
//        {number:2, name:김, age:30},
//        {number:3, name:이, age:40},
//        {number:4, name:권, age:null}]


//        List<Person4> cel2 = new ArrayList<Person4>();
 /* List<Person4> cel = new ArrayList<Person4>();
        cel.add(new Person4(1, "박", 20));
        cel.add(new Person4(2, "김", 30));
        cel.add(new Person4(3, "이", 40));
        cel.add(new Person4(4, "권", null));
        System.out.println(cel)*/;
