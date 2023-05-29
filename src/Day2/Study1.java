package Day2;

public class Study1 {
    public static void main(String[] args) {
        //배수 찾기
//        int a = 10; // 1 2 3 6
//        for (int i = 1; i <= 6; i++) {
//            if (a % i == 0) {
//                System.out.println(i);
//            }

//             int a = 48; // 1 2 3 6
//             for (int i = a; i  > 0; i--){
//                 //i = 6 5 4 3 2 1 / 0
//                 if (a % i == 0) {
//                     System.out.println(i);
//                 }

                // && : and 둘다 만족
                // || : or 둘중 하나 만족
          int a = 12;
        if(a % 2 == 0 && a % 3 ==0){
            System.out.println("2와 3의 배수");
        } else if (a % 2 == 0) {
            System.out.println("2의 배수");
        }else if (a % 3 == 0){
            System.out.println("3의 배수");
            }
        }
    }


