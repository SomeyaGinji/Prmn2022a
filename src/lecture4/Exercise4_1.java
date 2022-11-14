package lecture4;

public class Exercise4_1 {

    public static void main(String[] args) {

        // Fighterを2つインスタンス化して、fighterを2人作る
        Fighter fighter1 = new Fighter(210,100,"Fighter1");
        Fighter fighter2 = new Fighter(180,150,"Fighter2");

        while (true) { // 永遠に繰り返す

            fighter1.attack(fighter2); //fighter1が攻撃する
            fighter2.setHitPoint(fighter2.getHitPoint());
            if ( !fighter2.isAlive()) { //fighter2が倒れていたら、
                System.out.println(fighter2.getName() + "は倒れた。");
                break; // 試合終了
            }

            fighter2.attack(fighter1); //fighter2が攻撃する
            fighter1.setHitPoint(fighter1.getHitPoint());
            if ( !fighter1.isAlive() ) { //fighter1が倒れていたら、
                System.out.println(fighter1.getName() + "は倒れた。");
                break; // 試合終了
            }

        }

    }
}
