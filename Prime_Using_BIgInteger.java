
import java.io.*;
import java.math.*;

public class Prime_Using_BIgInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
        if(bi.isProbablePrime(10)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        bufferedReader.close();
   
    }
}
