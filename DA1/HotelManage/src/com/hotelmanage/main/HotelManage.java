/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hotelmanage.main;

import com.hotelmange.utils.Frame;
//import com.hotelmange.utils.NotiPoint;
import java.awt.EventQueue;
import javax.swing.JPanel;

/**
 *
 * @author hoang
 */
public class HotelManage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });

//         JPanel panelIcon = new JPanel();
//         panelIcon.setVisible(true);
    }

}
