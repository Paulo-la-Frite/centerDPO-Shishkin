/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.view;

import javax.swing.JOptionPane;

/**
 *
 * @author pavel
 */
public class FormAddProgram extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(FormAddProgram.class.getName());

    /**
     * Creates new form FormAddProgram
     */
    public FormAddProgram() {

        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        txtProgramId = new javax.swing.JTextField();
        txtProgramName = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Добавление программы обучения");

        jLabel1.setText("ID программы:");

        jLabel2.setText("Название программы:");

        jLabel3.setText("Длительность (мес):");

        jLabel4.setText("Описание:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);

        jScrollPane1.setViewportView(txtDescription);

        btnSave.setText("Сохранить");
        btnSave.addActionListener(this::btnSaveActionPerformed);

        btnCancel.setText("Отмена");
        btnCancel.addActionListener(this::btnCancelActionPerformed);

        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()

                                .addGap(30, 30, 30)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(txtProgramId)
                                        .addComponent(txtProgramName)
                                        .addComponent(txtDuration)
                                        .addComponent(jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                250,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addGroup(layout.createSequentialGroup()

                                                .addComponent(btnSave)

                                                .addGap(18, 18, 18)

                                                .addComponent(btnCancel)))

                                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()

                                .addGap(20, 20, 20)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtProgramId,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtProgramName,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtDuration,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(25, 25, 25)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave)
                                        .addComponent(btnCancel))

                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {

        String programId = txtProgramId.getText();
        String programName = txtProgramName.getText();
        String duration = txtDuration.getText();

        if (programId.trim().isEmpty()
                || programName.trim().isEmpty()
                || duration.trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Заполните все обязательные поля!",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        JOptionPane.showMessageDialog(
                this,
                "Программа успешно сохранена!",
                "Успех",
                JOptionPane.INFORMATION_MESSAGE
        );

        txtProgramId.setText("");
        txtProgramName.setText("");
        txtDuration.setText("");
        txtDescription.setText("");
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();

    }

    public static void main(String args[]) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ReflectiveOperationException |
                 javax.swing.UnsupportedLookAndFeelException ex) {

            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() ->
                new FormAddProgram().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtProgramId;
    private javax.swing.JTextField txtProgramName;
    // End of variables declaration
}