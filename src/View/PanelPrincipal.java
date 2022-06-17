
package View;

import Model.Usuario;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PanelPrincipal extends javax.swing.JFrame {
    public String nom;
    Usuario usuario;
    Login login = new Login();
    private int contador;
    
    private final String facebook = "https://www.facebook.com/";
    private final String twitter = "https://twitter.com/";
    private final String instagram = "https://www.instagram.com/";
    
    public PanelPrincipal() {
        initComponents();
    }

    public PanelPrincipal(Usuario usuario,String nombre){
        initComponents();
        nom = nombre;
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(962, 621));
        this.usuario = usuario;
        nameUser.setText(usuario.getNombre());
    }
    
    public PanelPrincipal(String nombre){
        initComponents();
        nom = nombre;
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(962, 621));
        nameUser.setText(nom);
    }
    
     public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
    private void abrirFacebook() {
        try {
            Desktop.getDesktop().browse(new URI(facebook));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void abrirTwitter() {
        try {
            Desktop.getDesktop().browse(new URI(twitter));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void abrirInstagram() {
        try {
            Desktop.getDesktop().browse(new URI(instagram));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        logoGrande = new javax.swing.JLabel();
        buttonMenu = new javax.swing.JButton();
        buttonOrdenar = new javax.swing.JButton();
        buttonMiCuenta = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        logoSalir = new javax.swing.JLabel();
        panelPromociones = new javax.swing.JPanel();
        promocionesTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imagePromo = new javax.swing.JLabel();
        titlePromotion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonInstagram = new javax.swing.JButton();
        buttonTwitter = new javax.swing.JButton();
        buttonFacebook = new javax.swing.JButton();
        panelProductosMenu = new javax.swing.JPanel();
        productosTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ceviche = new javax.swing.JLabel();
        cevicheText = new javax.swing.JLabel();
        botonIrMenu = new javax.swing.JLabel();
        carnes = new javax.swing.JLabel();
        CarneText = new javax.swing.JLabel();
        botonIrMenu1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnsaladasText = new javax.swing.JLabel();
        botonIrMenu2 = new javax.swing.JLabel();
        onlineText = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nameUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(36, 47, 65));

        logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoPequeño.png"))); // NOI18N

        buttonMenu.setBackground(new java.awt.Color(36, 47, 65));
        buttonMenu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Menú");
        buttonMenu.setBorderPainted(false);
        buttonMenu.setContentAreaFilled(false);
        buttonMenu.setDefaultCapable(false);
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
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
                .addGap(98, 98, 98)
                .addComponent(buttonMenu)
                .addGap(84, 84, 84)
                .addComponent(buttonOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMiCuenta)
                .addGap(81, 81, 81)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMenu)
                    .addComponent(buttonOrdenar)
                    .addComponent(buttonMiCuenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(logoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(buttonCerrarSesion)
                        .addGap(31, 31, 31))))
        );

        panelPromociones.setBackground(new java.awt.Color(255, 255, 255));
        panelPromociones.setForeground(new java.awt.Color(0, 0, 0));

        promocionesTitle.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        promocionesTitle.setForeground(new java.awt.Color(36, 47, 65));
        promocionesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        promocionesTitle.setText("Promociones");

        jSeparator1.setForeground(java.awt.Color.gray);

        imagePromo.setForeground(new java.awt.Color(0, 0, 0));
        imagePromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PromocionFinal.png"))); // NOI18N

        titlePromotion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        titlePromotion.setForeground(new java.awt.Color(36, 47, 65));
        titlePromotion.setText("* Descuento en tomahawks, aplican restricciones");

        javax.swing.GroupLayout panelPromocionesLayout = new javax.swing.GroupLayout(panelPromociones);
        panelPromociones.setLayout(panelPromocionesLayout);
        panelPromocionesLayout.setHorizontalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPromocionesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(promocionesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagePromo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addComponent(titlePromotion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPromocionesLayout.setVerticalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(promocionesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(imagePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titlePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 47, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEGUINOS EN REDES SOCIALES");

        buttonInstagram.setBackground(new java.awt.Color(255, 255, 255));
        buttonInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram (2).png"))); // NOI18N
        buttonInstagram.setBorder(null);
        buttonInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstagramActionPerformed(evt);
            }
        });

        buttonTwitter.setBackground(new java.awt.Color(255, 255, 255));
        buttonTwitter.setForeground(new java.awt.Color(255, 255, 255));
        buttonTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gorjeo (2).png"))); // NOI18N
        buttonTwitter.setBorder(null);
        buttonTwitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwitterActionPerformed(evt);
            }
        });

        buttonFacebook.setBackground(new java.awt.Color(255, 255, 255));
        buttonFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facebook (2).png"))); // NOI18N
        buttonFacebook.setBorder(null);
        buttonFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFacebookActionPerformed(evt);
            }
        });

        panelProductosMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelProductosMenu.setForeground(new java.awt.Color(0, 0, 0));

        productosTitle.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        productosTitle.setForeground(new java.awt.Color(36, 47, 65));
        productosTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productosTitle.setText("Menú");

        jSeparator2.setForeground(java.awt.Color.gray);

        ceviche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ceviche1.jpg"))); // NOI18N

        cevicheText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cevicheText.setForeground(new java.awt.Color(36, 47, 65));
        cevicheText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cevicheText.setText("Variedad de Ceviches");

        botonIrMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proximo (1).png"))); // NOI18N
        botonIrMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIrMenuMouseClicked(evt);
            }
        });

        carnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cortes (1).jpg"))); // NOI18N

        CarneText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CarneText.setForeground(new java.awt.Color(36, 47, 65));
        CarneText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CarneText.setText("Cortes de Carne");

        botonIrMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proximo (1).png"))); // NOI18N
        botonIrMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIrMenu1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ensalada (1).jpg"))); // NOI18N

        EnsaladasText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        EnsaladasText.setForeground(new java.awt.Color(36, 47, 65));
        EnsaladasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnsaladasText.setText("Ensaladas");

        botonIrMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proximo (1).png"))); // NOI18N
        botonIrMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIrMenu2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProductosMenuLayout = new javax.swing.GroupLayout(panelProductosMenu);
        panelProductosMenu.setLayout(panelProductosMenuLayout);
        panelProductosMenuLayout.setHorizontalGroup(
            panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelProductosMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(productosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProductosMenuLayout.createSequentialGroup()
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carnes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ceviche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cevicheText, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(CarneText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnsaladasText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonIrMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIrMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIrMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        panelProductosMenuLayout.setVerticalGroup(
            panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ceviche, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cevicheText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonIrMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(carnes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonIrMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CarneText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosMenuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelProductosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIrMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnsaladasText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        onlineText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        onlineText.setForeground(new java.awt.Color(36, 47, 65));
        onlineText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onlineText.setText("Online");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/online (2).png"))); // NOI18N

        nameUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nameUser.setForeground(new java.awt.Color(36, 47, 65));
        nameUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(buttonTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(buttonFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panelProductosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(panelPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelProductosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(onlineText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFacebookActionPerformed
        abrirFacebook();
    }//GEN-LAST:event_buttonFacebookActionPerformed

    private void buttonTwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwitterActionPerformed
        abrirTwitter();
    }//GEN-LAST:event_buttonTwitterActionPerformed

    private void buttonInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstagramActionPerformed
        abrirInstagram();
    }//GEN-LAST:event_buttonInstagramActionPerformed

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

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        MenuProductos menu = new MenuProductos(nom);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void botonIrMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIrMenuMouseClicked
        MenuProductos menu = new MenuProductos(nom);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrMenuMouseClicked

    private void botonIrMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIrMenu1MouseClicked
        MenuProductos menu = new MenuProductos(nom);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrMenu1MouseClicked

    private void botonIrMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIrMenu2MouseClicked
        MenuProductos menu = new MenuProductos(nom);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrMenu2MouseClicked

   
    
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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarneText;
    private javax.swing.JLabel EnsaladasText;
    private javax.swing.JLabel botonIrMenu;
    private javax.swing.JLabel botonIrMenu1;
    private javax.swing.JLabel botonIrMenu2;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonFacebook;
    private javax.swing.JButton buttonInstagram;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonMiCuenta;
    private javax.swing.JButton buttonOrdenar;
    private javax.swing.JButton buttonTwitter;
    private javax.swing.JLabel carnes;
    private javax.swing.JLabel ceviche;
    private javax.swing.JLabel cevicheText;
    private javax.swing.JLabel imagePromo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoGrande;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel onlineText;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProductosMenu;
    private javax.swing.JPanel panelPromociones;
    private javax.swing.JLabel productosTitle;
    private javax.swing.JLabel promocionesTitle;
    private javax.swing.JLabel titlePromotion;
    // End of variables declaration//GEN-END:variables
}
