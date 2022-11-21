package lecture7;

import java.util.List;

public class Monster {

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

    }

}
