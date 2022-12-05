/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmange.utils;

//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author duchmps23300
 */
public class Frame extends JFrame {

    public Frame() {
        //Set up JFrame
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1116, 700);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        //
        JPanel pnlWest = new JPanel();
        JPanel pnlEast = new JPanel();
        JPanel pnlIcon = new JPanel();

        pnlIcon.setBounds(10, 10 , 1, 10);
        pnlIcon.setBackground(Color.red);
        pnlWest.add(pnlIcon);

        pnlEast.setLayout(new CardLayout());
        pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));

        this.add(pnlEast, BorderLayout.EAST);
        this.add(pnlWest, BorderLayout.WEST);

        pnlEast.setPreferredSize(new Dimension(900, 700));
        pnlWest.setPreferredSize(new Dimension(216, 700));
        pnlWest.setBackground(new Color(0x1C1427));
        pnlEast.add(new MainScreen());

    }

}
