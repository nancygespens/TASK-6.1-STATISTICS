package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverage() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBetweenMaxMonth() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBetweenMinMonth() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBelowAverage() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAboveAverage() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

}