package ua.lviv.desctop.service;

import ua.lviv.desctop.domain.User;
import ua.lviv.desctop.shared.AbstractCRUD;

public interface UserService extends AbstractCRUD<User> {
	User getUserByEmail(String email);
}
