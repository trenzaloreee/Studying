package accounts;

import java.math.BigDecimal;

public class SavingAccount extends Account {
    private static int interest;

    public SavingAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double depositSum) {
        super.deposit(depositSum);
    }

    public void calculateSavings(){
        System.out.println("За год вы заработаете " + getBalance().multiply(BigDecimal.valueOf(interest*0.01)));
        System.out.println("Ваш баланс в конце года составит " + getBalance().add(getBalance().multiply(BigDecimal.valueOf(interest*0.01))));
    }
}
