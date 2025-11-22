package view;

import controller.ControlRoom;
import obs.Obsever;

public class Tank extends javax.swing.JFrame implements Obsever{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tank.class.getName());
    private ControlRoom controlRoom;
    public Tank(ControlRoom controlRoom) {
        initComponents();
        this.controlRoom=controlRoom;
        setTitle("TANK");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAreaTank = new javax.swing.JLabel();
        btnShootTank = new javax.swing.JButton();
        btnRedarTank = new javax.swing.JButton();
        btnMissilleTank = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTank = new javax.swing.JTextArea();
        btnSearchTank = new javax.swing.JButton();
        txtMessageSendTank = new javax.swing.JTextField();
        sldTank = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        checkBoxPositionTank = new javax.swing.JCheckBox();
        btnRotateShootingTank = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Main Controller");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Main Controller");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAreaTank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAreaTank.setText("Area Not Clerared");

        btnShootTank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShootTank.setText("Shoot");

        btnRedarTank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRedarTank.setText("Radar Operation");
        btnRedarTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedarTankActionPerformed(evt);
            }
        });

        btnMissilleTank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissilleTank.setText("Missille Operation");

        txtAreaTank.setColumns(20);
        txtAreaTank.setRows(5);
        jScrollPane1.setViewportView(txtAreaTank);

        btnSearchTank.setText("Search");
        btnSearchTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTankActionPerformed(evt);
            }
        });

        txtMessageSendTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageSendTankActionPerformed(evt);
            }
        });

        sldTank.setMajorTickSpacing(10);
        sldTank.setMinorTickSpacing(20);
        sldTank.setOrientation(javax.swing.JSlider.VERTICAL);
        sldTank.setPaintLabels(true);
        sldTank.setPaintTicks(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Soldier Counter");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ammo Counter");

        checkBoxPositionTank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxPositionTank.setText("Position");

        btnRotateShootingTank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRotateShootingTank.setText("Rotate Shooting");
        btnRotateShootingTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateShootingTankActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tank");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMessageSendTank, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchTank, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnShootTank, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnMissilleTank, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBoxPositionTank)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRedarTank, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRotateShootingTank, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaTank, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(sldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(sldTank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAreaTank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShootTank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMissilleTank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRedarTank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRotateShootingTank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(checkBoxPositionTank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMessageSendTank, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchTank, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTankActionPerformed
        String sendMsg="Tank  : "+txtMessageSendTank.getText();
        MainController.setDefenceMsg(sendMsg);
    }//GEN-LAST:event_btnSearchTankActionPerformed

    private void txtMessageSendTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageSendTankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageSendTankActionPerformed

    private void btnRedarTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedarTankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedarTankActionPerformed

    private void btnRotateShootingTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateShootingTankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRotateShootingTankActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissilleTank;
    private javax.swing.JButton btnRedarTank;
    private javax.swing.JButton btnRotateShootingTank;
    private javax.swing.JButton btnSearchTank;
    private javax.swing.JButton btnShootTank;
    private javax.swing.JCheckBox checkBoxPositionTank;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblAreaTank;
    private javax.swing.JSlider sldTank;
    private javax.swing.JTextArea txtAreaTank;
    private javax.swing.JTextField txtMessageSendTank;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean AreaClear) {
        if(AreaClear){
            lblAreaTank.setText("Area Clear...");
        }else{
            lblAreaTank.setText("Area Is Not Clear...");
        }
    }

    @Override
    public void getMsgMain(String Msg) {
        txtAreaTank.append("Main Controller  :"+Msg+"\n");
    }

    @Override
    public void setPosition(int position) {
        if(checkBoxPositionTank.isSelected())
        if(position>80){
                btnMissilleTank.setEnabled(true);
                btnRedarTank.setEnabled(true);
                btnRotateShootingTank.setEnabled(true);
                btnShootTank.setEnabled(true);
            }else if(position>60){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(true);
                btnRotateShootingTank.setEnabled(true);
                btnShootTank.setEnabled(true);
            }else if(position>40){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(false);
                btnRotateShootingTank.setEnabled(true);
                btnShootTank.setEnabled(true);
            }else if(position>20){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(false);
                btnRotateShootingTank.setEnabled(false);
                btnShootTank.setEnabled(true);
            }
            
            if(position<20){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(false);
                btnRotateShootingTank.setEnabled(false);
                btnShootTank.setEnabled(false);
            }else if(position<40){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(false);
                btnRotateShootingTank.setEnabled(false);
                btnShootTank.setEnabled(true);
            }else if(position<60){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(false);
                btnRotateShootingTank.setEnabled(true);
                btnShootTank.setEnabled(true);
            }else if(position<80){
                btnMissilleTank.setEnabled(false);
                btnRedarTank.setEnabled(true);
                btnRotateShootingTank.setEnabled(true);
                btnShootTank.setEnabled(true);
            }
        }

    @Override
    public void sendPrivate(String name, String msg) {
        if("Tank".equals(name)){
            txtAreaTank.append("Main Controller  :"+msg+"\n");
            
        }
    }
    }

