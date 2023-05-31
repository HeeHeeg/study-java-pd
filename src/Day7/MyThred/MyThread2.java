package Day7.MyThred;

import Day7.dto.Person;

public class MyThread2 extends Thread {  //이건 쓰레드를 만들어 버린것. // 경마~?
    private int time;
    private int id;
    private Person person;
    public static int count;

    public MyThread2(int time, int id, Person person) {
        this.time = time;
        this.id = id;
        this.person = person;
        count++;            //생성됐을 떄 카운트를 높여준다.
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {       // 한 턴에 5초 턴을 줌.
            person.setName("name" + id);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(id);
            System.out.println(person.getName());
        }
        count--;                                    //끝나면 카운트를 낮춰준다.
        System.out.println("대기순번 : " + count);      // 누구 순번이 머저 빠졌는지 모르기 때문에 순번이 뒤죽박죽.. 나와야되는데 잘나오네..? 이렇게 카운트는 내꺼 카운트가 나온다. 자원을 공유하고 있어도.
        System.out.println("대기순번 : " + MyThread2.count); // 이건 뒤죽박준 나온다.

    }
}

