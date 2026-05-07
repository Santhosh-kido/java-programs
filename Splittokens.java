
// import java.io.*;
import java.util.*;

public class Splittokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splitstr = s.split("[ !,?._'@]+");
        int count = 0;
        for (String str : splitstr) {
            if (!str.isEmpty()) {
                count++;
            }
        }
        System.out.println(count); 
        for (String str : splitstr) {
            if (!str.isEmpty()) {
                System.out.println(str);
            }
        }
        scan.close();
    }
}
