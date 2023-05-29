package Day1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //글 문자열 - String 참조타입은 앞에 대문자가 들어가는게 특징이다.
//        String str = "";
//        System.out.println(str + 1 + 1); //-> 11
//        System.out.println( 1 + 1 + str); // -> 2 순서에 영향을 받는다.
//        String str = "hello";
//        String wor = "world";
//        System.out.println(str +" " + wor); // 띄어쓰기 " "

//        char a = 'a';
//        // char 1 글자 출력.
//        Character b = 'b'; // null이 될 수 있다.
//        System.out.println(a + b); //아스키코드에 있는 것을 토대로 나온다.

//        //boolean
//        boolean p = true;
//        boolean z = false;
//        Boolean x = true;
//
//        String name = "현수정";
//        String name1 = "이태열";
//        String name2 = ""; //하나 하나 이렇게 계속 만들 수 없으니 배열을 만들어 사용한다.
//
//        //배열 - 길이가 정해져 있고 변경할 수 없다.
//
//        String[] names = {"현수정", "이태열", "000"};
//        System.out.println(names[0]); // 0부터 불러온다.
//        System.out.println(names[1] + names[2]); // 나오는걸 모두 출력하려면 이렇게 다 쳐야한다.

//        String[] names2 = {};
        String[] names3 = new String[2];
        int[] ints = {};
        int[] arr = {1, 2, 3, 4, 5}; // 1~5가 들어간 배열.
        int[] arr2 = new int[2];
        Integer[] arr3 = new Integer[2]; // 대문자가 붙으면 참조변수가 되기때문에 null이 나올 수 있다.
        System.out.println(arr[1]);
        System.out.println(arr3[1] + " " +arr2[1] + names3[1]); // null 을 ""을 통해 문자열로 바꿔준 것. 그래서 출력이 되는 것이다. null + null은 안나옴.에러.
        System.out.println(arr3.length); // 배열 길이 출력
    }
}
