package lecture5;

// LocustはInsectを継承する
public class Locust extends Insect{

    // Insectのmoveメソッドを上書き
    @Override
    public void move() {
        System.out.println("跳んだよ");
    }
}
