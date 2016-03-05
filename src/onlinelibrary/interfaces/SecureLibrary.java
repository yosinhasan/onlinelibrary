package onlinelibrary.interfaces;

import onlinelibrary.objects.User;

/**
 * Secure library.
 * 
 * @author elpai
 *
 */
public interface SecureLibrary {
	/**
	 * Login.
	 * 
	 * @param user
	 *            user
	 * @return boolean
	 */
	boolean login(User user);

	/**
	 * Logout.
	 * 
	 * @param user
	 *            user
	 */
	void logout(User user);

}
