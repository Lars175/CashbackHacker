package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceTestJUnit5 {
    CashbackHackService service = new CashbackHackService();

    @org.junit.jupiter.api.Test
    public void shouldReturn100IfAmountLowerThan1000() {

        int actual = service.remain(900);

        assertEquals(100, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {

        int actual = service.remain(1000);

        assertEquals(0, actual);
    }
}