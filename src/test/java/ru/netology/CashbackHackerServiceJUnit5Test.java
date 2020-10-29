package ru.netology;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceJUnit5Test {

    @Test
    public void shouldReturn50IfAmount950() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 950;

        int actual = cashbackHackerService.remain(amount);
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;

        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn950IfAmount1050() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1050;

        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        assertEquals(expected, actual);
    }

}