package Streams.ObservingTheStream;

import Streams.Introduction.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ObservingTheStream {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        //Stream Pipeline
        List<Book> popularyBooks = books.stream()
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror")) //Intermediate Operation
                .filter((book) -> book.getRating() > 3) //Intermediate Operation
                .toList(); //Terminal Operation

        //1. Source
        Stream<Book> stream = books.stream();

        //2. Intermediate Operation
        Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));

        //3. Intermediate Operation
        Stream<Book> popularyHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);

        //4. Terminal Operation
        List<Book> collect = popularyHorrorBooks.toList();
    }
}
