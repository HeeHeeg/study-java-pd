package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    static Map<String, String> map = new HashMap<>(); // 사전 만들기
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
            input();
        }

    //이 안에서만 쓸거면 public을 붙이지 않아도 되긴 한다.

    public static void input() {
        System.out.println("4. find 5. exit");
        Integer i = Integer.parseInt(sc.nextLine());
        modeSelect(i);

//        if (i == 1) insert();  // i 가 1 이면 인설트를 출력하겠다.
//        else if (i ==2) delete(); // 2 이면 딜리트로 가겠다.


    }
    public static void insert() {     // 위에가 static이기 때문에 여기에 static없이 쓸 수 없다.
        System.out.println("영단어 입력");
        String key = sc.nextLine();
        System.out.println("한국어 입력");
        String value = sc.nextLine();
        map.put(key, value);
        input();

    }
    public static void delete() {
        // 키를 보여주고
        // 키를 입력하고 그거(value) 삭제
        String key = sc.nextLine();
        if (isValid(key))
            map.remove(key);
        else
            System.out.println("키가 없어요");
        input();
    }
    public static void update() {
        // 키를 보여주고
        // 키를 입력하고 그거(value) 업데이트
        System.out.println("업데이트 할 단어 입력");
        String  key = sc.nextLine();
        System.out.println("바꿀내용 입력");
        String value = sc.nextLine();
        if (isValid(key)) map.put(key, value);
        input();
    }
    public static void find() {
        // 키를 보여주고
        // 키를 입력하고 그거(value) 찾기
        System.out.println("키 입력");
        String key = sc.nextLine();
        if (isValid(key))
          System.out.println("key : " + key + ", value : " + map.get(key));
        input();
    }
    public static boolean isValid(String key) {
        if (map.containsKey(key))
            return true;
        System.out.println(key + "로된 단어는 없습니다.");
        return false;
    }
    public static boolean isValid(String key, boolean isInsert) {
        if (!(map.containsKey(key))) return true;
        System.out.println(key + "는" + map.get(key) + "라고 있는 단어입니다.");
        return false;
    }
    public static void modeSelect(int mode){
        switch(mode){
            case 1:
                insert(); break;
            case 2:
                delete(); break;
            case 3:
                update(); break;
            case 4:
                find(); break;
            case 5:
                break;
            default:
                input(); break;

        }

    }
}
