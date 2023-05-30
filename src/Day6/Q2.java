package Day6;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Map<String, List<Food>> map = new HashMap<>();
//        Q2.  객체화 시켜라.
        String excel2 = "수\t상호명\t좌표\t지역\n" +
                "1\t피자\t37.01,127.01\t대구\n" +
                "2\t치킨\t37.03,127.02\t대전\n" +
                "3\t햄버거\t37.13,127.02\t서울\n" +
                "4\t감자탕\t36.13,127.02\t부산";

        // \n 쪼갠다 하나의 배열에 5요소가 담겨 있다.
        String[] arr = excel2.split("\n");
        List<String[]> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i].split("\t"));   // 여기까진 앞에꺼와 똑같다. 데이터를 잘라서 만드는 과정.
        }
        // +1.아래 클래스를 만들어줘야해~!
        List<Food> answer = new ArrayList<Food>();
        for (int i = 0; i < list.size(); i++) {
            answer.add(new Food(Integer.parseInt(list.get(i)[0]),
                    list.get(i)[1],
                    list.get(i)[2],
                    list.get(i)[3])
            );
        }
        System.out.println(answer);
    }
}

// 수\t상호명\t좌표\t지역\n
class Food {  // private 빼먹지 말자!
    private int num;
    private String businessName;
    private float[] coordinate;
    private String region;

    @Override
    public String toString() {
        return "Food{" +
                "num=" + num +
                ", businessName='" + businessName + '\'' +
                ", coordinate='" + Arrays.toString(coordinate) + '\'' +
                ", region='" + region + '\'' +
                "\n";
    }

    public Food(int num, String businessName, String coordinate, String region) {
        this.num = num;
        this.businessName = businessName;
        float[] tmp = new float[2];  // 처음에 Strifng으로 만들어줬는데 float로 바꾸면서 새로 만들어줘야 사용 가능.
        tmp[0] = Float.parseFloat(coordinate.split(",")[0]);
        tmp[1] = Float.parseFloat(coordinate.split(",")[1]);
        this.coordinate = tmp;
        this.region = region;

    }
}

