package PracticeLambda;

public class LambdaPractice3 {

    public static void main (String[] args) {

        LengthOfString len = str -> {

            int l = str.length();
            System.out.println("The length of given String is "+ l);
            return str.length();
        };

        int length = len.length("BasicsStrong");
        System.out.println(length);
    }
}
