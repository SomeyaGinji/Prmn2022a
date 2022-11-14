package lecture4;

public class Fighter {

    // フィールド
    // 基本的にprivate、外部に参照されない
    // 参照したいときはGetterを使って参照する
    private int hitPoint;
    private int power;
    private String name;

    // コンストラクタ
    // 引数として持ってきた値を、フィールドの値として初期化する
    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    // 以下メソッド
    // 基本的にpublic、外部に参照されてこそのメソッドなので。

    // 敵にダメージを与えるメソッド
    public void attack(Fighter enemy){
        // hitPointは敵の、powerは自分の。
        enemy.hitPoint -= power;
        System.out.println(name + "は" + enemy.name + "に" + power + "ダメージを与えた。");
    }

    // 自分が生きている(True)かを返す関数
    public boolean isAlive(){
        if (hitPoint > 0) { // 生存時
            return true;
        } else { // 死亡時
            return false;
        }
    }

    // フィールドは基本的にprivateなので、
    // ↓のGetterを用いることでフィールドの値を取得する
    public int getHitPoint() {
        return hitPoint; // これでprivateであるフィールドの値を返せる
    }

    // Setter
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    // Getter
    public String getName() {
        return name;
    }
}
