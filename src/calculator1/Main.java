/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    
    public static void main(String[] args) {
        Simple s = new Simple();
                s.setTitle("CalCulator");
                s.setSize(400, 405);
                s.setVisible(true);
                s.setResizable(false);
                s.setLocation(1200, 200);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
