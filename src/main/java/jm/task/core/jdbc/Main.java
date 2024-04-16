package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Alice", "Earl", (byte) 20);
        userDao.saveUser("Bob", "Feek", (byte) 25);
        userDao.saveUser("Clarie", "Garrad", (byte) 31);
        userDao.saveUser("Dan", "Hale", (byte) 38);

        userDao.createUsersTable();

        userDao.removeUserById(5);

        System.out.println();
        userDao.getAllUsers();

        userDao.cleanUsersTable();

        userDao.dropUsersTable();

    }
}
