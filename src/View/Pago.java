package View;

import Model.CrearArchivos;
import javax.swing.DefaultComboBoxModel;
import Model.Validar;
import javax.swing.table.DefaultTableModel;
import Model.Factura;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pago extends javax.swing.JFrame {
    private DefaultComboBoxModel <Factura> model = new DefaultComboBoxModel <Factura>();
    // We go to the comboBoxModel, in code and parameter we change String for Persona
    private DefaultTableModel tableModel = new DefaultTableModel();
    private String cantidad, nom,expiracion,nombre,tarjeta,code;
    private int counterName,counterSecurity,counterCard,counterDate;
    private String cripto,red,direccion,metodoPago;
    private String ordenCompra,totalAbsoluto;
    private int contador;
    CrearArchivos archivos = new CrearArchivos();
    
    public Pago() {
        fillModel(); // This is the method we created
        addTableModel(); // This is the method we created for the table
        initComponents();
        setLocationRelativeTo(null); // This is to put the window in center
        buttonGroup.add(checkTarjetas);
        buttonGroup.add(checkCriptos);
    }
    
    public Pago (String nom,String ordenCompra, String totalAbsoluto) {
        this.nom = nom;
        this.ordenCompra = ordenCompra;
        this.totalAbsoluto = totalAbsoluto;
        initComponents();
        setLocationRelativeTo(null); // This is to put the window in center
        buttonGroup.add(checkTarjetas);
        buttonGroup.add(checkCriptos);
    }

    // To put changes, go to window, in the comboboxmodel, in model, we put custom code and we add model or the name of 
    // the reference we use for the object DefaultComboBoxModel
    private void fillModel() {
        // Obtener cantidad del spiner
        cantidad = "0";
        //cantidad = String.valueOf(spiner.getValue().toString());
        
        
        // Here we put the data in a manual way, find other method with arrays, loops or other things
        model.addElement(new Factura("Ceviche Pescado","2500",cantidad));
        model.addElement(new Factura("Ceviche Pulpo","3500",cantidad));
        model.addElement(new Factura("Ceviche Mixto","6000",cantidad));
        model.addElement(new Factura("Ensalada Cesar","1500",cantidad));
        model.addElement(new Factura("Ensalada Lechuga","1500",cantidad));
        model.addElement(new Factura("Corte New York Steak","18000",cantidad));
        model.addElement(new Factura("Corte Tomahawk","20000",cantidad));
        model.addElement(new Factura("Corte Cow Boy","20000",cantidad));
        model.addElement(new Factura("Corte Entraña","20000",cantidad));
        model.addElement(new Factura("Cerveza","1500",cantidad));
        model.addElement(new Factura("Tragos","3000",cantidad));
        model.addElement(new Factura("Gaseosas","1000",cantidad));
        model.addElement(new Factura("Naturales","1500",cantidad));
        model.addElement(new Factura("Helado","1500",cantidad));
        model.addElement(new Factura("Cheescake","2500",cantidad));
    }
    
    // To put changes, go to window, in the table, in model, we put custom code and we add tableModel or the name of 
    // the reference we use for the object DefaultTableModel, to put all data into the table we have to go on table, go
    // to code and in Post-init-code we add the code we want
    private void addTableModel() {
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Precio");
        tableModel.addColumn("Cantidad");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        titleOrder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoGrande = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        principal = new javax.swing.JLabel();
        facturaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrarSesionLabel = new javax.swing.JLabel();
        checkTarjetas = new javax.swing.JCheckBox();
        checkCriptos = new javax.swing.JCheckBox();
        visaImage = new javax.swing.JLabel();
        mastercardImage = new javax.swing.JLabel();
        bitcoinImage = new javax.swing.JLabel();
        ethereumImage = new javax.swing.JLabel();
        titleOrder2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        securityField = new javax.swing.JLabel();
        seguridadText = new javax.swing.JTextField();
        simboloSeguridad = new javax.swing.JLabel();
        titleOrder3 = new javax.swing.JLabel();
        titleOrder4 = new javax.swing.JLabel();
        selectCrypto = new javax.swing.JComboBox<>();
        moneda = new javax.swing.JLabel();
        moneda1 = new javax.swing.JLabel();
        simboloCripto = new javax.swing.JLabel();
        moneda2 = new javax.swing.JLabel();
        moneda3 = new javax.swing.JLabel();
        selectNetwork = new javax.swing.JComboBox<>();
        moneda4 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        simboloSeguridad2 = new javax.swing.JLabel();
        simboloSeguridad3 = new javax.swing.JLabel();
        buttonPayCard = new javax.swing.JButton();
        buttonPayCryptos = new javax.swing.JButton();
        separator1 = new javax.swing.JSeparator();
        expiracionField = new javax.swing.JFormattedTextField();
        tarjetaField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        titleOrder.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder.setText("SELECCIONE SU MÉTODO DE PAGO");

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoPequeño.png"))); // NOI18N

        menuLabel.setBackground(new java.awt.Color(36, 47, 65));
        menuLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("Menu");
        menuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabelMouseClicked(evt);
            }
        });

        principal.setBackground(new java.awt.Color(36, 47, 65));
        principal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principal.setText("Principal");
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalMouseClicked(evt);
            }
        });

        facturaLabel.setBackground(new java.awt.Color(36, 47, 65));
        facturaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        facturaLabel.setForeground(new java.awt.Color(255, 255, 255));
        facturaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturaLabel.setText("Factura");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (2).png"))); // NOI18N

        cerrarSesionLabel.setBackground(new java.awt.Color(36, 47, 65));
        cerrarSesionLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cerrarSesionLabel.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesionLabel.setText("Cerrar Sesión");
        cerrarSesionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logoGrande)
                .addGap(89, 89, 89)
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(facturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerrarSesionLabel)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoGrande))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cerrarSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTarjetasActionPerformed(evt);
            }
        });

        visaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Visa (1).png"))); // NOI18N

        mastercardImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mastercard (1).png"))); // NOI18N

        bitcoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_48px (2).png"))); // NOI18N

        ethereumImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eth (1).png"))); // NOI18N

        titleOrder2.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder2.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder2.setText("NOMBRE");

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText("Ingrese su nombre completo");
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        securityField.setBackground(new java.awt.Color(36, 47, 65));
        securityField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        securityField.setForeground(new java.awt.Color(36, 47, 65));
        securityField.setText("CÓDIGO SEGURIDAD");

        seguridadText.setBackground(new java.awt.Color(255, 255, 255));
        seguridadText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        seguridadText.setForeground(new java.awt.Color(102, 102, 102));
        seguridadText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seguridadText.setText("CVV*");
        seguridadText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        seguridadText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguridadTextMouseClicked(evt);
            }
        });
        seguridadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguridadTextActionPerformed(evt);
            }
        });

        simboloSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info (1).png"))); // NOI18N
        simboloSeguridad.setToolTipText("Revisar dorso de la tarjeta");

        titleOrder3.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder3.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder3.setText("NÚMERO TARJETA");

        titleOrder4.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder4.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder4.setText("FECHA EXPIRACIÓN");

        selectCrypto.setBackground(new java.awt.Color(255, 255, 255));
        selectCrypto.setForeground(new java.awt.Color(102, 102, 102));
        selectCrypto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin (BTC)", "Ethereum (ETH)" }));
        selectCrypto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        selectCrypto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCryptoActionPerformed(evt);
            }
        });

        moneda.setBackground(new java.awt.Color(36, 47, 65));
        moneda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        moneda.setForeground(new java.awt.Color(36, 47, 65));
        moneda.setText("MONEDA");

        moneda1.setBackground(new java.awt.Color(36, 47, 65));
        moneda1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        moneda1.setForeground(new java.awt.Color(36, 47, 65));
        moneda1.setText("SELECCIONAR MONEDA");

        simboloCripto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btc.png"))); // NOI18N

        moneda2.setBackground(new java.awt.Color(36, 47, 65));
        moneda2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        moneda2.setForeground(new java.awt.Color(36, 47, 65));
        moneda2.setText("DEPOSITAR A");

        moneda3.setBackground(new java.awt.Color(36, 47, 65));
        moneda3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        moneda3.setForeground(new java.awt.Color(36, 47, 65));
        moneda3.setText("RED");

        selectNetwork.setBackground(new java.awt.Color(255, 255, 255));
        selectNetwork.setForeground(new java.awt.Color(102, 102, 102));
        selectNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin (BTC)", "Ethereum (ERC20)" }));
        selectNetwork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        selectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNetworkActionPerformed(evt);
            }
        });

        moneda4.setBackground(new java.awt.Color(36, 47, 65));
        moneda4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        moneda4.setForeground(new java.awt.Color(36, 47, 65));
        moneda4.setText("DIRECCIÓN");

        direccionField.setEditable(false);
        direccionField.setBackground(new java.awt.Color(255, 255, 255));
        direccionField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        direccionField.setForeground(new java.awt.Color(102, 102, 102));
        direccionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccionField.setText("TDvrvs34APbC2cocVzpyNvWtP1B7BCSevC");
        direccionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        direccionField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionFieldMouseClicked(evt);
            }
        });
        direccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFieldActionPerformed(evt);
            }
        });

        simboloSeguridad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/copy_48px (1).png"))); // NOI18N

        simboloSeguridad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qr_code_48px (1).png"))); // NOI18N

        buttonPayCard.setBackground(new java.awt.Color(0, 102, 0));
        buttonPayCard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonPayCard.setForeground(new java.awt.Color(255, 255, 255));
        buttonPayCard.setText("Pagar");
        buttonPayCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayCardActionPerformed(evt);
            }
        });

        buttonPayCryptos.setBackground(new java.awt.Color(0, 102, 0));
        buttonPayCryptos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonPayCryptos.setForeground(new java.awt.Color(255, 255, 255));
        buttonPayCryptos.setText("Pagar");
        buttonPayCryptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayCryptosActionPerformed(evt);
            }
        });

        expiracionField.setBackground(new java.awt.Color(255, 255, 255));
        expiracionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        expiracionField.setForeground(new java.awt.Color(102, 102, 102));
        try {
            expiracionField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        expiracionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiracionField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        tarjetaField.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tarjetaField.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tarjetaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tarjetaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tarjetaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleOrder))
                .addGap(334, 334, 334))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkTarjetas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkCriptos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ethereumImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bitcoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonPayCryptos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPayCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(visaImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(52, 52, 52)
                                    .addComponent(mastercardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moneda2)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(titleOrder2)
                                                .addComponent(titleOrder3)
                                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(tarjetaField))
                                            .addGap(66, 66, 66)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(securityField)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(seguridadText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(simboloSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(expiracionField, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(titleOrder4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(moneda1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(moneda)
                                            .addGap(146, 146, 146)))
                                    .addComponent(moneda4)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(simboloSeguridad2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(simboloSeguridad3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(simboloCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectCrypto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneda3))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(titleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mastercardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(titleOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(securityField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seguridadText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(simboloSeguridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(visaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(checkTarjetas)))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonPayCard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiracionField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarjetaField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkCriptos)
                        .addGap(75, 75, 75))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ethereumImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bitcoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(moneda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(moneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(selectCrypto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(simboloCripto))
                                .addGap(16, 16, 16)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moneda3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneda2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneda4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPayCryptos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(simboloSeguridad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccionField)
                    .addComponent(simboloSeguridad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
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

    private void checkTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTarjetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTarjetasActionPerformed

    private void menuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseClicked
        MenuProductos menu = new MenuProductos(nom);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLabelMouseClicked

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        counterName++;
        if (counterName == 1) {
            nameField.setText(null);
        }
    }//GEN-LAST:event_nameFieldMouseClicked

    private void seguridadTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguridadTextMouseClicked
       counterSecurity++;
        if (counterSecurity == 1) {
            seguridadText.setText(null);
        } 
    }//GEN-LAST:event_seguridadTextMouseClicked

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void cerrarSesionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLabelMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionLabelMouseClicked

    private void selectCryptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCryptoActionPerformed
        //Pago por BTC
        cripto = (String) selectCrypto.getSelectedItem();
        if (cripto.startsWith("B")) {
            simboloCripto.setIcon(new ImageIcon(getClass().getResource("/Images/btc.png")));
            direccion = "TDvrvs34APbC2cocVzpyNvWtP1B7BCSevC";
            cripto = "Bitcoin (BTC)";
            direccionField.setText(direccion);
        } 
        // Pago por ETH
        else if (cripto.startsWith("E")) {
            simboloCripto.setIcon(new ImageIcon(getClass().getResource("/Images/simbolo.png")));
            direccion = "0x7a022b040a7944ff47f6c2d126048b69";
            cripto = "Ethereum (ETH)";
            direccionField.setText(direccion);
        }
    }//GEN-LAST:event_selectCryptoActionPerformed

    private void selectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNetworkActionPerformed
        //Pago por BTC
        red = (String) selectNetwork.getSelectedItem();
        if (red.startsWith("B")) {
            red = "Bitcoin (BTC)";        } 
        // Pago por ETH
        else if (red.startsWith("E")) {
            red = "Ethereum (ERC20)";
        }
    }//GEN-LAST:event_selectNetworkActionPerformed

    private void direccionFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldMouseClicked

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    public void clearFields() {
        expiracionField.setText(null);
        nameField.setText(null);
        seguridadText.setText(null);
        tarjetaField.setText(null);
    }
    
    public String metodoPagos() {
        // Validar metodo de pago
        if (checkTarjetas.isSelected() == true) {
            metodoPago = "Tarjetas";
        }
        else if (checkCriptos.isSelected() == true) {
            metodoPago = "Criptomonedas";
        }
        return metodoPago;
    }
    
    private void buttonPayCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayCardActionPerformed
        //Instanciamos clase validar
        Validar validar = new Validar();
        expiracion = expiracionField.getText();
        nombre = nameField.getText();
        code = seguridadText.getText();
        tarjeta = tarjetaField.getText();

        try {
            if (metodoPagos().equals("Tarjetas")) {
                if (validar.validarTarjeta(tarjeta) && validar.validarNombre(nombre) && validar.validarCodigo(code) && validar.validarFechaExpiracion(expiracion)) {
                    JOptionPane.showMessageDialog(null, "Pago realizado satisfactoriamente", "Datos Correctos", JOptionPane.INFORMATION_MESSAGE);
                    archivos.menuArchivos(nom, ordenCompra, totalAbsoluto);
                    clearFields(); // Limpiamos los campos
                } else {
                    JOptionPane.showMessageDialog(null, "Error, hay datos incorrectos vuelva a intentarlo", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, asegurese de definir el tipo de pago", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (StringIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar los datos en los campos seleccionados", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, asegurese de ingresar los datos correctamente", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonPayCardActionPerformed

    
    private void buttonPayCryptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayCryptosActionPerformed
        // Validar metodo criptos
        red = (String) selectNetwork.getSelectedItem();
        cripto = (String) selectCrypto.getSelectedItem();
        if (metodoPagos().equals("Criptomonedas")) {
            //Pago por BTC
            if (cripto.startsWith("B") && red.startsWith("B")) {
                JOptionPane.showMessageDialog(null, "Pago realizado satisfactoriamente en BTC", "Transacción BTC", JOptionPane.INFORMATION_MESSAGE);
                archivos.menuArchivos(nom, ordenCompra, totalAbsoluto);
            }
            else if (cripto.startsWith("B") && red.startsWith("E")) {
                JOptionPane.showMessageDialog(null, "Error, asegurese de utilizar la misma red Bitcoin (BTC)", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
            }
            // Pago por ETH
            else if (cripto.startsWith("E") && red.startsWith("E")) {
                JOptionPane.showMessageDialog(null, "Pago ejecutado satisfactoriamente en ETH", "Transacción ETH", JOptionPane.INFORMATION_MESSAGE);
                archivos.menuArchivos(nom, ordenCompra, totalAbsoluto);
            }
            else if (cripto.startsWith("E") && red.startsWith("B")) {
                JOptionPane.showMessageDialog(null, "Error, asegurese de utilizar la misma red Ethereum (ERC20)", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, asegurese de definir el tipo de pago", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonPayCryptosActionPerformed

    private void seguridadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguridadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seguridadTextActionPerformed

    private void principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseClicked
        PanelPrincipal main = new PanelPrincipal();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_principalMouseClicked

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bitcoinImage;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonPayCard;
    private javax.swing.JButton buttonPayCryptos;
    private javax.swing.JLabel cerrarSesionLabel;
    private javax.swing.JCheckBox checkCriptos;
    private javax.swing.JCheckBox checkTarjetas;
    private javax.swing.JTextField direccionField;
    private javax.swing.JLabel ethereumImage;
    private javax.swing.JFormattedTextField expiracionField;
    private javax.swing.JLabel facturaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoGrande;
    private javax.swing.JLabel mastercardImage;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel moneda;
    private javax.swing.JLabel moneda1;
    private javax.swing.JLabel moneda2;
    private javax.swing.JLabel moneda3;
    private javax.swing.JLabel moneda4;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel principal;
    private javax.swing.JLabel securityField;
    private javax.swing.JTextField seguridadText;
    private javax.swing.JComboBox<String> selectCrypto;
    private javax.swing.JComboBox<String> selectNetwork;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JLabel simboloCripto;
    private javax.swing.JLabel simboloSeguridad;
    private javax.swing.JLabel simboloSeguridad2;
    private javax.swing.JLabel simboloSeguridad3;
    private javax.swing.JFormattedTextField tarjetaField;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrder2;
    private javax.swing.JLabel titleOrder3;
    private javax.swing.JLabel titleOrder4;
    private javax.swing.JLabel visaImage;
    // End of variables declaration//GEN-END:variables
}
