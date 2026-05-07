
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void quickSortf(int[] a, int low, int high) {

        if (low < high) {
            int pivot = a[low];
            int i = low;
            int j = high;

            while (i < j) {
                i += 1;
                while (i <= high && a[i] < pivot)
                    i++;
                while (j >= low && a[j] > pivot)
                    j--;

                if (i < j && i <= high)
                    swap(a, i, j);
            }

            swap(a, low, j);
            quickSortf(a, low, j - 1);
            quickSortf(a, j + 1, high);

        }
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        quickSortf(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}