package onlinelibrary.interfaces;

import onlinelibrary.objects.Book;

/**
 * Edit book.
 * 
 * @author elpai
 *
 */
public interface EditBook {
	/**
	 * Save book.
	 * 
	 * @param book
	 * @return boolean
	 */
	boolean save(Book book);

	/**
	 * Delete book.
	 * 
	 * @param book
	 * @return boolean
	 */
	boolean delete(Book book);

	/**
	 * Edit book.
	 * 
	 * @param book
	 * @return boolean
	 */
	boolean edit(Book book);

	/**
	 * Add book.
	 * 
	 * @param book
	 * @return boolean
	 */
	boolean add(Book book);

}
