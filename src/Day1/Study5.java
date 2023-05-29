package Day1;

//package test;
//조건문
public class Study5 {

    public static void main(String[] args) {
//        //벌레가 죽었나요
//        //예 true 거짓 false
//        boolean isDead = true; // 여기가 false면 "죽인다"가 나옴.
//        if(isDead) {
//            System.out.println("버린다"); // 죽었으면 버린다.
//        }else {
//            System.out.println("죽인다");
//        }


//        int i = 7;
//        if(i > 7){
//            System.out.println("if");
////        } else if (i == 7) { // i 가 7과 같냐?
////            System.out.println("elseif");
//        } else {
//            System.out.println("else");
//        }
//

//        String hi = "hi";
//        String hi2 = hi + "1";
//        if(hi2.equals("hi1")){ // equals로 써줘야 한다.
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }


//        int a = 0;
//        if(a + 2 == 0 + 1) { //한줄만 쓸 때에는 중괄호를 지울 수 있다.
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

        String hi = "hi";
        String hi2 = hi + "1";
            Integer b = 0;
            Integer c = 0;
            if (b + 1 == c + 1) // 같지 않을 때 true를 하고 싶다면 (a + 1 != b + 1)
                System.out.println(hi + "1");
                System.out.println(hi + "1" == "hi1"); // 이건 주소값이 다르기 때문에 같은것이 아님. 문자열 비교는 equals로 해야함
                System.out.println((hi + "1") .equals("hi1")); //이건 문자열 비교. 똑같이 hi1이 나오기 때문에 true


        //3항 연산자

//        int p = 6;
//        if(p%2 == 0){
//            System.out.println("짝수");
//        }else {
//            System.out.println("홀수");
//        }
//        System.out.println(p % 2 == 0? "짝수" : "홀수"); //삼항연산자
//        int p = 6;
//        switch (p % 5 ) {
//            case 1:
//                System.out.println("홀수");
//                break;
//            case 0:
//                System.out.println("짝수");
//                break;   // break가 빠지면 멈추지 않고 다음거 까지 출력한다.
//            default:
//                System.out.println("default");
//                break;
            }
        }


