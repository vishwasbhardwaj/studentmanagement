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
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
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

public class UadminPanel extends JFrame
{
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
   /* private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;*/
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    
    public UadminPanel() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jButton1 = new JButton();
        //this.jMenuBar1 = new JMenuBar();
        //this.jMenu1 = new JMenu();
        //this.jMenuItem1 = new JMenuItem();
        //this.jMenu2 = new JMenu();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(204, 204, 204));
        this.jPanel1.setBackground(new Color(102, 102, 102));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "ADMIN", 0, 0, new Font("Times New Roman", 1, 18)));
        this.jLabel1.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel1.setText("ADMIN");
        this.jLabel2.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel2.setText("PASSWORD");
        this.jButton1.setBackground(new Color(0, 102, 255));
        this.jButton1.setFont(new Font("Times New Roman", 1, 18));
        this.jButton1.setText("SUBMIT");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                UadminPanel.this.jButton1ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(61, 61, 61).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 97, -2).addComponent(this.jLabel2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 162, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jPasswordField1, -2, 115, -2).addGap(21, 21, 21)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jTextField1, -2, 65, -2).addGap(55, 55, 55)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton1).addGap(174, 174, 174)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 33, -2).addComponent(this.jTextField1, -2, -1, -2)).addGap(74, 74, 74).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jPasswordField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, 32767).addComponent(this.jButton1).addGap(47, 47, 47)));
       /* this.jMenu1.setText("showData");
        this.jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(84, 2));
        this.jMenuItem1.setText("GO TO TABLE");
        this.jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                UadminPanel.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
       this.jMenu2.setText("Edit");
        this.jMenuBar1.add(this.jMenu2);
        this.setJMenuBar(this.jMenuBar1);*/
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(344, 344, 344).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(344, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(135, 135, 135).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(14, 32767)));
        this.pack();
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        final String user = this.jTextField1.getText();
        final String password = String.valueOf(this.jPasswordField1.getPassword());
     
        if (user.equals("akash") && password.equals("akash")) {
            JOptionPane.showMessageDialog(this, "Welcome " + user);
              final SowTable st = new SowTable();
        st.setVisible(true);
        this.setVisible(false);
        }
        else  {
            JOptionPane.showMessageDialog(this, "wrong user or password!!");
            this.jTextField1.setBackground(Color.red);
            this.jPasswordField1.setBackground(Color.BLUE);
        } 
          // 
    }
    
   /* private void jMenuItem1ActionPerformed(final ActionEvent evt) {
        final SowTable st = new SowTable();
        st.setVisible(true);
        this.setVisible(false);
    }*/
    
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
            Logger.getLogger(UadminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(UadminPanel.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(UadminPanel.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(UadminPanel.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UadminPanel().setVisible(true);
            }
        });
    }
}
