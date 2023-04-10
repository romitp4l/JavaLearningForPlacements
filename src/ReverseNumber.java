public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1235 ; int  reverse = 0 ;
        System.out.println("Original Number :" +number);
        // run loop until it becomes zero
        while (number != 0) {
            //getting last number
            int digit = number % 10 ;
            reverse =  reverse * 10 + digit ;

            // remove the last digit from number
            number /=10 ;

        }
        System.out.println("Reversed number is " + reverse);
    }

}
