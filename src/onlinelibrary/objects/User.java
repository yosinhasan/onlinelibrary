package onlinelibrary.objects;

/**
 * User.
 * 
 * @author elpai
 *
 */
public class User {
	/**
	 * Username.
	 */
	private String username;
	/*
	 * Password.
	 */
	private String password;

	/**
	 * Default constructor.
	 */
	public User() {
	}

	/**
	 * Get username.
	 * 
	 * @return String
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * Set username.
	 * 
	 * @param username
	 *            username
	 */
	public final void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Get password.
	 * 
	 * @return String
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * Set password.
	 * 
	 * @param password
	 *            password
	 */
	public final void setPassword(final String password) {
		this.password = password;
	}
}
