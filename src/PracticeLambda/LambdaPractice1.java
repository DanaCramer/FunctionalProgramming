package PracticeLambda;

public class LambdaPractice1 {

    public static void main(String[] args) {

        Name name = () -> System.out.println("John");
        name.myName();
    }
}
