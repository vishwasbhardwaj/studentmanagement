/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
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
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SowTable extends JFrame
{
    private JButton jButton1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    
    public SowTable() {
        this.initComponents();
    }
    
   
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton1 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem1 = new JMenuItem();
        this.jMenu2 = new JMenu();
        this.jMenuItem2 = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(204, 255, 255));
        this.jTable1.setBackground(new Color(51, 153, 255));
        this.jTable1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 153, 153)));
        this.jTable1.setFont(new Font("Times New Roman", 1, 18));
        this.jTable1.setModel(new DefaultTableModel(new Object[][] 
        { { null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null }, 
            { null, null, null, null, null, null, null }, 
            { null, null, null, null, null, null, null } },
                new String[] {"name","mobile", "email", "gender", "standard","guardian","address" }){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jButton1.setFont(new Font("Times New Roman", 1, 24));
        this.jButton1.setText("OK");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SowTable.this.jButton1ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 1285, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(611, 611, 611).addComponent(this.jButton1))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 582, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1)));
        this.jMenu1.setText("signin");
        this.jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(83, 2));
        this.jMenuItem1.setText("signin");
        this.jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SowTable.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.jMenu2.setText("admin");
        this.jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        this.jMenuItem2.setText("adminPanel");
        this.jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SowTable.this.jMenuItem2ActionPerformed(evt);
            }
        });
        this.jMenu2.add(this.jMenuItem2);
        this.jMenuBar1.add(this.jMenu2);
        this.setJMenuBar(this.jMenuBar1);
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }
    
    
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
      
        final DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "1234");
            final PreparedStatement ps = con.prepareStatement("select * from feed ");
            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new String[] { rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) });
            }
            con.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "");
        }
    }
    
    private void jMenuItem1ActionPerformed(final ActionEvent evt) {
        final Signin si = new Signin();
        si.setVisible(true);
        this.setVisible(false);
    }
    
    private void jMenuItem2ActionPerformed(final ActionEvent evt) {
        final UadminPanel ua = new UadminPanel();
        ua.setVisible(true);
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
            Logger.getLogger(SowTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(SowTable.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(SowTable.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(SowTable.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SowTable().setVisible(true);
            }
        });
    }

    
    
}
 
