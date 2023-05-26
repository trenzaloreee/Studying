package accounts;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public abstract class Account {

    private static HashMap<String, Account> accountsMap = new HashMap<>();

    private static int numberOfAccounts;

    private BigDecimal balance;
    private int accountNumber;
    private AccountHolder holder;

    @Override
    public boolean equals(Object otherObject){
        return accountNumber == ((Account)otherObject).getAccountNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }


    public Account(double balance, int accountNumber) {
        this.balance = BigDecimal.valueOf(balance);
        this.accountNumber = accountNumber;
        numberOfAccounts++;
        accountsMap.put("default " + numberOfAccounts, this); //todo дефолт рефактор
    }


//    public Account(String name) {
//        this(100000, 283948923);
//        accountsMap.put(name, this);
//    }
    public static void getAccounts(){
        System.out.println("Общее количество аккаунтов: " + numberOfAccounts);
    }

    public void pay(double price){
        System.out.println("Ваш баланс до покупки: " + getBalance());
        setBalance(getBalance().subtract(BigDecimal.valueOf(price)));
        System.out.println("Ваш баланс после покупки: " + getBalance());
    }

    public void deposit(double depositSum){
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
}
