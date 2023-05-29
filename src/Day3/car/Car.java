package Day3.car;

abstract public class Car {
    Color color;
    int maxSpeed;
    boolean power;

    public Car(Color color, int maxSpeed, boolean power){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.power = power;

    }

    public String changePower() {
        power = !power;
        if (power) {
            return "앞으로 갑니다.";
        } else {
            return "시동을 먼저 켜주세요";
        }
    }
    abstract public String sound();
}

