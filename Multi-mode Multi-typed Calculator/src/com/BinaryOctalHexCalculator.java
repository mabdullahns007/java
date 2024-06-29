

//                                      BINARY OCTAL HEX CALCULATOR


package com.labexam;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BinaryOctalHexCalculator
{
    //check if input is binary
    public static boolean isBinaryNumber(String s)
    {
        try
        {
            Integer.parseInt(s,2);
            return true;
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
    }

    // check if input is octal
    public static boolean isOctal(String s)
    {
        try
        {
            Long.parseLong(s,8);
            return true;
        }
        catch(NumberFormatException ex)
        {
            return false;
        }

    }

    // check if input is hexadecimal
   public static boolean isHexadecimal(String s)
   {
       try
       {
           Long.parseLong(s, 16);
           return true;
       }
       catch (NumberFormatException ex)
       {
           return false;
       }
   }

   // main method
    public static void main(String[] args)
    {
        // frame
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,350);
        frame.setLocation(425,95);
        frame.setTitle("Binary Octal Hexadecimal Calculator");
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

        // Text Display
        JTextArea guide=new JTextArea();
        guide.setBackground(Color.GRAY);
        guide.setEditable(false);
        guide.setForeground(Color.BLACK);
        guide.setBounds(320,50,130,30);
        guide.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        guide.setText("Enter Hex characters in"+"\n"+"uppercase or lowercase");
        c.add(guide);


        // label user guide
        JLabel userGuide=new JLabel("USER GUIDE");
        userGuide.setBounds(320,131,80,100);
        userGuide.setForeground(Color.RED);
        userGuide.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(userGuide);

        //TextArea Error Box
        JTextArea errorAreaBox= new JTextArea();
        errorAreaBox.setBackground(Color.GRAY);
        errorAreaBox.setEditable(false);
        errorAreaBox.setForeground(Color.BLACK);
        errorAreaBox.setBounds(320,200,130,60);
        errorAreaBox.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(errorAreaBox);

        // 1-  ComboBox NumberSystem
        String[] dropOptionsNumSystem ={"SELECT","BINARY","OCTAL","HEXADECIMAL"};
        JComboBox numberSystem =new JComboBox(dropOptionsNumSystem);
        numberSystem.setBounds(20,50,105,28);
        numberSystem.setForeground(Color.BLACK);
        numberSystem.setBackground(Color.RED);
        c.add(numberSystem);

        // label numberSystem
        JLabel labelNumberSystem =new JLabel("NUMBER SYSTEM");
        labelNumberSystem.setBounds(20,8,110,50);
        labelNumberSystem.setForeground(Color.RED);
        labelNumberSystem.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelNumberSystem);

        // 2-  ComboBox Operations
        String[] dropOptionsOperations={"SELECT","ADDITION","SUBTRACTION","MULTIPLICATION","DIVISION","REMAINDER"};
        JComboBox operationsComboBox=new JComboBox(dropOptionsOperations);
        operationsComboBox.setBounds(190,50,105,28);
        operationsComboBox.setForeground(Color.BLACK);
        operationsComboBox.setBackground(Color.RED);
        c.add(operationsComboBox);

        // label Operations
        JLabel labelOperations=new JLabel("OPERATIONS");
        labelOperations.setBounds(206,8,110,50);
        labelOperations.setForeground(Color.RED);
        labelOperations.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelOperations);

        // label input 1
        JLabel labelInput1=new JLabel("OPERAND 1");
        labelInput1.setBounds(53,99,80,100);
        labelInput1.setForeground(Color.RED);
        labelInput1.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelInput1);

        // textField input 1
        JTextField textInput1=new JTextField();
        textInput1.setBounds(185,136,120,28);
        textInput1.setForeground(Color.RED);
        textInput1.setBackground(Color.BLACK);
        c.add(textInput1);

        // label input 2
        JLabel labelInput2=new JLabel("OPERAND 2");
        labelInput2.setBounds(51,131,80,100);
        labelInput2.setForeground(Color.RED);
        labelInput2.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelInput2);

        // textField input 2
        JTextField textInput2=new JTextField();
        textInput2.setBounds(185,168,120,28);
        textInput2.setForeground(Color.RED);
        textInput2.setBackground(Color.BLACK);
        c.add(textInput2);

        // label result
        JLabel labelResult=new JLabel("RESULT");
        labelResult.setBounds(74,163,80,100);
        labelResult.setForeground(Color.RED);
        labelResult.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelResult);

        // textField result
        JTextField textResult=new JTextField();
        textResult.setBounds(185,200,120,28);
        textResult.setForeground(Color.BLACK);
        textResult.setBackground(Color.GRAY);
        textResult.setEditable(false);
        c.add(textResult);

        //Button clear
        JButton clearButton= new JButton("CLEAR");
        clearButton.setBounds(20,232,105,28);
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.BLACK);
        clearButton.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("");
                errorAreaBox.setText("");
                textInput1.setText("");
                textInput2.setText("");
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
        buttonResult.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Getting index of number system type from dropOptionsNumSystem array
                int numberSystemSelectedIndex=numberSystem.getSelectedIndex();


                // Getting index of operation from dropOptionsOperations array
                int operationIndex =operationsComboBox.getSelectedIndex();
                if(numberSystemSelectedIndex>0 & operationIndex>0)
                {

                    switch(numberSystemSelectedIndex)
                    {
                        // Binary
                        case 1:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {
                                try
                                {
                                    if(isBinaryNumber(textInput1.getText()) & isBinaryNumber(textInput2.getText()))
                                    {
                                        // convert binary to decimal for calculations
                                        int binaryInp1=Integer.parseInt(textInput1.getText(),2);
                                        int binaryInp2=Integer.parseInt(textInput2.getText(),2);

                                        switch(operationIndex)
                                        {
                                            // addition
                                            case 1:
                                                int binaryAddition=binaryInp1+binaryInp2;
                                                String resultBinaryAddition=Integer.toBinaryString(binaryAddition);
                                                textResult.setText(resultBinaryAddition);
                                                break;

                                            // subtraction
                                            case 2:
                                                int binarySubtraction=binaryInp1-binaryInp2;
                                                if(binarySubtraction<0)
                                                {
                                                    errorAreaBox.setText("operand 1 should be\ngreater or equal-to\noperand 2");
                                                    break;
                                                }
                                                else
                                                {
                                                    String resultBinarySubtraction=Integer.toBinaryString(binarySubtraction);
                                                    textResult.setText(resultBinarySubtraction);
                                                }
                                                break;

                                            // multiplication
                                            case 3:
                                                int binaryMultiplication=binaryInp1*binaryInp2;
                                                String resultBinaryMultiplication=Integer.toBinaryString(binaryMultiplication);
                                                textResult.setText(resultBinaryMultiplication);
                                                break;

                                            // division
                                            case 4:
                                                if(binaryInp1==0 | binaryInp2==0)
                                                {
                                                    errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                }
                                                else
                                                {
                                                    int binaryDivision = binaryInp1 / binaryInp2;
                                                    String resultBinaryDivision = Integer.toBinaryString(binaryDivision);
                                                    textResult.setText(resultBinaryDivision);
                                                }
                                                break;
                                            // remainder
                                            case 5:
                                                if(binaryInp1==0 | binaryInp2==0)
                                                {
                                                    errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                }
                                                else
                                                {
                                                    int binaryRemainder = binaryInp1 % binaryInp2;
                                                    String resultBinaryRemainder = Integer.toBinaryString(binaryRemainder);
                                                    textResult.setText(resultBinaryRemainder);
                                                }
                                                break;
                                        }

                                    }
                                    else
                                    {
                                        errorAreaBox.setText("Please enter binary\noperands");
                                    }
                                }
                                catch(java.lang.NumberFormatException k)
                                {
                                    errorAreaBox.setText("Please enter binary\noperands");
                                }

                            }
                            else
                            {
                                errorAreaBox.setText("Please enter\noperands");
                            }
                            break;

                        // Octal
                        case 2:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {
                                try
                                {
                                    // convert octal to decimal for calculations
                                    long octalInp1=Long.parseLong(textInput1.getText(),8);
                                    long octalInp2=Long.parseLong(textInput2.getText(),8);

                                    if(isOctal(textInput1.getText()) & isOctal(textInput2.getText()))
                                    {
                                         if(octalInp1<0 | octalInp2<0)
                                         {
                                             errorAreaBox.setText("Please enter\n positive operands");
                                             break;
                                         }
                                         else
                                         {
                                             switch (operationIndex)
                                             {
                                                 // addition
                                                 case 1:
                                                     long octalAddition = octalInp1 + octalInp2;
                                                     String resultOctalAddition = Long.toOctalString(octalAddition);
                                                     textResult.setText(resultOctalAddition);
                                                     break;

                                                 // subtraction
                                                 case 2:
                                                     long octalSubtraction = octalInp1 - octalInp2;

                                                     if(octalSubtraction<0)
                                                     {
                                                       errorAreaBox.setText("operand 1 should be\ngreater or equal-to\noperand 2");
                                                       break;
                                                     }
                                                     else
                                                     {
                                                         String resultOctalSubtraction = Long.toOctalString(octalSubtraction);
                                                         textResult.setText(resultOctalSubtraction);
                                                     }
                                                     break;

                                                 // multiplication
                                                 case 3:
                                                     long octalMultiplication = octalInp1 * octalInp2;
                                                     String resultOctalMultiplication = Long.toOctalString(octalMultiplication);
                                                     textResult.setText(resultOctalMultiplication);
                                                     break;

                                                 // division
                                                 case 4:
                                                     if (octalInp1 == 0 | octalInp2 == 0)
                                                     {
                                                         errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                     }
                                                     else
                                                     {
                                                         long octalDivision = octalInp1 / octalInp2;
                                                         String resultOctalDivision = Long.toOctalString(octalDivision);
                                                         textResult.setText(resultOctalDivision);
                                                     }
                                                     break;
                                                 // remainder
                                                 case 5:
                                                     if (octalInp1 == 0 | octalInp2 == 0) {
                                                         errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                     } else {
                                                         long octalRemainder = octalInp1 % octalInp2;
                                                         String resultOctalRemainder = Long.toOctalString(octalRemainder);
                                                         textResult.setText(resultOctalRemainder);
                                                     }
                                                     break;
                                             }
                                         }
                                    }
                                    else
                                    {
                                        errorAreaBox.setText("Please enter\nOctal operands ");
                                    }
                                }
                                catch(java.lang.NumberFormatException k)
                                {
                                    errorAreaBox.setText("Please enter\nOctal operands ");
                                }
                            }
                            else
                            {
                                errorAreaBox.setText("Please enter\noperands");
                            }
                            break;

                        // Hexadecimal
                        case 3:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {
                                try
                                {
                                    if(isHexadecimal(textInput1.getText()) & isHexadecimal(textInput2.getText()))
                                    {
                                        // convert hexadecimal to decimal for calculations
                                        long hexInp1=Integer.parseInt(textInput1.getText(),16);
                                        long hexInp2=Integer.parseInt(textInput2.getText(),16);

                                        if(hexInp1<0 | hexInp2<0)
                                        {
                                            errorAreaBox.setText("Please enter\npositive operands");
                                            break;
                                        }
                                        else
                                        {
                                            switch(operationIndex)
                                            {
                                                // addition
                                                case 1:
                                                    long hexAddition=hexInp1+hexInp2;
                                                    String resultHexAddition=Long.toHexString(hexAddition);
                                                    textResult.setText(resultHexAddition.toUpperCase());
                                                    break;

                                                // subtraction
                                                case 2:
                                                    long hexSubtraction =hexInp1-hexInp2;
                                                    if(hexSubtraction<0)
                                                    {
                                                        errorAreaBox.setText("operand 1 should be\ngreater or equal-to\noperand 2");
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        String resultHexSubtraction=Long.toHexString(hexSubtraction);
                                                        textResult.setText(resultHexSubtraction.toUpperCase());
                                                    }
                                                    break;

                                                // multiplication
                                                case 3:
                                                    long hexMultiplication =hexInp1*hexInp2;
                                                    String resultHexMultiplication=Long.toHexString(hexMultiplication);
                                                    textResult.setText(resultHexMultiplication.toUpperCase());
                                                    break;

                                                // division
                                                case 4:
                                                    if(hexInp1==0 | hexInp2==0)
                                                    {
                                                        errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                    }
                                                    else
                                                    {
                                                        long hexDivision = hexInp1 / hexInp2;
                                                        String resultHexDivision = Long.toHexString(hexDivision);
                                                        textResult.setText(resultHexDivision.toUpperCase());
                                                    }
                                                    break;

                                                // remainder
                                                case 5:
                                                    if(hexInp1==0 | hexInp2==0)
                                                    {
                                                        errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                                    }
                                                    else
                                                    {
                                                        long hexRemainder = hexInp1 % hexInp2;
                                                        String resultHexRemainder = Long.toHexString(hexRemainder);
                                                        textResult.setText(resultHexRemainder.toUpperCase());
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        errorAreaBox.setText("Please enter\nHex operands ");
                                    }
                                }
                                catch(java.lang.NumberFormatException k)
                                {
                                    errorAreaBox.setText("Please enter\nHex operands ");
                                }
                            }
                            else
                            {
                                errorAreaBox.setText("Please enter\noperands");
                            }
                            break;
                    }
                }
                else
                {
                    String emptyError= "Please select\ndatatype &\noperations";
                    errorAreaBox.setText(emptyError);
                }
            }
        });
        frame.setVisible(true);
    }
}


