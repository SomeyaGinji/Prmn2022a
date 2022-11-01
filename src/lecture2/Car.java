package lecture2;

public class Car {

    //フィールド変数
    int fuel;

    //コンストラクタ
    Car() {
        this.fuel = 0;
    }

    //メソッド
    void run() {

        if (fuel > 0) {
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料が足りないため走れませんでした。");
        }

    }


}
