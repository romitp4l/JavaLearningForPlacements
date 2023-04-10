// DEMO OF THE STATIC VARIABLES , METHODS AND BLOCKS.
class DemoStatic  {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x  = " + x);
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);
    }

    static{
        System.out.println("static block initiateda .");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}

