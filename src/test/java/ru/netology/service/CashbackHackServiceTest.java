package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {

        int actual = service.remain(900);

        assertEquals(100, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {

        int actual = service.remain(1000);

        assertEquals( 0, actual);
    }

}