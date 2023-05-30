package JavaBasicPrograms;
import java.util.Scanner;

public class SwappingByThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number " );
        int m = sc.nextInt();
        System.out.println("Enter the second  number " );
        int n = sc.nextInt();
        int temp =n;

        n = m;
        m = temp;
        System.out.println("value of the first no :" +m );
        System.out.println("value of the second number is :"+n);

    }
}
