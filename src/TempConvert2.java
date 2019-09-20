
import javax.swing.JOptionPane;


public class TempConvert2 extends javax.swing.JFrame {

    double far, cel;
    
    public TempConvert2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        farbox = new javax.swing.JTextField();
        celbox = new javax.swing.JTextField();
        ftocbutton = new javax.swing.JButton();
        ctofbutton = new javax.swing.JButton();
        outputlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temp Conversion");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel1.setText("Fahrenheit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Celcius");

        celbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celboxActionPerformed(evt);
            }
        });

        ftocbutton.setText(">>>>");
        ftocbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftocbuttonActionPerformed(evt);
            }
        });

        ctofbutton.setText("<<<<");
        ctofbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctofbuttonActionPerformed(evt);
            }
        });

        outputlable.setBackground(new java.awt.Color(0, 0, 0));
        outputlable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        outputlable.setForeground(new java.awt.Color(255, 255, 0));
        outputlable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputlable.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(outputlable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(farbox)
                            .addComponent(ftocbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celbox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ctofbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftocbutton)
                    .addComponent(ctofbutton))
                .addGap(18, 18, 18)
                .addComponent(outputlable, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void celboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celboxActionPerformed

    private void ftocbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftocbuttonActionPerformed
        // TODO add your handling code here:
        //read number in from celbox
        try{
        far = Double.parseDouble(farbox.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error - must enter a number");
            return; //stop here
        }
        //convert to celcius
        cel = (far - 32.0) * 5.0 / 9.0;
        //print answer in celbox
        celbox.setText(String.format("%.2f ", cel));
        outputlable.setText(String.format("%.2f F = %.2f C", far, cel));
    }//GEN-LAST:event_ftocbuttonActionPerformed

    private void ctofbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctofbuttonActionPerformed
        // TODO add your handling code here:
        //read number in from farbox
        try{
        cel = Double.parseDouble(celbox.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error - must enter a number");
            return;
        }
        //conver to far
        far = (cel * 9.0 / 5.0) + 32;
        farbox.setText(String.format("%.2f ", far));
        //display answer formally in lable
        outputlable.setText(String.format("%.2f C = %.2f F", cel, far));
    }//GEN-LAST:event_ctofbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConvert2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celbox;
    private javax.swing.JButton ctofbutton;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JTextField farbox;
    private javax.swing.JButton ftocbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel outputlable;
    // End of variables declaration//GEN-END:variables
}