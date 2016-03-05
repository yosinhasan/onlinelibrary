package onlinelibrary.objects;

import java.util.Date;

/**
 * Author.
 * 
 * @author elpai
 *
 */
public class Author implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Full name.
	 */
	private String fio;
	/**
	 * Birthday.
	 */
	private Date birthday;

	/**
	 * Default constructor.
	 */
	public Author() {
	}

	/**
	 * Constructor with params
	 * 
	 * @param fio
	 *            full name
	 * @param birthday
	 *            birthday
	 */
	public Author(final String fio, final Date birthday) {
		this.fio = fio;
		this.birthday = birthday;
	}

	/**
	 * Get full name.
	 * 
	 * @return String
	 */
	public final String getFio() {
		return this.fio;
	}

	/**
	 * Set full name.
	 * 
	 * @param fio
	 *            full name
	 */
	public final void setFio(final String fio) {
		this.fio = fio;
	}

	/**
	 * Get birthday.
	 * 
	 * @return Date
	 */
	public final Date getBirthday() {
		return this.birthday;
	}

	/**
	 * Set birthday.
	 * 
	 * @param birthday
	 *            birthday
	 */
	public final void setBirthday(final Date birthday) {
		this.birthday = birthday;
	}

}
