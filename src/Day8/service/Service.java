package Day8.service;

import java.util.ArrayList;
import java.util.List;

//single ton
public class Service {
    private final List<Integer> list = new ArrayList<>();    // 필드는 위에 있는게 좋다.

    public void insert(int number) {
        list.add(number);
    }


    private static Service instance;

    public static Service getInstance() {
        if (instance == null) instance = new Service();     //만약 인스턴스가 널이면 새 서비스를 넣어주겠다. 하나로만 돌아감. single ton
        return instance;
    }
}
