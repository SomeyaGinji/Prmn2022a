package lecture4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ATM {

    // フィールド
    private List<Account> accountList;

    // コンストラクタ
    public ATM() {
        // accountListを初期化
        this.accountList = new ArrayList<>();
    }

    // アカウントを登録するメソッド
    public void registerAccount(String name, String number) {
        Account account = new Account(name, number); // accountインスタンスを作成
        accountList.add(account); // 作成したaccountインスタンスをaccountListに追加する
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    // アカウントが存在するか調べるメソッド
    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) { // accountListの全てのaccountについて見て、
            // name,number共に一致するアカウントが存在すれば、
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                // ※ ==ではなくequalsを使うことでNullPointerException(nullが原因のエラー)を防ぐ
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                return true; // trueを返す
            }
        }
        // 存在しなければ、
        System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
        return false; // falseを返す
    }

    // 入金するメソッド
    public void deposit(String number, long money) {
        for (Account account : accountList) { // accountListの全てのaccountについて見て、
            // 引数のnumberがaccountListに存在すれば、
            if (account.getNumber().equals(number)) {
                // そのaccountのbalanceにmoneyの値を加える(入金)
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
                break;
            }
        }
        // 口座番号が存在しなければ、
        System.out.println("口座番号:" + number + " は存在しません。");
    }

    public long withdraw(String number, long money) {
        for (Account account : accountList) {
            // 引数のnumberがaccountListに存在すれば、
            if (account.getNumber().equals(number)) {
                // かつ引き出せる金額であれば、
                if (account.getBalance() >= money) {
                    // 残高から引出金額を引き、
                    account.setBalance(account.getBalance() - money);
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出しました。");
                    System.out.println("残高:" + account.getBalance() + "円です。");
                    return money; // 引出金額を返す
                } else { // 引き出せない金額であれば、
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。");
                    System.out.println("残高:" + account.getBalance() + "円です。");
                    return 0; // 0を返して処理を無効にする
                }
            }
        }
        // 口座番号が存在しなければ、
        System.out.println("口座番号:" + number + " は存在しません。");
        return 0;
    }


}
