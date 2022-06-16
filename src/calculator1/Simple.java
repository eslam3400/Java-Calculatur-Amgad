/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author El_Fiky ^_^
 */
public class Simple extends ABSTRACT_SIM {
    
    double ans,num;
    int cal;
    
    //Action
    action act = new action();
    
    
    public Simple(){
        
        //this.setLayout(new GridLayout(5 , 4 , 0 , 0 ) );
        
        this.setLayout(null);
        
        //Buttons
        this.Button0 = new JButton("0");
        this.Button1 = new JButton("1");
        this.Button2 = new JButton("2");
        this.Button3 = new JButton("3");
        this.Button4 = new JButton("4");
        this.Button5 = new JButton("5");
        this.Button6 = new JButton("6");
        this.Button7 = new JButton("7");
        this.Button8 = new JButton("8");
        this.Button9 = new JButton("9");
        this.Buttonc = new JButton("c");
        this.Button10 = new JButton("+");
        this.Button11 = new JButton("-");
        this.Button12 = new JButton("/");
        this.Button13 = new JButton("*");
        this.Button14 = new JButton(".");
        this.Button15 = new JButton("=");
        this.Button16 = new JButton("<--");
        this.Button17 = new JButton("SQRT");
        
        
        //Text
        this.text = new JTextField();
        
        //Labels
        this.label = new JLabel("");
        
        //Radios
        this.radio1 = new JRadioButton("ON");
        this.radio2 = new JRadioButton("OFF");
        this.radio3 = new JRadioButton("DARK MODE ");
        this.radio4 = new JRadioButton("NORMAL ");
        
        this.g1 = new ButtonGroup();
        this.g2 = new ButtonGroup();
        
        this.add(text);
        
        this.add(label);
        
        this.add(Button0);
        this.add(Button1);
        this.add(Button2);
        this.add(Button3);
        this.add(Buttonc);
        this.add(Button4);
        this.add(Button5);
        this.add(Button6);
        this.add(Button7);
        this.add(Button8);
        this.add(Button9);
        this.add(Button10);
        this.add(Button11);
        this.add(Button12);
        this.add(Button13);
        this.add(Button14);
        this.add(Button15);
        this.add(Button16);
        this.add(Button17);

        
        g1.add(radio1);
        g1.add(radio2);
        this.add(radio1);
        this.add(radio2);
        g2.add(radio3);
        g2.add(radio4);
        this.add(radio3);
        this.add(radio4);
        
        normal();
        
        //Desgine
        label.setBounds(200, 0, 400, 20);
        text.setBounds(0, 20, 400, 100);
        
        //FIRST COL
        radio1.setBounds(0, 121, 100, 25);
        radio2.setBounds(0,146, 100, 25);
        Button7.setBounds(0, 170, 100, 50);
        Button4.setBounds(0, 220, 100, 50);
        Button1.setBounds(0, 270, 100, 50);
        Button14.setBounds(0, 320, 100, 50);
       
        //SECOND COL
        radio3.setBounds(100, 121, 100, 25);
        radio4.setBounds(100, 146, 100, 25);
        Button8.setBounds(100, 170, 100, 50);
        Button5.setBounds(100, 220, 100, 50);
        Button2.setBounds(100, 270, 100, 50);
        Button0.setBounds(100, 320, 100, 50);
      
        //COL 3
        Buttonc.setBounds(200, 120, 100, 50);
        Button9.setBounds(200, 170, 100, 50);
        Button6.setBounds(200, 220, 100, 50);
        Button3.setBounds(200, 270, 100, 50);
        Button15.setBounds(200, 320, 100, 50);
        
        //COL 4
        Button16.setBounds(300, 120, 100, 50);
        Button12.setBounds(300, 170, 100, 50);
        Button13.setBounds(300, 220, 100, 50);
        Button11.setBounds(300, 270, 100, 50);
        Button10.setBounds(300, 320, 100, 50);

        
        
        Button0.addActionListener(act);
        Button1.addActionListener(act);
        Button2.addActionListener(act);
        Button3.addActionListener(act);
        Buttonc.addActionListener(act);
        Button4.addActionListener(act);
        Button5.addActionListener(act);
        Button6.addActionListener(act);
        Button7.addActionListener(act);
        Button8.addActionListener(act);
        Button9.addActionListener(act);
        Button10.addActionListener(act);
        Button11.addActionListener(act);
        Button12.addActionListener(act);
        Button13.addActionListener(act);
        Button14.addActionListener(act);
        Button15.addActionListener(act);
        Button16.addActionListener(act);
        Button17.addActionListener(act);
        
        
        radio1.addActionListener(act);
        radio2.addActionListener(act);
        radio3.addActionListener(act);
        radio4.addActionListener(act);
       
}

