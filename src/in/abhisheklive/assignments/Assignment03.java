/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.assignments;

import java.awt.Color;

/**
 *
 * @author Abhishek Live
 */
public class Assignment03 extends javax.swing.JFrame {

    /**
     * Creates new form Assignment03
     */
        Color prevColor = null;
       int red,green,blue=0;
    
    public Assignment03() {
        initComponents();
        setLocationRelativeTo(null);
        prevColor= MyPanel.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyPanel = new javax.swing.JPanel();
        Mypanel2 = new javax.swing.JPanel();
        jCheckBoxRed = new javax.swing.JCheckBox();
        jCheckBoxGreen = new javax.swing.JCheckBox();
        jCheckBoxBlue = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyPanel.setBackground(new java.awt.Color(0, 0, 0));

        Mypanel2.setBackground(new java.awt.Color(0, 0, 0));
        Mypanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Change Color", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jCheckBoxRed.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxRed.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxRed.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxRed.setText("RED");
        jCheckBoxRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxRedItemStateChanged(evt);
            }
        });
        jCheckBoxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRedActionPerformed(evt);
            }
        });

        jCheckBoxGreen.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxGreen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxGreen.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxGreen.setText("GREEN");
        jCheckBoxGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxGreenItemStateChanged(evt);
            }
        });

        jCheckBoxBlue.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxBlue.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxBlue.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxBlue.setText("BLUE");
        jCheckBoxBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxBlueItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Mypanel2Layout = new javax.swing.GroupLayout(Mypanel2);
        Mypanel2.setLayout(Mypanel2Layout);
        Mypanel2Layout.setHorizontalGroup(
            Mypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mypanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxRed)
                .addGap(26, 26, 26)
                .addComponent(jCheckBoxGreen)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxBlue))
        );
        Mypanel2Layout.setVerticalGroup(
            Mypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mypanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Mypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxRed)
                    .addComponent(jCheckBoxGreen)
                    .addComponent(jCheckBoxBlue))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Mypanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MyPanelLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(Mypanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRedActionPerformed

    private void jCheckBoxRedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxRedItemStateChanged
      
        red=jCheckBoxRed.isSelected()==true?255:0;
        MyPanel.setBackground(new Color(red,green,blue));

       
       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRedItemStateChanged

    private void jCheckBoxBlueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxBlueItemStateChanged
        blue=jCheckBoxBlue.isSelected()==true?255:0;
       MyPanel.setBackground(new Color(red,green,blue));

                  // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBlueItemStateChanged

    private void jCheckBoxGreenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxGreenItemStateChanged
       green = jCheckBoxGreen.isSelected()==true?255:0;
       MyPanel.setBackground(new Color(red,green,blue));

           
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxGreenItemStateChanged

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
            java.util.logging.Logger.getLogger(Assignment03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPanel;
    private javax.swing.JPanel Mypanel2;
    private javax.swing.JCheckBox jCheckBoxBlue;
    private javax.swing.JCheckBox jCheckBoxGreen;
    private javax.swing.JCheckBox jCheckBoxRed;
    // End of variables declaration//GEN-END:variables
}
