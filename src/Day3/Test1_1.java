package Day3;//public class Test1_1 {
//    public static void main(String[] args) {
//    //객체 지향 프로그래밍 (oop) - 사전적인 정의로 실제 존재하는 것을 말한다.
//    //클래스 - 템플릿이라고 생각하면 된다.
//    //상속 -
//    //캡슐화
//    //다형성 -
//
////    Person newFace = new Person();
////    newFace.name = "유성호";
////    newFace.age = 29;
////    Person oldFace = new Person();
////    oldFace.name = "현수정";
////    oldFace.age = 21;
//    String[] names = {"유성호", "현수정"};
//    int[] ages = {29, 21};
//    Person[] persons = new Person[2];
//    for (int i = 0; i < persons.length; i++){
//        Person person = new Person(names[i], ages[i]);  //외부에서 강ㅂㅅ을 받아오는 것. (아래 3번) 타입과 변수 일므을
////        person.name = names[i];
////        person.age = ages[i];
//        persons[i] = person;
////        if(i ==4) {break;} '사람이 4명 출력되면 멈추겠다.' 멈출일이 있으면 이렇게 사용. 순환할거면 아래처럼 사용.
//    }
//
//    // foreach - 무조건 순서대로 다 빼오는거다. 순환할 때 쓰는 것. 오른쪽에는 배열을 두고 왼쪽에는 클래스를 두고 하나 하나 뽑아서 오는 것이다. 편하게 쓸 수 있다. 주안에 끊을 수 없다. 끊을 일이 있음ㄴ
//    for (Person person : persons) {
//        System.out.println(person.age + " " + person.name);
////        System.out.println(person.toString()); // 이렇게 하면 주소값이 나온다.
//        System.out.println(person.getAge());
//    }
////    for (int age:ages) {}
//
// }
////}
//
//// 클래스 (템플릿)
////    class Person {                      //사람은
//    //이 영역을 field 라고 한다.
//    String name;                    //이름도 있고
//    int age;                        //나이도 있다.
//
//    // 100명일 때 계속 위에처럼 만들 것인가? 그럴 수 없다. 이럴때 아래처럼 사용.  // 이건 뭔가 생성할 때 쓰인다 : 생성자 constructor
//    // 메서드
//    //overload - 다형성 이라고한다.
//    public Person(String name, int age) {
//        this.name = name;  //this가 붙으면 -이것의.name을 넣겠다.
//        this.age = age;
//
//    }
//
//    //다형성 - Person이 위에와 아래 이름이 같지만 사용이 가능하다. (안에 들어오는 값이 다르면 같은 이름을 쓸 수 있다.)// 타입을 본다.
//    //overload - 다형성 이라고한다.
//    public Person(int age) {
//        this.age = age;
//    }
//
//    @Override
//    // - @이거는 원래 있던 것을 바꿔주는 것(덮어쓰기?). 이것을 지우면 그냥 퍼블릭 내에 있는것을 불러오는 것.
//    //method - getAge같은 것.
//    public String toString() { //이걸로 주소값이 나오게 된 것이당.
//        return "Person [name=]" + name + ", age+" + age + "]";
//    }
////    @Override
////    public String sound(){
////        return "안녕하세요";
////    }
////class Animal extends sound {
////            Stringn name;
////            @Override
////            public String sound(){
////                return name+ " "+ name;
////            }
////}
//
//    public int getAge() {
//        return age;
//    }
//
////    @Override
////    public boolean equals(Object obj) {
////        if (this == obj)
////            return true;
////        if (obj == null)
////            return false;
////        if (getClass() != obj.getClass())
////            return false;
////        Person other = (Person) obj;
////        return age == other.age && Objects.equals(name, other.name);
//    }
//
