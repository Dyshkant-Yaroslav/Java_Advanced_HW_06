package ua.lviv.desctop.dao;

import ua.lviv.desctop.domain.User;
import ua.lviv.desctop.shared.AbstractCRUD;

public interface UserDao extends AbstractCRUD<User> {
	User getUserByEmail(String email);
}
