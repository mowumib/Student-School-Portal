package DataBase;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Mowumi
 */
public class admin extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }

    public admin() {
        initComponents();
        conn = dbConnection.conn();
        Update_Table();
        
    }
    
    public void Update_Table(){
        try{
            String sql = "Select * FROM student_data";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            data_from_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(SQLException ex){
                }
            }
        }
    public void Clear(){
        txtfield_matric.setText("");
        txtfield_name.setText("");
        txtfield_entry.setText("");
        txtfield_level.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfield_matric = new javax.swing.JTextField();
        txtfield_name = new javax.swing.JTextField();
        txtfield_entry = new javax.swing.JTextField();
        txtfield_level = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_remove = new javax.swing.JTextField();
        remove_button = new javax.swing.JButton();
        signout_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_from_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");

        Add_button.setText("Add Student");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Matric no");

        jLabel3.setText("Name");

        jLabel4.setText("Mode Of Entry");

        jLabel5.setText("Level");

        txtfield_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_levelActionPerformed(evt);
            }
        });

        jLabel6.setText("Remove Student");

        jLabel7.setText("Id");

        remove_button.setText("Remove");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        signout_button.setText("Sign Out");
        signout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_buttonActionPerformed(evt);
            }
        });

        data_from_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Matric Number", "Name", "Mode Of Entry", "Level"
            }
        ));
        jScrollPane1.setViewportView(data_from_table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Welcome Admin");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Department: Computer Sciences");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Level: 400");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Course Adviser: MR S. Edagbami");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_button))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfield_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfield_matric, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfield_entry, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfield_level, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remove_button)
                            .addComponent(txt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signout_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(signout_button)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfield_matric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfield_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfield_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51)
                        .addComponent(Add_button)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remove_button)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfield_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_levelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_levelActionPerformed

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        // TODO add your handling code here:
        String sql="INSERT INTO student_data (matric_num, name, entry_mode, level) values(?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtfield_matric.getText());
            pst.setString(2, txtfield_name.getText());
            pst.setString(3, txtfield_entry.getText());
            pst.setString(4, txtfield_level.getText());
            pst.execute();
                        
                JOptionPane.showMessageDialog(null, "Added to database Successfully");
        }catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Not added to database" + ex);
        }
            Update_Table();
            Clear();
        
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void signout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_buttonActionPerformed
        try{
            rs.close();
            pst.close();
            conn.close();
        }
        catch(SQLException ex) {
            
                   }
        this.dispose();
        Login s = new Login();
        s.setVisible(true);
    }//GEN-LAST:event_signout_buttonActionPerformed

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        // TODO add your handling code here:
        String sql="delete from student_data where id=?";
        try{
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_remove.getText());
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Deleted");
            Update_Table();
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);    
        }
    }//GEN-LAST:event_remove_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JTable data_from_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove_button;
    private javax.swing.JButton signout_button;
    private javax.swing.JTextField txt_remove;
    private javax.swing.JTextField txtfield_entry;
    private javax.swing.JTextField txtfield_level;
    private javax.swing.JTextField txtfield_matric;
    private javax.swing.JTextField txtfield_name;
    // End of variables declaration//GEN-END:variables
}
