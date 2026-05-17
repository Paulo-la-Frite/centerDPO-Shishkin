package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/dpo_shishkin";

    private static final String USER = "postgres";

    private static final String PASSWORD = "2517Katya!";

    public static Connection getConnection() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Подключение к БД успешно!");

        } catch (SQLException e) {

            System.out.println("Ошибка подключения к БД!");

            e.printStackTrace();
        }

        return connection;
    }
}