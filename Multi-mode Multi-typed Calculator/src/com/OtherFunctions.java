

//                                          FUNCTIONS WINDOW

package com.labexam;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OtherFunctions
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

        //Button Back
        JButton backButton = new JButton("BACK");
        backButton.setBounds(20,270,105,28);
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.BLACK);
        backButton.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(backButton);
        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                MainPage.main(null);

            }
        });


        // 3-  textField DOUBLE
        JTextField numberSystemTextField =new JTextField("DOUBLE");
        numberSystemTextField.setFont(new Font("Bahnschrift",Font.PLAIN,13));
        numberSystemTextField.setBounds(20,50,105,28);
        numberSystemTextField.setForeground(Color.BLACK);
        numberSystemTextField.setEditable(false);
        numberSystemTextField.setBackground(Color.GRAY);
        c.add(numberSystemTextField);


        // label Number System
        JLabel labelNumberSystem=new JLabel("INPUT DATATYPE");
        labelNumberSystem.setBounds(20,8,110,50);
        labelNumberSystem.setForeground(Color.RED);
        labelNumberSystem.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelNumberSystem);


        //  ComboBox functions
        String[] dropOptionsFunctions ={"SELECT","sin","cos","tan","sec","csc","cot","ln(Base e)","log(Base 10)","percentage"};
        JComboBox functionsComboBox =new JComboBox(dropOptionsFunctions);
        functionsComboBox.setBounds(150,50,105,28);
        functionsComboBox.setForeground(Color.BLACK);
        functionsComboBox.setBackground(Color.RED);
        c.add(functionsComboBox);


        // label functions
        JLabel labelFunctions =new JLabel("FUNCTIONS");
        labelFunctions.setBounds(168,8,110,50);
        labelFunctions.setForeground(Color.RED);
        labelFunctions.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelFunctions);


        // textField result
        JTextField textResult=new JTextField();
        textResult.setBounds(185,200,120,28);
        textResult.setForeground(Color.BLACK);
        textResult.setBackground(Color.GRAY);
        textResult.setEditable(false);
        c.add(textResult);

        // label result
        JLabel labelResult=new JLabel("RESULT");
        labelResult.setBounds(74,163,80,100);
        labelResult.setForeground(Color.RED);
        labelResult.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelResult);


        //TextArea
        JTextArea errorAreaBox= new JTextArea();
        errorAreaBox.setBackground(Color.GRAY);
        errorAreaBox.setEditable(false);
        errorAreaBox.setForeground(Color.BLACK);
        errorAreaBox.setBounds(320,200,130,60);
        errorAreaBox.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(errorAreaBox);

        // Text Display
        JTextArea guide=new JTextArea();
        guide.setBackground(Color.GRAY);
        guide.setEditable(false);
        guide.setForeground(Color.BLACK);
        guide.setBounds(320,50,130,45);
        guide.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        guide.setText("Enter values in degree\nfor trigonometric and\nhyperbolic functions ");
        c.add(guide);

        // label user guide
        JLabel userGuide=new JLabel("USER GUIDE");
        userGuide.setBounds(320,131,80,100);
        userGuide.setForeground(Color.RED);
        userGuide.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(userGuide);

        // textField input 2
        JTextField textInput =new JTextField();
        textInput.setBounds(185,168,120,28);
        c.add(textInput);
        textInput.setForeground(Color.RED);
        textInput.setBackground(Color.BLACK);

        // label input 2
        JLabel labelInput2=new JLabel("OPERAND ");
        labelInput2.setBounds(62,131,80,100);
        labelInput2.setForeground(Color.RED);
        labelInput2.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelInput2);

        //Button clear
        JButton clearButton= new JButton("CLEAR");
        clearButton.setBounds(20,232,105,28);
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.BLACK);
        clearButton.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(clearButton);
        clearButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textResult.setText("");
                errorAreaBox.setText("");
                textInput.setText("");
            }
        });

        //Button result
        JButton buttonResult=new JButton("GET RESULT");
        buttonResult.setBounds(185,232,120,28);
        buttonResult.setBackground(Color.RED);
        buttonResult.setForeground(Color.BLACK);
        buttonResult.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        buttonResult.setCursor(cursorV);
        c.add(buttonResult);
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int functionsSelectedIndex=functionsComboBox.getSelectedIndex();


                if(functionsSelectedIndex>0)
                {
                    try
                    {
                        if(!textInput.getText().isEmpty())
                        {
                            double input = Double.parseDouble(textInput.getText());
                            switch (functionsSelectedIndex)
                            {
                                // sin function
                                case 1:
                                    double sinFunction=Math.sin(Math.toRadians(input));
                                    textResult.setText(String.format("%.2f",sinFunction));
                                    break;

                                // cos function
                                case 2:
                                    double cosFunction=Math.cos(Math.toRadians(input));
                                    textResult.setText(String.format("%.2f",cosFunction));
                                    break;

                                // tan function
                                case 3:
                                    double tanFunction=Math.tan(Math.toRadians(input));
                                    double n= input/90;

                                    if(n%2.0==0)
                                    {
                                        textResult.setText(String.format("%.2f",tanFunction));
                                    }
                                    // tan is infinity at odd multiples of 90
                                    else if(n%2.0==1.0)
                                    {
                                        textResult.setText("∞");
                                    }
                                    else
                                    {
                                        textResult.setText(String.format("%.2f",tanFunction));
                                    }
                                    break;

                                // sec function
                                case 4:
                                    double CosFunction=Math.cos(Math.toRadians(input));
                                    double k= input/90;
                                    double secFunction=1/CosFunction;
                                    if(k%2.0==0)
                                    {
                                        textResult.setText(String.format("%.2f",secFunction));
                                    }
                                    else if(k%2==1)
                                    {
                                        textResult.setText("∞");
                                    }
                                    else
                                    {
                                        textResult.setText(String.format("%.2f",secFunction));
                                    }
                                    break;

                                // csc function
                                case 5:
                                    double SinFunction=(Math.sin(Math.toRadians(input)));
                                    double l=input/90;
                                    double cscFunction=1.0/SinFunction;

                                    // csc is infinity at even multiple of 90
                                    if(l%2.0==0)
                                    {
                                        textResult.setText("∞");
                                    }
                                    else if(l%2==1)
                                    {
                                        textResult.setText(String.format("%.2f",cscFunction));
                                    }
                                    else
                                    {
                                        textResult.setText(String.format("%.2f",cscFunction));
                                    }
                                    break;

                                //cot function
                                case 6:
                                    double TanFunction=(Math.tan(Math.toRadians(input)));
                                    double m=input/90;
                                    double cotFunction=1.0/TanFunction;

                                    // cot is infinity at even multiple of 90
                                    if(m%2.0==0)
                                    {
                                        textResult.setText("∞");
                                    }
                                    else if(m%2==1)
                                    {
                                        textResult.setText(String.format("%.2f",cotFunction));
                                    }
                                    else
                                    {
                                        textResult.setText(String.format("%.2f",cotFunction));
                                    }
                                    break;

                                // log base e
                                case 7:
                                    double logBaseEFunction=Math.log(input);
                                    if(input>0)
                                    {
                                        textResult.setText(String.format("%.4f",logBaseEFunction));
                                    }
                                    else
                                    {
                                        textResult.setText("∞");
                                    }
                                    break;

                                // log base 10
                                case 8:
                                    double logBase10Functions=Math.log10(input);
                                    if(input>0)
                                    {
                                        textResult.setText(String.format("%.4f",logBase10Functions));
                                    }
                                    else
                                    {
                                        textResult.setText("∞");
                                    }
                                    break;

                                case 9:
                                    double percentFunction= input*100;
                                    String percentString=String.format("%.3f",percentFunction);
                                    textResult.setText(String.format("%s%%",percentString));
                                    break;
                            }
                        }
                        else
                        {
                            errorAreaBox.setText("Please enter the\noperand");
                        }
                    }
                    catch(java.lang.NumberFormatException k)
                    {
                        errorAreaBox.setText("Please enter the\nvalue in\ndouble(radians)");
                    }
                }
                else
                {
                    String emptyError= "Please select a\nfunction";
                    errorAreaBox.setText(emptyError);
                }
            }
        });
        frame.setVisible(true);
    }

}
