package Day2;

public class Study2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Q. 159487 이렇게 해봐라.
//        arr[0][0] arr[1][1] arr[2][2] [j][j]
//        arr[1][0] arr[2][2]
//        arr[2][0]
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length -i; j++){
                System.out.print(arr[j+i][j]);
            }
        }

        // 탐색할때 만약 홀수면 1을 더하고
        // 마지막에 홀수 인 값의 합을 출력하고
        // 리스트를 보여줘라
        // 1+3+5+7+9 = 25
        // 224
        // 466
        // 8810 이 되게 만들어라.
//        int sum = 0;
//        for (int i =0; i < arr.length; i++){
//            for (int j =0; j <arr[i].length; j++){
//                if (arr[i][j]%2 == 1){
//                    sum += arr[i][j];
//                    arr[i][j]++;  //arr[i][j] = arr[i][j] +1; 이거를 줄인것.
//                }
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(sum);

//        me
//        int i = 0;
//         int sum = 0;
//        while (i < arr.length){
//            int j = 0;
//            while (j < arr.length){
//                System.out.print(arr[i][j]);
//                j++;
//            }i++;
//            if (arr[i][j]%2 != 0){
//                System.out.println(arr[i][j]+1);
//            }
            System.out.println();
        }




        //159263 대각선으로 읽기. 아래처럼 먼저 다 써봐라.
//        arr[0][0] arr[1][1] arr[2][2] -> [j][j]
//        arr[0][1] arr[1][2] -> j에 -i를 해줌
//        arr[0][2] -> 시스템 아웃에 j + i
//        왼쪽 세로가 똑같고 오른쪽은 하나씩 늘어남. ->규칙 찾기
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[i].length - i; j++) {
//                System.out.print(arr[j][j+i]); // [j][j]를 넣으면 159159159가 출력.
//            }
//        }
    }
//}


//        147258369 while로 만들기 -- 내가 해따!!!!!!><
//        for (int i = 0; i < arr.length; i++)
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[j][i]);
//            }

//        int i = 0;
//        while (i < arr.length) {
//            int j = 0;
//            while (j < arr.length) {
//                System.out.println(arr[j][i]);
//                j++;
//            }
//            i++;
//        }
//    }
//}



//        //987654321이 나오도록 while로 만들기  // 일단 for문으로 먼저 만들어보자
//        for (int i = 0; i < arr.length; i++)
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println(arr[arr.length - i - 1][arr.length - j - 1]);
//                //length자체가 3이기 때문에 0, 1, 2 배열의 2부터 읽기 위해 -1을 해준것
//            }

//                for (int i = arr.length - 1; i >= 0; i--) {
//                    for (int j = arr.length- 1; j >= 0; j--) {
//                        System.out.println(arr[i][j]);
//                    }
//            }
//        int i = arr.length - 1;
//        while (i >= 0) {
//            int j = arr[i].length - 1;
//            while (j >= 0) {
//                System.out.println(arr[i][j]);
//                j--;
//            }
//            i--;
//        }
//    }
//}

                //내가 생각해본것
//        int i = 2; int j =2;
//        while (arr[i][j] > arr.length ){
//            System.out.println(arr[j][i]);
//            i--;
//            j--;
//            }


        //for의 기본값
//        for (int i = 0; i < 10; i++) { // 선언, 조건, 증감이 다 들어있다.
//            System.out.println(i);
//        }
//        // while(조건){ 실행}
//        int i = 0; // 선언을 해야 사용 가능
//        while (i < 10){ // 조건
//            System.out.println(i);
//            i++; // 증감할 곳이 없어서 여기서 증감하는 것.
//        }
//        boolean isBreak = true;
//        int i = 0;
//        while (isBreak){             // 무한루프? 가될 수 있음.
//            System.out.println("while");
//            i++;
//            if(i > 5) isBreak = false;
//        }
//        i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10); // i가 10보다 작을 동안

//    }

