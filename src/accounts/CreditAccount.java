package accounts;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private int interest;
    private BigDecimal creditLimit;
    private BigDecimal allDepositsSum;

    @Override
    public void pay(BigDecimal price) {
        super.pay(price);
    }

    @Override
    public void deposit(BigDecimal depositSum) {
        calculateAllDeposits(depositSum);
        if (getBalance().add(depositSum).intValue() < creditLimit.intValue()){
            super.deposit(depositSum);
        }else{
            System.out.println("Вы достигли лимита пополнений по кредиту");
        }
    }

    public void calculateAllDeposits(BigDecimal depositSum) {
        allDepositsSum.add(depositSum);
    }

    public void calculateCredit() {
        System.out.println("За год вы пополнили карту на " + allDepositsSum);
        System.out.println("За год вы должны будете банку " + allDepositsSum.add(allDepositsSum.multiply(BigDecimal.valueOf(interest * 0.01))));
    }
}
