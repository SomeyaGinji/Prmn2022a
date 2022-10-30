/*
int型変数ageに任意の値を代入し、ageの値によって処理を分岐させ、実行結果のようになるようにしなさい
また、文字列連結を用いて、ageを使って年齢を表示させること
 */

package lecture1;

public class Kadai3 {

    public static void main(String[] args) {
        int age = 21; //int型変数ageに任意の値を代入
        if ( age < 20 ) { //ageが20未満のとき
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        } else { //ageが20以上のとき
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
    }

}
