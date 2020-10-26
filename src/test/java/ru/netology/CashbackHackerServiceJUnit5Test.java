package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceJUnit5Test {

    @Test
    public void shouldReturn50IfAmount950() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 950;

        int actual = cashbackHackerService.remain(amount);
        int expected = 50;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;

        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn950IfAmount1050() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1050;

        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        Assert.assertEquals(expected, actual);
    }

}