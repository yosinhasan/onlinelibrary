package onlinelibrary.interfaces;

import java.util.List;

import onlinelibrary.objects.Author;
import onlinelibrary.objects.Book;
import onlinelibrary.objects.Genre;

/**
 * Book search.
 * 
 * @author elpai
 *
 */
public interface BookSearch {
	/**
	 * Get books.
	 * 
	 * @return Book
	 */
	List<Book> getBooks();

	/**
	 * Get books.
	 * 
	 * @param author
	 *            author
	 * @return Book
	 */
	List<Book> getBooks(Author author);

	/**
	 * Get books.
	 * 
	 * @param bookName
	 *            book name
	 * @return Book
	 */
	List<Book> getBooks(String bookName);

	/**
	 * Get books.
	 * 
	 * @param genre
	 *            genre
	 * @return Book
	 */
	List<Book> getBooks(Genre genre);

	/**
	 * Get books.
	 * 
	 * @param letter
	 *            letter
	 * @return Book
	 */
	List<Book> getBooks(Character letter);

}
