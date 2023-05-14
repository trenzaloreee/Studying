package accounts;

import java.math.BigDecimal;

public class SavingAccount extends Account {
    private static int interest;

    @Override
    public void deposit(BigDecimal depositSum) {
        super.deposit(depositSum);
    }

    @Override
    public void calculateSavings(int interest) {
        super.calculateSavings(interest);
        //interest задается каждый раз при вызовы метода, а не берется от статической переменной выше
    }
}
