package view;

import controller.ControlRoom;
import obs.Obsever;

public class MainController extends javax.swing.JFrame implements Obsever{

    private ControlRoom controlroom;    
    
    public MainController(ControlRoom controlRoom){      
        initComponents();
        this.controlroom=controlRoom;
        setTitle("MAIN CONTROLLER");
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnCollectInfor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkBoxAreaclearMain = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSendMessageMain = new javax.swing.JTextArea();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnSendMessageMain = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        sldMainController = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Helicopter", "Tank", "Submarine" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, 144, 34));

        btnCollectInfor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCollectInfor.setText("Collect Informations");
        btnCollectInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectInforActionPerformed(evt);
            }
        });
        getContentPane().add(btnCollectInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 64, 146, 34));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Soldier Count");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 110, 144, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Fuel Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 144, 144, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ammo Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 178, 144, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Position");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 212, 144, 31));

        checkBoxAreaclearMain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkBoxAreaclearMain.setText("Area Clear");
        checkBoxAreaclearMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAreaclearMainActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxAreaclearMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        txtAreaSendMessageMain.setColumns(20);
        txtAreaSendMessageMain.setRows(5);
        jScrollPane1.setViewportView(txtAreaSendMessageMain);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 110, 277, 124));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setText("Send Private");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 18));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 277, 117));

        btnSendMessageMain.setBackground(new java.awt.Color(0, 0, 0));
        btnSendMessageMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSendMessageMain.setForeground(new java.awt.Color(255, 255, 255));
        btnSendMessageMain.setText("Send");
        btnSendMessageMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageMainActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendMessageMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 277, 33));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 299, 117));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Main Controller");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, -1));

        sldMainController.setMajorTickSpacing(20);
        sldMainController.setMinorTickSpacing(10);
        sldMainController.setPaintLabels(true);
        sldMainController.setPaintTicks(true);
        sldMainController.setValue(0);
        sldMainController.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMainControllerStateChanged(evt);
            }
        });
        getContentPane().add(sldMainController, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCollectInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectInforActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCollectInforActionPerformed

    private void checkBoxAreaclearMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAreaclearMainActionPerformed
        boolean areaClear=checkBoxAreaclearMain.isSelected();
        controlroom.setArea(areaClear);
    }//GEN-LAST:event_checkBoxAreaclearMainActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btnSendMessageMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageMainActionPerformed
        String sendMsg=txtAreaSendMessageMain.getText();
        String defenceName = jComboBox1.getSelectedItem().toString();
        if(jCheckBox2.isSelected()){
            controlroom.sendPrivateMsg(defenceName,sendMsg);
        }else{
        controlroom.sendMessage(sendMsg);
        }
    }//GEN-LAST:event_btnSendMessageMainActionPerformed

    private void jTextArea3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea3AncestorAdded

    private void sldMainControllerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMainControllerStateChanged
        int value = sldMainController.getValue();
        controlroom.setPosition(value);
    }//GEN-LAST:event_sldMainControllerStateChanged
    public static void setDefenceMsg(String msg){
        try {
            javax.swing.text.Document doc = jTextArea3.getDocument();
            doc.insertString(doc.getLength(), msg + "\n", null);
            jTextArea3.setCaretPosition(doc.getLength());
        } catch (javax.swing.text.BadLocationException e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectInfor;
    private javax.swing.JButton btnSendMessageMain;
    private javax.swing.JCheckBox checkBoxAreaclearMain;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea jTextArea3;
    private javax.swing.JSlider sldMainController;
    private javax.swing.JTextArea txtAreaSendMessageMain;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean AreaClear) {
         
    }

    @Override
    public void getMsgMain(String Msg) {
        
    }

    @Override
    public void setPosition(int Position) {
        
    }

    @Override
    public void sendPrivate(String name, String msg) {
        
    }
}
