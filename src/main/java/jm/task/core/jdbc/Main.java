package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Alice", "Earl", (byte) 20);
        user.saveUser("Bob", "Feek", (byte) 25);
        user.saveUser("Clarie", "Garrad", (byte) 31);
        user.saveUser("Dan", "Hale", (byte) 38);

        user.createUsersTable();

        user.removeUserById(5);

        System.out.println();
        user.getAllUsers();

        user.cleanUsersTable();

        user.dropUsersTable();

    }
}
