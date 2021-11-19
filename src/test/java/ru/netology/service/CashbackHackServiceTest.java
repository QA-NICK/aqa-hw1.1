package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void ShouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual, "wrong remain");

    }

    @Test
    public void ShouldCalculateRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual, "wrong remain");

    }
    @Test
    public void ShouldCalculateRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual, "wrong remain");

    }
}