package onlinelibrary.interfaces;

import onlinelibrary.objects.Book;

/**
 * Show book.
 * 
 * @author elpai
 *
 */
public interface ShowBook {
	/**
	 * Show book.
	 * 
	 * @param book
	 *            book
	 */
	void showBook(Book book);

	/**
	 * Download book.
	 * 
	 * @param book
	 *            book
	 */
	void downloadBook(Book book);

	/**
	 * Vote book.
	 * 
	 * @param book
	 *            book
	 */
	void voteBook(Book book);

}
