package FunctionalGenericInterface;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> fun = s -> s.substring(1,5);
        System.out.println(fun.execute("BasicsStrong"));

        FunctionalGenerics<Integer, String> fun1 = s -> s.length();
        System.out.println(fun1.execute("BasicsStrong"));
    }
}
