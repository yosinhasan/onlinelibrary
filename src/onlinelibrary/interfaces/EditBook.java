package onlinelibrary.interfaces;

import onlinelibrary.objects.Book;

public interface EditBook {

	boolean save(Book book);

	boolean delete(Book book);

	boolean edit(Book book);

	boolean add(Book book);

}
