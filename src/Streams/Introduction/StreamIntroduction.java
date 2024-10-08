package Streams.Introduction;

import java.util.ArrayList;
import java.util.List;

public class StreamIntroduction {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book: books) {
            if(book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {
                popularHorrorBooks.add(book);
            }
        }

        //after java 8
        List<Book> collect = books.parallelStream()
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() >3)
                .toList();
    }
}
