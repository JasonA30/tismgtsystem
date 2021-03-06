/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professordatabase;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jason PC
 */
public class manageStudents extends javax.swing.JFrame {

    /**
     * Creates new form manageStudents
     */
    
    student std = new student();
    DefaultTableModel model;
    public manageStudents() {
        initComponents();
        std.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1_female_manage);
        bg.add(jRadioButton2_male_manage);
       model = (DefaultTableModel)jTable1.getModel();
       jTable1.setRowHeight(40);
       jTable1.setShowGrid(true);
       jTable1.setGridColor(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_newstdTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_LN_manage = new javax.swing.JTextField();
        jTextField1_phonenum_manage = new javax.swing.JTextField();
        jTextField1_std_id = new javax.swing.JTextField();
        jTextField1_address_manage = new javax.swing.JTextField();
        jRadioButton1_female_manage = new javax.swing.JRadioButton();
        jRadioButton2_male_manage = new javax.swing.JRadioButton();
        jButton1_editstd_manage = new javax.swing.JButton();
        jButton1_removestd_manage = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_FN_manage = new javax.swing.JTextField();
        jButton1_addstd_manage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1_val_find = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1_newstdTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1_newstdTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_newstdTitle.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sex:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone:");

        jTextField1_phonenum_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_phonenum_manageActionPerformed(evt);
            }
        });
        jTextField1_phonenum_manage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_phonenum_manageKeyTyped(evt);
            }
        });

        jTextField1_std_id.setEditable(false);

        jRadioButton1_female_manage.setText("Female");

        jRadioButton2_male_manage.setText("Male");

        jButton1_editstd_manage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_editstd_manage.setText("Edit");
        jButton1_editstd_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_editstd_manageActionPerformed(evt);
            }
        });

        jButton1_removestd_manage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_removestd_manage.setText("Remove");
        jButton1_removestd_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_removestd_manageActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name:");

        jButton1_addstd_manage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_addstd_manage.setText("Add");
        jButton1_addstd_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addstd_manageActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Phone", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1_val_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_val_findKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1_FN_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1_LN_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jRadioButton2_male_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton1_female_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1_phonenum_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1_address_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton1_editstd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton1_addstd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton1_removestd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1_newstdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1_std_id, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221)
                                .addComponent(jTextField1_val_find, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1_newstdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_std_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_val_find, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField1_FN_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField1_LN_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2_male_manage)
                                    .addComponent(jRadioButton1_female_manage))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField1_phonenum_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1_address_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_editstd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_addstd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_removestd_manage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_phonenum_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_phonenum_manageActionPerformed

    }//GEN-LAST:event_jTextField1_phonenum_manageActionPerformed

    private void jTextField1_phonenum_manageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_phonenum_manageKeyTyped
        //allows numbers only

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_phonenum_manageKeyTyped

    public boolean verifText(){
        
        if(jTextField1_FN_manage.getText().equals("") || jTextField1_LN_manage.getText().equals("") || jTextField1_phonenum_manage.getText().equals("") 
                || jTextField1_std_id.getText().equals("")|| jTextField1_address_manage.getText().equals("")
                )
            
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        }
        else
        {
            return true;
        }
      
    }
    
    
    
    
    private void jButton1_editstd_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editstd_manageActionPerformed

        String fname = jTextField1_FN_manage.getText();
        String lname = jTextField1_LN_manage.getText();
        String phone = jTextField1_phonenum_manage.getText();
        String address = jTextField1_address_manage.getText();
        int id = Integer.valueOf(jTextField1_std_id.getText());
        String sex  = "Male";
        if(jRadioButton1_female_manage.isSelected()){
            sex = "Female";

        }
        
