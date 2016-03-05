package onlinelibrary.objects;

/**
 * Publisher.
 * 
 * @author elpai
 *
 */
public class Publisher implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7427700395674616996L;
	/**
	 * Name.
	 */
	private String name;

	/**
	 * Publisher default constructor.
	 */
	public Publisher() {
	}

	/**
	 * Publisher constructor with params.
	 * 
	 * @param name
	 *            name
	 */
	public Publisher(final String name) {
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
