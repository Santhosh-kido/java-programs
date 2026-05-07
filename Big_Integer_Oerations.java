
import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer_Oerations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        String n1 = sc.nextLine();

        System.out.print("Enter number2: ");
        String n2 = sc.nextLine();
        
        BigInteger bi1 = new BigInteger(n1);
        BigInteger bi2 = new BigInteger(n2);

        System.out.println("Add: " + bi1.add(bi2));
        System.out.println("Subract: " + bi1.subtract(bi2));
        System.out.println("Multiply: " + bi1.multiply(bi2));
        System.out.println("Divide: " + bi1.divide(bi2));

        sc.close();
    }
}
