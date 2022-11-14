package lecture3;

import java.util.ArrayList;

public class Exercise3_4 {

    public static void main(String[] args) {

        ArrayList<Vegetable> arrayList = new ArrayList<>();

        Vegetable[] vegetables = {
                new Vegetable("にんじん", 117),
                new Vegetable("たまねぎ", 120),
                new Vegetable("じゃがいも", 154)
        };

        for (Vegetable vegetable : vegetables) { //拡張for文
            arrayList.add(vegetable);
        }

        for (Vegetable textlist : arrayList) {
            textlist.print();
        }

        /* 上2つのfor文の別解

        for (int i = 0;i < arrayList.size(); i++) {
            arrayList.get(i).print();
        }

        */

    }
}
