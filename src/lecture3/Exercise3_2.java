package lecture3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("何行分入力しますか？");

        int number = scanner.nextInt();
        scanner.nextLine(); //空読み

        for (int i = 0; i < number; i++) {
            System.out.println(i + "行目：");
            String text = scanner.nextLine();
            arrayList.add(text);
        }

        for (String textList : arrayList) { //拡張for文
            System.out.println("[" + arrayList.indexOf(textList) + "]" + textList);
        }

    }

}
