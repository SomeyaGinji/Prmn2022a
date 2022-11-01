package lecture2;

public class Car {

    //フィールド
    int fuel; //燃料
    Tire[] tires; //Tire型配列tires
    Engine engine; //Engine型変数engine

    //コンストラクタ
    Car(Tire tires[], Engine engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    //runメソッド
    void run() {

        if (fuel > 0) {
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料が足りないため走れませんでした。");
        }

    }

    //startEngineメソッド
    void startEngine() {
        engine.start();
    }


}
