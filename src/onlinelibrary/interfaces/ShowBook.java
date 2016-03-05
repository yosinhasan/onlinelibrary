package onlinelibrary.interfaces;

import onlinelibrary.objects.Book;

public interface ShowBook {

	void showBook(Book book);

	void downloadBook(Book book);

	void voteBook(Book book);

}
