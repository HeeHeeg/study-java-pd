package Day5;

import java.util.*;

public class Example3 {
    static Scanner sc;
    static Map<String, List<Person1>> map = new HashMap<>();
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        controller();

    }

    static void controller() {
        System.out.println("1. insert 2. find 3. findAll 4. Exit");
        String nextLine = sc.nextLine();

        int nextInt = Integer.parseInt(nextLine);
        selectMode(nextInt);

    }

    private static void selectGh(String str) {
        System.out.println("str = " + str);
    }

    private static void selectMode(int mode) {
        if (mode == 1) insert();
        else if (mode == 2) find();
        else if (mode == 3) findAll();
        else if (mode == 4) return;
        else  controller();
    }

    static void insert() {
        String region = sc.nextLine();
        String name = sc.nextLine();
        String ageString = sc.nextLine();
        int age = Integer.parseInt(ageString);
        List<Person1> orDefault = map.getOrDefault(region, new ArrayList<>());
        orDefault.add(new Person1(name, age));
        map.put(region, orDefault);
        controller();

//        List<Person> orDefault = map.getOrDefault(region, new ArrayList<>());
    }

    static void find() {
        String region = sc.nextLine();
        if (map.containsKey(region)) System.out.println(map.get(region));  //있으면 출력 없으면  컨트롤러로~?
        controller();
    }
    static void findAll() {
        System.out.println(map);
        controller();
    }

}
class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
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