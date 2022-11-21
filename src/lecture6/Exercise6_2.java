package lecture6;

public class Exercise6_2 {

    public static void main(String[] args) {

        // Integer型のArrayListを用意（変数名は各自で考える）


        // Scannerクラス、Randomクラスのインスタンス化


        // これにより、random.nextInt(6)+1 で
        // 1~6のいずれかの数字を取得できる(Integer型)

        // 用意したArrayListにInteger型のインスタンスを5つ追加


        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のサイコロの値を確認しますか？");

        // try句

            // int型変数indexに、Scannerを用いて入力された数値を代入


            // ArrayListのindex番目の値を表示


        // 課題2のcatch句(ArrayListの範囲外)


            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");

        // 課題3のcatch句(整数以外の入力)


            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");


    }
}
