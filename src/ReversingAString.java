public class ReversingAString {
    public static void main(String[] args) {
        public void reverseString(char[] s) {
            int left =0 ;
            int right = s.length -1 ;
            while(right > left ){
                char  temp = s[left];
                s[left] = s[right];
                s[right]= temp ;
                left++;
                right--;
            }


        }
    }
}
