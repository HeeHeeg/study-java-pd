package Day3.car;

public class Oil extends Car{

    int gasoline;

    public String gasolineUp(int amount){
        gasoline += amount;
        return "주유를 완료했습니다.";
    }

    @Override
    public String sound() {
        return "부아앙";
    }
    public Oil(int gasoline){
        super(Color.RED, 150, false);
        this.gasoline = gasoline;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "gasoline=" + gasoline +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", power=" + power +
                '}';
    }
}
