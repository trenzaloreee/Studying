package accounts;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public abstract class Account {

    private static HashMap<AccountHolder, Account> accountsMap = new HashMap<>();

    private static int numberOfAccounts;

    private BigDecimal balance;

    private int accountNumber;

    private AccountHolder holder;


    public Account(AccountHolder holder, double balance, int accountNumber) {
        this.balance = BigDecimal.valueOf(balance);
        this.accountNumber = accountNumber;
        this.holder = holder;
        numberOfAccounts++;
        accountsMap.put(holder, this);
    }


    public static void getAccounts() {
        System.out.println("Общее количество аккаунтов: " + numberOfAccounts);
    }

    public void pay(double price) {
        System.out.println("Ваш баланс до покупки: " + getBalance());
        setBalance(getBalance().subtract(BigDecimal.valueOf(price)));
        System.out.println("Ваш баланс после покупки: " + getBalance());
    }

    public void deposit(double depositSum) {
        setBalance(getBalance().add(BigDecimal.valueOf(depositSum)));
        System.out.println("Ваш баланс был пополнен на " + depositSum);
        System.out.println("Ваш текущий баланс " + getBalance());
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static Account getAccount(AccountHolder holder) {
        return accountsMap.get(holder);
    }

    @Override
    public boolean equals(Object otherObject) {
        return accountNumber == ((Account) otherObject).getAccountNumber();
        //todo добавить холдеров
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString(){
        return "Держатель аккаунта - " +  holder + "." + "\nБаланс счета: " + balance + "." + "\nНомер счета: " + accountNumber + ".";

    }
}
