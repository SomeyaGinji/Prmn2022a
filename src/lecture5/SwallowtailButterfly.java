package lecture5;

// SwallowtailButterflyはButterflyを継承する
public class SwallowtailButterfly extends Butterfly{

    // Butterflyのmoveメソッドをさらに上書き
    @Override
    public void move() {
        System.out.println("綺麗に飛んだよ");
    }

}
