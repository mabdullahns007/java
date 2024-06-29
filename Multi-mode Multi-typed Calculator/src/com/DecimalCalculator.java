

//                                           DECIMAL NUMBER SYSTEM MULTI-TYPED CALCULATOR


package com.labexam;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DecimalCalculator
{
     public static JTextArea errorAreaBox= new JTextArea();
     public static JTextField textResult=new JTextField();


    public static void main(String[] args)
    {

        // frame
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(425,95);
        frame.setTitle("Decimal Number System Calculator");
        frame.setResizable(false);




        // for cursor
        Cursor cursorV=new Cursor(Cursor.HAND_CURSOR);

        // container
        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        //TextArea Error box
        errorAreaBox.setBackground(Color.GRAY);
        errorAreaBox.setEditable(false);
        errorAreaBox.setForeground(Color.BLACK);
        errorAreaBox.setBounds(320,200,130,60);
        errorAreaBox.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(errorAreaBox);

        // label user guide
        JLabel userGuide=new JLabel("USER GUIDE");
        userGuide.setBounds(320,131,80,100);
        userGuide.setForeground(Color.RED);
        userGuide.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(userGuide);

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
        c.add(textInput2);
        textInput2.setForeground(Color.RED);
        textInput2.setBackground(Color.BLACK);

        // label result
        JLabel labelResult=new JLabel("RESULT");
        labelResult.setBounds(74,163,80,100);
        labelResult.setForeground(Color.RED);
        labelResult.setFont(new Font("Bahnschrift",Font.PLAIN,14));
        c.add(labelResult);


        // textField result
        textResult.setBounds(185,200,120,28);
        textResult.setForeground(Color.BLACK);
        textResult.setBackground(Color.GRAY);
        textResult.setEditable(false);
        c.add(textResult);



        // range of types label
        // Area user help
        JTextArea areaUserHelp =new JTextArea("FOR ACCURATE CALCULATIONS, CONSIDER OPERANDS AND RESULTS\nIN RANGE AS FOLLOW");
        areaUserHelp.setBounds(20,310,400,40);
        areaUserHelp.setForeground(Color.RED);
        areaUserHelp.setBackground(Color.BLACK);
        areaUserHelp.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(areaUserHelp);

        // area range of dataTypes
        JTextArea areaRange =new JTextArea("BYTE          -128 to 127\nSHORT       -32,768 to 32,767\nINT              -2,147,483,648 to 2,147,483,647\nLONG         -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\nFLOAT        3.4e-038 to 3.4e+038\nDOUBLE     1.7e-308 to 1.7e+308");
        areaRange.setBounds(20,350,400,130);
        areaRange.setForeground(Color.RED);
        areaRange.setBackground(Color.BLACK);
        areaRange.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(areaRange);




        // 1-  ComboBox datatype
        String[] dropOptionsDatatype={"SELECT","INT","BYTE","SHORT","LONG","FLOAT","DOUBLE"};
        JComboBox inputTypeCB=new JComboBox(dropOptionsDatatype);
        inputTypeCB.setBounds(20,50,105,28);
        inputTypeCB.setForeground(Color.BLACK);
        inputTypeCB.setBackground(Color.RED);
        c.add(inputTypeCB);

        // label datatype
        JLabel labelDataType=new JLabel("INPUT DATATYPES");
        labelDataType.setBounds(20,8,110,50);
        labelDataType.setForeground(Color.RED);
        labelDataType.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelDataType);


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


        // 3-  textField NumberSystem
        JTextField numberSystemTextField =new JTextField("DECIMAL");
        numberSystemTextField.setFont(new Font("Bahnschrift",Font.PLAIN,13));
        numberSystemTextField.setBounds(360,50,105,28);
        numberSystemTextField.setForeground(Color.BLACK);
        numberSystemTextField.setEditable(false);
        numberSystemTextField.setBackground(Color.GRAY);
        c.add(numberSystemTextField);


        // label Number System
        JLabel labelNumberSystem=new JLabel("NUMBER SYSTEM");
        labelNumberSystem.setBounds(360,8,110,50);
        labelNumberSystem.setForeground(Color.RED);
        labelNumberSystem.setFont(new Font("Bahnschrift",Font.PLAIN,12));
        c.add(labelNumberSystem);



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
                textInput1.setText("");
                textInput2.setText("");
            }
        });

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
            public void actionPerformed(ActionEvent e)
            {

                // Getting index of input combo-box array
                int dataTypeIndex=inputTypeCB.getSelectedIndex();


                // Getting index of operation combo-box array
                int operationIndex =operationsComboBox.getSelectedIndex();


               // conditions
                if(operationIndex>0 & dataTypeIndex>0)
                {
                    // conditions
                    switch(dataTypeIndex)
                    {
                        // int
                        case 1:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {

                                try
                                {
                                    int input1 = Integer.parseInt(textInput1.getText());
                                    int input2 = Integer.parseInt(textInput2.getText());



                                    switch (operationIndex)
                                    {
                                        // addition
                                        case 1:
                                            long intAddition =(long) input1 + input2;
                                            resultValidationInteger(intAddition);
                                            break;

                                        // subtraction
                                        case 2:
                                            long intSubtraction =(long) input1 - input2;
                                            resultValidationInteger(intSubtraction);
                                            break;

                                        // multiplication
                                        case 3:
                                            long intMultiplication =  (input1 * input2);
                                            resultValidationInteger(intMultiplication);
                                            break;

                                        // division
                                        case 4:
                                            if (input2 == 0)
                                            {
                                                errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                            }
                                            else
                                            {
                                                long intDivision = input1 / input2;
                                                resultValidationInteger(intDivision);
                                            }
                                            break;

                                        // remainder
                                        case 5:
                                            if (input2 == 0)
                                            {
                                                errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                            }
                                            else
                                            {
                                                long intRemainder = input1 % input2;
                                                resultValidationInteger(intRemainder);
                                            }
                                            break;

                                    }

                                }
                                catch(java.lang.NumberFormatException k)
                                {
                                    errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
                                }
                            }
                            else
                            {
                                errorAreaBox.setText("Please enter\noperands");
                            }
                            break;

                    // byte
                        case 2:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {

                                try
                                {
                                    byte input1 = Byte.parseByte(textInput1.getText());
                                    byte input2 = Byte.parseByte(textInput2.getText());

                                    switch (operationIndex)
                                    {
                                        // addition
                                        case 1:
                                            long byteAddition=(input1+input2);
                                            resultValidationByte(byteAddition);

                                            break;

                                        // subtraction
                                        case 2:
                                            long byteSubtraction = (input1 - input2);
                                            resultValidationByte(byteSubtraction);
                                            break;

                                        // multiplication
                                        case 3:
                                            long byteMultiplication = (input1 * input2);
                                            resultValidationByte(byteMultiplication);
                                            break;

                                        // division
                                        case 4:
                                            if (input2 == 0)
                                            {
                                                errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                            }
                                            else
                                            {
                                                long byteDivision =  (input1 / input2);
                                                resultValidationByte(byteDivision);
                                            }
                                            break;

                                        // remainder
                                        case 5:
                                            if (input2 == 0)
                                            {
                                                errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                            }
                                            else
                                            {
                                                long byteRemainder =  (input1 % input2);
                                                resultValidationByte(byteRemainder);
                                            }
                                            break;

                                    }

                                }
                                catch(java.lang.NumberFormatException k)
                                {
                                    errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
                                }
                            }
                            else
                            {
                                errorAreaBox.setText("Please enter\noperands");
                            }

                            break;

                    // short
                        case 3:
                            if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                            {

                            try
                            {
                                short input1 = Short.parseShort(textInput1.getText());
                                short input2 = Short.parseShort(textInput2.getText());

                                switch (operationIndex)
                                {
                                    // addition
                                    case 1:
                                        long shortAddition= (input1+input2);
                                        resultValidationShort(shortAddition);
                                        break;

                                    // subtraction
                                    case 2:
                                        long shortSubtraction =  (input1 - input2);
                                        resultValidationShort(shortSubtraction);
                                        break;

                                    // multiplication
                                    case 3:
                                        long shortMultiplication = (input1 * input2);
                                        resultValidationShort(shortMultiplication);
                                        break;

                                    // division
                                    case 4:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                        }
                                        else
                                        {
                                            long shortDivision =  (input1 / input2);
                                            resultValidationShort(shortDivision);
                                        }
                                        break;

                                    // remainder
                                    case 5:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                        }
                                        else
                                        {
                                            long shortRemainder = (input1 % input2);
                                            resultValidationShort(shortRemainder);
                                        }
                                        break;

                                }

                            }
                            catch(java.lang.NumberFormatException k)
                            {
                                errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
                            }
                        }
                        else
                        {
                            errorAreaBox.setText("Please enter\noperands");
                        }

                        break;


                    // long
                        case 4:
                        if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                        {

                            try {
                                long input1 = Long.parseLong(textInput1.getText());
                                long input2 = Long.parseLong(textInput2.getText());

                                switch (operationIndex)
                                {
                                    // addition
                                    case 1:
                                        long longAddition=(input1+input2);
                                        textResult.setText(String.valueOf(longAddition));
                                        break;

                                    // subtraction
                                    case 2:
                                        long longSubtraction = (input1 - input2);
                                        textResult.setText(String.valueOf(longSubtraction));
                                        break;

                                    // multiplication
                                    case 3:
                                        long longMultiplication = (input1 * input2);
                                        textResult.setText(String.valueOf(longMultiplication));
                                        break;

                                    // division
                                    case 4:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                        }
                                        else
                                        {
                                            long longDivision = (input1 / input2);
                                            textResult.setText(String.valueOf(longDivision));
                                        }
                                        break;

                                    // remainder
                                    case 5:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                        }
                                        else
                                        {
                                            long longRemainder = (input1 % input2);
                                            textResult.setText(String.valueOf(longRemainder));
                                        }
                                        break;

                                }

                            }
                            catch(java.lang.NumberFormatException k)
                            {
                                errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
                            }
                        }
                        else
                        {
                            errorAreaBox.setText("Please enter\noperands");
                        }

                        break;


                    // float
                    case 5:
                        if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                        {

                            try {
                                float input1 = Float.parseFloat(textInput1.getText());
                                float input2 = Float.parseFloat(textInput2.getText());

                                switch (operationIndex)
                                {
                                    // addition
                                    case 1:
                                        float floatAddition=(input1+input2);
                                        resultValidationFloat(floatAddition);
                                        break;

                                    // subtraction
                                    case 2:
                                        float floatSubtraction = (input1 - input2);
                                        resultValidationFloat(floatSubtraction);
                                        break;

                                    // multiplication
                                    case 3:
                                        float floatMultiplication = (input1 * input2);
                                        resultValidationFloat(floatMultiplication);
                                        break;

                                    // division
                                    case 4:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                        }
                                        else
                                        {
                                            float floatDivision = (input1 / input2);
                                            textResult.setText(String.format("%.2f",floatDivision));
                                        }
                                        break;

                                    // remainder
                                    case 5:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                        }
                                        else
                                        {
                                            float floatRemainder = (input1 % input2);
                                            textResult.setText(String.valueOf(floatRemainder));
                                        }
                                        break;

                                }

                            }
                            catch(java.lang.NumberFormatException k)
                            {
                                errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
                            }
                        }
                        else
                        {
                            errorAreaBox.setText("Please enter\noperands");
                        }

                        break;

                    // double
                    case 6:
                        if(!textInput1.getText().isEmpty() & !textInput2.getText().isEmpty())
                        {
                            try
                            {
                                double input1 = Double.parseDouble(textInput1.getText());
                                double input2 = Double.parseDouble(textInput2.getText());

                                switch (operationIndex)
                                {
                                    // addition
                                    case 1:
                                        double doubleAddition=(input1+input2);
                                        textResult.setText(String.valueOf(doubleAddition));
                                        break;

                                    // subtraction
                                    case 2:
                                        double doubleSubtraction = (input1 - input2);
                                        textResult.setText(String.valueOf(doubleSubtraction));
                                        break;

                                    // multiplication
                                    case 3:
                                        double doubleMultiplication = (input1 * input2);
                                        textResult.setText(String.valueOf(doubleMultiplication));
                                        break;

                                    // division
                                    case 4:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0\ngives infinity");
                                        }
                                        else
                                        {
                                            double doubleDivision = (input1 / input2);
                                            textResult.setText(String.format("%.2f",doubleDivision));
                                        }
                                        break;

                                    // remainder
                                    case 5:
                                        if (input2 == 0)
                                        {
                                            errorAreaBox.setText("Dividing any value\nby 0 gives\ninfinity ");
                                        }
                                        else
                                        {
                                            double doubleRemainder = (input1 % input2);
                                            textResult.setText(String.valueOf(doubleRemainder));
                                        }
                                        break;
                                }

                            }
                            catch(java.lang.NumberFormatException k)
                            {
                                errorAreaBox.setText("Please enter the\nselected datatype\nvalues");
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


    //result validation method for byte
    public static void resultValidationByte(long m)
    {
        if((m>Byte.MAX_VALUE) | (m<Byte.MIN_VALUE))
        {
              errorAreaBox.setText("Result out of\nrange of byte\ntype");
        }
        else
        {
            textResult.setText(String.valueOf(m));
        }

    }
    //result validation method for short
    public static void resultValidationShort(long m)
    {
        if((m>Short.MAX_VALUE) | (m<Short.MIN_VALUE))
        {
            errorAreaBox.setText("Result out of\nrange of short\ntype");
        }
        else
        {
            textResult.setText(String.valueOf(m));
        }

    }
    //result validation method for int
    public static void resultValidationInteger(long m)
    {
        if((m>Integer.MAX_VALUE) | (m<Integer.MIN_VALUE))
        {
            errorAreaBox.setText("Result out of\nrange of int\ntype");
        }
        else
        {
            textResult.setText(String.valueOf(m));
        }

    }
    //result validation method for float
    public static void resultValidationFloat(double m)
    {
        if((m>Float.MAX_VALUE) | (m<Float.MIN_VALUE))
        {
            errorAreaBox.setText("Result out of\nrange of float\ntype");
        }
        else
        {
            textResult.setText(String.valueOf(m));
        }

    }
}
