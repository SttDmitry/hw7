package hw.service;


import hw.entities.Book;
import hw.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private BooksRepository booksRepository;

    @Autowired
    public void setBooksRepository(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getBooks(){
        return booksRepository.listOfBooks();
    }

    public void addBook(Book book){
        booksRepository.addBookToList(book);
    }

    public BooksService() {
    }
}