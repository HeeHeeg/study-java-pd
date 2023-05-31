package Day7;

import Day7.MyThred.MyRunnable;
import Day7.MyThred.MyThread2;
import Day7.dto.Person;

public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable(1);
//        MyRunnable myRunnable2 = new MyRunnable(2);
//        Thread thread = new Thread(myRunnable);         //여긴 쓰레드에 구현체를 만들어 직접 넣어준것! (마이쓰레드2랑 비교할떄)
//        Thread thread2 = new Thread(myRunnable2);       //여기까지가 선언부.
//        // thread는 분기를 치는 것이다.
//        thread.start();                             // thread와 thread2는 각자 도는 것.
//        thread2.start();
//        System.out.println("main");

/*        MyThread2 myThread = new MyThread2(1000, 1);        //중요하진 않다. 우리가 직접 구현할 필요가있는게 아니면.
        MyThread2 myThread3 = new MyThread2(2000, 2);
        myThread.start();
        myThread3.start();*/
        Person person = new Person();
        for (int i = 0; i < 5; i++) {
            MyThread2 myThread2 = new MyThread2(1000, i, person);
            myThread2.start();
        }
    }
}
