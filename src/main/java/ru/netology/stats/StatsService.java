package ru.netology.stats;

public class StatsService {

    public int summAllSales(int[] sales) {
        int summSales = 0; // сумма всех продаж по месяцам
        for (int t : sales) {
            summSales = summSales + t;
        }
        return summSales;
    }

    public int averageAllSales(int[] sales) {
        // среднее значение продаж в месяц
        int averageSales = summAllSales(sales) / 12;
        return averageSales;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxAverageSalesMonth(int[] sales) {
        int count = 0; //количество месяцев в которых было продаж больше среднемесячного значения
        int averageSales = averageAllSales(sales);

        for (int salesPerMonth : sales) {
            if (salesPerMonth > averageSales) {
                count++;
            }
        }
        return count;
    }

    public int minAverageSalesMonth(int[] sales) {
        int count = 0; //количество месяцев в которых было продаж меньше среднемесячного значения
        int averageSales = averageAllSales(sales);

        for (int salesPerMonth : sales) {
            if (salesPerMonth < averageSales) {
                count++;
            }
        }
        return count;
    }
}
