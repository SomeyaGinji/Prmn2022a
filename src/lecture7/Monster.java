package lecture7;

import java.util.List;

// IMonsterインターフェースを実装
public class Monster implements IMonster{

    // フィールド
    private String name;
    private HP hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills;


    // コンストラクタ
    protected Monster(String name, int hp, int power,
                      int defense, int speed, List<Skill> skills){
        this.name = name;
        // hpを初期化する処理をここに書く
        HP hp1 = new HP();
        hp1.hp = hp;
        this.power = power;
        this.defense = defense;
        this.speed = speed;

    }

    // オーバーロード
    protected Monster(IMonster monster){

    }


    // メソッド


    public String getName() {
        return name;
    }

    public int getHP(){

    }


}
