package ru.netology.service;

import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual,expected);

    }

    @Test
    public void ShouldCalculateRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual,expected);

    }
    @Test
    public void ShouldCalculateRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual,expected);

    }
}