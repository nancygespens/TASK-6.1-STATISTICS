package ru.netology.stats;

public class StatsService {

    public int sum(long[] sales) {
        int sum = 0;
        for (Long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(Long[] sales) {
        int sum = 0;
        for (Long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countBelowAverage(Long[] sales) {
        int count = 0;
        int average = average(sales);
        for (Long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countAboveAverage(Long[] sales) {
        int count = 0;
        int average = average(sales);
        for (Long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}
