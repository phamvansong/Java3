/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

/**
 *
 * @author pvsla
 */
public class MayTinhBoTui extends javax.swing.JFrame {

    String pheptoan = "";
    String pheptoan1 = "";
    boolean isEqual = false;

    /**
     * Creates new form MayTinhBoTui
     */
    public MayTinhBoTui() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnSQRT = new javax.swing.JButton();
        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnSubtraction = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSummation = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        btnNumber1.setText("1");
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber1);

        btnNumber2.setText("2");
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber2);

        btnNumber3.setText("3");
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber3);

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision);

        btnSQRT.setText("sqrt");
        btnSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSQRTActionPerformed(evt);
            }
        });
        jPanel2.add(btnSQRT);

        btnNumber4.setText("4");
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber4);

        btnNumber5.setText("5");
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber5);

        btnNumber6.setText("6");
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber6);

        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplication);

        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSQRTActionPerformed(evt);
            }
        });
        jPanel2.add(btnPercent);

        btnNumber7.setText("7");
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber7);

        btnNumber8.setText("8");
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber8);

        btnNumber9.setText("9");
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber9);

        btnSubtraction.setText("-");
        btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtraction);

        btnFraction.setText("1/x");
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSQRTActionPerformed(evt);
            }
        });
        jPanel2.add(btnFraction);

        btnNumber0.setText("0");
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber0);

        btnPlus.setText("+/-");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlus);

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnSummation.setText("+");
        btnSummation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btnSummation);

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel2.add(btnEqual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        // TODO add your handling code here:
        if (isEqual) {
            isEqual = false;
            txtResult.setText("");
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);

    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        if (isEqual) {
            isEqual = false;
            txtResult.setText("");
        }
        try {
            double value = Double.parseDouble(txtResult.getText());
            value = -value;
            txtResult.setText("" + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
        String cmd = evt.getActionCommand();

        pheptoan = cmd;
        pheptoan1 = txtResult.getText();

        txtResult.setText("");
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        if (txtResult.getText().equals("") || pheptoan1.equals("")) {
            return;
        }
        try {
            double operand1 = Double.parseDouble(pheptoan1);
            double operand2 = Double.parseDouble(txtResult.getText());
            double result = 0;
            if (pheptoan.equals("+")) {
                result = operand1 + operand2;
            } else if (pheptoan.equals("-")) {
                result = operand1 - operand2;
            } else if (pheptoan.equals("*")) {
                result = operand1 * operand2;
            } else if (pheptoan.equals("/")) {
                result = operand1 / operand2;
            }
            txtResult.setText("" + result);
            isEqual = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtResult.setText("");
        pheptoan = "";
        pheptoan1 = "";
        isEqual = false;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSQRTActionPerformed
        // TODO add your handling code here:
        if (txtResult.getText().equals("")) {
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(txtResult.getText());
            if (cmd.equals("sqrt")) {
                value = Math.sqrt(value);
            } else if (cmd.equals("%")) {
                value = value * 100;
            } else if (cmd.equals("1/x")) {
                value = 1 / value;
            }
            txtResult.setText("" + value);
            isEqual = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSQRTActionPerformed

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
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayTinhBoTui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSQRT;
    private javax.swing.JButton btnSubtraction;
    private javax.swing.JButton btnSummation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
