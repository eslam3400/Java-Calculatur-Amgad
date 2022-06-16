/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author El_Fiky ^_^
 */
public class Project extends BEGIN{
    
    JButton B1,B2,B3;
    
    Action a = new Action();
    
    public Project()
    {
        JPanel p = new JPanel();
        this.setTitle("CALCULATOR       ^_^");
        p.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(730, 30);
        this.B1 = new JButton("SIMPLE");
        this.B2 = new JButton("SCIENTIFIC");
        this.B3 = new JButton("PROGRAMMING");
        
        p.add(B1);
        p.add(B2);
        p.add(B3);
        
        
        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.GRAY);
        B3.setBackground(Color.DARK_GRAY);
        B1.setForeground(Color.RED);
        B2.setForeground(Color.RED);
        B3.setForeground(Color.RED);
        this.add(p);
        p.setBackground(Color.BLACK);
        B1.setBounds(50, 100, 200, 100);
        B2.setBounds(250, 100, 200, 100);
        B3.setBounds(50, 200, 400, 100);
        
        B1.addActionListener(a);
        B2.addActionListener(a);
        B3.addActionListener(a);
        
    }

    private class Action implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==B1)
            {
                Simple s = new Simple();
                s.setTitle("SIMPLE");
                s.setSize(400, 405);
                s.setVisible(true);
                s.setResizable(false);
                s.setLocation(300, 150);
            }
            else if(e.getSource()==B2)
            {
                Calculator1 c = new Calculator1();
                c.setTitle("SCIENTIFIC");
                c.setSize(500, 555);
                c.setVisible(true);
                c.setResizable(false);
                c.setLocation(1250, 200);
            }
            else if(e.getSource()==B3)
            {
                Programe p = new Programe();
                p.setTitle("PROGRAMMER");
                p.setSize(506, 604);
                p.setVisible(true);
                p.setResizable(false);
                p.setLocation(730, 410);
            }
        }
    }
}

