package Day3;

public class Test1_1_2 { // 강사님이 보내주신 코드
    public static void main(String[] args) {
        // 객체 사전적인 정의로 실제 존재하는 것을 말한다
        // 클래스 템플릿
        // 다형성
        // 상속
        // 캡슐화
        // 객체지향 장점 => 코드 재사용성이 좋다 (모듈성), 유지보수 용이
        //        단점 =>복잡해진다

//		Person newFace = new Person();
//		newFace.name = "유성호";
//		newFace.age = 29;
//		Person oldFace = new Person();
//		oldFace.name = "현수정";
//		oldFace.age = 21;

        String[] names = {"유성호", "현수정"};
        int[] ages = {29, 21};
        Person[] persons = new Person[2];

        for(int i=0; i < persons.length; i++) {
            Person person = new Person(names[0], ages[i]);
//			person.name = names[i];
//			person.age = ages[i];
            persons[i] = person;
//			if(i==4) {break;}
        }
        System.out.println(persons[0].equals(persons[1]));
        // foreach
        for(Person person:persons) {
            System.out.println(person.age + " "+ person.name);
            System.out.println(person);
            System.out.println(person.sound());
        }
           Animal1 cat = new Animal1("고양이");
           System.out.println(cat.sound());
    }
}
class Person extends Sound{
    // field
    String name;
    int age;
    // 생성 할떄 쓰인다 : 생성자 constructor
    // method
    // overload 다형성
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int age) {
        this.age = age;
    }
    // method
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public int getAge(){
        return age;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    public boolean equals(Person obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (age != obj.age)
            return false;
        if (name == null) {
            if (obj.name != null)
                return false;
        } else if (!name.equals(obj.name))
            return false;
        return true;
    }
    @Override
    public String sound() {return "안녕하세요";}

}
class Animal1 extends Sound{
    String name;
    public Animal1(String name) {
        this.name = name;
    }
    @Override
    public String sound() {
        return name +" "+ name;
    }

}
class Sound {
    public String sound(){return "sound";}
}

//abstract Sound {                //abstract 추상 클래스. 상속만 받을 수 있음. 이거 자체로는 쓸 수 없다.(독집적으로 사용 불가능.)
//    abstract public String sound();
//    public String sound2(){
//        return "sound2";
//    }
//    }
