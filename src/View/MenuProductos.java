
package View;

import Model.Usuario;
import Model.tablaMenu;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class MenuProductos extends javax.swing.JFrame {
    static String nom;
    Login login = new Login();
    
    public MenuProductos(String nombre) {
        initComponents();
        nom = nombre;
        nameUser.setText(nom);
        propiedadesTabla();
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(962, 621));
    }
    
    private void propiedadesTabla() {
        // Usamos object para manipular mejor los Labels
        String space = "           ";
        String spacePrice = "                      ";
        tabla.setDefaultRenderer(Object.class, new tablaMenu());
        String titles [] = {spacePrice+space+"Nombre",spacePrice+space+"Precio",spacePrice+space+"Ilustración",};
        DefaultTableModel table = new DefaultTableModel(null,titles);
        table.addRow(new Object[]{space+"Ceviche Pescado",spacePrice+"2500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/ceviche2.jpg")))});
        table.addRow(new Object[]{space+"Ceviche Pulpo",spacePrice+"3500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/pulpo1.jpg")))});
        table.addRow(new Object[]{space+"Ceviche Mixto",spacePrice+"6000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/mixto1.jpg")))});
        table.addRow(new Object[]{space+"Ensalada Cesar",spacePrice+"1500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/cesar3.jpg")))});
        table.addRow(new Object[]{space+"Ensalada Lechuga",spacePrice+"1500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/lechuga3.jpg")))});
        table.addRow(new Object[]{space+"Corte New York Steak",spacePrice+"18000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/NewYork3.jpg")))});
        table.addRow(new Object[]{space+"Corte Tomahawk",spacePrice+"20000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/tomahack4.jpg")))});
        table.addRow(new Object[]{space+"Corte Cow Boy",spacePrice+"20000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/Cowboy1.jpg")))});
        table.addRow(new Object[]{space+"Corte Entraña",spacePrice+"22000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/entraña1.jpg")))});
        table.addRow(new Object[]{space+"Cerveza",spacePrice+"1500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/cerveza1.jpg")))});
        table.addRow(new Object[]{space+"Tragos",spacePrice+"3000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/tragos1.jpg")))});
        table.addRow(new Object[]{space+"Gaseosas",spacePrice+"1000 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/gaseosas1.jpg")))});
        table.addRow(new Object[]{space+"Naturales",spacePrice+"1500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/naturales1.jpg")))});
        table.addRow(new Object[]{space+"Helado",spacePrice+"1500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/helado1.jpg")))});
        table.addRow(new Object[]{space+"Cheescake",spacePrice+"2500 ₡",new JLabel(new ImageIcon(getClass().getResource("/Images/Cheescake1.jpg")))});
        tabla.setRowHeight(160);
        tabla.setModel(table);
    }
    
    
     public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        logoGrande = new javax.swing.JLabel();
        nameUser = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        onlineText = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JButton();
        buttonOrdenar = new javax.swing.JButton();
        buttonMiCuenta = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        logoSalir = new javax.swing.JLabel();
        panelProductosMenu = new javax.swing.JPanel();
        productosTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(36, 47, 65));

        logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoPequeño.png"))); // NOI18N

        nameUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nameUser.setForeground(new java.awt.Color(255, 255, 255));
        nameUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/online (2).png"))); // NOI18N

        onlineText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        onlineText.setForeground(new java.awt.Color(255, 255, 255));
        onlineText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onlineText.setText("Online");

        panelPrincipal.setBackground(new java.awt.Color(36, 47, 65));
        panelPrincipal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setText("Principal");
        panelPrincipal.setBorderPainted(false);
        panelPrincipal.setContentAreaFilled(false);
        panelPrincipal.setDefaultCapable(false);
        panelPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPrincipalActionPerformed(evt);
            }
        });

        buttonOrdenar.setBackground(new java.awt.Color(36, 47, 65));
        buttonOrdenar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        buttonOrdenar.setText("Ordenar");
        buttonOrdenar.setBorderPainted(false);
        buttonOrdenar.setContentAreaFilled(false);
        buttonOrdenar.setDefaultCapable(false);
        buttonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrdenarActionPerformed(evt);
            }
        });

        buttonMiCuenta.setBackground(new java.awt.Color(36, 47, 65));
        buttonMiCuenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMiCuenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonMiCuenta.setText("Factura");
        buttonMiCuenta.setBorderPainted(false);
        buttonMiCuenta.setContentAreaFilled(false);
        buttonMiCuenta.setDefaultCapable(false);
        buttonMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMiCuentaActionPerformed(evt);
            }
        });

        buttonCerrarSesion.setBackground(new java.awt.Color(36, 47, 65));
        buttonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        buttonCerrarSesion.setText("Cerrar Sesión");
        buttonCerrarSesion.setBorderPainted(false);
        buttonCerrarSesion.setContentAreaFilled(false);
        buttonCerrarSesion.setDefaultCapable(false);
        buttonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarSesionActionPerformed(evt);
            }
        });

        logoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (2).png"))); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(logoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(panelPrincipal)
                .addGap(51, 51, 51)
                .addComponent(buttonOrdenar)
                .addGap(39, 39, 39)
                .addComponent(buttonMiCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(panelPrincipal)
                            .addComponent(buttonOrdenar)
                            .addComponent(buttonMiCuenta)
                            .addComponent(buttonCerrarSesion))
                        .addContainerGap())
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelProductosMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelProductosMenu.setForeground(new java.awt.Color(0, 0, 0));

        productosTitle.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        productosTitle.setForeground(new java.awt.Color(36, 47, 65));
        productosTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productosTitle.setText("Menú Disponible");

        jSeparator2.setForeground(java.awt.Color.gray);

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(36, 47, 65));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Ilustración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setRowSelectionAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(90);
        }

        javax.swing.GroupLayout panelProductosMenuLayout = new javax.swing.GroupLayout(panelProductosMenu);
        panelProductosMenu.setLayout(panelProductosMenuLayout);
        panelProductosMenuLayout.setHorizontalGroup(
            panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelProductosMenuLayout.createSequentialGroup()
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(productosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelProductosMenuLayout.setVerticalGroup(
            panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProductosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(panelProductosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void buttonMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMiCuentaActionPerformed

    }//GEN-LAST:event_buttonMiCuentaActionPerformed

    private void buttonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrdenarActionPerformed
        Ordenar ordenar = new Ordenar(nom);
        ordenar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonOrdenarActionPerformed

    private void panelPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPrincipalActionPerformed
        PanelPrincipal principal = new PanelPrincipal(nom);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_panelPrincipalActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        propiedadesTabla();
    }//GEN-LAST:event_tablaMouseClicked

   
    
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
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProductos(nom).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonMiCuenta;
    private javax.swing.JButton buttonOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoGrande;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel onlineText;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JButton panelPrincipal;
    private javax.swing.JPanel panelProductosMenu;
    private javax.swing.JLabel productosTitle;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
