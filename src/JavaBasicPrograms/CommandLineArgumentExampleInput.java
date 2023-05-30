package JavaBasicPrograms;
import java.io.*;

public class CommandLineArgumentExampleInput {
    public static void main(String[] args) {
        // first checking if the length of args is greater than 0
        if (args.length > 0 ) {
            System.out.println("The command line arguments are as :");
            for (String values  :args
                 ) {
                System.out.println("Elements are as follows "+values);

            }
        }
    }
}
