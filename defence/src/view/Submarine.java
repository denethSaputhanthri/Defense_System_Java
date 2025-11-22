package view;
import controller.ControlRoom;
import obs.Obsever;
public class Submarine extends javax.swing.JFrame implements Obsever{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Submarine.class.getName());
    private ControlRoom controlroom;
    
        public Submarine(ControlRoom controlRoom) {
        initComponents();
        this.controlroom=controlRoom;
        setTitle("SUBMARINE");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaSubmarine = new javax.swing.JLabel();
        btnShootSubmarine = new javax.swing.JButton();
        btnTomahawkSubmarine = new javax.swing.JButton();
        btnMassileSubmarine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSubmarine = new javax.swing.JTextArea();
        btnSearchSubmarine = new javax.swing.JButton();
        txtMessageSendSubmarine = new javax.swing.JTextField();
        sldSubOxygen = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        checkBoxPositionSub = new javax.swing.JCheckBox();
        btnTridentSubmarine = new javax.swing.JButton();
        sldSubEnergy = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAreaSubmarine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAreaSubmarine.setText("Area Not Clerared");
        getContentPane().add(lblAreaSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 138, -1));

        btnShootSubmarine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShootSubmarine.setText("Shoot");
        btnShootSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(btnShootSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, 138, 35));

        btnTomahawkSubmarine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomahawkSubmarine.setText("Tomahawk Missile");
        btnTomahawkSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomahawkSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 138, 35));

        btnMassileSubmarine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMassileSubmarine.setText("Sonar Operation");
        btnMassileSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMassileSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(btnMassileSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 87, 138, 35));

        txtAreaSubmarine.setColumns(20);
        txtAreaSubmarine.setRows(5);
        jScrollPane1.setViewportView(txtAreaSubmarine);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 539, 244));

        btnSearchSubmarine.setText("Search");
        btnSearchSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 462, 103, 32));

        txtMessageSendSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageSendSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(txtMessageSendSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 462, 424, 32));

        sldSubOxygen.setMajorTickSpacing(10);
        sldSubOxygen.setMinorTickSpacing(20);
        sldSubOxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        sldSubOxygen.setPaintLabels(true);
        sldSubOxygen.setPaintTicks(true);
        getContentPane().add(sldSubOxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 84, 351));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Soldier Counter");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 86, 109, 35));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 93, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ammo Counter");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 128, 109, 35));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 135, -1, -1));

        checkBoxPositionSub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkBoxPositionSub.setText("Position");
        checkBoxPositionSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPositionSubActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxPositionSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 20));

        btnTridentSubmarine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTridentSubmarine.setText("Trident-2 Missile ");
        getContentPane().add(btnTridentSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 128, 138, 35));

        sldSubEnergy.setMajorTickSpacing(10);
        sldSubEnergy.setMinorTickSpacing(20);
        sldSubEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sldSubEnergy.setPaintLabels(true);
        sldSubEnergy.setPaintTicks(true);
        getContentPane().add(sldSubEnergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 124, 84, 358));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Energy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 93, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Oxygen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 93, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Submarine");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 780, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSubmarineActionPerformed
        String sendMsg="Submarine  : "+txtMessageSendSubmarine.getText();
        MainController.setDefenceMsg(sendMsg);
    }//GEN-LAST:event_btnSearchSubmarineActionPerformed

    private void txtMessageSendSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageSendSubmarineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageSendSubmarineActionPerformed

    private void btnTomahawkSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkSubmarineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomahawkSubmarineActionPerformed

    private void checkBoxPositionSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPositionSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxPositionSubActionPerformed

    private void btnShootSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootSubmarineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootSubmarineActionPerformed

    private void btnMassileSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMassileSubmarineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMassileSubmarineActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMassileSubmarine;
    private javax.swing.JButton btnSearchSubmarine;
    private javax.swing.JButton btnShootSubmarine;
    private javax.swing.JButton btnTomahawkSubmarine;
    private javax.swing.JButton btnTridentSubmarine;
    private javax.swing.JCheckBox checkBoxPositionSub;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblAreaSubmarine;
    private javax.swing.JSlider sldSubEnergy;
    private javax.swing.JSlider sldSubOxygen;
    private javax.swing.JTextArea txtAreaSubmarine;
    private javax.swing.JTextField txtMessageSendSubmarine;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean AreaClear) {
        if (AreaClear) {
            lblAreaSubmarine.setText("Area Clear...");
        }else{
            lblAreaSubmarine.setText("Area Is Not Clear...");
        }
    }

    @Override
    public void getMsgMain(String Msg) {
       txtAreaSubmarine.append("Main Controller  :"+Msg+"\n");
    }

    @Override
    public void setPosition(int position) {
        if(checkBoxPositionSub.isSelected()){
            if(position>80){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(true);
                btnTomahawkSubmarine.setEnabled(true);
                btnTridentSubmarine.setEnabled(true);
            }else if(position>60){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(true);
                btnTomahawkSubmarine.setEnabled(true);
                btnTridentSubmarine.setEnabled(false);
            }else if(position>40){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(true);
                btnTomahawkSubmarine.setEnabled(false);
                btnTridentSubmarine.setEnabled(false);
            }else if(position>20){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(false);
                btnTomahawkSubmarine.setEnabled(false);
                btnTridentSubmarine.setEnabled(false);
            }
            
            if(position<20){
                btnShootSubmarine.setEnabled(false);
                btnMassileSubmarine.setEnabled(false);
                btnTomahawkSubmarine.setEnabled(false);
                btnTridentSubmarine.setEnabled(false);
            }else if(position<40){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(false);
                btnTomahawkSubmarine.setEnabled(false);
                btnTridentSubmarine.setEnabled(false);
            }else if(position<60){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(true);
                btnTomahawkSubmarine.setEnabled(false);
                btnTridentSubmarine.setEnabled(false);
            }else if(position<80){
                btnShootSubmarine.setEnabled(true);
                btnMassileSubmarine.setEnabled(true);
                btnTomahawkSubmarine.setEnabled(true);
                btnTridentSubmarine.setEnabled(false);
            }
            
            
        }
    }

    @Override
    public void sendPrivate(String name, String msg) {
        if("Submarine"==name){
            txtAreaSubmarine.append("Main Controller  :"+msg+"\n");
        }
    }

    
}
