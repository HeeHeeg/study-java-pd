package Day7;

import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();         // Queue는 링크더리스트가 들어간다. 처음으로 들어간게 나온다.
/*        queue.add(1);                                 // 큐는 알고리즘 공부할때나 사용한다.그때 다시 공부하게되서 가볍게만 ~
        queue.offer(2);
        System.out.println(queue.peek());               // peek - 뭐가 나오는지를 보는 것.빼는게 아님. 보여만주는 것 ->1
        System.out.println(queue.size());               // 사이즈 보여주는 것. 두개 넣었으니 두개 있다고 보여줌
        System.out.println(queue.remove());             // 빼기. 없으면 에러
        System.out.println(queue.poll());               // 이것도 빼기. 리무브 하면서 하나 빼내겠다는 것. 이걸로 빼면 없을때 null이 나옴
        System.out.println(queue.size());                // poll해서 하나가 빠져나와서 사이즈가 1이됨.*/
        while (!queue.isEmpty()) {                      // 큐는 한 좌표에서 움직이는 것. 한 경우의 수에서 계속 흘러감. 스택은 그냥 쭉 가버림.
            System.out.println(queue.poll());

        }

    }
}
