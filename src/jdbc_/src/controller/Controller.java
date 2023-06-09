package controller;

import domain.dto.SignupDto;
import service.UserService;

import java.util.Scanner;

public class Controller {
    public static UserService service = UserService.getInstance();
    public void selectMode() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 로그인 2. 회원가입");
            String mode = sc.nextLine();
            switch (mode) {
                case "1":
                    login(sc);
                    break;
                case "2":
                    signup(sc);
                    break;

            }
        }
        /*while (true) {
            String mode = sc.nextLine();

            switch (mode) {
                case "5":
                    System.out.println("테이블 생성");
                    break;
            }
        }*/
    }

    private static void login(Scanner sc) {
        System.out.println("insert in : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        //Todo : login 로그인 하겠다.
//        UserService service = UserService.getInstance(); // 싱글톤으로 받아서 new로 받지 않아도 된다.
        service.login(id, pw);
    }
    private static void signup(Scanner sc) {
        System.out.println("insert in : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        System.out.println("insert name : ");
        String name = sc.nextLine();
        SignupDto dto = new SignupDto(id, pw, name);
        service.signup(dto);
    }
}
