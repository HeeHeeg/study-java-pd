package Day1;

public class Study6 {
    //반복문
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a = 0;
//        a = a + 1;
//        a += 1;
//          a++;  //세 개가 다 같은말이다.
//        System.out.println(a++); // 0
//        a = 1 + a;
//        System.out.println(a++); // 2
//        for (int i = 0; i < 6; i++) { // 선언, 조건, 증감 이라는 뜻. i = i + 1
//            System.out.println(i);
            // 1~5 까지 출력해봐라.
//        for (int i= 0; i < arr.length; i++) { // <=로 쓰면 에러난다! length로 찍어야 길이만큼 나옴!
//            System.out.println(arr[i]);

//            //짝수만 나오게 하기
         for (int i = 0; i < arr.length; i++){
//             if (i % 2 == 1) // 홀수만 나오게 하려면 i%2 ==0  0부터 시작하니까 짝수로 나오려면 1로 해야한다.
                 if(arr[i] % 2 == 1) //-> 이게 더 좋다! 홀수로 하고 싶으면 '== 0'을 '!= 0'으로 바꾸던가 '== 1'로 바꾸면 된다.
             System.out.println(arr[i]);
        }
    }
}


