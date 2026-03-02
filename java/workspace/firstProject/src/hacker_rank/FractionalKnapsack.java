package hacker_rank;

public class FractionalKnapsack {

    public static double getMaxValue(int[] weight, int[] value, int capacity) {

        int n = weight.length;

        // Step 1: Calculate ratio = value / weight
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) value[i] / weight[i];
        }

        // Step 2: Sort by ratio (descending order) using Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (ratio[j] > ratio[max]) {
                    max = j;
                }
            }

            // swap ratio
            double temp = ratio[i];
            ratio[i] = ratio[max];
            ratio[max] = temp;

            // swap weight
            int tempW = weight[i];
            weight[i] = weight[max];
            weight[max] = tempW;

            // swap value
            int tempV = value[i];
            value[i] = value[max];
            value[max] = tempV;
        }

        // Step 3: Pick items greedily
        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {

            if (capacity == 0) {
				break;
			}

            if (weight[i] <= capacity) {
                // take full item
                totalValue += value[i];
                capacity -= weight[i];
            } else {
                // take fractional part
                totalValue += ratio[i] * capacity;
                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;

        System.out.println(getMaxValue(weight, value, capacity));
    }
}