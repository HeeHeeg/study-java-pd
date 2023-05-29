package Day2;

public class Test {
    public static void main(String[] args) {
        //Q.2대각선으로 숫자가 나오게 하려면? 1, 5, 9, 2, 6, 3 이렇게!
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 00 11 22
        //  01 12 02

//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length; j++){
//                System.out.println(arr[i][j]);
//            }
//        }
        //987654321 - 방식1
//        for (int i = arr.length-1; i >= 0; i--){  //이렇게 할거면 i>0이 아니라 i>=로 넣어줘야 한다.
//            for (int j = arr.length-1; j >= 0; j--){
//                System.out.println(arr[i][j]);
//            }
//        }

        //987654321 - 방식2
//            for (int i = arr.length; i > 0; i--){
//                for (int j = arr.length; j > 0; j--){
//                    System.out.println(arr[i-1][j-1]);
//                }
//            }

        // 123 456 789 처럼 띄어써서 나옴.
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//            System.out.println();
//        }

        //987654321
//        for (int i = 2; i >= 0; i--) { //이렇게보다는 위에서한 arr.lenght를 쓰는게 좋음.
//            for (int j = 2; j >= 0; j--) {
//                System.out.println(arr[j][i]);


        //이것도 987654321
//        for (int i = arr.length; i > 0; i--) {
//            // arr.length = 3/ 3, 2, 1
//            for (int j = arr[i-1].length; j > 0; j--) { //arr.length로 하면 길이가 3이 들어가는 거니까 3 2 1로 돌아가고
//                                                       // arr[i-1].lenght 로 하면 []이 배열 안의 값이 [3-1], [2-1], [1-1]이 들어가서 [2], [1], [0]이 되므로
//                                                       // 둘 다 987654321이 출력된다.
//                //j = 3/ 3, 2, 1
//                System.out.println(arr[i - 1][j - 1]);
//                // arr[i-1] = 2 arr [j-1] =2
//                // arr[i-1] = 1 arr [j-1] = 1
//                // arr[i-1] = 0 arr [j-1] = 0


        //147258369 -  j와 i

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[j][i]); // j와 i  바꾸기
            }
        }
    }
}


