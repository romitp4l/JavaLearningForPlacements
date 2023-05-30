package JavaBasicPrograms;
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args)  throws IOException   {
        // Enter data using Buffered Reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Reading data using readline
        String naam = reader.readLine();
        System.out.println(naam);

    }

}
