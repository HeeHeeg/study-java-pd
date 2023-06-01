package Day8.controller;

import Day8.service.Service;

import java.util.Scanner;

public class Controller {
    private final Scanner sc;         //필드
    private static Service service = Service.getInstance();

    public Controller(Scanner sc) {     //생성자. 호출하면 얘가 오는 것이다.
        this.sc = sc;
        service = Service.getInstance();
    }

    /**
     * 기능 : 모드를 찾아 검색한다.
     *
     * @param i: None
     * @return : None
     */

    public void selectMode() {      //메소드
        int mode;
        {
            try {
                mode = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                mode = 0;
            }
            if (mode == 1) {
//                TODO : insert 기능 만들것

                service.insert(Integer.parseInt(sc.nextLine()));
            } else if (mode == 2) {
//                TODO : 전체 찾기 기능 말들것(조언2)
            } else if (mode == 3) {
//                TODO :인덱스를 입력받아 찾는거(조언1)
            } else {
//                TODO : selectMode 다시 실행
            }
        }
    }
}
