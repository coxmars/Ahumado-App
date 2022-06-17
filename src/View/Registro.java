
package View;

// Here we import complements

import Model.CifrarPassword;
import Model.SQLUsuario;
import Model.Usuario;
import Model.Validar;
import java.awt.Dimension;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {
    private boolean terms = false, validatePasswd = false, validateEmail = false;
    private int counter = 0,counterName=0,counterPasswd=0,counterEmail=0,counterCard=0;
    private String user = "",passwd = "",email = "",tarjeta = "", newPassword = "";
    private int contLetraMay = 0, contLetraMin = 0, contSignos = 0, contNumero = 0;
    
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension (510, 610));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        nameText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        condiciones = new javax.swing.JCheckBox();
        mail = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        volverInicio = new javax.swing.JButton();
        tarjetaName = new javax.swing.JLabel();
        tarjetaData = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        guardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGeneral.setBackground(new java.awt.Color(36, 47, 65));

        panel2.setBackground(new java.awt.Color(36, 47, 65));

        nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE");

        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("CONTRASEÑA");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        passwordField.setBackground(new java.awt.Color(36, 47, 65));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("jPasswordField1");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        nameText.setBackground(new java.awt.Color(36, 47, 65));
        nameText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setText("Ingrese su nombre completo");
        nameText.setBorder(null);
        nameText.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        nameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextMouseClicked(evt);
            }
        });

        mailText.setBackground(new java.awt.Color(36, 47, 65));
        mailText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mailText.setForeground(new java.awt.Color(255, 255, 255));
        mailText.setText("Digite su correo");
        mailText.setBorder(null);
        mailText.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        mailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextFocusGained(evt);
            }
        });
        mailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextActionPerformed(evt);
            }
        });

        condiciones.setBackground(new java.awt.Color(36, 47, 65));
        condiciones.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        condiciones.setForeground(new java.awt.Color(255, 255, 255));
        condiciones.setText("Estoy de acuerdo con términos y condiciones");
        condiciones.setBorder(null);
        condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionesActionPerformed(evt);
            }
        });

        mail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setText("EMAIL");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        volverInicio.setBackground(new java.awt.Color(255, 255, 255));
        volverInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverInicio.setForeground(new java.awt.Color(0, 0, 0));
        volverInicio.setText("Regresar Inicio");
        volverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverInicioActionPerformed(evt);
            }
        });

        tarjetaName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tarjetaName.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaName.setText("TARJETA");

        tarjetaData.setBackground(new java.awt.Color(36, 47, 65));
        tarjetaData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tarjetaData.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaData.setText("Inserte Tarjeta");
        tarjetaData.setBorder(null);
        tarjetaData.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tarjetaData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tarjetaDataFocusGained(evt);
            }
        });
        tarjetaData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjetaDataMouseClicked(evt);
            }
        });
        tarjetaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaDataActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N

        guardarDatos.setBackground(new java.awt.Color(255, 255, 255));
        guardarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        guardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        guardarDatos.setText("Guardar Datos");
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tarjetaName)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(condiciones)
                    .addComponent(nombre)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tarjetaData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(guardarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverInicio)))
                .addGap(0, 107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tarjetaName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tarjetaData, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(condiciones)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tarjetaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaDataActionPerformed

    private void tarjetaDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tarjetaDataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaDataFocusGained

    private void volverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverInicioActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverInicioActionPerformed

    private void condicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionesActionPerformed
        counter++;
        if (counter % 2 != 0) {
            terms = true;
        }
        else {
            terms = false;
        }
    }//GEN-LAST:event_condicionesActionPerformed

    private void mailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextActionPerformed

    private void mailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFocusGained
        counterEmail++;
        if (counterEmail == 1) {
            mailText.setText(null);
        }
    }//GEN-LAST:event_mailTextFocusGained

    private void nameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextMouseClicked
        counterName++;
        if (counterName == 1) {
            nameText.setText(null);
        }
    }//GEN-LAST:event_nameTextMouseClicked

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        counterPasswd++;
        if (counterPasswd == 1) {
            passwordField.setText(null);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void tarjetaDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaDataMouseClicked
        counterCard++;
        if (counterCard == 1) {
            tarjetaData.setText(null);
        }
    }//GEN-LAST:event_tarjetaDataMouseClicked

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        // Here we import the other classes
        Validar validar = new Validar();
        Usuario usuario = new Usuario();
        SQLUsuario sqlUsuario = new SQLUsuario();
        
        int tamano;
        user = nameText.getText();
        for (int i = 0; i < passwordField.getPassword().length; i++) {
            passwd += passwordField.getPassword()[i];
        }
        email = mailText.getText();
        tarjeta = tarjetaData.getText();
        
        // Here we verify if all data are correct
        if (terms) {
            if (validar.validarPassword(passwd) && validar.validarNombre(user) && validar.validarTarjeta(tarjeta) && validar.validarCorreo(email)) {
                if (sqlUsuario.verificarNombre(user) == 0) {
                    if (sqlUsuario.verificarPassword(newPassword) == 0) {
                        if (sqlUsuario.verificarCorreo(email) == 0) {
                            usuario.setNombre(user);
                            usuario.setContraseña(newPassword);
                            usuario.setCorreo(email);
                            usuario.setTarjeta(tarjeta);
                            if (sqlUsuario.registrar(usuario)) {
                                JOptionPane.showMessageDialog(null, "Excelente, datos guardados correctamente", "Guardando Datos", JOptionPane.INFORMATION_MESSAGE);
                            } 
                            else {
                                JOptionPane.showMessageDialog(null, "Error al registrar usuario", "Error al Registrar", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Error ya existe un usuario con ese correo", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Error ya existe un usuario con esa contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error ya existe un usuario con ese nombre", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos","Error Datos",JOptionPane.ERROR_MESSAGE);
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Error, debe aceptar los términos y condiciones", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarDatosActionPerformed

    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox condiciones;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField mailText;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField tarjetaData;
    private javax.swing.JLabel tarjetaName;
    private javax.swing.JButton volverInicio;
    // End of variables declaration//GEN-END:variables
}
