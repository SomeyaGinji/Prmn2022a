package lecture7;

public class HP {

    // フィールド
    private int hp;
    // クラス図における下線はstaticを表す
    private static int dead = 0;


    // メソッド
    public boolean isAlive(){
        return true;
    }

    public int getHp() {
        return hp;
    }

}
