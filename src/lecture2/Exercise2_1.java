package lecture2;

public class Exercise2_1 {

    public static void main(String[] args) {

        //Humanクラスからhuman1インスタンス,human2インスタンスを作成（インスタンス化）
        Human human1 = new Human("たかし", 18);
        Human human2 = new Human("ひろし", 20);

        //メソッド呼び出し
        human1.print();
        human2.print();

    }
}
