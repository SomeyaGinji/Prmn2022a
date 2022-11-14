package lecture4;

public class Exercise4_2 {

    public static void main(String[] args) {

        ATM atm = new ATM();

        String name = "染谷銀志";
        String number = "12345";

        atm.existsAccount(name, number); // 口座が存在するか確認
        atm.registerAccount(name, number); // 口座を作成
        atm.existsAccount(name, number); // 口座が存在するか再確認
        atm.deposit(number, 1000); // 入金
        atm.withdraw(number, 2000); // 出金(残高超え)
        atm.withdraw(number, 500); // 出金(残高以下)

    }
}
