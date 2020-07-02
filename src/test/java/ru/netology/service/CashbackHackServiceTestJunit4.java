package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTestJunit4 {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {
        int actual = service.remain(900);
        Assert.assertEquals(100, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {
        int actual = service.remain(1000);
        Assert.assertEquals(0, actual);
    }
}
