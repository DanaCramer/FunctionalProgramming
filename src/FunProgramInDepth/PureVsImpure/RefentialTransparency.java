package FunProgramInDepth.PureVsImpure;

public class RefentialTransparency {

    public static void main(String[] args) {

        int result = add(2, multiply(2,multiply(2,2)));
        System.out.println("result = " + result);
    }

    //transparent and pure (pure always transparent)
    public static int add(int a, int b) {
        return a+b;
    }

    //not transparent
    public static int multiply(int a, int b) {
        System.out.println("Multiplying a and b: " + a + ", " + b);
        return a*b;
    }
}
