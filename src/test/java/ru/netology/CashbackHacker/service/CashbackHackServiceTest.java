package ru.netology.CashbackHacker.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test

    public void PurchaseUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void Purchase1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void PurchaseOver1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

}