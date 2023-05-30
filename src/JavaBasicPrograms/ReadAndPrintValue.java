package JavaBasicPrograms;
import java.util.*;
import java.io.*;
// java program to read and print integer value  through terminal



public class ReadAndPrintValue {
    public static void main(String[] args) {
        System.out.println(" Please inter the number");
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();
        System.out.println("Your entered number is : " +num);

    }
}
