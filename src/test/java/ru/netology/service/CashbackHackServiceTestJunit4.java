package ru.netology.service;

import org.junit.Assert;


public class CashbackHackServiceTestJunit4 {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn100IfAmountLowerThan1000() {
        int actual = service.remain(900);
        Assert.assertEquals(100, actual);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmountIs1000() {
        int actual = service.remain(1000);
        Assert.assertEquals(0, actual);
    }
}
