package Day8;

import Day8.controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //싱글톤
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(sc);
        while (true) controller.selectMode();
    }
}
