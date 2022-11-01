package lecture2;

public class Human {

    //フィールド
    String name;
    int age;

    //コンストラクタ
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //メソッド
    void print(){
        System.out.println(name + " " + age + "歳です。");
        if (age <= 18) {
            System.out.println("生徒です。");
        } else if (age <= 22) {
            System.out.println("学生です。");
        }
    }

}
