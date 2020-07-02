package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {

        int actual = service.remain(900);

        assertEquals(actual, 100);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {

        int actual = service.remain(1000);

        assertEquals(actual, 0);
    }
    @Test
    public void shouldReturnZeroIfAmountIs0() {

        int actual = service.remain(0);

        assertEquals( actual, 1000);
    }
    @Test
    public void shouldReturnZeroIfAmountLowerThan2000() {

        int actual = service.remain(2000);

        assertEquals(actual,  0);
    }

}