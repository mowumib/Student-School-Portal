package DataBase;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mowumi
 */
public class ChangePassword extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }
    public ChangePassword() {
        initComponents();
        conn = dbConnection.conn();
    }
    public void Clear(){
        newpassword_txt.setText("");
        currentpassword_txt.setText("");
        confirmpassword_txt.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordchange_button = new javax.swing.JButton();
        currentpassword_txt = new javax.swing.JPasswordField();
        newpassword_txt = new javax.swing.JPasswordField();
        confirmpassword_txt = new javax.swing.JPasswordField();
        studentboard_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        holder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Change Password");

        jLabel2.setText("Current Password");

        jLabel3.setText("New Password");

        jLabel4.setText("Confirm New Password");

        passwordchange_button.setText("save");
        passwordchange_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordchange_buttonActionPerformed(evt);
            }
        });

        studentboard_button.setText("Go to student dashboard");
        studentboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentboard_buttonActionPerformed(evt);
            }
        });

        jLabel5.setText("Matric Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(studentboard_button)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(currentpassword_txt)
                                .addComponent(newpassword_txt)
                                .addComponent(confirmpassword_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(passwordchange_button)
                        .addGap(94, 94, 94)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(studentboard_button)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(confirmpassword_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentpassword_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(newpassword_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(passwordchange_button)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordchange_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordchange_buttonActionPerformed
        try{
            Login l = new Login();
            l.setVisible(false);  
            
            String cpholde = holder.getText();
            String pwordl = l.txtpassword.getText();
            String value1 = currentpassword_txt.getText();
            String value2 = newpassword_txt.getText();
            String value3 = confirmpassword_txt.getText();
            
//            String sql="SELECT * FROM student_login WHERE username ='" + cpholde +"' password='"+value1+"'";
//            pst = conn.prepareStatement(sql);
//            pst.execute();
            
//            if(pwordl.equals(value1)){
                if(value2.equals(value3)){
                    String sql2= "UPDATE student_login SET password ='"+value3+"' WHERE username ='"+cpholde+"'";
                    pst2 = conn.prepareStatement(sql2);
                    pst2.execute();
                
                JOptionPane.showMessageDialog(null, "Updated");
                Clear();
                }
//            }
        else{
                JOptionPane.showMessageDialog(null, "not updated");
            }     
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
       
        
    }//GEN-LAST:event_passwordchange_buttonActionPerformed

    private void studentboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentboard_buttonActionPerformed
        this.dispose();
        student s = new student();
        s.label.setText(holder.getText());
        s.setVisible(true);
    }//GEN-LAST:event_studentboard_buttonActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpassword_txt;
    private javax.swing.JPasswordField currentpassword_txt;
    public static javax.swing.JLabel holder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField newpassword_txt;
    private javax.swing.JButton passwordchange_button;
    private javax.swing.JButton studentboard_button;
    // End of variables declaration//GEN-END:variables
}
