/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.main;

import com.hotelmanage.ui.button.RoomButton;
import com.hotelmanage.ui.panel.ImageAvatar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hoang
 */
//This frame for test
public class MyFrame extends JFrame {

    private JPanel pnl1;
    private RoomButton[] btn;

    public MyFrame() {
        

        RoomButton btn1 = new RoomButton();
        btn1.setSize(100, 70);
        btn1.setRadius(50);
        btn1.setBorder(null);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JOptionPane.showMessageDialog(null, "ban da click nut");
                
            }
        });
        
        ImageAvatar avata = new ImageAvatar();
        avata.setBounds(200, 10, 100, 100);
        ImageIcon icon = new ImageIcon("/home/hoang/Desktop/FPOLY/Ky4/DA1/HotelManage/src/com/hotelmanage/image/5918d8e9040516b65f93c75a9c5b8175.jpg");
        avata.setIcon(icon);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(btn1);
        this.add(avata);
    }


}
