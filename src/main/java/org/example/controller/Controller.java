package org.example.controller;

public class Controller {
    
    // Проверка на пустые поля
    public boolean isEmptyAccept(String login, String password) {
        return login == null || login.trim().isEmpty() || 
               password == null || password.trim().isEmpty();
    }
    
    // Проверка логина и пароля, возвращает роль
    // 0 - нет доступа
    // 1 - администратор центра
    // 2 - гость
    // 3 - администратор системы
    public int getAccept(String login, String password) {
        // Временная заглушка для тестирования GUI
        // Позже здесь будет подключение к БД
        
        if (isEmptyAccept(login, password)) {
            return 0; // пустые поля
        }
        
        // Тестовые данные
        if (login.equals("admin") && password.equals("123")) {
            return 1; // администратор центра
        }
        
        if (login.equals("guest") && password.equals("guest")) {
            return 2; // гость
        }
        if (login.equals("sysadmin") && password.equals("admin")) {
            return 3; // администратор системы
        }
        
        return 0; // доступ запрещён
    }
    
    // Валидация данных пользователя (для добавления)
    public String validateUserData(String id, String lastName, String firstName, 
                                    String phone, String email) {
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
        return null; // всё правильно
    }
}