//        else if (jRadioButton2_male_manage.isSelected())
//        {
//            sex = "Male";
//        }

        if(verifText()){
            student std = new student();

            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, phone, address);
            //MainForm.jLabel2_StdCount.setText(" Student Count = " +Integer.toString(TeacherFunction.countData("student")));
        
        
        //refresh jtable
        manageStudents.jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Phone","Address"}));
       std.fillStudentJtable(manageStudents.jTable1, "");
        
        }
        
      
        
    }//GEN-LAST:event_jButton1_editstd_manageActionPerformed

    private void jButton1_removestd_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_removestd_manageActionPerformed
        
       // we deleting a student, grade must also be deleted that was affected
       
       /*
       
       ALTER TABLE score
    add CONSTRAINT fk_score_student
    FOREIGN KEY (`student_id`)
    REFERENCES student (Id)
    on DELETE CASCADE 
       
       
       
       
       
       */
       
       
       if(jTextField1_std_id.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "No Student Selected");
           
       }
       else
       {
       int id = Integer.valueOf(jTextField1_std_id.getText());
        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null);
        std.fillStudentJtable(jTable1, "");
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Phone","Address"}));
        std.fillStudentJtable(jTable1, jTextField1_val_find.getText());
        MainForm.jLabel2_StdCount.setText(" Student Count = " +Integer.toString(TeacherFunction.countData("student")));
       
        jTextField1_std_id.setText("");
        jTextField1_address_manage.setText("");
        jTextField1_FN_manage.setText("");
        jTextField1_LN_manage.setText("");
        jTextField1_phonenum_manage.setText("");
        jRadioButton2_male_manage.setSelected(false);
        jRadioButton1_female_manage.setSelected(false);
       }
    }//GEN-LAST:event_jButton1_removestd_manageActionPerformed

    private void jButton1_addstd_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addstd_manageActionPerformed
        AddStudentForm AddSf = new AddStudentForm();
            AddSf.setVisible(true);
            AddSf.pack();
            AddSf.setLocationRelativeTo(null);
            AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1_addstd_manageActionPerformed

    int rowIndex;
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        //get a new radiomodel
        model = (DefaultTableModel)jTable1.getModel();
        
        rowIndex = jTable1.getSelectedRow();
        jRadioButton2_male_manage.setSelected(false);
            jRadioButton1_female_manage.setSelected(false);
        if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
        {
            jRadioButton2_male_manage.setSelected(true);
            
        }
        else{
            
            jRadioButton1_female_manage.setSelected(true);
        }
        jTextField1_std_id.setText(model.getValueAt(rowIndex, 0).toString());
       jTextField1_FN_manage.setText(model.getValueAt(rowIndex, 1).toString());
       jTextField1_LN_manage.setText(model.getValueAt(rowIndex, 2).toString());
       jTextField1_phonenum_manage.setText(model.getValueAt(rowIndex, 4).toString());
      jTextField1_address_manage.setText(model.getValueAt(rowIndex, 5).toString());
       
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
       {
             rowIndex = jTable1.getSelectedRow();
            jTextField1_std_id.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField1_FN_manage.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField1_LN_manage.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField1_phonenum_manage.setText(model.getValueAt(rowIndex, 4).toString());
            jTextField1_address_manage.setText(model.getValueAt(rowIndex, 5).toString());
            
            if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
        {
            jRadioButton2_male_manage.setSelected(true);
            jRadioButton1_female_manage.setSelected(false);
        }
        else{
            jRadioButton2_male_manage.setSelected(false);
            jRadioButton1_female_manage.setSelected(true);
        }
       }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField1_val_findKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_val_findKeyTyped
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Phone","Address"}));

        std.fillStudentJtable(jTable1, jTextField1_val_find.getText());
    }//GEN-LAST:event_jTextField1_val_findKeyTyped

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
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_addstd_manage;
    private javax.swing.JButton jButton1_editstd_manage;
    private javax.swing.JButton jButton1_removestd_manage;
    private javax.swing.JLabel jLabel1_newstdTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_female_manage;
    private javax.swing.JRadioButton jRadioButton2_male_manage;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_FN_manage;
    private javax.swing.JTextField jTextField1_LN_manage;
    private javax.swing.JTextField jTextField1_address_manage;
    private javax.swing.JTextField jTextField1_phonenum_manage;
    private javax.swing.JTextField jTextField1_std_id;
    private javax.swing.JTextField jTextField1_val_find;
    // End of variables declaration//GEN-END:variables
}
