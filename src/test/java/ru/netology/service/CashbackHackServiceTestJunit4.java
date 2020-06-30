package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class CashbackHackServiceTestJunit4 {
    public class CashbackHackServiceTest {

        CashbackHackService service = new CashbackHackService();

        @Test
        public void shouldReturn100IfAmountLowerThan1000() {

            int actual = service.remain(900);

            Assert.assertEquals(100, actual);

        }

        @Testable
        public void shouldReturnZeroIfAmountIs1000() {

            int actual = service.remain(1000);

            Assert.assertEquals(0, actual);
        }

    }

}