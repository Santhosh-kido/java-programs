

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // Enter the size of the square

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star only at borders
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space inside
                }
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
