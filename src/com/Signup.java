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
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Signup extends JFrame
{
    private JComboBox c;
    private JLabel dateandtime;
    private JRadioButton f;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenuBar jMenuBar1;
    private JMenuBar jMenuBar2;
    private JMenuBar jMenuBar3;
    private JMenuItem jMenuItem2;
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JRadioButton m;
    
    public Signup() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jMenuBar2 = new JMenuBar();
        this.jMenu3 = new JMenu();
        this.jMenu4 = new JMenu();
        this.jMenuBar3 = new JMenuBar();
        this.jMenu5 = new JMenu();
        this.jMenu6 = new JMenu();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jTextField4 = new JTextField();
        this.c = new JComboBox();
        this.jTextField5 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.m = new JRadioButton();
        this.f = new JRadioButton();
        this.jButton1 = new JButton();
        this.dateandtime = new JLabel();
        this.jButton2 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu2 = new JMenu();
        this.jMenuItem2 = new JMenuItem();
        this.jMenu3.setText("File");
        this.jMenuBar2.add(this.jMenu3);
        this.jMenu4.setText("Edit");
        this.jMenuBar2.add(this.jMenu4);
        this.jMenu5.setText("File");
        this.jMenuBar3.add(this.jMenu5);
        this.jMenu6.setText("Edit");
        this.jMenuBar3.add(this.jMenu6);
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(204, 204, 204));
        this.jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 5));
        this.jPanel1.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel1.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel1.setText("NAME");
        this.jLabel2.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel2.setText("PASSWORD");
        this.jLabel3.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel3.setText("MOBILE");
        this.jLabel4.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel4.setText("EMAIL");
        this.jLabel5.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel5.setText("GENDER");
        this.jLabel6.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel6.setText("COURSE");
        this.jLabel7.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel7.setText("GUARDIAN/FATHER NAME");
        this.jLabel8.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel8.setText("ADDRESS");
        this.jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jTextField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jTextField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jTextField3ActionPerformed(evt);
            }
        });
        this.c.setModel(new DefaultComboBoxModel<String>(new String[] { "SELECT COURSE", "JAVA", "PHP", "C++", "C" }));
        this.c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.cActionPerformed(evt);
            }
        });
        this.jTextField4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jTextField5ActionPerformed(evt);
            }
        });
        this.jTextField5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jTextField5ActionPerformed(evt);
            }
        });
        this.jPasswordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jPasswordField1ActionPerformed(evt);
            }
        });
        this.m.setText("MALE");
        this.m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.mActionPerformed(evt);
            }
        });
        this.f.setText("FEMALE");
        this.f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.fActionPerformed(evt);
            }
        });
        this.jButton1.setFont(new Font("Times New Roman", 1, 18));
        this.jButton1.setText("SIGNUP");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jButton1ActionPerformed(evt);
            }
        });
        this.dateandtime.setText("DATE AND TIME");
        this.jButton2.setBackground(new Color(0, 102, 255));
        this.jButton2.setFont(new Font("Times New Roman", 1, 18));
        this.jButton2.setText("GO TO SIGNIN");
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jButton2ActionPerformed(evt);
            }
        });
        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (Exception ex) {}
                    Signup.this.dateandtime.setText(String.valueOf(new Date()));
                }
            }
        });
        t1.start();
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(209, 209, 209).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPasswordField1, -2, 59, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.jLabel6).addComponent(this.jLabel4).addComponent(this.jLabel3).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(102, 102, 102).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(288, 288, 288).addComponent(this.jTextField1, -2, 59, -2)).addComponent(this.jTextField3, GroupLayout.Alignment.TRAILING, -2, 59, -2).addComponent(this.jTextField2, GroupLayout.Alignment.TRAILING, -2, 59, -2).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.m).addGap(166, 166, 166))))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.c, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.f).addGap(0, 0, 32767)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel7).addComponent(this.jLabel8)).addGap(250, 250, 250).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField4, -1, 68, 32767).addComponent(this.jTextField5))))).addGroup(jPanel1Layout.createSequentialGroup().addGap(447, 447, 447).addComponent(this.dateandtime)).addGroup(jPanel1Layout.createSequentialGroup().addGap(291, 291, 291).addComponent(this.jButton1).addGap(171, 171, 171).addComponent(this.jButton2))).addContainerGap(431, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(75, 75, 75).addComponent(this.dateandtime).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addGap(25, 25, 25).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jPasswordField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jTextField3, -2, -1, -2)).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField2, -2, -1, -2).addComponent(this.jLabel4)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.m).addComponent(this.f)).addGap(32, 32, 32).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.c, -2, -1, -2)).addGap(74, 74, 74).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.jTextField4, -2, -1, -2)).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8, -2, 29, -2).addComponent(this.jTextField5, -2, -1, -2)).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jButton2)).addContainerGap(46, 32767)));
        this.jMenu2.setText("Admin");
        this.jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        this.jMenuItem2.setText("AdminPanel");
        this.jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Signup.this.jMenuItem2ActionPerformed(evt);
            }
        });
        this.jMenu2.add(this.jMenuItem2);
        this.jMenuBar1.add(this.jMenu2);
        this.setJMenuBar(this.jMenuBar1);
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(20, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap()));
        this.pack();
    }
    
    private void jTextField2ActionPerformed(final ActionEvent evt) {
    }
    
    private void jTextField3ActionPerformed(final ActionEvent evt) {
    }
    private void jTextField4ActionPerformed(final ActionEvent evt) {
    }
    private void jTextField5ActionPerformed(final ActionEvent evt) {
    }
    
    private void cActionPerformed(final ActionEvent evt) {
    }
   
    private void jButton1ActionPerformed(final ActionEvent evt) {
        final String name = this.jTextField1.getText();
        final String pass = String.valueOf(this.jPasswordField1.getPassword());
        
        final long mobile = Integer.parseInt(this.jTextField3.getText());
       
        final String email = this.jTextField2.getText();
        String gender = " ";
        if (this.m.isSelected()) {
            gender = this.m.getText();
        }
        else {
            gender = this.f.getText();
        }
        final String course = String.valueOf(this.c.getSelectedItem());
          final String guardian = this.jTextField4.getText();
                  final String Address = this.jTextField5.getText();
        JOptionPane.showMessageDialog(this, name + "\n" + mobile + "\n" + email + "\n" + gender + "\n" + course+"\n"+guardian+"\n"+Address);
        this.jTextField1.setText("");
        this.jPasswordField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "1234");
            final PreparedStatement ps = con.prepareStatement("insert into feed(name,password,mobile,email,gender,standard,Guardian,Address)values(?,?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setLong(3, mobile);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, course);
            ps.setString(7,guardian );
            ps.setString(8, Address);
            final int a = ps.executeUpdate();
            con.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "");
        }
    }
    
    private void jMenuItem2ActionPerformed(final ActionEvent evt) {
        final UadminPanel ua = new UadminPanel();
        ua.setVisible(true);
        this.setVisible(false);
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        final Signin si = new Signin();
        si.setVisible(true);
        this.setVisible(false);
    }
    
    private void jTextField1ActionPerformed(final ActionEvent evt) {
    }
    
    private void jPasswordField1ActionPerformed(final ActionEvent evt) {
    }
    
    private void fActionPerformed(final ActionEvent evt) {
    }
    
    private void mActionPerformed(final ActionEvent evt) {
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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }
}
