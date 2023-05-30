package JavaBasicPrograms;

public class AddingTwoBinaryStrings {
    public static void main(String[] args) {
        String x = "011011", y = "1010111";

        int num1 = Integer.parseInt(x, 2);

        int num2 = Integer.parseInt(y, 2);
        int sum = num2 + num1;
        System.out.println(sum);
        String bin = Integer.toBinaryString(sum);
        System.out.println(bin);

    }
}
