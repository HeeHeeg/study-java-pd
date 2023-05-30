package Day2;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 9, 10},
                {2, 7, 3, 4},
                {9, 2, 8, 5},
                {8, 4, 2, 1}
        };
        int sum = 0;
     /*    arr 탐색을 하는데 하나씩 더하고
         만약 짝수면 그 수를 출력을 하고
         홀수이면서 더한 값이 20이 넘으면
         끝내고 아니면 더하고 더한 값을 출력하라.*/
//
        for (int i = 0; i < arr.length; i++) {
//            boolean isBreak = sum > 20;
            if (sum > 20) {
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                } else {
//                    isBreak = sum > 20;
                    if (sum > 20) {
                        break;
                    }
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);


        //is_break  snake case
        //isBreak   campl case
        // nowTagetNumber -> 띄어쓰기 부분에 대문자를 넣어주는 것. 처음은 무조건 소문자. 파이썬에선 now_taget_number이렇게 쓴다.
/*
        for (int i = 0; i < arr.length; i++) {
            boolean isBreak = sum > 20;                // 1. bllolan은 true false만 있기 때문에 is가 붙어야한다.
            for (int j = 0; j < arr.length; j++) {
                int now = arr[i][j];                      //2.박복되는 것 위로.
                if (now % 2 == 0)
                    System.out.println(now);                //3.
                    else{
                        sum += now;
                        isBreak = sum > 20;{
                            if(isBreak) break;
                        }
                    }
                }
                if(isBreak) {
                    break;
                }
            }

        System.out.println(sum);
        */
    }
}

