
import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float bill_amount = 0;
        System.out.println();
        System.out.println("********************************** Electricity Bill **********************************");
        System.out.print("Enter previous month reading: ");
        float pre_reading = scan.nextFloat();
        System.out.print("Enter current month reading: ");
        float cur_reading = scan.nextFloat();

        float unit = cur_reading - pre_reading;
        System.out.println("Units Consumed: " + unit);

        if (unit <= 100) {
            bill_amount = 0;
        } else if (unit >= 201 && unit <= 400) {
            bill_amount = ((unit - 100) * 4.50f);
        } else if (unit >= 401 && unit <= 500) {
            bill_amount = (300 * 4.50f) + ((unit - 300) * 6f);
        } else if (unit>=501 && unit <= 600) {
            bill_amount = (300 * 4.50f) + (100 * 6f) + ((unit - 500) * 8f);
        } else if (unit>=601 && unit <= 800) {
            bill_amount = (300 * 4.50f) + (100 * 6f) + (100 * 8f) + ((unit -600 ) * 9f);
        } else if (unit>=801 && unit <= 1000) {
            bill_amount =  (300 * 4.50f) + (100 * 6f) + (100 * 8f) + (200 * 9f) + ((unit - 800) * 10f);
        }
        System.out.println("Previous Month Reading: " + pre_reading);
        System.out.println("Current Month Reading: " + cur_reading);
        System.out.println("Total Units Consumed: " + unit);
        System.out.println("Bill Amount: " + bill_amount);
        scan.close();
    }
}
