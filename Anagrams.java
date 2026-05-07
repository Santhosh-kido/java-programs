
import java.util.Scanner;
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        int[] count = new int[256];
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;}
        for(int c:count){
            if(c!=0){
                return false;}}
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println("Anagrams or Not!!");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

