package onlinelibrary.dao.interfaces;


import onlinelibrary.entities.Author;
import onlinelibrary.entities.Book;
import onlinelibrary.entities.Genre;

import java.util.List;


public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
    Object getFieldValue(Long id, String fieldName);

}
