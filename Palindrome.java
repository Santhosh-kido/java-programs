
import java.util.Scanner;

public class Palindrome {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String rev_str = "";
        System.out.println("Palindrome or Not!!");
        System.out.print("Enter a String : ");
        String s = scan.next();
        String final_str = s.toLowerCase();
        scan.close();

        for(int i=final_str.length()-1;i>=0;i--){
            rev_str += final_str.charAt(i); 
        }
        if(final_str.equals(rev_str)){
            System.out.println(s+" is a Palindrome!");
        }else{
            System.out.println(s+" is not a Palindrome!");
        }
    } 
}
