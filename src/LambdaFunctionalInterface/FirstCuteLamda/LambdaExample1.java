package LambdaFunctionalInterface.FirstCuteLamda;

public class LambdaExample1 {

    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("Thread Executed!"));
        t.start();
    }
}
