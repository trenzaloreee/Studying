import accounts.Account;
import accounts.CreditAccount;
import accounts.DebitAccount;
import accounts.SavingAccount;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Account debit = new DebitAccount(0, 1234);
        CreditAccount credit = new CreditAccount(0,2345, 10000);
        Account saving = new SavingAccount(0, 3456);

        debit.deposit(1000);
        credit.deposit(2000);
        saving.deposit(3000);

        debit.pay(1500);
        credit.pay(1500);

        credit.calculateCredit();

        Account.getAccounts();
    }
}
