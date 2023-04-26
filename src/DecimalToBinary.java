
import  java.util.Scanner ;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int decimalNumber = sc.nextInt();
        String binary = "";
        while (decimalNumber > 0 )
        {
            int remainder = decimalNumber % 2 ;
            binary = remainder + binary ;
            decimalNumber /= 2;

        }
        System.out.println(" Binary represrntation " + binary);
    }
}
