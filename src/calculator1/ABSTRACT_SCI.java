/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author El_Fiky ^_^
 */
public abstract class ABSTRACT_SCI extends JFrame{
    JButton Button0;
    JButton Button1;
    JButton Button2;
    JButton Button3;
    JButton Button4;
    JButton Button5;
    JButton Button6;
    JButton Button7;
    JButton Button8;
    JButton Button9;
    JButton Button10;
    JButton Button11;
    JButton Button12;
    JButton Button13;
    JButton Button14;
    JButton Button15;
    JButton Button16;
    JButton Button17;
    JButton Button18;
    JButton Button19;
    JButton Button20;
    JButton Button21;
    JButton Button22;
    JButton Button23;
    JButton Button24;
    JButton Button25;
    JButton Button26;
    JButton Button27;
    JButton Button28;
    JButton Button29;
    JButton Button30;
    JButton Button31;
    JButton Button32;
    JButton Buttonc;
    
    JTextField text;
    
    JLabel label;
    
    JRadioButton radio1;
    JRadioButton radio2;
    JRadioButton radio3;
    JRadioButton radio4;
    
    
    ButtonGroup g1;
    ButtonGroup g2;
    
        public void enable()
    {
        Button0.setEnabled(true);
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button10.setEnabled(true);
        Button11.setEnabled(true);
        Button12.setEnabled(true);
        Button13.setEnabled(true);
        Button14.setEnabled(true);
        Button15.setEnabled(true);
        Button16.setEnabled(true);
        Button17.setEnabled(true);
        Button18.setEnabled(true);
        Button19.setEnabled(true);
        Button20.setEnabled(true);
        Button21.setEnabled(true);
        Button22.setEnabled(true);
        Button23.setEnabled(true);
        Button24.setEnabled(true);
        Button25.setEnabled(true);
        Button26.setEnabled(true);
        Button27.setEnabled(true);
        Button28.setEnabled(true);
        Button29.setEnabled(true);
        Button30.setEnabled(true);
        Button31.setEnabled(true);
        Button32.setEnabled(true);
        radio3.setEnabled(true);
        radio4.setEnabled(true);
        Buttonc.setEnabled(true);
        radio2.setEnabled(true);
        radio3.setEnabled(true);
        radio4.setEnabled(true);
        text.setEditable(true);
        
        //to not be clicked again in this case
        radio1.setEnabled(false);
       
    }
        public void disable()
    {
        text.setText("");
        Button0.setEnabled(false);
        Button1.setEnabled(false);
        Button2.setEnabled(false);
        Button3.setEnabled(false);
        Button4.setEnabled(false);
        Button5.setEnabled(false);
        Button6.setEnabled(false);
        Button7.setEnabled(false);
        Button8.setEnabled(false);
        Button9.setEnabled(false);
        Button10.setEnabled(false);
        Button11.setEnabled(false);
        Button12.setEnabled(false);
        Button13.setEnabled(false);
        Button14.setEnabled(false);
        Button15.setEnabled(false);
        Button16.setEnabled(false);
        Button17.setEnabled(false);
        Button18.setEnabled(false);
        Button19.setEnabled(false);
        Button20.setEnabled(false);
        Button21.setEnabled(false);
        Button22.setEnabled(false);
        Button23.setEnabled(false);
        Button24.setEnabled(false);
        Button25.setEnabled(false);
        Button26.setEnabled(false);
        Button27.setEnabled(false);
        Button28.setEnabled(false);
        Button29.setEnabled(false);
        Button30.setEnabled(false);
        Button31.setEnabled(false);
        Button32.setEnabled(false);
        radio3.setEnabled(false);
        radio4.setEnabled(false);
        Buttonc.setEnabled(false);
        radio2.setEnabled(false);
        radio3.setEnabled(false);
        radio4.setEnabled(false);
        text.setEditable(false);
        label.setText("");
        
        //to not be clicked again in this case
        radio1.setEnabled(true);
    }
    
