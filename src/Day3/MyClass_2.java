package Day3;

public class MyClass_2 {
    public static void main(String[] args) {
//        Card card = new Card();
//        card.name = "spaid";
//        card.number = 9;
//        Card card1 = new Card();
//        card1.name = "heart";
//        card1.number = 7;
//        Card card2 = new Card();
//        card2.name = "diamond";
//        card2.number = 10;
//        Card card3 = new Card();
//        card3.name = "clover";
//        card3.number = 2;

        String[] names = {"spaid", "heart", "diamond", "clover"};
        int[] numbers = {9, 7, 10, 2};
        Card[] cards = new Card[4];
//        System.out.println(card1.toString());

        for (int i = 0; i < cards.length; i++) {
            Card card4 = new Card(Type.CLOVER, numbers[i]); //
            //앞에는 타입이 들어가야함. 네임이 스트링이여서 들어갈 수 없기 때문에 고정값을 가져올거다-> Type.을 누르면 아래 클래스에 저장해놓은 값을 불러올 수 있다.
            //Type. 을 찍어보면 SPAID, HEART, DIAMOND, CLOVER이 네개가 뜬다. 이렇게 확실한 값을 넣을 수 있다. 아래 '조커'를 만들지 않고 여기에 추가로 조커를 만들 수 없다.
            // (정해진 상수값 4개만 들어갈 수 있다)

//            card4.name = names[i];
//            card4.number = numbers[i];
            cards[i] = card4;
        }

//1번.        for (int i = 0; i < cards.length; i++) {
//              System.out.println(cards[i].name + " " + cards[i].number);
//        }
        // foreach
        for (Card j : cards) {
            System.out.println(j.number + " " + j.name);


        }
    }
}

 class Card {
    Type name;
    int number;
     public Card(Type name, int number){
         this.name = name;
         this.number = number;
     }
    public Card(){}
}
enum Type{                 //이런 확실한것 -> 상수 . 상수는 대문자로 쓴다.  enum -상수들만 들어있는 확실한 수
    SPAID, HEART, DIAMOND, CLOVER
}
