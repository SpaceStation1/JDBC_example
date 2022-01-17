package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Util.getMySQLConnection();
        System.out.println("connected");
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan1","Ivanov1",(byte)5);
        userService.saveUser("Ivan2","Ivanov2",(byte)5);
        userService.saveUser("Ivan3","Ivanov3",(byte)5);
        userService.saveUser("Ivan4","Ivanov4",(byte)5);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();






    }
}
