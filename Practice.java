
public class Practice {
    public static void main(String[] args) {
        
        int n4 = 34;
        int n1 = 3521;
        int n2 = 2482;
        int n3= 1352;
        int pin=0;

        if(n4%2==0){
               pin =  (returnEvenSum(n1) + returnEvenSum(n2) + returnEvenSum(n3) )
                 - (returnOddSum(n1)+returnOddSum(n2)+returnOddSum(n3));
        }else{
                pin = (returnOddSum(n1)+returnOddSum(n2)+returnOddSum(n3))
                -   (returnEvenSum(n1) + returnEvenSum(n2) + returnEvenSum(n3) );
        }
        System.out.println("PIN : "+pin);
    }
    public static int returnEvenSum(int n){
        int sum=0;
        String str = n+" ";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    public static int returnOddSum(int n){
        int sum=0;
        String str = n+" ";
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;

    }
}
