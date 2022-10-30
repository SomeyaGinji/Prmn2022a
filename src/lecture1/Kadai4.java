/*
要素数100のint型の配列arrayを用意する。 それぞれに要素番号+1の値を代入していくことにする。
 (0番目の要素には、「１」が入るように)
配列arrayの数値を用いて配列番号が偶数の値の総和を求めよ。
ただし、代入処理及び総和を求める処理には繰り返し文を用いて、総和をint型変数sumに代入して結果を出すこと
for, whileのどちらの繰り返し文を用いるかは各自考え。 なぜその繰り返し分を記述したのかの理由を答えよ。
 */

package lecture1;

public class Kadai4 {

    public static void main(String[] args) {

        //要素数100のint型の配列arrayを用意
        int[] array = new int[100];
        //値の合計を格納する変数sumを用意
        int sum = 0;

        //配列arrayに要素番号+1の値を格納
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        //配列arrayの数値を用いて配列番号が偶数の値の総和を求める
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { //要素番号が偶数のとき、
                sum += array[i]; //sumに要素番号+1の値を累積していく
            }
        }

        //偶数の値の総和を出力
        System.out.println(sum);

    }


}
