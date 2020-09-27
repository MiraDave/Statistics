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
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long calculateAverageSum(long[] purchases) {
        long averageSum = 0;
        for (long purchase : purchases) {
            averageSum += purchase;
        }
        return averageSum / 12;
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
            if (averageSum <= purchase) {
                maxAverageSum++;
            }
        }
        return maxAverageSum;
    }
}
