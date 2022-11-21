package lecture5;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {

    public static void main(String[] args) {

        // List型の変数insectListを用意、各要素はInsect型
        List<Insect> insectList = new ArrayList<>();

        // 各クラスのインスタンスをListに格納する
        insectList.add(new Insect());
        insectList.add(new Butterfly());
        insectList.add(new Locust());
        insectList.add(new SwallowtailButterfly());

        // 格納した4つのインスタンスからmoveメソッドを呼び出す
        for (Insect insect: insectList){
            insect.move();
        }

    }
}
