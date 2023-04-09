// pata naho kych to wrong  hai



class RecTest {
    int values [];
    RecTest(int i) {
        values = new int[i];
    }


    //display array recursively
    void printArray(int i) {
        if (i == 0)  return;
        else printArray(i-1);
        System.out.println("[" + (i-1 +"]" +values(i-1)));

        }
    }


public class Recursion {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (int i = 0; i < 10; i++) {
            ob.values[i]=i;


        }
        ob.printArray(10);
    }
}