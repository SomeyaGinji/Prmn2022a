package lecture4;

public class Account {

    // フィールド(やっぱりprivate)
    private String name;
    private String number;
    private long balance;

    // コンストラクタ(public)
    public Account(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

}
