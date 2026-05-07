
//4. program to find a number is positive or negativeusing ternary operator
import java.util.Scanner;

class OctHex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ënter a Number: ");
		int input = sc.nextInt();
		sc.close();
		int n1=input,n2=input;
		System.out.println("Decimal: "+input);
		String octal = "";
		String hexa = "";
			while(n1>0) {
			octal = (n1 % 8) + octal;
			n1 /= 8;}
			while(n2>0){
			int r = n2%16;
			hexa = r < 10 ? r+hexa : (char)('A'+(r-10))+hexa;
			n2/=16;
			}
		System.out.println("Octal: "+octal+"\nHexadecimal: "+hexa);

	}
}