package Day3.car;

public class Electric extends Car {
    int battery;
    public String charge(int amount){
        battery += amount;
        return "충전을 완료했습니다.";
    }

    @Override
    public String sound() {
        return "위이이이잉";
    }
    public Electric(int battery){
        super(Color.BLUE,250, false);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "battery=" + battery +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", power=" + power +
                '}';
    }
}
