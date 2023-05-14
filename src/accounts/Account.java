package accounts;

import java.math.BigDecimal;

public abstract class Account {
    private static int numberOfAccounts;

    private BigDecimal balance;

    private int accountNumber;
    private AccountHolder holder;

    public void pay(BigDecimal price){
        setBalance(getBalance().subtract(price));
    }

    public void deposit(BigDecimal depositSum){
        setBalance(getBalance().add(depositSum));
        System.out.println("Ваш баланс был пополнен на " + depositSum);
        System.out.println("Ваш текущий баланс " + getBalance());
    }

    public void calculateSavings(int interest){
        System.out.println("За год вы заработаете " + getBalance().multiply(BigDecimal.valueOf(interest*0.01)));
        System.out.println("Ваш баланс в конце года составит " + getBalance().add(getBalance().multiply(BigDecimal.valueOf(interest*0.01))));
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
