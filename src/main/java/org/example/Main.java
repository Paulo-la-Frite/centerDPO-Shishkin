package org.example;

import org.example.view.FormLogin;

public class Main {

    public static void main(String[] args) {

        // Проверка подключения к БД
        ConnectionDB.getConnection();

        // Запуск формы авторизации
        java.awt.EventQueue.invokeLater(() -> {

            new FormLogin().setVisible(true);

        });
    }
}