
import java.util.Scanner;

public class StringReverse {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to reverse : ");
        String s = scan.nextLine();
        String rev_str = "";
        scan.close();

        for(int i=s.length()-1;i>=0;i--){
            rev_str += s.charAt(i);
        }
        System.out.println("Reversed String is : "+rev_str);
    }
}
