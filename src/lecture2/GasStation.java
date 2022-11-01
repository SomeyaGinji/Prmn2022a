package lecture2;

public class GasStation {

    //メソッド
    void refuel(Car car){
        car.fuel += 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }

}
