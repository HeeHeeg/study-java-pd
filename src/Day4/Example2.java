package Day4;

import java.util.ArrayList;
import java.util.List;
//import java.lang.List; 이런 자바 랭 이 자동으로 생성되어있기 때문에 내가 만들지 않은 것들을 그냥 사용할 수 있는 것이다.

public class Example2 {
    public static void main(String[] args) {
        int[] arr = new int[3];                         // array는 길이가 정해져있다. 정해진 길이 안에 무언가를 넣어서 썼음. { 이 안에 }<- 이런 인덱스가 생김. array(순서가 있다.)
        //list  - {1, 2, 3, 4,} 이 안의 각각의 것을 한번에 묶어서 사용할 때 씀. 리스트는 길이가 동적이다. 추가가 되면서 사용. 순서가 있다. 길이가 무한.
        List<Integer> list = new ArrayList<>();        //<이 안에는 참조형으로 쓴다. int xx Integer O 리스트가 들어갈 타입을 적어주는 것.>
//
//        list.add(1);
//        list.add(2);
//        list.add(3);

//        Integer[] tmp = (Integer[])list.toArray(); //Integer로 확실하게 형변환 해주기 위해 넣음.

//        System.out.println(arr.length);  // arr만 찍어서 돌리면-> 주소값이 나옴.
//        System.out.println(list); // -> 입력해준 [1, 2]가 나옴 => 내부에 toString이 구현되어있다고 볼 수 있다.
//        System.out.println(list.size()); //arr.lenght와 같이 길이를 보는 것. getSize 같은 것.  메서드를 호출해서 불러오는 것이다.
////        System.out.println(list.contains(1)); // contains(1) <-()안에 있는 수 가 있는지 확인. 1이 있으니까 true 4를 넣으면 없으니까 false가 나옴.
////        System.out.println(list.remove(1)); // 인덱스를 지우는 것.
//        System.out.println(list.remove("st")); // Integer로 만들면 무조건 인덱스로 들어가니 지울 수 없다.
//        System.out.println(list.get(1));  // 인덱스에 있는 것 출력.

//        System.out.println(list.set(0, 3));  // 인덱스 0번에 3번을 넣겠다. 아래것과 같이 써야 확인됨.
//        System.out.println(list);


        // 123456789 넣고 짝수의 합을 구하자.
//        List<Integer> list2 = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i <10; i++){
//            list2.add(i);
//        }
//        for (int i = 0; i<10; i++){
//            if (list2.get(i) %2 == 0){
//                sum += list2.get(i);
//            }
//        }
//        for (Integer i : list2) if (i % 2 ==0) sum += i;
//        System.out.println("짝수의 합 :" + " "+ sum);


        //name 과 age를 가지고 있는 person을 만들고
        //input 데이터 :
        //          {name : park, age : 20}, {name: kim, age :14}, {name:lee, age: 24}
        //한 해가 지나서 한살 먹어야함 한살 씩 먹이고 출력하라
        //output:[name : park, age : 21], [name: kim, age :15], [name:lee, age: 25]

        //2. 사람 만들기.
        Person person1 = new Person("park", 20);
        Person person2 = new Person("kim", 14);
        Person person3 = new Person("lee", 25);
                //3. 이걸 리스트로 묶어준다..
        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
//        for (int i = 0; i < persons.size(); i++){
//            Person tmp1 = persons.get(i);
//            Person p = new Person(tmp1.getName(), tmp1.getAge()+1);
//            persons.set(i, p);
//        }

        //이런 방법도 있다.
//        for (Person person: persons){ // 이건 원본을 건드리는 방법. 원본드로 되돌리라고 하면 할 수 없음.
//            person.getAge(person.getAge()+1);
//        }
        for (Person person: persons) {
            person.grow();
        }
         //출력 방법 1.
//        for (int i = 0; i< persons.size(); i++){
//            Person tmp2 = persons.get(i);
//            System.out.println(tmp2.getName()+ " " + tmp2.getAge());
//        }
        //출력 2


    }
}
class Person{ //1. 먼저 만들기.
    private String name;
    private int age;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getAge(int age) {
        this.age = age;
    }
    public void grow() {
        age++;
    }
}
