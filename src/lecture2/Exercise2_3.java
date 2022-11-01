package lecture2;

public class Exercise2_3 {

    public static void main(String[] args) {

        //インスタンス化
        //インスタンスが4つ生成され、配列tiresに格納されている
        Tire[] tires = {
                new Tire(65), new Tire(65), new Tire(65), new Tire(65)
        };

        /*複数のインスタンスを生成する別の方法
        Tire[] tires = new Tire[4];

        for (int i = 0; i < tires.length; i++) {
            tires[i]=new Tire(65);
        }
         */

        Engine engine = new Engine(4000);

        Car car = new Car(tires, engine);
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();

    }
}
