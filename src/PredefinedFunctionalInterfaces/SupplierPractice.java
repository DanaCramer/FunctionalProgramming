package PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String("A String");

        System.out.println("stringSupplier = " + stringSupplier.get());

        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println("randomNumber = " + randomNumber.get());
    }
}
