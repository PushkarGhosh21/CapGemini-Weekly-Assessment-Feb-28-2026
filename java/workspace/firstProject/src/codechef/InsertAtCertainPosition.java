package codechef;

import java.util.Scanner;

class InsertIntoSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
  
        int key = sc.nextInt();
        int i;
        for ( i = n - 1; i >= 0 && arr[i] > key; i--) {
            arr[i + 1] = arr[i];
        }

        arr[i + 1] = key;

        for (int j = 0; j <= n; j++) {
            System.out.print(arr[j]);
            if (j < n) {
                System.out.print(",");
            }
        }
    }
}
