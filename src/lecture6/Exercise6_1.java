package lecture6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("小数値を入力してください：");

        // try句内で例外発生でcatch句へ
        try {
            // 入力された64bit浮動小数点の値をnumberに格納する
            double number = scanner.nextDouble();
            // 浮動小数点以外の値が入力されると、catch句へ移行

            // 例外が発生しなければ、numberの値を表示する
            System.out.println("入力した値: " + number);

        } catch (InputMismatchException e){
            System.out.println("エラー.");
        }


    }
}
