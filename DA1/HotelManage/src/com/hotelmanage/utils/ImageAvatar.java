/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.utils;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
//import javax.swing.JLabel;


/**
 *
 * @author hoang
 */
public class ImageAvatar extends JComponent {

    private Icon icon;
    private int borderSize;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        if(icon != null){
            int width = getWidth();
            int height = getHeight();
            int dimenter = Math.max(width, height);
            
            int x = width / 2 - dimenter / 2;
            int y = height / 2 - dimenter / 2;
            
            Dimension size = getAutoSize(icon, dimenter);
            
            BufferedImage img = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
            
            Graphics2D g2Img = img.createGraphics();
            g2Img.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2Img.fillOval(0, 0, dimenter, dimenter);
            
            Composite composite = g2Img.getComposite();
            g2Img.setComposite(AlphaComposite.SrcIn);
            g2Img.drawImage(toImage(icon), 0, 0, size.width, size.height, null);
            
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(img, x, y,null);
        }
        super.paintComponent(g);
    }

    private Dimension getAutoSize(Icon image, int size) {
        int w = size;
        int h = size;
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / iw;
        double scale = Math.max(xScale, yScale);
        
        int width = (int) (scale*iw);
        int height = (int) (scale*ih);
        
        return new Dimension(width,height);
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
}
