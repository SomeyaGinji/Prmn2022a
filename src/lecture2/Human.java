package lecture2;

public class Human {

    //フィールド
    String name;
    int age;

    //コンストラクタ（インスタンス化と同時に呼び出されるメソッド）
    Human(String name, int age){
        this.name = name; //コンストラクタの引数をフィールド変数に当てはめる
        this.age = age;
    }

    //メソッド
    void print(){

        if (age <= 18) {
            System.out.println("生徒:" + name + " " + age + "歳です。");
        } else if (age <= 22) {
            System.out.println("学生:" + name + " " + age + "歳です。");
        }

    }

}
