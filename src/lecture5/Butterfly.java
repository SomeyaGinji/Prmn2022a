package lecture5;

// ButterflyクラスはInsectクラスを継承する
public class Butterfly extends Insect{

    // オーバーライドでInsectクラスのmoveメソッドを上書きする
    @Override
    public void move(){
        System.out.println("飛んだよ");
    }

}
