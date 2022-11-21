package lecture5;

public class Exercise5_3 {

    public static void main(String[] args) {

        // Insect型の変数swallowtail(アゲハ蝶)にButterflyクラスのインスタンスを代入
        Insect swallowtail = new Butterfly();

        // Butterflyクラスのmoveメソッドを呼び出す
        swallowtail.move();

    }
}
