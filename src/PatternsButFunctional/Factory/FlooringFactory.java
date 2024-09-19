package PatternsButFunctional.Factory;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring(int minTemperature, int maxTemperature) {
        Supplier<Flooring> flooring;
        if(minTemperature <= 5 && maxTemperature <= 20) {
            flooring = () -> new WoodenFlooring();
        }
        else if(minTemperature <= 5 && maxTemperature >=45) {
            flooring = () -> new CorkFlooring();
        } else {
            flooring = () -> new ConcreteFlooring();
        }
        return flooring.get();
    }
}
