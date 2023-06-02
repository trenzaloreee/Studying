import accounts.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        Account debit = new DebitAccount(new AccountHolder("Alex", "Alex"), 0, 1234);
        CreditAccount credit = new CreditAccount(new AccountHolder("John", "John"), 0,2345, 10000);
        Account saving = new SavingAccount(new AccountHolder("Bob", "Bob"), 0, 3456);

        AccountHolder alex = new AccountHolder("Alex", "Alex");

        System.out.println(Account.getAccount(alex));

        System.out.println(alex.equals(debit));



        debit.deposit(1000);
        credit.deposit(2000);
        saving.deposit(3000);

        debit.pay(1500);
        credit.pay(1500);

        credit.calculateCredit();

//        Account.getAccounts();

        // интерфейс с interest rate'м
    }
}
