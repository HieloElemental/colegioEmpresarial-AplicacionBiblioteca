/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Samuel Betancur Diosa
 * @grade 11C
 */
public class Camisa extends javax.swing.JFrame {
    public UsersProvider usersProvider = new UsersProvider(); 

    /**
     * Creates new form Camisa
     */
    public Camisa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        titleSeparator = new javax.swing.JSeparator();
        userLabel = new javax.swing.JLabel();
        adminButton = new javax.swing.JButton();
        studentButton = new javax.swing.JButton();
        userSeparator = new javax.swing.JSeparator();
        userPanel = new javax.swing.JPanel();
        userTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        userSeparator2 = new javax.swing.JSeparator();
        addBookButton = new javax.swing.JButton();
        addBookPanel = new javax.swing.JPanel();
        addBookTitleLabel = new javax.swing.JLabel();
        addBookNameLabel = new javax.swing.JLabel();
        addBookNameField = new javax.swing.JTextField();
        addBookAuthorLabel = new javax.swing.JLabel();
        addBookAuthorField = new javax.swing.JTextField();
        addUserButton = new javax.swing.JButton();
        addUserPanel = new javax.swing.JPanel();
        addUserTitleLabel = new javax.swing.JLabel();
        addUserUsernameLabel = new javax.swing.JLabel();
        addUserUsernameField = new javax.swing.JTextField();
        addUserPasswordLabel = new javax.swing.JLabel();
        addUserPasswordField = new javax.swing.JPasswordField();
        addUserTypeLabel = new javax.swing.JLabel();
        addUserTypeComboBox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bookSelectPanel = new javax.swing.JPanel();
        bookSelectLabel = new javax.swing.JLabel();
        bookSelectComboBox = new javax.swing.JComboBox<>();
        bookSelectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("COLEGIO EMPRESARIAL");

        userLabel.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuario:");

        adminButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        adminButton.setText("Administrador");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        studentButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        studentButton.setText("Estudiante");

        userPanel.setBackground(new java.awt.Color(0, 102, 102));
        userPanel.setForeground(new java.awt.Color(0, 102, 102));

        userTypeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        userTypeLabel.setText("Administrador");

        usernameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Usuario:");

        usernameTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Contraseña:");

        passwordPasswordField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userTypeLabel)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordPasswordField)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 186, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(userTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        addBookButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addBookButton.setText("Agregar Libros");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        addBookTitleLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addBookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookTitleLabel.setText("Agregar Libro");

        addBookNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addBookNameLabel.setText("Nombre:");

        addBookNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        addBookAuthorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addBookAuthorLabel.setText("Contraseña:");

        addBookAuthorField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBookAuthorLabel)
                            .addComponent(addBookNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBookNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(addBookAuthorField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                .addContainerGap())
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookNameLabel)
                    .addComponent(addBookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookAuthorLabel)
                    .addComponent(addBookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addUserButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addUserButton.setText("Agregar Estudiantes");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addUserTitleLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addUserTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addUserTitleLabel.setText("Agregar Usuario");

        addUserUsernameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addUserUsernameLabel.setText("Nombre:");

        addUserUsernameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        addUserPasswordLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addUserPasswordLabel.setText("Contraseña:");

        addUserPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        addUserTypeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addUserTypeLabel.setText("Tipo:");

        addUserTypeComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addUserTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Student" }));

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUserTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserPasswordLabel)
                            .addComponent(addUserUsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addUserTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserUsernameField)
                            .addComponent(addUserPasswordField)
                            .addComponent(addUserTypeComboBox, 0, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserUsernameLabel)
                    .addComponent(addUserUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserPasswordLabel)
                    .addComponent(addUserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUserTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/librarybg.jpg"))); // NOI18N

        bookSelectLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bookSelectLabel.setText("Libros:");

        bookSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bookSelectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSelectComboBoxActionPerformed(evt);
            }
        });

        bookSelectButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bookSelectButton.setText("Reservar!");

        javax.swing.GroupLayout bookSelectPanelLayout = new javax.swing.GroupLayout(bookSelectPanel);
        bookSelectPanel.setLayout(bookSelectPanelLayout);
        bookSelectPanelLayout.setHorizontalGroup(
            bookSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookSelectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookSelectPanelLayout.createSequentialGroup()
                        .addComponent(bookSelectLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(bookSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookSelectButton))
                .addContainerGap())
        );
        bookSelectPanelLayout.setVerticalGroup(
            bookSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookSelectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookSelectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookSelectButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(userLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(adminButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentButton))
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBookButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addUserButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(addUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(userSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(userSeparator)
                            .addComponent(titleSeparator, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookSelectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)))
                .addComponent(imageLabel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(titleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentButton)
                    .addComponent(adminButton)
                    .addComponent(userLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookButton)
                    .addComponent(addUserButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookSelectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verifyLogin(boolean isAdmin){
        User gettedUser = usersProvider.login(usernameTextField.getText(), passwordPasswordField.getText());
        if(gettedUser == null){
            return false;
        }
        if(!isAdmin){
            return true;
        }
        return gettedUser.getRole().equals("Administrator");
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(this.getBackground());
        addBookButton.setVisible(false);
        addBookPanel.setVisible(false);
        addUserButton.setVisible(false);
        addUserPanel.setVisible(false);
        bookSelectPanel.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void bookSelectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSelectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookSelectComboBoxActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        if(verifyLogin(true)){
            addBookButton.setVisible(true);
            addBookPanel.setVisible(true);
            addUserButton.setVisible(true);
            addUserPanel.setVisible(true);
            bookSelectPanel.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Error de credenciales");
        }
    }//GEN-LAST:event_adminButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        if(verifyLogin(false)){
            addBookButton.setVisible(false);
            addBookPanel.setVisible(false);
            addUserButton.setVisible(false);
            addUserPanel.setVisible(false);
            bookSelectPanel.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Error de credenciales");
        }
    }//GEN-LAST:event_addUserButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Camisa().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addBookAuthorField;
    private javax.swing.JLabel addBookAuthorLabel;
    private javax.swing.JButton addBookButton;
    private javax.swing.JTextField addBookNameField;
    private javax.swing.JLabel addBookNameLabel;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JLabel addBookTitleLabel;
    private javax.swing.JButton addUserButton;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JPasswordField addUserPasswordField;
    private javax.swing.JLabel addUserPasswordLabel;
    private javax.swing.JLabel addUserTitleLabel;
    private javax.swing.JComboBox<String> addUserTypeComboBox;
    private javax.swing.JLabel addUserTypeLabel;
    private javax.swing.JTextField addUserUsernameField;
    private javax.swing.JLabel addUserUsernameLabel;
    private javax.swing.JButton adminButton;
    private javax.swing.JButton bookSelectButton;
    private javax.swing.JComboBox<String> bookSelectComboBox;
    private javax.swing.JLabel bookSelectLabel;
    private javax.swing.JPanel bookSelectPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JButton studentButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JSeparator titleSeparator;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JSeparator userSeparator2;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
