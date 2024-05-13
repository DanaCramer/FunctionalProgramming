package LambdaFunctionalInterface.FunctionalInterface;

public class FunctionalInterfaceDemo {

    public static void main (String[] args) {

//        MyFunctionalInterface fun = () -> System.out.println("hello");
//        fun.myMethod();

        onTheFly(() -> System.out.println("Hello") );
    }

    public static void onTheFly(MyFunctionalInterface fun) {
        fun.myMethod();
    }
}
