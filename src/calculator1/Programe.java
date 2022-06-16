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
public class Programe extends ABSTRACT_P{
    double ans,num;
    String str = "";
    int cal;
    
    
    //Action
    action act = new action();
    
    JPanel P = new JPanel();
    
    public Programe(){
        
        //this.setLayout(new GridLayout(5 , 4 , 0 , 0 ) );
        JPanel P = new JPanel();
        P.setLayout(null);
        
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
        this.Button17 = new JButton("%");
        this.Button18 = new JButton("D -> B");               //done
        this.Button19 = new JButton("D -> OCT");          //done
        this.Button20 = new JButton("D -> HEX");         //done
        this.Button21 = new JButton("B   ->  D");               //done
        this.Button22 = new JButton("B   ->  OCT");         //done
        this.Button23 = new JButton("B   ->  HEXA");      //done
        this.Button24 = new JButton("OCT -> D");               //done
        this.Button25 = new JButton("OCT -> B");               //done
        this.Button26 = new JButton("OCT -> HEXA");      //done
        this.Button27 = new JButton("HEXA -> D");           //done
        this.Button28 = new JButton("HEXA -> B");           //
        this.Button29 = new JButton("HEXA -> OCT");     //
        this.Button30 = new JButton("A");
        this.Button31 = new JButton("B");
        this.Button32 = new JButton("C");
        this.Button33 = new JButton("D");
        this.Button34 = new JButton("E");
        this.Button35 = new JButton("F");
        
        //Text
        this.text = new JTextField();
        
        //Labels
        this.label = new JLabel("");
        
        //Radios
        this.radio1 = new JRadioButton("ON");
        this.radio2 = new JRadioButton("OFF");
        this.radio3 = new JRadioButton("DARK MODE ");
        this.radio4 = new JRadioButton("NORMAL ");
        this.radio5 = new JRadioButton("DEC");
        this.radio6 = new JRadioButton("BIN ");
        this.radio7 = new JRadioButton("OCT ");
        this.radio8 = new JRadioButton("HEXA");
        
        
        this.g1 = new ButtonGroup();
        this.g2 = new ButtonGroup();
        this.g3 = new ButtonGroup();
        
        P.add(text);
        
        P.add(label);
        
        P.add(Button0);
        P.add(Button1);
        P.add(Button2);
        P.add(Button3);
        P.add(Buttonc);
        P.add(Button4);
        P.add(Button5);
        P.add(Button6);
        P.add(Button7);
        P.add(Button8);
        P.add(Button9);
        P.add(Button10);
        P.add(Button11);
        P.add(Button12);
        P.add(Button13);
        P.add(Button14);
        P.add(Button15);
        P.add(Button16);
        P.add(Button17);
        P.add(Button18);
         P.add(Button19);
        P.add(Button20);
        P.add(Button21);
        P.add(Button22);
        P.add(Button23);
        P.add(Button24);
        P.add(Button25);
        P.add(Button26);
        P.add(Button27);
        P.add(Button28);
        P.add(Button29);
        P.add(Button30);
        P.add(Button31);
        P.add(Button32);
        P.add(Button33);
        P.add(Button34);
        P.add(Button35);
//        

        
        g1.add(radio1);
        g1.add(radio2);
        P.add(radio1);
        P.add(radio2);
        
        g2.add(radio3);
        g2.add(radio4);
        P.add(radio3);
        P.add(radio4);
        
        g3.add(radio5);
        g3.add(radio6);
        g3.add(radio7);
        g3.add(radio8);
        P.add(radio5);
        P.add(radio6);
        P.add(radio7);
        P.add(radio8);
        
        normal();
        
        this.add(P);
        
        //Desgine
        label.setBounds(200, 0, 400, 20);
        text.setBounds(0, 20, 506, 100);
        
        //FIRST COL
        radio1.setBounds(0, 120, 100, 31);
        radio2.setBounds(0,150 , 100, 25);
        Button7.setBounds(0, 170, 100, 50);
        Button4.setBounds(0, 220, 100, 50);
        Button1.setBounds(0, 270, 100, 50);
        Button14.setBounds(0, 320, 100, 50);
        Button18.setBounds(0, 370, 133, 50);
        Button21.setBounds(0, 420, 133, 50);
        Button24.setBounds(0, 470, 133, 50);
        Button27.setBounds(0, 520, 133, 50);
        
       
        //SECOND COL
        radio3.setBounds(100, 120, 100, 30);
        radio4.setBounds(100, 150, 100, 25);
        Button8.setBounds(100, 170, 100, 50);
        Button5.setBounds(100, 220, 100, 50);
        Button2.setBounds(100, 270, 100, 50);
        Button0.setBounds(100, 320, 100, 50);
        Button19.setBounds(133, 370, 133, 50);
        Button22.setBounds(133, 420, 133, 50);
        Button25.setBounds(133, 470, 133, 50);
        Button28.setBounds(133, 520, 133, 50);
      
        //COL 3
        Buttonc.setBounds(200, 120, 100, 50);
        Button9.setBounds(200, 170, 100, 50);
        Button6.setBounds(200, 220, 100, 50);
        Button3.setBounds(200, 270, 100, 50);
        Button15.setBounds(200, 320, 100, 50);
        Button20.setBounds(266, 370, 133, 50);
        Button23.setBounds(266, 420, 133, 50);
        Button26.setBounds(266, 470, 133, 50);
        Button29.setBounds(266, 520, 133, 50);
        
        //COL 4
        Button16.setBounds(300, 120, 100, 50);
        Button12.setBounds(300, 170, 100, 50);
        Button13.setBounds(300, 220, 100, 50);
        Button11.setBounds(300, 270, 100, 50);
        Button10.setBounds(300, 320, 100, 50);
        
        //COL 5
        Button30.setBounds(400, 120, 100, 50);
        Button31.setBounds(400, 170, 100, 50);
        Button32.setBounds(400, 220, 100, 50);
        Button33.setBounds(400, 270, 100, 50);
        Button34.setBounds(400, 320, 100, 50);
        Button35.setBounds(400, 370, 100, 50);
        radio5.setBounds(400, 420, 100, 40);
        radio6.setBounds(400, 460, 100, 40);
        radio7.setBounds(400, 495, 100, 40);
        radio8.setBounds(400, 530, 100, 40);
        

        
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
        Button18.addActionListener(act);
        Button19.addActionListener(act);
        Button20.addActionListener(act);
        Button21.addActionListener(act);
        Button22.addActionListener(act);
        Button23.addActionListener(act);
        Button24.addActionListener(act);
        Button25.addActionListener(act);
        Button26.addActionListener(act);
        Button27.addActionListener(act);
        Button28.addActionListener(act);
        Button29.addActionListener(act);
        Button30.addActionListener(act);
        Button31.addActionListener(act);
        Button32.addActionListener(act);
        Button33.addActionListener(act);
        Button34.addActionListener(act);
        Button35.addActionListener(act);
        radio1.addActionListener(act);
        radio2.addActionListener(act);
        radio3.addActionListener(act);
        radio4.addActionListener(act);
        radio5.addActionListener(act);
        radio6.addActionListener(act);
        radio7.addActionListener(act);
        radio8.addActionListener(act);
//       
}

//    public static void main(String[] args) {
//        Programe a = new Programe();
//                a.setTitle("CalCulator");
//                a.setSize(500, 504);
//                a.setVisible(true);
//                a.setResizable(false);
//                a.setLocation(1200, 200);
//                a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }


