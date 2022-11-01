package lecture2;

public class Exercise2_2 {

    public static void main(String[] args) {

        Car car = new Car();
        GasStation gasStation = new GasStation();

        car.run(); //給油前
        gasStation.refuel(car); //給油する
        car.run(); //給油後

    }

}
