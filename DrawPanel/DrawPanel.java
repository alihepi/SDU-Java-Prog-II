package com.sdu.firstproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DrawPanel extends JPanel implements MouseListener{
    
    int x,y;
    
    public DrawPanel(){
        setSize(640,480);
        
        //Border
        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
        setBorder(blackBorder);
        
        //MouseListener
        addMouseListener(this);
        
    }

    public void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        //type casting
        
        g2d.setPaint(Color.blue);
        g2d.fillOval(x, y, 10, 10);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       x = e.getX();
       y = e.getY();
       repaint();    
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
