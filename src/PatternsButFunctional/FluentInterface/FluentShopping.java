package PatternsButFunctional.FluentInterface;

public class FluentShopping {

    public static void main(String[] args) {

        new Order()
                .add("Shoes")
          .add("Headphones")
                .deliverAt("Street no 45, Jodhpur")
                .place();
    }
}