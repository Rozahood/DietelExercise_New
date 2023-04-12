package Private;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {
    private Account paulineAccount;


@Before
    public void setUpTest() {
        paulineAccount = new Account("2055538295","1234");
    }

    @Test
    public void depositMoneyTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithCorrectPinTest() {
        paulineAccount.deposit(BigDecimal.valueOf(200));
        assertEquals(BigDecimal.valueOf(200), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithWrongPinThrowsExceptionTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals (BigDecimal.valueOf(2000),paulineAccount.getBalance("1234"));
    }

    @Test
    public void withdrawWithRightPinWorksTest(){
        paulineAccount.deposit(BigDecimal.valueOf(1200));
        paulineAccount.withdraw(BigDecimal.valueOf(200), "1234");
        assertEquals(BigDecimal.valueOf(1000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void withdrawWithRightPinWorks1Test(){
        paulineAccount.deposit(BigDecimal.valueOf(1200));
        paulineAccount.withdraw(BigDecimal.valueOf(200), "1234");
        assertEquals(BigDecimal.valueOf(1000),paulineAccount.getBalance("1234"));
    }
}
