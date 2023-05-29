package Day2;

public class Study4 {
    public static void main(String[] args) {
        String[] names = {"아메리카노", "라떼"};
        int[] prices = {1400, 3000};
        for (int i = 0; i <names.length; i++)
            System.out.println(names[i] + " " + prices[i]);
//        이렇게 만들었는데 메뉴가 추가되서 초코라떼의 가격을 1400, 2500, 3000 으로 넣는다면 메뉴의 가격이 바뀌게 된다. 그래서 객체를 사용하는 것이다.

       //그래서 현실 물건을 만들어(객체생성) 사용하는 방식으로 하는 것이다.
        Coffee 아메리카노 = new Coffee(); // 2. 타입은 커피인데 아메리카노라고 하자. 이건 새롭게 만든 것이다.
        아메리카노.name = "아메리카노";         //이름은 아메리카노야
        아메리카노.price = 1400;             //아메리카노는 1400원이야
        Coffee 아메리카노1 = new Coffee();
        아메리카노1.name = "라떼";
        아메리카노1.price = 3000;
        Coffee 아메리카노2 = new Coffee();
        아메리카노2.name = "초코라뗴";
        아메리카노2.price = 3300;
        Coffee[] coffees = {아메리카노, 아메리카노1, 아메리카노2};
        for (int i = 0; i < coffees.length; i++)
            System.out.println(coffees[i].name + " " + coffees[i].price);
    }  //사전적인 의미로 실제 존재하는 것처럼 나온다. -> 메뉴를 만들어서 실제 있는 것 같이 생성함.
}

//객체를 만든 것.
class Coffee{ // 클래스의 이름은 대문자로 준다. 1.커피라는 것을 만들어서
    // field라고 한다. Coffee는 name과 price를 갖는 객체라는 뜻이다.
    String name;
    int price;
}
