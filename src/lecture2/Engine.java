package lecture2;

public class Engine {

    //フィールド
    int rpm;

    //コンストラクタ
    Engine(int rpm) {
        this.rpm = rpm;
    }

    //メソッド
    void start() {
        System.out.println("rpm = " + rpm + " でエンジンを始動させました。");
    }


}
