/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab_booking;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateBooking extends javax.swing.JFrame {
Connection con=Connect.connectdb();
PreparedStatement ps=null;
ResultSet rs=null;
    /**
     * Creates new form UPDATE
     */
    public UpdateBooking() {
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

        last = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        ppl = new javax.swing.JTextField();
        start = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        last.setBackground(new java.awt.Color(204, 204, 204));
        last.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 732, 44));

        submit.setBackground(new java.awt.Color(51, 153, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("UPDATE");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 604, 147, 44));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone no");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 44));

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 604, 162, 44));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No of people");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 44));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UPDATE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 270, 55));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 44));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 44));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 150, 44));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("From");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 44));

        back.setBackground(new java.awt.Color(0, 51, 204));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 665, 120, 40));

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 732, 44));

        phoneno.setBackground(new java.awt.Color(204, 204, 204));
        phoneno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 732, 41));

        ppl.setBackground(new java.awt.Color(204, 204, 204));
        ppl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(ppl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 732, 44));

        start.setBackground(new java.awt.Color(204, 204, 204));
        start.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 732, 47));

        comboBox.setBackground(new java.awt.Color(204, 204, 204));
        comboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatchback", "Sedans", "Suvs" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 730, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2024-11-11 at 19.23.48_5a4d16c9.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1180, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      String updateQuery = "UPDATE Cab_booking SET Name = ?, phone_no = ?, No_of_people = ?, Type = ?, Start = ?, Final = ? WHERE Name = ?";

try {
    // Prepare the SQL statement using the connection object (con)
    ps = con.prepareStatement(updateQuery); // This creates a PreparedStatement object for the update query

    // Set values for each placeholder in the query (the columns to be updated)
    ps.setString(1, name.getText());        // Set the Name value from the user input
    ps.setString(2, phoneno.getText());     // Set the phone_no value from the user input
    ps.setString(3, ppl.getText());         // Set the No_of_people value from the user input
    ps.setString(4, comboBox.getSelectedItem().toString());   // Set the Type value from the user input
    ps.setString(5, start.getText());       // Set the Start location from the user input
    ps.setString(6, last.getText());        // Set the Final location from the user input
    ps.setString(7, name.getText());        // Set the Name in WHERE clause for matching the record

    // Execute the update query, which returns the number of affected rows
    int rowsUpdated = ps.executeUpdate();   // Execute the update and store the number of rows affected

    // Check if the update was successful by verifying the number of affected rows
    if (rowsUpdated > 0) {
        // If rows were updated, show a success message
        JOptionPane.showMessageDialog(null, "Record Updated Successfully");
        dispose();                          // Closes the current frame if needed
        new Userinterface().setVisible(true);   // Opens the next window
    } else {
        // If no rows were updated, show a failure message
        JOptionPane.showMessageDialog(null, "Update Operation Failed");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}



    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        name.setText("");
        phoneno.setText("");
        ppl.setText("");
        start.setText("");
        last.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
         new Userinterface().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField last;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField ppl;
    private javax.swing.JButton reset;
    private javax.swing.JTextField start;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
