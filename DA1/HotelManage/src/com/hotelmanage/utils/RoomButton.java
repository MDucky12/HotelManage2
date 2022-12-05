/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author hoang
 */
public class RoomButton extends JButton{

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        setBackground(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
//    public RoomButton(String txt) {
//        this.setSize(60, 60);
//        this.setText(txt);
//        this.setFocusable(false);
//    }
//    
//    public RoomButton(String txt, String link, boolean enable){
//        this.setSize(150, 100);
//        this.setText(txt);
//        this.setFocusable(false);
//        ImageIcon icon = new ImageIcon(link);
//        this.setIcon(icon);
//        this.setForeground(Color.red);
//        this.setBackground(Color.lightGray);
//        this.setEnabled(enable);
//        this.setBorder(BorderFactory.createLineBorder(Color.yellow,20, enable));
//    }
//

    public RoomButton() {
        setColor(Color.white);
        colorOver = new Color(0x3ea9ff);
        colorClick = new Color(0x0081e8);
        borderColor = new Color(255,255,255);
        setContentAreaFilled(false);
        this.setFocusable(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(isOver())
                    setBackground(colorOver);
                else 
                    setBackground(color);
            }   
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //paint radius
        g2.setColor(borderColor);
        //
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        
        g2.setColor(getBackground());
        
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(g); 
    } 
}
