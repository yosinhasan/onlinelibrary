package onlinelibrary.interfaces;

import java.util.List;

import onlinelibrary.objects.Author;
import onlinelibrary.objects.Book;
import onlinelibrary.objects.Genre;

public interface BookSearch {

	List<Book> getBooks();

	List<Book> getBooks(Author author);

	List<Book> getBooks(String bookName);

	List<Book> getBooks(Genre genre);

	List<Book> getBooks(Character letter);

}
