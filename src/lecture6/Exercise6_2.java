package lecture6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {

    public static void main(String[] args) {

        // Integer型のArrayListを用意（変数名は各自で考える）
        ArrayList<Integer> diceList = new ArrayList<>();

        // Scannerクラス、Randomクラスのインスタンス化
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // random.nextInt(6)+1 で1~6のいずれかの数字を取得できる(Integer型)

        // 用意したArrayListにInteger型のインスタンスを5つ追加
        for (int i = 0; i < 5; i++) {
            diceList.add(random.nextInt(6) + 1);
        }

        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のサイコロの値を確認しますか？");

        // try句
        try {

            // int型変数indexに、Scannerを用いて入力された数値を代入
            int index = scanner.nextInt();

            // ArrayListのindex番目の値を表示
            System.out.println(diceList.get(index));

            // 課題2のcatch句(ArrayListの範囲外)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");

            // 課題3のcatch句(整数以外の入力)
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }

    }
}
