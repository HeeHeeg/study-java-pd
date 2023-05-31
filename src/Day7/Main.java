package Day7;

import Day7.MyThred.MyRunnable;
import Day7.MyThred.MyThread2;
import Day7.dto.Person;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws CustomException { // throws CustomException 이거 적어준게 여기에 이게 에러가 발생할 수 있다고 알려준 것이다.
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

      /*  Person person = new Person();
        for (int i = 0; i < 5; i++) {
            MyThread2 myThread2 = new MyThread2(1000, i, person);
            myThread2.start();*/
//    }

        /*try {
            System.out.println(1 / 0);
            Person person = null;
            System.out.println(person.getName());       //null에는 getName이 없어서 에러가 난다.

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (ArithmeticException e) {
            System.out.println("/0 err");
        } finally {
            System.out.println("fds");              //에러가 나던말던 마지막엔 이걸 실행하겠다는 것.
        }*/
        /*try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            throw new CustomException("sss");       // 이렇게 되면 맨 위 psvm가서 '이건 에러가 발생할 수 있어'라는걸 적어줘야함.
        }*/
        MyThread2 myThread2 = new MyThread2(1000, 1, new Person());
        myThread2.start();
        MyThread2 myThread3 = new MyThread2(1000, 2, new Person());
        myThread3.start();
    }
}

