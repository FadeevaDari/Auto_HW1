package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturn50IfAmount950() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 950;

        int actual = cashbackHackerService.remain(amount);
        int expected = 50;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;

        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn950IfAmount1050() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1050;

        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        Assert.assertEquals(actual, expected);
    }

}