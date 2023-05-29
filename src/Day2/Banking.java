package Day2;

public class Banking {
    public static void main(String[] args) {
        int money = 50300;  // 1.내가 가진돈 5만원 // 2.50300 커피 얼마나 사고 얼마나 남는지 구하기
        int coffee = 2200; // 커피 2500원 몇잔을 살 수 있을까요? 2. 커피 2200원일때

        System.out.println(money / coffee); //1. 몇잔 살 수 있는지.
        System.out.println(money % coffee); // 2. 얼마 남는지 1900원 22잔

        //3.점원인데 거스름돈을 천원 몇장 500 몇개 100원 몇개
        int 거스름돈 = money % coffee;
        int[] 화폐 = {1000, 500, 100};
        for (int i = 0; i < 화폐.length; i++) {
            if (i == 0) {
                System.out.println(거스름돈 / 화폐[i]);
            } else { // 처음 이후 i 가 0이 아니니까 여기로 와서 돌아간다.
                System.out.println(
                        ((거스름돈 - ((거스름돈 / 화폐[i - 1]) * 화폐[i - 1])) / 화폐[i])
                );
//            }

//        int 거스름돈 = money % coffee; // 1900
//        int[] 화폐 = {1000, 500, 100};
//        for (int i = 0; i < 화폐.length; i++) { //2
//            // 0부터 시작 1번째     2번째 => 총 3번 실행된다.
//            //          400남음 / 100 = 4
//            int now = 거스름돈 / 화폐[i]; // 0번째는 1900/1000 -> 1나옴
//            System.out.println(now);
//            거스름돈 = 거스름돈 % 화폐[i]; //다음에 필요한건 거스름돈 900원
//            //1900 % 1000 -> 900(나머지) 1번째로 가면 900 % 500 ->  2번째로 가면 400 % 100 ->4
//        }
//           우리나라 돈 50000 -> 10000 -> 5000 -> 1000 -> ...-> 10

//
//        int 거스름돈 = money % coffee; // 1900
//        int[] 화폐 = {1000, 500, 100};
//        for (int i = 0; i < 화폐.length; i++) {
////            if(화폐[i] == 1000) continue; //   1000원 짜리가 다 떨어졌을 떄 키면됨
//            System.out.println(화폐[i]
//                        +" " +
//                         거스름돈 / 화폐[i]);
//                        거스름돈 = 거스름돈 % 화폐[i];
////                        if(화폐[i] == 1000) break;
        }


//        System.out.println(거스름돈 / 화폐[0]);
//        System.out.println(
//                (거스름돈
//                        -((거스름돈 / 화폐[0]) * 화폐[0])
//                        )
//                        / 화폐[1]);
//        System.out.println(
//                (
//                        거스름돈
//                        -((거스름돈 / 화폐[1]) * 화폐[1])
//                        )
//                /화폐[2]);

        }
    }
}








//    int count_1000 = 0;
//    int count_500 = 0;
//    int count_100 = 0;
//
//public static void main(String[] args) {
//        int money = 50300;
//        int coffee = 2200;
//        int a = money%coffee;
//        int count_1000 = 0;
//        int count_500 = 0;
//        int count_100 = 0;
//
//        while(a > 999) {
//        a = a-1000;
//        count_1000++;
//        }
//        System.out.println(count_1000);
//
//        while(a > 499) {
//        a = a-500;
//        count_500++;
//        }
//        System.out.println(count_500);
//        while(a>99) {
//        a = a-100;
//        count_100++;
//        }
//        System.out.println(count_100);
//        }
//        }
//
//

//	1900 - 500 1400 count_500 1
//	1400 - 500 900  count_500 2
//}
