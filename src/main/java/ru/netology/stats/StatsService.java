package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long findMax(long[] purchases) {
        long maxPurchase = findMax(purchases);
        long index = 0;
        long indexMax = 1;
        for (long purchase : purchases) {
            index++;
            if (purchase == maxPurchase) {
                indexMax = index;
            }
        }
        return indexMax;
    }

    public long findMin(long[] purchases) {
        long minPurchase = findMin(purchases);
        int index = 0;
        int indexMin = 1;
        for (long purchase : purchases) {
            index++;
            if (purchase == minPurchase) {
                indexMin = index;
            }
        }
        return indexMin;
    }

    public long calculateAverageSum(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public long calculateMinAverageSum(long[] purchases) {
        long averageSum = calculateAverageSum(purchases);
        long minAverageSum = 0;
        for (long purchase : purchases) {
            if (averageSum > purchase) {
                minAverageSum++;
            }
        }
        return minAverageSum;
    }

    public long calculateMaxAverageSum(long[] purchases) {
        long averageSum = calculateAverageSum(purchases);
        long maxAverageSum = 0;
        for (long purchase : purchases) {
            if (averageSum < purchase) {
                maxAverageSum++;
            }
        }
        return maxAverageSum;
    }
}