package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculateSummAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumm = 180;
        int actualSumm = service.summAllSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void calculateAverageAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageAllSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void calculateMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmax = 8;
        int actualmax = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedmax, actualmax);
    }

    @Test
    public void calculateMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmin = 9;
        int actualmin = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedmin, actualmin);
    }

    @Test
    public void calculateAverageMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmax = 5;
        int actualmax = service.maxAverageSalesMonth(sales);

        Assertions.assertEquals(expectedmax, actualmax);
    }

    @Test
    public void calculateAverageMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmin = 5;
        int actualmin = service.minAverageSalesMonth(sales);

        Assertions.assertEquals(expectedmin, actualmin);
    }
}
