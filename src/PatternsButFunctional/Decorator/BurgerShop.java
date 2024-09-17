package PatternsButFunctional.Decorator;

import FunProgramInDepth.Composition.Function;

public class BurgerShop {

    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger) {
        System.out.println("baseBurger = " + baseBurger);
        return decoration.apply(baseBurger);
    }
}
