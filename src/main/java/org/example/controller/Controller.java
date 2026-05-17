package org.example.controller;

import org.example.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    // Проверка на пустые поля
    public boolean isEmptyAccept(String login, String password) {

        return login == null || login.trim().isEmpty() ||
                password == null || password.trim().isEmpty();
    }

    // Проверка логина и пароля через PostgreSQL
    // 0 - нет доступа
    // 1 - администратор
    // 2 - пользователь
    // 3 - гость
    public int getAccept(String login, String password) {

        if (isEmptyAccept(login, password)) {
            return 0;
        }

        Connection connection = ConnectionDB.getConnection();

        String sql =
                "SELECT role_id FROM users " +
                        "WHERE login = ? AND password = ?";

        try {

            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql);

            preparedStatement.setString(1, login);

            preparedStatement.setString(2, password);

            ResultSet resultSet =
                    preparedStatement.executeQuery();

            if (resultSet.next()) {

                int roleId = resultSet.getInt("role_id");

                return roleId;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return 0;
    }

    // Валидация данных пользователя
    public String validateUserData(String id,
                                   String lastName,
                                   String firstName,
                                   String phone,
                                   String email) {

        if (id == null || id.trim().isEmpty()) {
            return "ID не может быть пустым";
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            return "Фамилия не может быть пустой";
        }

        if (firstName == null || firstName.trim().isEmpty()) {
            return "Имя не может быть пустым";
        }

        if (phone == null || phone.trim().isEmpty()) {
            return "Телефон не может быть пустым";
        }

        if (email == null || email.trim().isEmpty()) {
            return "Email не может быть пустым";
        }

        if (!email.contains("@")) {
            return "Введите корректный email";
        }

        return null;
    }
}