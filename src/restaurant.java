
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AreeshaJiwani
 */
public class restaurant extends javax.swing.JFrame {

    /**
     * Creates new form restaurant
     */
    public restaurant() {
        initComponents();
        zeroAll();
       
        
    }
    
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblD1 = new javax.swing.JLabel();
        lblD2 = new javax.swing.JLabel();
        lblD3 = new javax.swing.JLabel();
        lblD4 = new javax.swing.JLabel();
        lblD5 = new javax.swing.JLabel();
        txtD1 = new javax.swing.JTextField();
        txtD2 = new javax.swing.JTextField();
        txtD3 = new javax.swing.JTextField();
        txtD4 = new javax.swing.JTextField();
        txtD5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTotal = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTax = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtT = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblM1 = new javax.swing.JLabel();
        lblM2 = new javax.swing.JLabel();
        lblM3 = new javax.swing.JLabel();
        lblM4 = new javax.swing.JLabel();
        lblM5 = new javax.swing.JLabel();
        txtM1 = new javax.swing.JTextField();
        txtM2 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        txtM4 = new javax.swing.JTextField();
        txtM5 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        lblMealCost = new javax.swing.JLabel();
        lblDrinkCost = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        txtMeal = new javax.swing.JTextField();
        txtDrink = new javax.swing.JTextField();
        txtTCost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 5));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      RESTAURANT MANAGEMENT SYSTEM");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setText("DRINKS");

        lblD1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblD1.setText("Oreo Milkshake");

        lblD2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblD2.setText("Cappuccino");

        lblD3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblD3.setText("Classic Vanilla");

        lblD4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblD4.setText("Hot Chocolate");

        lblD5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblD5.setText("Chocolate Milk Shake");

        txtD1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtD2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtD3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtD3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtD4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtD4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD4ActionPerformed(evt);
            }
        });

        txtD5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtD5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblD3)
                        .addGap(137, 137, 137)
                        .addComponent(txtD3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblD1)
                        .addGap(164, 164, 164)
                        .addComponent(txtD1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblD2)
                        .addGap(151, 151, 151)
                        .addComponent(txtD2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblD4)
                            .addComponent(lblD5))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtD5)
                            .addComponent(txtD4))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD1)
                    .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD2)
                    .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD3)
                    .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD4)
                    .addComponent(txtD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD5)
                    .addComponent(txtD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 340, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReceipt.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnTotal)
                .addGap(100, 100, 100)
                .addComponent(btnReceipt)
                .addGap(100, 100, 100)
                .addComponent(btnReset)
                .addGap(100, 100, 100)
                .addComponent(btnExit)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 690, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        lblTax.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTax.setText("Tax");

        lblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSubTotal.setText("SubTotal");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTotal.setText("Total");

        txtTax.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTax)
                    .addComponent(lblSubTotal)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtT, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(txtTax, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTax))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubTotal))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 340, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel3.setText("MEALS");

        lblM1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblM1.setText("North Indian Thali");

        lblM2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblM2.setText("South Indian Thali");

        lblM3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblM3.setText("Chicken Legend");

        lblM4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblM4.setText("Chicken Burger Meal");

        lblM5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblM5.setText("Bacon & Cheese Burger");

        txtM1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtM2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtM3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtM3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtM4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtM4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtM5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblM2)
                                .addGap(129, 129, 129)
                                .addComponent(txtM2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblM3)
                                        .addGap(125, 125, 125))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtM1)
                                    .addComponent(txtM3)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblM4)
                                .addGap(85, 85, 85)
                                .addComponent(txtM4))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblM5)
                        .addGap(62, 62, 62)
                        .addComponent(txtM5)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblM1)
                    .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM2)
                    .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM3)
                    .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM4)
                    .addComponent(txtM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM5)
                    .addComponent(txtM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 210));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 280, 430));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 4));

        lblMealCost.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMealCost.setText("Cost of Meal");

        lblDrinkCost.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDrinkCost.setText("Cost of Drinks");

        lblTotalCost.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTotalCost.setText("Total Cost of Items");

        txtMeal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMealActionPerformed(evt);
            }
        });

        txtDrink.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtDrink.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTCost.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalCost)
                    .addComponent(lblDrinkCost)
                    .addComponent(lblMealCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTCost)
                    .addComponent(txtDrink, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(txtMeal))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lblMealCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrinkCost))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCost)
                    .addComponent(txtTCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 340, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 190, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void zeroAll(){
        txtM1.setText("0");
        txtM2.setText("0");
        txtM3.setText("0");
        txtM4.setText("0");
        txtM5.setText("0");
        txtD1.setText("0");
        txtD2.setText("0");
        txtD3.setText("0");
        txtD4.setText("0");
        txtD5.setText("0");
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Restaurant Management System", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION){
        System.exit(0);
        }
        else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtM1.setText("0");
        txtM2.setText("0");
        txtM3.setText("0");
        txtM4.setText("0");
        txtM5.setText("0");
        txtD1.setText("0");
        txtD2.setText("0");
        txtD3.setText("0");
        txtD4.setText("0");
        txtD5.setText("0");
        txtMeal.setText("");
        txtDrink.setText("");
        txtTCost.setText("");
        txtT.setText("");
        txtSubTotal.setText("");
        txtTax.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        double a = Double.parseDouble(txtM1.getText()) * 5;
        double b = Double.parseDouble(txtM2.getText()) * 7;
        double c = Double.parseDouble(txtM3.getText()) * 7;
        double d = Double.parseDouble(txtM4.getText()) * 4;
        double e = Double.parseDouble(txtM5.getText()) * 6;
        
        double f = Double.parseDouble(txtD1.getText())* 3;
        double g = Double.parseDouble(txtD2.getText())* 10;
        double h = Double.parseDouble(txtD3.getText())* 4;
        double i = Double.parseDouble(txtD4.getText())* 7;
        double j = Double.parseDouble(txtD5.getText())* 6;
        
        double mealTotal = a + b + c + d + e;
        double drinkTotal = f + g + h + i + j;
        double totalCost = mealTotal + drinkTotal;
        double tax = totalCost * 0.1;
        double total = tax + totalCost;
        
        txtMeal.setText("₹" + mealTotal);
        txtDrink.setText("₹" + drinkTotal);
        txtTCost.setText("₹" + totalCost);
        txtSubTotal.setText("₹" + totalCost);
        txtTax.setText("₹" + tax);
        txtT.setText("₹" + total);
        
    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMealActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_txtMealActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        // TODO add your handling code here:
        double a = Double.parseDouble(txtM1.getText()) * 5;
        double b = Double.parseDouble(txtM2.getText()) * 7;
        double c = Double.parseDouble(txtM3.getText()) * 7;
        double d = Double.parseDouble(txtM4.getText()) * 4;
        double e = Double.parseDouble(txtM5.getText()) * 6;
        
        double f = Double.parseDouble(txtD1.getText())* 3;
        double g = Double.parseDouble(txtD2.getText())* 10;
        double h = Double.parseDouble(txtD3.getText())* 4;
        double i = Double.parseDouble(txtD4.getText())* 7;
        double j = Double.parseDouble(txtD5.getText())* 6;
        
        double mealTotal = a + b + c + d + e;
        double drinkTotal = f + g + h + i + j;
        double totalCost = mealTotal + drinkTotal;
        double tax = totalCost * 0.1;
        double total = tax + totalCost;
        int reference = 1235 + (int) (Math.random()*4238);
        
        
        Date date = new Date();
        
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(date);
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        Tdate.format(date);
        
        
        txtArea.setText("   Restaurant Management System\n\n");
        txtArea.setText(txtArea.getText() + "Reference: " + reference + "\n");
        txtArea.setText(txtArea.getText() + "**********************************\n");
        txtArea.setText(txtArea.getText() + "Meals:           ₹" + mealTotal + "\n\n");
        txtArea.setText(txtArea.getText() + "Drinks:          ₹" + drinkTotal + "\n\n");
        txtArea.setText(txtArea.getText() + "Cost of items:   ₹" + totalCost + "\n");
        txtArea.setText(txtArea.getText() + "**********************************\n");
        txtArea.setText(txtArea.getText() + "Tax:             ₹" + tax + "\n\n");
        txtArea.setText(txtArea.getText() + "SubTotal:        ₹" + totalCost + "\n\n");
        txtArea.setText(txtArea.getText() + "Total:           ₹" + total + "\n");
        txtArea.setText(txtArea.getText() + "**********************************\n\n");
        txtArea.setText(txtArea.getText() + "Date:   " + Tdate.format(date) +"\n"); 
        txtArea.setText(txtArea.getText() +  "Time:   "+tTime.format(date) + "\n\n");
        txtArea.setText(txtArea.getText() + "                 ________________\n");
        txtArea.setText(txtArea.getText() + "                     Signature \n\n");
        txtArea.setText(txtArea.getText() + "*************THANKYOU*************");
        
        
     
             
           
         
        
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void txtD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD4ActionPerformed

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
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD2;
    private javax.swing.JLabel lblD3;
    private javax.swing.JLabel lblD4;
    private javax.swing.JLabel lblD5;
    private javax.swing.JLabel lblDrinkCost;
    private javax.swing.JLabel lblM1;
    private javax.swing.JLabel lblM2;
    private javax.swing.JLabel lblM3;
    private javax.swing.JLabel lblM4;
    private javax.swing.JLabel lblM5;
    private javax.swing.JLabel lblMealCost;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtD1;
    private javax.swing.JTextField txtD2;
    private javax.swing.JTextField txtD3;
    private javax.swing.JTextField txtD4;
    private javax.swing.JTextField txtD5;
    private javax.swing.JTextField txtDrink;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM3;
    private javax.swing.JTextField txtM4;
    private javax.swing.JTextField txtM5;
    private javax.swing.JTextField txtMeal;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtTCost;
    private javax.swing.JTextField txtTax;
    // End of variables declaration//GEN-END:variables
}
