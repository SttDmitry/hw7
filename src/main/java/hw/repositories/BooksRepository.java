package hw.repositories;

import hw.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class BooksRepository {

    List<Book> books = new ArrayList<>(Arrays.asList(new Book(1,"1","1", new Date()), new Book(2,"2","2", new Date())));

    public List<Book> listOfBooks () {
        return books;
    }

    public void addBookToList (Book book){
        books.add(book);
    }
}
