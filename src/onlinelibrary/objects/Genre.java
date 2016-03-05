package onlinelibrary.objects;

/**
 * Genre.
 * 
 * @author elpai
 *
 */
public class Genre implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Name.
	 */
	private String name;

	/**
	 * Genre.
	 */
	public Genre() {
	}

	/**
	 * Genre constructor.
	 * 
	 * @param name
	 *            name
	 */
	public Genre(final String name) {
		this.name = name;
	}

	/**
	 * Get name.
	 * 
	 * @return String
	 */
	public final String getName() {
		return this.name;
	}

	/**
	 * Set name.
	 * 
	 * @param name
	 *            name
	 */
	public final void setName(final String name) {
		this.name = name;
	}

}
