/*

                                              MULTI-MODE MULTI-TYPED CALCULATOR
                                                     LAB EXAM MIDTERM
                                                     FA21-BCS-044(2A)
                                                     Muhammad Abdullah

*/

package com.labexam;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage
{
    public static void main(String[] args)
    {
        // frame
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,350);
        frame.setLocation(425,95);
        frame.setTitle("Multi-mode Multi-typed Calculator");
        frame.setResizable(false);

        // container
        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);


        // Cursor Style
        Cursor cursorV=new Cursor(Cursor.HAND_CURSOR);

        // label Multi-mode Multi-typed Calculator
        JLabel labelNumberSystem =new JLabel("MULTI-MODE MULTI-TYPED CALCULATOR");
        labelNumberSystem.setBounds(95,50,300,60);
        labelNumberSystem.setForeground(Color.RED);
        labelNumberSystem.setFont(new Font("Bahnschrift",Font.PLAIN,15));
        c.add(labelNumberSystem);


        //Button decimal calculator
        JButton btn_decimalCalculator = new JButton("DECIMAL CALCULATOR");
        btn_decimalCalculator.setBounds(140,135,200,28);
        btn_decimalCalculator.setBackground(Color.RED);
        btn_decimalCalculator.setForeground(Color.BLACK);
        btn_decimalCalculator.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        btn_decimalCalculator.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(btn_decimalCalculator);
        btn_decimalCalculator.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                DecimalCalculator.main(null);
            }
        });

        //Button decimal calculator
        JButton btn_BinaryHexOctCal = new JButton("BINARY OCT HEX CALCULATOR");
        btn_BinaryHexOctCal.setBounds(118,175,245,28);
        btn_BinaryHexOctCal.setBackground(Color.RED);
        btn_BinaryHexOctCal.setForeground(Color.BLACK);
        btn_BinaryHexOctCal.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        btn_BinaryHexOctCal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(btn_BinaryHexOctCal);
        btn_BinaryHexOctCal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                BinaryOctalHexCalculator.main(null);
            }
        });


        // footer
        JLabel labelFooter =new JLabel("FA21-BCS-044 (2A)");
        labelFooter.setBounds(15,280,130,30);
        labelFooter.setForeground(Color.RED);
        labelFooter.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelFooter);


        //Button decimal calculator
        JButton btn_otherFunctions = new JButton("OTHER FUNCTIONS AND OPERATORS");
        btn_otherFunctions.setBounds(100,215,280,28);
        btn_otherFunctions.setBackground(Color.RED);
        btn_otherFunctions.setForeground(Color.BLACK);
        btn_otherFunctions.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        btn_otherFunctions.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(btn_otherFunctions);
        btn_otherFunctions.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                OtherFunctions.main(null);
            }
        });
        frame.setVisible(true);
    }

}
