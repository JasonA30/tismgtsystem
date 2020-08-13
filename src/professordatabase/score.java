
package professordatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jason PC
 */
public class score {
    
     public void insertUpdateDeleteStudent(char operation, Integer stud_id, Integer course_id, Double scr, String desc)
            
    {
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        //the i is for insert
        if(operation == 'd')//u is for update, d is for delet
        {
            try {
                ps = con.prepareStatement("DELETE FROM `score` WHERE `student_id` = ? AND `course_id` = ?");
           
                ps.setInt(1, stud_id);
                ps.setInt(2, course_id);
                if(ps.executeUpdate() > 0){
                    
                    JOptionPane.showMessageDialog(null, "Final Grade Removed");
                }
                
            
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (operation == 'i')
        {
            try {
                ps = con.prepareStatement(" INSERT INTO `score`(`student_id`, `course_id`, `final_score`, `description`) VALUES (?,?,?,?)");
                
                ps.setInt(1, stud_id);
                ps.setInt(2, course_id);
                ps.setDouble(3, scr);
                ps.setString(4, desc);
                
             
                if(ps.executeUpdate() > 0){
                    
                    JOptionPane.showMessageDialog(null, "Final Grade Posted");
                }
                
            
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `score` SET `final_score`= ? ,`description`= ? WHERE `student_id` = ? AND `course_id` = ?");
                
                ps.setDouble(1, scr);
                ps.setString(2, desc);
                ps.setInt(3, stud_id);
                ps.setInt(4, course_id);
             
                if(ps.executeUpdate() > 0){
                    
                    JOptionPane.showMessageDialog(null, "Final Grade Updated");
                }
                
            
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
    
    
}
      public void fillScoreJtable(JTable table)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `score`");
        
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[4];
                row [0] = rs.getInt(1);
                row [1] = rs.getInt(2);
                row [2] = rs.getDouble(3);
                row [3] = rs.getString(4);
                
                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      public void ShowAllScores(JTable table)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT `student_id`, first_name, last_name, label, final_score\n" +
                                        "FROM `score`\n" +
                                         "INNER JOIN student as stab on stab.id = `student_id`\n" +
                                         "INNER JOIN course as ctab on ctab.id = `course_id`");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];
                row [0] = rs.getInt(1);
                row [1] = rs.getString(2);
                row [2] = rs.getString(3);
                row [3] = rs.getString(4);
                row [4] = rs.getDouble(5);
                
                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
