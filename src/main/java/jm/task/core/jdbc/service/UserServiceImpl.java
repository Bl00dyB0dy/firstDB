package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class UserServiceImpl extends Util implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {
        userDao.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) throws SQLException {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        System.out.printf("%-3s\t%-10s\t%-10s\t%-3s%n", "id", "name", "lastName", "age");
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDao.cleanUsersTable();
    }
}
