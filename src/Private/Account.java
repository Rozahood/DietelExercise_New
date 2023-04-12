package Private;

import java.math.BigDecimal;

public class Account {
    private  String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;

    private String pin;


    public Account(String accountNumber, String accountPin) {
        this.pin = accountPin;
        this.accountNumber = accountNumber;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(String pin) {
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid pin");

        return balance;
    }

    private void validate(String pin){
        if(!pin.equals(this.pin)) throw new IllegalArgumentException();
    }

    public void withdraw(BigDecimal valueOf, String pin) {
        if (pin.equals(this.pin)){
            this.balance = balance.subtract(valueOf);
        }else throw new IllegalArgumentException("Invalid pin");
    }


    public String getAccountNumber() {
        return accountNumber;
    }
}