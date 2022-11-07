package lecture3;

public class Vegetable {

    // フィールド
    String name;
    int value;

    // コンストラクタ
    Vegetable (String name, int value) {
        this.name = name;
        this.value = value;
    }

    // メソッド
    void print() {
        System.out.println(name + " は " + value + " 円");
    }
}
