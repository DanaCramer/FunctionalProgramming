package PatternsButFunctional.FluentInterface;

public class FluentShopping {

    public static void main(String[] args) {
        Order.place(order -> order
                .add("Shoes")
                .add("Headphones")
                .deliverAt("Street no 45, Jodhpur")
                );
    }
}