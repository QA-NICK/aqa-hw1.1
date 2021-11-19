package ru.netology.service;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected,actual);

    }

    @Test
    public void ShouldCalculateRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected,actual);

    }
    @Test
    public void ShouldCalculateRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);

    }
}