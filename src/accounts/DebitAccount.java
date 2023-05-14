package accounts;

import java.math.BigDecimal;

public class DebitAccount extends Account {
    @Override
    public void pay(BigDecimal price) {
        if (getBalance().subtract(price).intValue() >= 0){
            super.pay(price);
        }else {
            System.out.println("Недостаточно средств.");
        }
    }

    @Override
    public void deposit(BigDecimal depositSum) {
        super.deposit(depositSum);
    }
}
