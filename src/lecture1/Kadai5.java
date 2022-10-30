/*
小松川高校の1年生は5人います。
1年生全員を対象として算数のテストを行い,成績をつけることになりました.
int型の1次元配列(テストの点数表)を引数にとる関数min(), max(), average()を作成し、
各クラスのそれぞれの最低点をint型,最高点をint型,平均点をdouble型で返すようにせよ.

また、条件分岐を用いて60点未満を不可、60~70点未満を可、70~80点未満を良、
80~90点未満を優、90~100点を秀とし表示例のように表示せよ。

<表示例>
 0番 41点 不可
 1番 85点 優
.....
最高点:85点
最低点:38点
平均点 63.2点
.....

 */

package lecture1;

public class Kadai5 {

    public static void main(String[] args) {
        //テストの点数表
        int[] score = {41,85,72,38,80};

        //各点数の成績を表示
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            } else if (score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            } else if (score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            } else if (score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            } else {
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            }
        }

        //各メソッドを呼び出し、最高点と最低点と平均点を表示
        System.out.println(".....");
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");
        System.out.println(".....");

    }

    //最低点を返すメソッド
    static int min(int[] score){
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    // 最高点を返すメソッド
    static int max(int[] score){
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    // 平均点を返すメソッド
    static double average(int[] score){
        double ave;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        ave = sum / score.length;
        return ave;
    }

}
