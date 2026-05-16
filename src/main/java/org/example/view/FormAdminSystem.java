package org.example.view;

import javax.swing.*;
import java.awt.*;

public class FormAdminSystem extends JFrame {
    private JButton btnAddUser;
    private JButton btnLogout;
    
    public FormAdminSystem() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void initComponents() {
        setTitle("Администратор системы");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Создаём панель с GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        // Заголовок
        JLabel lblTitle = new JLabel("Панель администратора системы");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitle, gbc);
        
        // Кнопка "Добавить пользователя"
        btnAddUser = new JButton("Добавить пользователя");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(btnAddUser, gbc);
        
        // Кнопка "Выйти"
        btnLogout = new JButton("Выйти");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(btnLogout, gbc);
        
        add(panel);
        pack();
    }
    
    // Геттеры для кнопок
    public JButton getBtnAddUser() { return btnAddUser; }
    public JButton getBtnLogout() { return btnLogout; }
    
    // Метод для добавления обработчиков (вызвать после создания окна)
    public void addEventHandlers() {
    btnAddUser.addActionListener(e -> {
        // TODO: открыть форму добавления пользователя
        JOptionPane.showMessageDialog(this, 
            "Добавление пользователя (будет позже)", 
            "Информация", 
            JOptionPane.INFORMATION_MESSAGE);
    });
    
    btnLogout.addActionListener(e -> {
        this.dispose();
        new FormLogin().setVisible(true);
    });
}
}