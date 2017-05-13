/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author hp
 */
import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Signin extends JFrame
{
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    /*private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;*/
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPasswordField tpass;
    private JTextField tuser;
    
    public Signin() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.tuser = new JTextField();
        this.tpass = new JPasswordField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
       /* this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem1 = new JMenuItem();*/
        this.setDefaultCloseOperation(3);
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 5));
        this.jPanel2.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel1.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel1.setText("STUDENT NAME");
        this.jLabel2.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel2.setText("PASSWORD");
        this.tuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signin.this.tuserActionPerformed(evt);
            }
        });
        this.jButton1.setFont(new Font("Times New Roman", 1, 24));
        this.jButton1.setText("LOGIN");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signin.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Times New Roman", 1, 18));
        this.jButton2.setText("CANCEL");
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signin.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setBackground(new Color(51, 153, 255));
        this.jButton3.setFont(new Font("Times New Roman", 1, 18));
        this.jButton3.setText("JOIN US");
        this.jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signin.this.jButton3ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(211, 211, 211).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 157, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1).addComponent(this.jLabel2, -2, 134, -2))).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(371, 371, 371).addComponent(this.tuser, -2, 92, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(352, 352, 352).addComponent(this.tpass, -2, 155, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(116, 116, 116).addComponent(this.jButton2).addGap(146, 146, 146).addComponent(this.jButton3))).addContainerGap(373, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(116, 116, 116).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.tuser, -2, -1, -2)).addGap(45, 45, 45).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.tpass, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 158, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton3)).addGap(109, 109, 109)));
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(23, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jPanel2, -1, -1, 32767).addContainerGap()));
       /* this.jMenu1.setText("ShowTable");
        this.jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(68, 2));
        this.jMenuItem1.setText("DataTable");
        this.jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signin.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.setJMenuBar(this.jMenuBar1);*/
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }
    
    private void tuserActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        final String name = this.tuser.getText();
        final String password = String.valueOf(this.tpass.getPassword());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "1234");
            final PreparedStatement ps = con.prepareStatement("select password from feed where name=? ");
            ps.setString(1, name);
            final ResultSet rs = ps.executeQuery();
            rs.next();
            final String dbpass = rs.getString(1);
            if (password.equals(dbpass)) {
                new After_Login(name).setVisible(true);
               
            }
            else{
             JOptionPane.showMessageDialog(this, "wrong user or password!!","Inane error",JOptionPane.ERROR_MESSAGE);
            this.tuser.setBackground(Color.red);
            this.tpass.setBackground(Color.BLUE);
            tuser.setText("");
            tpass.setText("");
            tuser.requestFocus();
            }
             
             con.close();
        }
        catch (Exception e) {
                         JOptionPane.showMessageDialog(this, "wrong user or password!!","Inane error",JOptionPane.ERROR_MESSAGE);

           // this.tuser.setBackground(Color.red);
            //this.tpass.setBackground(Color.BLUE);
             tuser.setText("");
            tpass.setText("");
            tuser.requestFocus();
        }
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        System.exit(0);
    }
    
   /* private void jMenuItem1ActionPerformed(final ActionEvent evt) {
        final SowTable st = new SowTable();
        st.setVisible(true);
        this.setVisible(false);
    }*/
    
    private void jButton3ActionPerformed(final ActionEvent evt) {
        final Signup su = new Signup();
        su.setVisible(true);
        this.setVisible(false);
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }
}