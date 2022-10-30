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

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { //要素番号が偶数のとき、
                sum += array[i]; //sumに要素番号+1の値を累積していく
            }
        }

        //偶数の値の総和を出力
        System.out.println(sum);

    }


}
