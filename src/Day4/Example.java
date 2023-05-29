package Day4;

public class Example {
// static - 정석

    public static void main(String[] args) {
        Test test = new Test();
        test.a = 1;
        System.out.println(test.b + " " + Test.b);
        for (int i = 0; i < 3; i++){
            Test test1 = new Test();
              Test.plus(i);  //아래와 같은 것.
//            test1.plus(i);
        }
        System.out.println(test.b + " " + Test.b);
    }
}

class Test{
    int a;
    static int b = 0;
    public Test() { //생성자
        b++;
    }
    public static void plus(int i) { // 메서드
        b += i;
    }
}