    public void operation()
    {
        switch(cal)
        {
            case 1: 
                ans = num + Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
               
                break;
            case 2 :
                ans = num - Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));

                break;
            case 4 :
                ans = num * Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
              
                break;
            case 3 :
                ans = num / Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                
                break;
            case 5 :
                ans=num%Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
              
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
            text.setText(text.getText() + "9");
        }
        else if(e.getSource()==Buttonc)
        {
            text.setText("");
            label.setText("");
        }
        else if(e.getSource()==Button10)
        {
            
            num += Double.parseDouble(text.getText());
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
        else if(e.getSource()==Button17)
        {
            int cal = 5;
            num = Double.parseDouble(text.getText());
             label.setText(num + "%");
            text.setText("");
        }
        else if(e.getSource()==Button18)
        {
            int DtoB = Integer.parseInt(text.getText());
            int  temp = DtoB;
            str = "";
            while(temp!=0)
            {
                int rem = temp %2;
                str = rem + str;
                temp = temp /2;
            }
            text.setText(str);
        }
        else if(e.getSource()==Button19)
        {
            int DtoOCT = Integer.parseInt(text.getText());
            int  temp = DtoOCT;
            str = "";
            while(temp!=0)
            {
                int rem = temp %8;
                str = rem + str;
                temp = temp /8;
            }
            text.setText(str);
        }
        else if(e.getSource()==Button20)
        {
            int DtoHEXA = Integer.parseInt(text.getText());
            char [] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int  temp = DtoHEXA;
            str = "";
            while(temp!=0)
            {
                int rem = temp %16;
                str = hexa[rem] + str;
                temp = temp /16;
            }
            text.setText(str);
        }
        else if(e.getSource()==Button21)
        {
            String str = text.getText();
            int temp = Integer.parseInt(str);
            int power = 0;
            int dec = 0;
            while(temp != 0)
            {
                int rem = temp %10;
                dec += (int)(rem*Math.pow(2, power));
                power++;
                temp = temp/10;
            }
            text.setText(Integer.toString(dec));
          }
        else if(e.getSource()==Button22)
        {
            String str = text.getText();
            int dec = Integer.parseInt(str, 2);
            String octal = Integer.toOctalString(dec);
            text.setText(octal);
        }
        else if(e.getSource()==Button23)
        {
            String str = text.getText();
            int dec = Integer.parseInt(str, 2);
            String hex = Integer.toHexString(dec);
            text.setText(hex);
        }
        else if(e.getSource()==Button24)
        {
            String str = text.getText();
            int i = Integer.parseInt(str, 8);
            text.setText(Integer.toString(i));
        }
        else if(e.getSource()==Button25)
        {
            int [] octNum = {0,1,10,11,100,101,110,111};
            long octNo = Long.parseLong(text.getText());
            long temp = octNo;
            long biNum = 0;
            long place = 1;
            while(temp!=0)
            {
                int rem = (int)(temp%10);
                biNum = octNum[rem]*place + biNum;
                temp /=10;
                place *=1000;
            }
            text.setText(Long.toString(biNum));
        }
        else if(e.getSource()==Button26)
        {
            String str = text.getText();
            int OCTtoDEC = Integer.parseInt(str, 8);
            int DtoHEXA = OCTtoDEC;
            char [] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int  temp = DtoHEXA;
            str = "";
            while(temp!=0)
            {
                int rem = temp %16;
                str = hexa[rem] + str;
                temp = temp /16;
            }
            text.setText(str);
        }
        else if(e.getSource()==Button27)
        {
            int no = Integer.parseInt(text.getText(), 16);
            text.setText(Integer.toString(no));
        }
        else if(e.getSource()==Button28)
        {
            int no = Integer.parseInt(text.getText(), 16);
            text.setText(Integer.toBinaryString(no));
        }
        else if(e.getSource()==Button29)
        {
            int no = Integer.parseInt(text.getText(), 16);
            text.setText(Integer.toOctalString(no));
        }
        
        
//        else if(e.getSource()==Button22)
//        {
//            
//            text.setText(Integer.toString(dec));
//        }
        else if(e.getSource()==Button30)
        {
            text.setText(text.getText() + "A");
        }
        else if(e.getSource()==Button31)
        {
            text.setText(text.getText() + "B");
        }
        else if(e.getSource()==Button32)
        {
            text.setText(text.getText() + "C");
        }
        else if(e.getSource()==Button33)
        {
            text.setText(text.getText() + "D");
        }
        else if(e.getSource()==Button34)
        {
            text.setText(text.getText() + "E");
        }
        else if(e.getSource()==Button35)
        {
            text.setText(text.getText() + "F");
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
            P.setBackground(Color.black);
        }
        else if(e.getSource()==radio4)
        {
            normal();
        }
        else if(e.getSource()==radio5)
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
            Button18.setEnabled(true);
            Button19.setEnabled(true);
            Button20.setEnabled(true);
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
            Button33.setEnabled(false);
            Button34.setEnabled(false);
            Button35.setEnabled(false);
            
        }
        else if(e.getSource()==radio6)
        {
            Button0.setEnabled(true);
            Button1.setEnabled(true);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            Button18.setEnabled(false);
            Button19.setEnabled(false);
            Button20.setEnabled(false);
            Button21.setEnabled(true);
            Button22.setEnabled(true);
            Button23.setEnabled(true);
            Button24.setEnabled(false);
            Button25.setEnabled(false);
            Button26.setEnabled(false);
            Button27.setEnabled(false);
            Button28.setEnabled(false);
            Button29.setEnabled(false);
            Button30.setEnabled(false);
            Button31.setEnabled(false);
            Button32.setEnabled(false);
            Button33.setEnabled(false);
            Button34.setEnabled(false);
            Button35.setEnabled(false);
        }
        else if(e.getSource()==radio7)
        {
            Button0.setEnabled(true);
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            Button18.setEnabled(false);
            Button19.setEnabled(false);
            Button20.setEnabled(false);
            Button21.setEnabled(false);
            Button22.setEnabled(false);
            Button23.setEnabled(false);
            Button24.setEnabled(true);
            Button25.setEnabled(true);
            Button26.setEnabled(true);
            Button27.setEnabled(false);
            Button28.setEnabled(false);
            Button29.setEnabled(false);
            Button30.setEnabled(false);
            Button31.setEnabled(false);
            Button32.setEnabled(false);
            Button33.setEnabled(false);
            Button34.setEnabled(false);
            Button35.setEnabled(false);
        }
        else if(e.getSource()==radio8)
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
            Button18.setEnabled(false);
            Button19.setEnabled(false);
            Button20.setEnabled(false);
            Button21.setEnabled(false);
            Button22.setEnabled(false);
            Button23.setEnabled(false);
            Button24.setEnabled(false);
            Button25.setEnabled(false);
            Button26.setEnabled(false);
            Button27.setEnabled(true);
            Button28.setEnabled(true);
            Button29.setEnabled(true);
            Button30.setEnabled(true);
            Button31.setEnabled(true);
            Button32.setEnabled(true);
            Button33.setEnabled(true);
            Button34.setEnabled(true);
            Button35.setEnabled(true);
        }
    }
    }
   
    
    
}
