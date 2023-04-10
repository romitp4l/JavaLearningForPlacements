public class CheckPositiveNegative {
    public static void main(String[] args) {
        double number = -35 ;
        // true if number is less than 0
        if (number < 0.0) {
            System.out.println( number+ "  is negative number .");

        } else if (number > 0.0) {
            System.out.println(number + "  is positive number ");

        }
        // if both testcases evaluated to false
        else {
            System.out.println(number + "number is zero ");
        }
    }
}