    public void dark()
{
    text.setBackground(Color.black);
    label.setBackground(Color.black);
    
    radio1.setBackground(Color.black);
    radio2.setBackground(Color.black);
    radio3.setBackground(Color.black);
    radio4.setBackground(Color.black);
    Buttonc.setBackground(Color.black);
    Button0.setBackground(Color.black);
    Button1.setBackground(Color.black);
    Button2.setBackground(Color.black);
    Button3.setBackground(Color.black);
    Button4.setBackground(Color.black);
    Button5.setBackground(Color.black);
    Button6.setBackground(Color.black);
    Button7.setBackground(Color.black);
    Button8.setBackground(Color.black);
    Button9.setBackground(Color.black);
    Button10.setBackground(Color.black);
    Button11.setBackground(Color.black);
    Button12.setBackground(Color.black);
    Button13.setBackground(Color.black);
    Button14.setBackground(Color.black);
    Button15.setBackground(Color.black);
    Button16.setBackground(Color.black);
    Button17.setBackground(Color.black);
    Button18.setBackground(Color.black);
    Button19.setBackground(Color.black);
    Button20.setBackground(Color.black);
    Button21.setBackground(Color.black);
    Button22.setBackground(Color.black);
    Button23.setBackground(Color.black);
    Button24.setBackground(Color.black);
    Button25.setBackground(Color.black);
    Button26.setBackground(Color.black);
    Button27.setBackground(Color.black);
    Button28.setBackground(Color.black);
    Button29.setBackground(Color.black);
    Button30.setBackground(Color.black);
    Button31.setBackground(Color.black);
    Button32.setBackground(Color.black);
    
    text.setForeground(Color.red);
    label.setForeground(Color.red);
    
    radio1.setForeground(Color.red);
    radio2.setForeground(Color.red);
    radio3.setForeground(Color.red);
    radio4.setForeground(Color.red);
    
    Buttonc.setForeground(Color.red);
    Button0.setForeground(Color.red);
    Button1.setForeground(Color.red);
    Button2.setForeground(Color.red);
    Button3.setForeground(Color.red);
    Button4.setForeground(Color.red);
    Button5.setForeground(Color.red);
    Button6.setForeground(Color.red);
    Button7.setForeground(Color.red);
    Button8.setForeground(Color.red);
    Button9.setForeground(Color.red);
    Button10.setForeground(Color.red);
    Button11.setForeground(Color.red);
    Button12.setForeground(Color.red);
    Button13.setForeground(Color.red);
    Button14.setForeground(Color.red);
    Button15.setForeground(Color.red);
    Button16.setForeground(Color.red);
    Button17.setForeground(Color.red);
    Button18.setForeground(Color.red);
    Button19.setForeground(Color.red);
    Button20.setForeground(Color.red);
    Button21.setForeground(Color.red);
    Button22.setForeground(Color.red);
    Button23.setForeground(Color.red);
    Button24.setForeground(Color.red);
    Button25.setForeground(Color.red);
    Button26.setForeground(Color.red);
    Button27.setForeground(Color.red);
    Button28.setForeground(Color.red);
    Button29.setForeground(Color.red);
    Button30.setForeground(Color.red);
    Button31.setForeground(Color.red);
    Button32.setForeground(Color.red);

    
}
     
     public void normal()
     {
         text.setBackground(Color.WHITE);
        label.setBackground(Color.white);

        radio1.setBackground(Color.white);
        radio2.setBackground(Color.white);
        radio3.setBackground(Color.white);
        radio4.setBackground(Color.white);

        Buttonc.setBackground(Color.white);
        Button0.setBackground(Color.white);
        Button1.setBackground(Color.white);
        Button2.setBackground(Color.white);
        Button3.setBackground(Color.white);
        Button4.setBackground(Color.white);
        Button5.setBackground(Color.white);
        Button6.setBackground(Color.white);
        Button7.setBackground(Color.white);
        Button8.setBackground(Color.white);
        Button9.setBackground(Color.white);
        Button10.setBackground(Color.white);
        Button11.setBackground(Color.white);
        Button12.setBackground(Color.white);
        Button13.setBackground(Color.white);
        Button14.setBackground(Color.white);
        Button15.setBackground(Color.white);
        Button16.setBackground(Color.white);
        Button17.setBackground(Color.white);
        Button18.setBackground(Color.white);
        Button19.setBackground(Color.white);
        Button20.setBackground(Color.white);
        Button21.setBackground(Color.white);
        Button22.setBackground(Color.white);
        Button23.setBackground(Color.white);
        Button24.setBackground(Color.white);
        Button25.setBackground(Color.white);
        Button26.setBackground(Color.white);
        Button27.setBackground(Color.white);
        Button28.setBackground(Color.white);
        Button29.setBackground(Color.white);
        Button30.setBackground(Color.white);
        Button31.setBackground(Color.white);
        Button32.setBackground(Color.white);

        text.setForeground(Color.black);
        label.setForeground(Color.black);

        radio1.setForeground(Color.black);
        radio2.setForeground(Color.black);
        radio3.setForeground(Color.black);
        radio4.setForeground(Color.black);

        Buttonc.setForeground(Color.black);
        Button0.setForeground(Color.black);
        Button1.setForeground(Color.black);
        Button2.setForeground(Color.black);
        Button3.setForeground(Color.black);
        Button4.setForeground(Color.black);
        Button5.setForeground(Color.black);
        Button6.setForeground(Color.black);
        Button7.setForeground(Color.black);
        Button8.setForeground(Color.black);
        Button9.setForeground(Color.black);
        Button10.setForeground(Color.black);
        Button11.setForeground(Color.black);
        Button12.setForeground(Color.black);
        Button13.setForeground(Color.black);
        Button14.setForeground(Color.black);
        Button15.setForeground(Color.black);
        Button16.setForeground(Color.black);
        Button17.setForeground(Color.black);
        Button18.setForeground(Color.black);
        Button19.setForeground(Color.black);
        Button20.setForeground(Color.black);
        Button21.setForeground(Color.black);
        Button22.setForeground(Color.black);
        Button23.setForeground(Color.black);
        Button24.setForeground(Color.black);
        Button25.setForeground(Color.black);
        Button26.setForeground(Color.black);
        Button27.setForeground(Color.black);
        Button28.setForeground(Color.black);
        Button29.setForeground(Color.black);
        Button30.setForeground(Color.black);
        Button31.setForeground(Color.black);
        Button32.setForeground(Color.black);

     }
}
