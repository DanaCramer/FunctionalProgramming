package Optional;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {

        Integer a = 10;

        Optional<Integer> optional = Optional.of(a);

        //get

        Integer integerVal = optional.get();

        System.out.println("integerVal = " + integerVal);

        Optional<Integer> emptyOptional = Optional.empty();

        //emptyOptional.get();

        //isPresent

        Integer val = optional.isPresent() ? optional.get() : 0;
        System.out.println("val = " + val);

        //OrElse, orElseGet

        //orElse

        Integer orElse = emptyOptional.orElse(0);
        System.out.println("orElse = " + orElse);

        //orElseGet

        Integer orElseGet = emptyOptional.orElseGet((() -> 0));
        System.out.println("orElseGet = " + orElseGet);

        //orElseThrow

        Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
        System.out.println("orElseThrow = " + orElseThrow);

        //orElseThrow() = get()
    }
}
