package onlinelibrary.interfaces;

import onlinelibrary.objects.User;

public interface SecureLibrary {

	boolean login(User user);

	void logout(User user);

}
