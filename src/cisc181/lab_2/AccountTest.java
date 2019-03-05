package cisc181.lab_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void deposit() {
        System.out.println("Testing deposit");
        Account account = new Account("Edward", 6699, 0.2);
        assertEquals(6699,account.getBalance(),0.001);
    }

    @Test
    public void withDraw() {
        System.out.println("Testing withDraw");
        Account account = new Account("AQ", 5432, 0.01);
        assertFalse(account.withDraw(9999));
        assertTrue(account.withDraw(432));
    }

    @Test
    public void addMonthlyInterest() {
        System.out.println("Testing addMonthlyInterest");
        Account account = new Account("BBS", 1000, 0.03);
        account.addMonthlyInterest();
        assertEquals(1030,account.getBalance(),0.0001);
    }
}