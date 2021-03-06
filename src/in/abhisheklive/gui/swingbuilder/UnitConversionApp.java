/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.gui.swingbuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Live
 */
public class UnitConversionApp extends javax.swing.JFrame {

    /**
     * Creates new form UnitConversionApp
     */
    public UnitConversionApp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKiloMeters = new javax.swing.JTextField();
        txtConversion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbMeter = new javax.swing.JRadioButton();
        rbCentimeter = new javax.swing.JRadioButton();
        rbMilimeter = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unit Conversion App");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter KiloMeters ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("After Conversion ");

        txtKiloMeters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKiloMetersActionPerformed(evt);
            }
        });

        txtConversion.setEditable(false);
        txtConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConversionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Select Conversion Unit", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        rbMeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbMeter);
        rbMeter.setForeground(new java.awt.Color(255, 255, 255));
        rbMeter.setText("Meter");
        rbMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMeterActionPerformed(evt);
            }
        });

        rbCentimeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbCentimeter);
        rbCentimeter.setForeground(new java.awt.Color(255, 255, 255));
        rbCentimeter.setText("Centimeter");
        rbCentimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCentimeterActionPerformed(evt);
            }
        });

        rbMilimeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbMilimeter);
        rbMilimeter.setForeground(new java.awt.Color(255, 255, 255));
        rbMilimeter.setText("milimeter");
        rbMilimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMilimeterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMeter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(rbCentimeter)
                .addGap(119, 119, 119)
                .addComponent(rbMilimeter)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMeter)
                    .addComponent(rbCentimeter)
                    .addComponent(rbMilimeter))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConversion, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(txtKiloMeters))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKiloMeters, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMeterActionPerformed
        String str=null;
        if(rbMeter.isSelected()==true)
            str=txtKiloMeters.getText();
        try{
            int KmValue = Integer.parseInt(str);
            txtConversion.setText(String.valueOf((1000*KmValue)));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please enter digits only!","Error",JOptionPane.ERROR_MESSAGE);
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_rbMeterActionPerformed

    private void rbCentimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCentimeterActionPerformed
       String str=null;
        if(rbCentimeter.isSelected()==true)
            str=txtKiloMeters.getText();
        try{
            int KmValue = Integer.parseInt(str);
            txtConversion.setText(String.valueOf((100000L*KmValue)));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please enter digits only!","Error",JOptionPane.ERROR_MESSAGE);
            
        } // TODO add your handling code here:
    }//GEN-LAST:event_rbCentimeterActionPerformed

    private void txtKiloMetersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKiloMetersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKiloMetersActionPerformed

    private void txtConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConversionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConversionActionPerformed

    private void rbMilimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMilimeterActionPerformed
        String str=null;
        if(rbMilimeter.isSelected()==true)
            str=txtKiloMeters.getText();
        try{
            int KmValue = Integer.parseInt(str);
            txtConversion.setText(String.valueOf((10000000L*KmValue)));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please enter digits only!","Error",JOptionPane.ERROR_MESSAGE);
            
        }   // TODO add your handling code here:
    }//GEN-LAST:event_rbMilimeterActionPerformed

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
            java.util.logging.Logger.getLogger(UnitConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitConversionApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbCentimeter;
    private javax.swing.JRadioButton rbMeter;
    private javax.swing.JRadioButton rbMilimeter;
    private javax.swing.JTextField txtConversion;
    private javax.swing.JTextField txtKiloMeters;
    // End of variables declaration//GEN-END:variables
}
