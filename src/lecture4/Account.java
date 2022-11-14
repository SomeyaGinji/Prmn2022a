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

    // 以下アクセサ(Getter,Setter)
    // ATMクラスを作成したときに必要になったので作りました

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
