/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professordatabase;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jason PC
 */
public class addScoreForm extends javax.swing.JFrame {

    /**
     * Creates new form addScoreForm
     */
    course c = new course();
    student std = new student();
    score sc = new score();
    private int colIndex;
    DefaultTableModel model;
    
    public addScoreForm() {
        initComponents();
        c.fillCourseCombo(jComboBox1_course_id_score);
        std.fillStudentJtable(jTable1_score, "");
        
        model = (DefaultTableModel)jTable1_score.getModel();
        jTable1_score.setRowHeight(40);
        jTable1_score.setShowGrid(true);
        jTable1_score.setGridColor(Color.red);
        jTable1_score.setSelectionBackground(Color.blue);
       
    }
    
    private void HideColumn(int par)
    {
        TableColumn col = jTable1_score.getColumnModel().getColumn(colIndex);
        col.setMaxWidth(0);
        col.setMaxWidth(0);
        col.setPreferredWidth(0);
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_final_score = new javax.swing.JTextField();
        jTextField2_std_id_score = new javax.swing.JTextField();
        jComboBox1_course_id_score = new javax.swing.JComboBox<>();
        jButton1_add_score = new javax.swing.JButton();
        jButton2_cancel_score = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_score = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_desc_score = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Score");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course ID:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Final Grade:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student ID:");
        jLabel4.setToolTipText("");

        jButton1_add_score.setText("Add");
        jButton1_add_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_add_scoreActionPerformed(evt);
            }
        });

        jButton2_cancel_score.setText("Cancel");
        jButton2_cancel_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_cancel_scoreActionPerformed(evt);
            }
        });

        jTable1_score.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Phone", "Address"
            }
        ));
        jTable1_score.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_scoreMouseClicked(evt);
            }
        });
        jTable1_score.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1_scoreKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_score);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Description:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1_final_score)
                                    .addComponent(jTextField2_std_id_score)
                                    .addComponent(jComboBox1_course_id_score, 0, 170, Short.MAX_VALUE)
                                    .addComponent(jTextField1_desc_score)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jButton1_add_score, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2_cancel_score, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2_std_id_score, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1_course_id_score))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_final_score, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_desc_score, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_add_score, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_cancel_score, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1_scoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_scoreMouseClicked

        int rowIndex = jTable1_score.getSelectedRow();
        jTextField2_std_id_score.setText(jTable1_score.getValueAt(rowIndex, 0).toString());
        
        
        
//        rowIndex = jTable1_score.getSelectedRow();
//
//        if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
//        {
//            jRadioButton2_male_manage.setSelected(true);
//            jRadioButton1_female_manage.setSelected(false);
//        }
//        else{
//            jRadioButton2_male_manage.setSelected(false);
//            jRadioButton1_female_manage.setSelected(true);
//        }
//        jTextField1_std_id.setText(model.getValueAt(rowIndex, 0).toString());
//        jTextField1_FN_manage.setText(model.getValueAt(rowIndex, 1).toString());
//        jTextField1_LN_manage.setText(model.getValueAt(rowIndex, 2).toString());
//        jTextField1_phonenum_manage.setText(model.getValueAt(rowIndex, 4).toString());
//        jTextField1_address_manage.setText(model.getValueAt(rowIndex, 5).toString());

    }//GEN-LAST:event_jTable1_scoreMouseClicked

    private void jTable1_scoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1_scoreKeyReleased
//        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
//        {
//            rowIndex = jTable1_score.getSelectedRow();
//            jTextField1_std_id.setText(model.getValueAt(rowIndex, 0).toString());
//            jTextField1_FN_manage.setText(model.getValueAt(rowIndex, 1).toString());
//            jTextField1_LN_manage.setText(model.getValueAt(rowIndex, 2).toString());
//            jTextField1_phonenum_manage.setText(model.getValueAt(rowIndex, 4).toString());
//            jTextField1_address_manage.setText(model.getValueAt(rowIndex, 5).toString());
//
//            if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
//            {
//                jRadioButton2_male_manage.setSelected(true);
//                jRadioButton1_female_manage.setSelected(false);
//            }
//            else{
//                jRadioButton2_male_manage.setSelected(false);
//                jRadioButton1_female_manage.setSelected(true);
//            }
//        }
    }//GEN-LAST:event_jTable1_scoreKeyReleased

    private void jButton2_cancel_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_cancel_scoreActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton2_cancel_scoreActionPerformed

    private void jButton1_add_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_add_scoreActionPerformed
        
        
       int stdId = Integer.valueOf(jTextField2_std_id_score.getText());
        int crsId = c.getCourseId(jComboBox1_course_id_score.getSelectedItem().toString());
        double scr = Double.valueOf(jTextField1_final_score.getText());
        System.out.println(crsId);
        sc.insertUpdateDeleteStudent('i', stdId, crsId, scr, jTextField1_desc_score.getText() );
   
    try{
        editDeleteScore.jTable1_score.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Final Grade","Description" }));
    sc.fillScoreJtable(editDeleteScore.jTable1_score);
    }
    catch(Exception ex){
        
        System.out.println(ex.getMessage());
    }
    
    
    
    }//GEN-LAST:event_jButton1_add_scoreActionPerformed

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
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addScoreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_add_score;
    private javax.swing.JButton jButton2_cancel_score;
    private javax.swing.JComboBox<String> jComboBox1_course_id_score;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1_score;
    private javax.swing.JTextField jTextField1_desc_score;
    private javax.swing.JTextField jTextField1_final_score;
    private javax.swing.JTextField jTextField2_std_id_score;
    // End of variables declaration//GEN-END:variables
}