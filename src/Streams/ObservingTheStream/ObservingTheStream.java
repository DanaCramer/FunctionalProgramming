package Streams.ObservingTheStream;

import Streams.Introduction.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ObservingTheStream {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        List<Book> popularyBooks = books.stream()
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() > 3)
                .toList();

        //1.
        Stream<Book> stream = books.stream();

        //2.
        Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));

        //3.
        Stream<Book> popularyHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);

        //4.
        List<Book> collect = popularyHorrorBooks.toList();
    }
}
