package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long findMaximum(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMaxMonth(long[] purchases) {
        long maxPurchase = findMaximum(purchases);
        long index = 0;
        long indexMax = 1;
        for (long purchase : purchases) {
            index++;
            if (purchase == maxPurchase) { ;
                indexMax = index;
            }
        }
        return indexMax;
    }

    public long findMinimum(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long findMinMonth(long[] purchases) {
        long minPurchase = findMinimum(purchases);
        long index = 0;
        long indexMin = 1;
        for (long purchase : purchases) {
            index++;
            if (purchase == minPurchase) { ;
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