public class ArrayMinMax {
    public static void main(String[] args) {
        int [] array = {1,5,5 ,5,9,6,};
        int smallest = array[0];
        int largest = array[0];
        for (int i = 1 ; i< array.length;i++)
        {
            if (array[i] < smallest)
            {
                smallest = array[i];

            } else if ( array[i] > largest)  {
                largest = array[i];

            }
        }
        System.out.println("smallest numbers in the array is : " + smallest);
        System.out.println("largest numbers in the array is :  " + largest);
    }
}
