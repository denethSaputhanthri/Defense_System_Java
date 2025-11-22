package view;
import controller.ControlRoom;
import obs.Obsever;

public class Helicopter extends javax.swing.JFrame implements Obsever{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Helicopter.class.getName());
    private ControlRoom contralRoom;
    
    public Helicopter(ControlRoom controlRoom) {
        initComponents();
        this.contralRoom=controlRoom;
        setTitle("HELICOPTER");
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaHelicopter = new javax.swing.JLabel();
        btnShootHelicopter = new javax.swing.JButton();
        btnLaserHelicopter = new javax.swing.JButton();
        btnMissilleHelicopter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaHelicopter = new javax.swing.JTextArea();
        btnSendHelicopter = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        sldHelicopter = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sprSoldierHelicopter = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAreaHelicopter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAreaHelicopter.setText("Area Not Clerared");
        getContentPane().add(lblAreaHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, 177, -1));

        btnShootHelicopter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShootHelicopter.setText("Shoot");
        getContentPane().add(btnShootHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 87, 138, 35));

        btnLaserHelicopter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLaserHelicopter.setText("Laser Operation");
        btnLaserHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserHelicopterActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaserHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 128, 138, 35));

        btnMissilleHelicopter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissilleHelicopter.setText("Missile Operation");
        btnMissilleHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissilleHelicopterActionPerformed(evt);
            }
        });
        getContentPane().add(btnMissilleHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 87, 138, 35));

        txtAreaHelicopter.setColumns(20);
        txtAreaHelicopter.setRows(5);
        jScrollPane1.setViewportView(txtAreaHelicopter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 197, 562, 256));

        btnSendHelicopter.setText("Send");
        btnSendHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendHelicopterActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 107, 32));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 459, 447, 32));

        sldHelicopter.setMajorTickSpacing(10);
        sldHelicopter.setMinorTickSpacing(20);
        sldHelicopter.setOrientation(javax.swing.JSlider.VERTICAL);
        sldHelicopter.setPaintLabels(true);
        sldHelicopter.setPaintTicks(true);
        getContentPane().add(sldHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 84, 367));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Soldier Counter");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 86, 109, 35));
        getContentPane().add(sprSoldierHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 93, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ammo Counter");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 128, 109, 35));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 135, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setText("Position");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 167, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Helicopter");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 680, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendHelicopterActionPerformed
        String sendMsg="Helicopter  : "+jTextField1.getText();
        MainController.setDefenceMsg(sendMsg);
        
    }//GEN-LAST:event_btnSendHelicopterActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnLaserHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserHelicopterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaserHelicopterActionPerformed

    private void btnMissilleHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissilleHelicopterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissilleHelicopterActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaserHelicopter;
    private javax.swing.JButton btnMissilleHelicopter;
    private javax.swing.JButton btnSendHelicopter;
    private javax.swing.JButton btnShootHelicopter;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAreaHelicopter;
    private javax.swing.JSlider sldHelicopter;
    private javax.swing.JSpinner sprSoldierHelicopter;
    private javax.swing.JTextArea txtAreaHelicopter;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean AreaClear) {
       if(AreaClear){
           lblAreaHelicopter.setText("Area Clear...");
       }else{
           lblAreaHelicopter.setText("Area Is Not Clear...");
       }
    }

    @Override
    public void getMsgMain(String Msg) {
       txtAreaHelicopter.append("Main Controller  :"+Msg+"\n");
    }

    @Override
    public void setPosition(int position) {
        if(jCheckBox1.isSelected()){
            if(position>60){
                btnShootHelicopter.setEnabled(true);
                btnMissilleHelicopter.setEnabled(true);
                btnLaserHelicopter.setEnabled(true);
            }else if(position>40){
                btnShootHelicopter.setEnabled(true);
                btnMissilleHelicopter.setEnabled(true);
                btnLaserHelicopter.setEnabled(false);
            }else if(position>20){
                btnShootHelicopter.setEnabled(true);
                btnMissilleHelicopter.setEnabled(false);
                btnLaserHelicopter.setEnabled(false);
            }
            if(position<20){
                btnShootHelicopter.setEnabled(false);
                btnMissilleHelicopter.setEnabled(false);
                btnLaserHelicopter.setEnabled(false);
            }else if(position<40){
                btnShootHelicopter.setEnabled(true);
                btnMissilleHelicopter.setEnabled(false);
                btnLaserHelicopter.setEnabled(false);
            }else if(position<60){
               btnShootHelicopter.setEnabled(true);
                btnMissilleHelicopter.setEnabled(true);
                btnLaserHelicopter.setEnabled(true);
            }
        }
   }

    @Override
    public void sendPrivate(String name, String msg) {
        if("Helicopter".equals(name)){
            txtAreaHelicopter.append("Main Controller  :"+msg+"\n");
        }
    }
}
