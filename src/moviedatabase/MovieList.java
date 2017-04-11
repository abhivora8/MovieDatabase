/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author abhishekvora
 */
public class MovieList extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    int i=1;
    
    public MovieList() {
        initComponents();
        
        jMenu_Movies.setOpaque(true);
        jMenu_Movies.setBackground(Color.lightGray);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String db,unm,pwd;
            db="jdbc:mysql://localhost:3306/dbs_project";
            unm="root";
            pwd="root";
            con=DriverManager.getConnection(db,unm,pwd);
            stmt=con.createStatement();
            
            String qry;
            int id;
            Vector comboBoxItems=new Vector();
            qry = "select dir_id from director";
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                id = Integer.parseInt(rs.getString("dir_id"));
                comboBoxItems.add(id);
            }    
            DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
            cmbBoxDir_Id.setModel(model);
            
            this.setSize(720, 430);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
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
        btnupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbBoxGenre = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtRelease = new javax.swing.JTextField();
        txtm_id = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        txtDirectorName = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();
        txttitle = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnload = new javax.swing.JButton();
        txtGenre = new javax.swing.JTextField();
        btnprevious = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        cmbBoxDir_Id = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Home = new javax.swing.JMenu();
        jMenu_Movies = new javax.swing.JMenu();
        jMenu_Users = new javax.swing.JMenu();
        jMenu_SignUp = new javax.swing.JMenu();
        jMenu_Review = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnupdate.setText("UPDATE");
        btnupdate.setEnabled(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(161, 295, 94, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Director");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(113, 116, 124, 21);

        cmbBoxGenre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "History", "Fiction", "Non-Fiction", "Drama", "Romance", "Action", "Comedy" }));
        cmbBoxGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxGenreActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBoxGenre);
        cmbBoxGenre.setBounds(249, 161, 158, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Release Date");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(122, 204, 104, 23);

        txtRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReleaseActionPerformed(evt);
            }
        });
        jPanel1.add(txtRelease);
        txtRelease.setBounds(249, 204, 346, 26);

        txtm_id.setEditable(false);
        jPanel1.add(txtm_id);
        txtm_id.setBounds(242, 32, 353, 26);

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnew.setText("INSERT NEW");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew);
        btnnew.setBounds(334, 248, 122, 29);
        jPanel1.add(txtDirectorName);
        txtDirectorName.setBounds(329, 114, 266, 26);

        btnnext.setText(">");
        btnnext.setEnabled(false);
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext);
        btnnext.setBounds(403, 342, 94, 29);
        jPanel1.add(txttitle);
        txttitle.setBounds(243, 70, 352, 26);

        btnsave.setText("SAVE");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(531, 295, 91, 29);

        btnfirst.setText("<<<");
        btnfirst.setEnabled(false);
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnfirst);
        btnfirst.setBounds(161, 342, 94, 29);

        btnload.setText("LOAD");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnload);
        btnload.setBounds(282, 295, 91, 29);

        txtGenre.setEditable(false);
        jPanel1.add(txtGenre);
        txtGenre.setBounds(413, 160, 182, 26);

        btnprevious.setText("<");
        btnprevious.setEnabled(false);
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnprevious);
        btnprevious.setBounds(282, 342, 91, 29);

        btnlast.setText(">>>");
        btnlast.setEnabled(false);
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });
        jPanel1.add(btnlast);
        btnlast.setBounds(531, 342, 90, 29);

        btndelete.setText("DELETE");
        btndelete.setEnabled(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);
        btndelete.setBounds(403, 295, 94, 29);

        cmbBoxDir_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxDir_IdActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBoxDir_Id);
        cmbBoxDir_Id.setBounds(249, 115, 62, 27);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MovieID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(113, 36, 123, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Genre");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(122, 161, 104, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Title ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 72, 95, 20);

        logo.setIcon(new javax.swing.ImageIcon("/Users/abhishekvora/Desktop/movieLogo.png")); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 0, 730, 410);

        jMenu_Home.setText("Home");
        jMenu_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_HomeMouseClicked(evt);
            }
        });
        jMenu_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_HomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Home);

        jMenu_Movies.setText("Movies");
        jMenu_Movies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_MoviesMouseClicked(evt);
            }
        });
        jMenu_Movies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_MoviesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Movies);

        jMenu_Users.setText("Users");
        jMenu_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_UsersMouseClicked(evt);
            }
        });
        jMenu_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_UsersActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Users);

        jMenu_SignUp.setText("Sign Up");
        jMenu_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_SignUpMouseClicked(evt);
            }
        });
        jMenu_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SignUpActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_SignUp);

        jMenu_Review.setText("Review");
        jMenu_Review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_ReviewMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Review);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try
        {
            String qry,id,title,director,category,release;
            id = txtm_id.getText();
            title = txttitle.getText();
            director = txtDirectorName.getText();
            release = txtRelease.getText();
            category = txtGenre.getText();

            qry="Update movie set m_name='"+title+"',dir_id='"+String.valueOf(cmbBoxDir_Id.getSelectedItem())+"',release_date='"+release+"',genre='"+category+"' where m_id="+id;
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Successfully Updated!!!!!!");
            
            txtGenre.setText("");
            txtDirectorName.setText("");
            txtRelease.setText("");
            txttitle.setText("");
            txtm_id.setText("");
            
            btnfirst.setEnabled(false);
            btnlast.setEnabled(false);
            btnnext.setEnabled(false);
            btnprevious.setEnabled(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void cmbBoxGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxGenreActionPerformed
        String a=(cmbBoxGenre.getSelectedItem()).toString();
        txtGenre.setText(a);
    }//GEN-LAST:event_cmbBoxGenreActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed

        int count = 0;
        try
        {
            String qry="select m_id from movie order by m_id";
            rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                count = Integer.parseInt(rs.getString("m_id"));               
            }
            count++;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        txtGenre.setText("");
        txtDirectorName.setText("");
        txtRelease.setText("");
        txttitle.setText("");
        String s = Integer.toString(i);
        txtm_id.setText(""+count);
        btnsave.setEnabled(true);
        btndelete.setEnabled(false);
        btnnext.setEnabled(false);
        btnprevious.setEnabled(false);
        btnlast.setEnabled(false);
        btnfirst.setEnabled(false);
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        try{
            rs.next();
            txtm_id.setText(rs.getString("m_id"));
            txtDirectorName.setText(rs.getString("dir_name"));
            txtRelease.setText(rs.getString("Release_Date"));
            txtGenre.setText(rs.getString("genre"));
            txttitle.setText(rs.getString("m_name"));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "End of results");
            try {
                rs.previous();
            } catch (SQLException ex) {
                
            }
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try
        {
            String qry,id,title,director,category,releasedate;
            title=txttitle.getText();
            director= String.valueOf(cmbBoxDir_Id.getSelectedItem());
            category=txtGenre.getText();
            releasedate=txtRelease.getText();
            id=txtm_id.getText();
            qry="insert into movie values("+id+",'"+title+"','"+director+"','"+category+"','"+releasedate+"',null,null)";
            stmt.executeUpdate(qry);
            i++;
            JOptionPane.showMessageDialog(null, "Successfully Saved!!!!!!");
            txtGenre.setText("");
            txtDirectorName.setText("");
            txtRelease.setText("");
            txttitle.setText("");
            txtm_id.setText("");
            
            btnfirst.setEnabled(false);
            btnlast.setEnabled(false);
            btnnext.setEnabled(false);
            btnprevious.setEnabled(false);
            btnsave.setEnabled(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
        try
        {
            String qry="select * from movie natural join director order by m_id";
            rs=stmt.executeQuery(qry);
            rs.first();
            int id = Integer.parseInt(rs.getString("m_id"));
            txtDirectorName.setText(rs.getString("dir_name"));
            txttitle.setText(rs.getString("m_name"));
            txtGenre.setText(rs.getString("genre"));        
            txtRelease.setText(rs.getString("release_date"));
            txtm_id.setText(rs.getString("m_ID"));
            
            btnfirst.setEnabled(true);
            btnlast.setEnabled(true);
            btnnext.setEnabled(true);
            btnprevious.setEnabled(true);
            btnload.setEnabled(true);
            btnsave.setEnabled(false);
            btndelete.setEnabled(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnloadActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        try{
            rs.previous();
            txtm_id.setText(rs.getString("m_id"));
            txtDirectorName.setText(rs.getString("dir_name"));
            txtRelease.setText(rs.getString("Release_Date"));
            txtGenre.setText(rs.getString("genre"));
            txttitle.setText(rs.getString("m_name"));
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "End of results");
            try {
                rs.next();
            } catch (SQLException ex) {
                
            }
        }
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try
        {
            String qry,id;
            id=txtm_id.getText();
            qry="delete from movie where m_id="+id;
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Successfully Deleted!!!!!!");
            txtGenre.setText("");
            txtDirectorName.setText("");
            txtRelease.setText("");
            txttitle.setText("");
            txtm_id.setText("");
            
            btnfirst.setEnabled(false);
            btnlast.setEnabled(false);
            btnnext.setEnabled(false);
            btnprevious.setEnabled(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        try{
            rs.first();
            txtm_id.setText(rs.getString("m_id"));
            txtDirectorName.setText(rs.getString("dir_name"));
            txtRelease.setText(rs.getString("Release_Date"));
            txtGenre.setText(rs.getString("genre"));
            txttitle.setText(rs.getString("m_name"));
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        try{
            rs.last();
            txtm_id.setText(rs.getString("m_id"));
            txtDirectorName.setText(rs.getString("dir_name"));
            txtRelease.setText(rs.getString("Release_Date"));
            txtGenre.setText(rs.getString("genre"));
            txttitle.setText(rs.getString("m_name"));
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnlastActionPerformed

    private void txtReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReleaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReleaseActionPerformed

    private void cmbBoxDir_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxDir_IdActionPerformed
        try
        {
            String qry;
            int id;
            
            id = (int)cmbBoxDir_Id.getSelectedItem();
            qry = "select dir_name from director where dir_id="+id;
            rs = stmt.executeQuery(qry);
            rs.first();
            txtDirectorName.setText(rs.getString("dir_name"));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_cmbBoxDir_IdActionPerformed

    private void jMenu_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_HomeMouseClicked
        Home frame = new Home();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu_HomeMouseClicked

    private void jMenu_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_HomeActionPerformed

    }//GEN-LAST:event_jMenu_HomeActionPerformed

    private void jMenu_MoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_MoviesMouseClicked
        MovieList frame = new MovieList();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu_MoviesMouseClicked

    private void jMenu_MoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_MoviesActionPerformed

    }//GEN-LAST:event_jMenu_MoviesActionPerformed

    private void jMenu_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_UsersMouseClicked
        UsersPage frame = new UsersPage();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu_UsersMouseClicked

    private void jMenu_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_UsersActionPerformed

    }//GEN-LAST:event_jMenu_UsersActionPerformed

    private void jMenu_SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_SignUpMouseClicked
        UserRegistration frame = new UserRegistration();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu_SignUpMouseClicked

    private void jMenu_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SignUpActionPerformed

    }//GEN-LAST:event_jMenu_SignUpActionPerformed

    private void jMenu_ReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_ReviewMouseClicked
        ReviewsPage frame = new ReviewsPage();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu_ReviewMouseClicked

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
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbBoxDir_Id;
    private javax.swing.JComboBox cmbBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Home;
    private javax.swing.JMenu jMenu_Movies;
    private javax.swing.JMenu jMenu_Review;
    private javax.swing.JMenu jMenu_SignUp;
    private javax.swing.JMenu jMenu_Users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtDirectorName;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtRelease;
    private javax.swing.JTextField txtm_id;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}