    public void operation()
    {
        switch(cal)
        {
            case 1: 
                ans = num + Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                ans=0;
                break;
            case 2 :
                ans = num - Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                ans=0;
                break;
            case 4 :
                ans = num * Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                ans=0;
                break;
            case 3 :
                ans = num / Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                ans=0;
                break;
            case 5 :
                ans=num%Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                ans=0;
                break;
        }
    }
    
    private class action implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Button0)
        {
            text.setText(text.getText() + "0");
        }
        else if(e.getSource()==Button1)
        {
            text.setText(text.getText() + "1");
        }
        else if(e.getSource()==Button2)
        {
            text.setText(text.getText() + "2");
        }
        else if(e.getSource()==Button3)
        {
            text.setText(text.getText() + "3");
        }
        else if(e.getSource()==Button4)
        {
            text.setText(text.getText() + "4");
        }
        else if(e.getSource()==Button5)
        {
            text.setText(text.getText() + "5");
        }
        else if(e.getSource()==Button6)
        {
            text.setText(text.getText() + "6");
        }
        else if(e.getSource()==Button7)
        {
            text.setText(text.getText() + "7");
        }
        else if(e.getSource()==Button8)
        {
            text.setText(text.getText() + "8");
        }
        else if(e.getSource()==Button9)
        {
            text.setText(text.getText() +"9");
        }
        else if(e.getSource()==Buttonc)
        {
            text.setText("");
            label.setText("");
        }
        else if(e.getSource()==Button10)
        {
            num = Double.parseDouble(text.getText());
             label.setText(num + "+");
            text.setText("");
            cal = 1;
        }
        else if(e.getSource()==Button11)
        {
                num = Double.parseDouble(text.getText());
            label.setText(num + "-");
            text.setText("");
            cal = 2;
        }
        else if(e.getSource()==Button12)
        {
                num = Double.parseDouble(text.getText());
            label.setText(num + "/");
            text.setText("");
            cal = 3;
        }
        else if(e.getSource()==Button13)
        {
                num = Double.parseDouble(text.getText());
             label.setText(num + "*");
            text.setText("");
            cal = 4;
        }
        else if(e.getSource()==Button14)
        {
            text.setText(text.getText() + "." );
        }
        else if(e.getSource()==Button16)
        {
            int lenght = text.getText().length();
            int NumToDel = text.getText().length()-1;
            String Store;
            if(lenght>0)
            {
                StringBuffer BackOne = new StringBuffer(text.getText());
                BackOne.deleteCharAt(NumToDel);
                Store = BackOne.toString();
                text.setText(Store);
            }
        }
        else if(e.getSource()==Button15)
        {
            operation();
            label.setText("");
        }
        else if(e.getSource()==Button16)
        {
            int cal = 5;
            num = Double.parseDouble(text.getText());
             label.setText(num + "%");
            text.setText("");
        }
        else if(e.getSource()==radio1)
        {
            enable();
        }
        else if(e.getSource()==radio2)
        {
            disable();
        }
        else if(e.getSource()==radio3)
        {
            dark();
        }
        else if(e.getSource()==radio4)
        {
            normal();
        }
    }
    }
    
    
    }