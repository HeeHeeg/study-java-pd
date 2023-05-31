package Day7.MyThred;

public class MyRunnable implements Runnable {
    private int param;

    public MyRunnable(int param) {
        this.param = param;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(param);
            try {
                Thread.sleep(1000);    // 한번 돌고 1초 기달렸다가 다음 아이가 들어가서 출력되도록 하는 것. sleep- 1초 대기. 로딩 걸리듯이
            } catch (InterruptedException e) {
                System.out.println("에러 발생");
            }
        }

    }
}
