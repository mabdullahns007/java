package com.casestudy;

import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
import java.util.Random;
import java.util.Scanner;

import static com.casestudy.Main.record;


public class template
{
    public static void ConsumerNotUsingAUtility()
    {

            Scanner scan=new Scanner(System.in);

            String line="";
            String strFile;

            String [] monthArray=new String[13];
            monthArray[0]="";
            monthArray[1]="january2022.txt";
            monthArray[2]="february2022.txt";
            monthArray[3]="march2022.txt";
            monthArray[4]="april2022.txt";
            monthArray[5]="may2022.txt";
            monthArray[6]="june2022.txt";
            monthArray[7]="july2022.txt";
            monthArray[8]="august2022.txt";
            monthArray[9]="september2022.txt";
            monthArray[10]="october2022.txt";
            monthArray[11]="november2022.txt";
            monthArray[12]="december2022.txt";


            System.out.println("Months are represented by 1-12, 1 : january , 12 : December");
            System.out.println("Enter the start month ");
            int x1= scan.nextInt(); ;
            System.out.println("Enter the end month");
            int x2=scan.nextInt();
            while((x1<=0 | x1>12) & (x2<=0 | x2>12))
            {
                System.out.println("Please enter in range 1-12");
                System.out.println("Enter the start month ");
                x1= scan.nextInt();
                System.out.println("Enter the end month");
                x2=scan.nextInt();
            }
            try
            {
                for(x1=x1;x1<=x2;x1++)
                {

                    strFile = monthArray[x1];
                    FileInputStream fin = new FileInputStream(strFile);
                    Scanner sc = new Scanner(fin);

                    while (sc.hasNextLine())
                    {
                        line = sc.nextLine();
                        StringTokenizer stn = new StringTokenizer(line);

                        String CID = stn.nextToken();
                        String name = stn.nextToken();
                        String eUnits = stn.nextToken();
                        String gasUnits = stn.nextToken();
                        String waterUnits = stn.nextToken();
                        String internetUnits = stn.nextToken();
                        String localMin = stn.nextToken();
                        String internationalMin = stn.nextToken();
                        String ebill = stn.nextToken();
                        String gbill = stn.nextToken();
                        String wbill = stn.nextToken();
                        String pbill = stn.nextToken();

                        if (eUnits.equals("0") & gasUnits.equals("0") & waterUnits.equals("0") & internetUnits.equals("0") & localMin.equals("0") & internationalMin.equals("0") )
                        {
                            System.out.println(strFile);
                            System.out.println(String.format("%s %10s %10s %10s %10s %10s %10s %14s %10s %10s %10s %10s","CID","name","eUnits","gasUnits","waterUnits","internetUnits","localMin","internationalMin", "ebill","gbill","wbill","pbill"));
                            System.out.println(String.format("%s %10s %10s %10s %10s %10s %10s %14s %14s %12s %10s %8s", CID, name, eUnits,gasUnits,waterUnits,internetUnits,localMin,internationalMin, ebill,gbill,wbill,pbill));
                            break;
                        }
                    }
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println(e);
                System.out.println("re-run the program");
            }
            catch (IOException e)
            {
                System.out.println(e);
                System.out.println("re-run the program");
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                System.out.println("re-run the program");
            }
        }


    public static void YearlyHalf_Yearly()
    {
        Scanner scan=new Scanner(System.in);

        //cid input
        System.out.println("Enter cid to get Yearly and Half Yearly report of a consumer: ");
        String cid= scan.nextLine();

        String line="";
        String strFile;

        String [] monthArray=new String[13];
        monthArray[0]=" ";
        monthArray[1]="january2022.txt";
        monthArray[2]="february2022.txt";
        monthArray[3]="march2022.txt";
        monthArray[4]="april2022.txt";
        monthArray[5]="may2022.txt";
        monthArray[6]="june2022.txt";
        monthArray[7]="july2022.txt";
        monthArray[8]="august2022.txt";
        monthArray[9]="september2022.txt";
        monthArray[10]="october2022.txt";
        monthArray[11]="november2022.txt";
        monthArray[12]="december2022.txt";


        System.out.println("Months are represented by 1-12, 1 : january , 12 : December");
        System.out.println("For Half Yearly Report Press 1  ");
        System.out.println("For Yearly Report Press 2 ");

        int x1= scan.nextInt();

        while(x1<1 | x1>2)
        {
            System.out.println("Please enter 1 0r 2 ");
            System.out.println("For Half Yearly Report Press 1  ");
            System.out.println("For Yearly Report Press 2 ");
            x1= scan.nextInt();
        }
        try
        {
            switch(x1)
            {

                case 1:
                    for (x1 = x1; x1 <= 6; x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn = new StringTokenizer(line);

                            String CID = stn.nextToken();
                            String name = stn.nextToken();
                            String eUnits = stn.nextToken();
                            String gasUnits = stn.nextToken();
                            String waterUnits = stn.nextToken();
                            String internetUnits = stn.nextToken();
                            String localMin = stn.nextToken();
                            String internationalMin = stn.nextToken();
                            String ebill = stn.nextToken();
                            String gbill = stn.nextToken();
                            String wbill = stn.nextToken();
                            String pbill = stn.nextToken();





                            if (line.startsWith(cid))
                            {
                                double Ebill=Double.parseDouble(ebill);
                                double Gbill=Double.parseDouble(gbill);
                                double Wbill=Double.parseDouble(wbill);
                                double Pbill=Double.parseDouble(pbill);
                                double sumOfUtilities=Ebill+Gbill+Wbill+Pbill;
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %16s ", "CID", "NAME", "SumOfAllUtilities"));
                                System.out.println(String.format("%s %10s %14.2f", CID, name, sumOfUtilities));
                                System.out.println();
                                break;
                            }
                        }
                        fin.close();
                    }
                    break;

                case 2:

                    for (x1 = x1-1; x1 <= 12; x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn = new StringTokenizer(line);

                            String CID = stn.nextToken();
                            String name = stn.nextToken();
                            String eUnits = stn.nextToken();
                            String gasUnits = stn.nextToken();
                            String waterUnits = stn.nextToken();
                            String internetUnits = stn.nextToken();
                            String localMin = stn.nextToken();
                            String internationalMin = stn.nextToken();
                            String ebill = stn.nextToken();
                            String gbill = stn.nextToken();
                            String wbill = stn.nextToken();
                            String pbill = stn.nextToken();


                            if (line.startsWith(cid))
                            {
                                double Ebill=Double.parseDouble(ebill);
                                double Gbill=Double.parseDouble(gbill);
                                double Wbill=Double.parseDouble(wbill);
                                double Pbill=Double.parseDouble(pbill);
                                double sumOfUtilities=Ebill+Gbill+Wbill+Pbill;
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %16s ", "CID", "NAME", "SumOfAllUtilities"));
                                System.out.println(String.format("%s %10s %14.2f", CID, name, sumOfUtilities));
                                System.out.println();
                                break;
                            }
                        }
                        fin.close();

                    }
                    break;
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(NumberFormatException q)
        {
            System.out.println(q);
            System.out.println("re-run the program");
        }

    }
    public static void Month_wiseBillingReportSpecificUtilities()
    {
        Scanner scan=new Scanner(System.in);

        //cid input
        System.out.println("Enter cid to search Record: ");
        String cid= scan.nextLine();

        String line="";
        String strFile;

        String [] monthArray=new String[13];
        monthArray[0]="";
        monthArray[1]="january2022.txt";
        monthArray[2]="february2022.txt";
        monthArray[3]="march2022.txt";
        monthArray[4]="april2022.txt";
        monthArray[5]="may2022.txt";
        monthArray[6]="june2022.txt";
        monthArray[7]="july2022.txt";
        monthArray[8]="august2022.txt";
        monthArray[9]="september2022.txt";
        monthArray[10]="october2022.txt";
        monthArray[11]="november2022.txt";
        monthArray[12]="december2022.txt";


        System.out.println("Months are represented by 1-12, 1 : january , 12 : December");
        System.out.println("Enter the start month ");
        int x1= scan.nextInt(); ;
        System.out.println("Enter the end month");
        int x2=scan.nextInt();
        System.out.println("Enter the utlity bill");
        System.out.println("1 for electricity Bill");
        System.out.println("2 for gas Bill");
        System.out.println("3 for water Bill");
        System.out.println("4 for Phone Bill");
        int x3= scan.nextInt();
        while((x1<=0 | x1>12) & (x2<=0 | x2>12))
        {
            System.out.println("Please enter in range 1-12");
            System.out.println("Enter the start month ");
            x1= scan.nextInt();
            System.out.println("Enter the end month");
            x2=scan.nextInt();
        }
        while(x3<=0 | x3>4)
        {
            System.out.println("Please enter in range 1-4");
            System.out.println("Enter again");
            x3= scan.nextInt();
        }

        try
        {
            switch(x3)
            {
                case 1:
                    for(x1=x1;x1<=x2;x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn=new StringTokenizer(line);

                            String CID=stn.nextToken();
                            String name=stn.nextToken();
                            String eUnits=stn.nextToken();
                            String gasUnits=stn.nextToken();
                            String waterUnits=stn.nextToken();
                            String internetUnits=stn.nextToken();
                            String localMin=stn.nextToken();
                            String internationalMin=stn.nextToken();
                            String ebill= stn.nextToken();

                            if (line.startsWith(cid))
                            {
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %10s %10s","CID","NAME","eUnits","EBill"));
                                System.out.println(String.format("%s %10s %10s %10s",CID,name,eUnits,ebill));
                                break;
                            }
                        }
                        fin.close();

                    }
                    break;

                case 2:
                    for(x1=x1;x1<=x2;x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn=new StringTokenizer(line);

                            String CID=stn.nextToken();
                            String name=stn.nextToken();
                            String eUnits=stn.nextToken();
                            String gasUnits=stn.nextToken();
                            String waterUnits=stn.nextToken();
                            String internetUnits=stn.nextToken();
                            String localMin=stn.nextToken();
                            String internationalMin=stn.nextToken();
                            String ebill= stn.nextToken();
                            String gBill= stn.nextToken();


                            if (line.startsWith(cid))
                            {
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %10s %10s","CID","NAME","GUnits","GBill"));
                                System.out.println(String.format("%s %10s %10s %10s",CID,name,gasUnits,gBill));
                                break;
                            }
                        }
                        fin.close();

                    }
                    break;
                case 3:
                    for(x1=x1;x1<=x2;x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn=new StringTokenizer(line);

                            String CID=stn.nextToken();
                            String name=stn.nextToken();
                            String eUnits=stn.nextToken();
                            String gasUnits=stn.nextToken();
                            String waterUnits=stn.nextToken();
                            String internetUnits=stn.nextToken();
                            String localMin=stn.nextToken();
                            String internationalMin=stn.nextToken();
                            String ebill= stn.nextToken();
                            String gBill= stn.nextToken();
                            String wBill= stn.nextToken();



                            if (line.startsWith(cid))
                            {
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %10s %10s","CID","NAME","wUnits","wBill"));
                                System.out.println(String.format("%s %10s %10s %10s",CID,name,waterUnits,wBill));
                                break;
                            }
                        }
                        fin.close();

                    }
                    break;
                case 4:
                    for(x1=x1;x1<=x2;x1++)
                    {

                        strFile = monthArray[x1];
                        FileInputStream fin = new FileInputStream(strFile);
                        Scanner sc = new Scanner(fin);

                        while (sc.hasNextLine())
                        {
                            line = sc.nextLine();
                            StringTokenizer stn=new StringTokenizer(line);

                            String CID=stn.nextToken();
                            String name=stn.nextToken();
                            String eUnits=stn.nextToken();
                            String gasUnits=stn.nextToken();
                            String waterUnits=stn.nextToken();
                            String internetUnits=stn.nextToken();
                            String localMin=stn.nextToken();
                            String internationalMin=stn.nextToken();
                            String ebill= stn.nextToken();
                            String gBill= stn.nextToken();
                            String wBill= stn.nextToken();
                            String pBill= stn.nextToken();



                            if (line.startsWith(cid))
                            {
                                System.out.println(strFile);
                                System.out.println(String.format("%s %10s %10s %10s %10s %10s ","CID","NAME","internet","localMin","international","pBill"));
                                System.out.println(String.format("%s %10s %10s %10s %10s %14s ",CID,name,internetUnits,localMin,internationalMin,pBill));
                                break;
                            }
                        }
                        fin.close();

                    }
                    break;
            }



        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
    }

    public static void Month_wiseBillingReportAllUtilities()
    {
        Scanner scan=new Scanner(System.in);

        //cid input
        System.out.println("Enter cid to search Record: ");
        String cid= scan.nextLine();

        String line="";
        String strFile;

        String [] monthArray=new String[13];
        monthArray[0]="";
        monthArray[1]="january2022.txt";
        monthArray[2]="february2022.txt";
        monthArray[3]="march2022.txt";
        monthArray[4]="april2022.txt";
        monthArray[5]="may2022.txt";
        monthArray[6]="june2022.txt";
        monthArray[7]="july2022.txt";
        monthArray[8]="august2022.txt";
        monthArray[9]="september2022.txt";
        monthArray[10]="october2022.txt";
        monthArray[11]="november2022.txt";
        monthArray[12]="december2022.txt";


        System.out.println("Months are represented by 1-12, 1 : january , 12 : December");
        System.out.println("Enter the start month ");
        int x1= scan.nextInt(); ;
        System.out.println("Enter the end month");
        int x2=scan.nextInt();
        while((x1<=0 | x1>12) & (x2<=0 | x2>12))
        {
            System.out.println("Please enter in range 1-12");
            System.out.println("Enter the start month ");
            x1= scan.nextInt();
            System.out.println("Enter the end month");
            x2=scan.nextInt();
        }

        try
        {
            for(x1=x1;x1<=x2;x1++)
            {
                strFile = monthArray[x1];
                System.out.println(strFile);
                FileInputStream fin = new FileInputStream(strFile);
                Scanner sc = new Scanner(fin);
                while (sc.hasNextLine())
                {
                    line = sc.nextLine();
                    if (line.startsWith(cid))
                    {
                        System.out.println(line);
                        break;
                    }
                }
                fin.close();

            }



        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
    }

    public static void Delete() throws IOException
    {
        Scanner scan = new Scanner(System.in);

        //file name input
        System.out.println("Enter file name to delete a record");
        String strFile = String.format("%s.txt", scan.nextLine());

        //to save file record in a line variable
        String line = null;

        //array initialized
        record = new String[10][4][10][20][3];


        // reading records from file and saving in array
        try
        {
            FileReader fr = new FileReader(strFile);
            BufferedReader br = new BufferedReader(fr);
            int i = 0, j = 0, k = 0, l = 0, m = 0;
            while ((line = br.readLine()) != null)
            {

                record[i][j][k][l][m] = line;


                m++;
                if (m == 3)
                {
                    m = 0;
                    l++;
                }
                if (l == 20)
                {
                    m = 0;
                    l = 0;
                    k++;
                }
                if (k == 10)
                {
                    m = 0;
                    l = 0;
                    k = 0;
                    j++;
                }
                if (j == 4)
                {
                    m = 0;
                    l = 0;
                    k = 0;
                    j = 0;
                    i++;
                }
            }
            fr.close();
            br.close();

            // ask user for cid to update
            System.out.println("Enter cid to be deleted");
            String cid = scan.nextLine();

            //updating the record in the array
            int n = 0, o = 0, p = 0, q = 0, r = 0;
            int x = -1;
            while (x != 1)
            {
                if (record[n][o][p][q][r].startsWith(cid))
                {
                    record[n][o][p][q][r] = String.format("%s  %12s  %13s  %14s  %19s  %10s %10s %10s  %10s %10s %10s %10s", cid, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                    System.out.println("Enter 1 to continue: ");
                    x = scan.nextInt();


                }


                r++;
                if (r == 3)
                {
                    r = 0;
                    q++;
                }
                if (q == 20)
                {
                    r = 0;
                    q = 0;
                    p++;
                }
                if (p == 10)
                {
                    r = 0;
                    q = 0;
                    p = 0;
                    o++;
                }
                if (o == 4)
                {
                    r = 0;
                    q = 0;
                    p = 0;
                    o = 0;
                    n++;
                }
            }

            // Re-writing the file with updated record
            try
            {
                FileWriter kw=new FileWriter(strFile);
                for (int a = 0; a < 10; a++)
                {
                    for (int b = 0; b < 4; b++)
                    {
                        for (int c = 0; c < 10; c++)
                        {
                            for (int d = 0; d < 20; d++)
                            {
                                for (int e = 0; e < 3; e++)
                                {
                                    kw.write(String.valueOf(record[a][b][c][d][e]));
                                    kw.write(System.lineSeparator());
                                }
                            }
                        }
                    }
                }
                kw.close();
                System.out.println("RECORD DELETED SUCCESSFULLY");
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }
        }
        catch(FileNotFoundException s)
        {
            System.out.println(s);
            System.out.println("Please re-run the program");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(InputMismatchException x)
        {
            System.out.println(x);
            System.out.println("Please re-run the program");
        }
        catch(NumberFormatException d)
        {
            System.out.println(d);
            System.out.println("Please re-run the program");
        }
    }




    public static void Update() throws IOException {
        Scanner scan = new Scanner(System.in);

        //file name input
        System.out.println("Enter file name to be updated");
        String strFile = String.format("%s.txt", scan.nextLine());

        //to save file record in a line variable
        String line = null;

        //array initialized
        record = new String[10][4][10][20][3];
        String name;
        int eUnits,gasUnits,wUnits,internet,localMin,internationalMin;
        double eBill,gasBill,wBill,phoneBill;

        // reading records from file and saving in array
        try
        {
            FileReader fr = new FileReader(strFile);
            BufferedReader br = new BufferedReader(fr);
            int i = 0, j = 0, k = 0, l = 0, m = 0;
            while ((line = br.readLine()) != null)
            {

                record[i][j][k][l][m] = line;


                m++;
                if (m == 3)
                {
                    m = 0;
                    l++;
                }
                if (l == 20)
                {
                    m = 0;
                    l = 0;
                    k++;
                }
                if (k == 10)
                {
                    m = 0;
                    l = 0;
                    k = 0;
                    j++;
                }
                if (j == 4)
                {
                    m = 0;
                    l = 0;
                    k = 0;
                    j = 0;
                    i++;
                }
            }
            fr.close();
            br.close();

            // ask user for cid to update
            System.out.println("Enter cid to update");
            String cid = scan.nextLine();

            //updating the record in the array
            int n = 0, o = 0, p = 0, q = 0, r = 0;
            int x = -1;
            while (x != 1)
            {
                if (record[n][o][p][q][r].startsWith(cid))
                {
                    System.out.println("Enter name");
                    name= scan.nextLine();
                    System.out.println("Enter Electricity units");
                    eUnits=scan.nextInt();
                    System.out.println("Enter Gas units");
                    gasUnits= scan.nextInt();
                    System.out.println("Enter Water units");
                    wUnits= scan.nextInt();
                    System.out.println("Enter Internet units");
                    internet= scan.nextInt();
                    System.out.println("Enter Local minutes");
                    localMin= scan.nextInt();
                    System.out.println("Enter International minutes");
                    internationalMin= scan.nextInt();
                    System.out.println("Enter Electricity bill");
                    eBill=scan.nextDouble();
                    System.out.println("Enter Gas bill");
                    gasBill= scan.nextDouble();
                    System.out.println("Enter Water bill");
                    wBill= scan.nextDouble();
                    System.out.println("Enter Phone Bill");
                    phoneBill= scan.nextDouble();



                    record[n][o][p][q][r] = String.format("%s  %12s  %13s  %14s  %19s  %10s %10s %10s  %10s %10s %10s %10s", cid, name, eUnits, gasUnits, wUnits, internet, localMin, internationalMin, String.format("%.2f",eBill), String.format("%.2f",gasBill), String.format("%.2f",wBill), String.format("%.2f",phoneBill));
                    System.out.println("Enter 1 to continue: ");
                    x = scan.nextInt();


                }


                r++;
                if (r == 3)
                {
                    r = 0;
                    q++;
                }
                if (q == 20)
                {
                    r = 0;
                    q = 0;
                    p++;
                }
                if (p == 10)
                {
                    r = 0;
                    q = 0;
                    p = 0;
                    o++;
                }
                if (o == 4)
                {
                    r = 0;
                    q = 0;
                    p = 0;
                    o = 0;
                    n++;
                }
            }

            // Re-writing the file with updated record
            try
            {
                FileWriter kw=new FileWriter(strFile);
                for (int a = 0; a < 10; a++)
                {
                    for (int b = 0; b < 4; b++)
                    {
                        for (int c = 0; c < 10; c++)
                        {
                            for (int d = 0; d < 20; d++)
                            {
                                for (int e = 0; e < 3; e++)
                                {
                                    kw.write(String.valueOf(record[a][b][c][d][e]));
                                    kw.write(System.lineSeparator());
                                }
                            }
                        }
                    }
                }
                kw.close();
                System.out.println("FILE UPDATED SUCCESSFULLY");
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }
        }
        catch(FileNotFoundException s)
        {
            System.out.println(s);
            System.out.println("Please re-run the program");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
        catch(InputMismatchException x)
        {
            System.out.println(x);
            System.out.println("Please re-run the program");
        }
        catch(NumberFormatException d)
        {
            System.out.println(d);
            System.out.println("Please re-run the program");
        }
    }




    public static void BaseFile() throws IOException {

        FileWriter file = new FileWriter("basefile.txt");

        //record format string
        String recordFormatString;

        //record array
        record = new String[10][4][10][20][3];

        // for random numbers
        Random rand = new Random();

        //variables
        String strEUnits;
        String strGasUnits;
        String strWaterUnits;
        String strInternetUnits;
        String strLocalCallMin;
        String strIntCallMin;

        int eBill;
        int gasBill;
        int waterBill;
        int internetUnits;
        int localCallMin;
        int internationalCallMin;

        try
         {
            //for the inputs
            for (int g = 0; g < 10; g++) {
                for (int j = 0; j < 4; j++) {
                    for (int m = 0; m < 10; m++) {
                        for (int f = 0; f < 20; f++) {
                            for (int i = 0; i < 3; i++) {


                            String k = String.valueOf(Main.cid);
                            Main.cid++;

                            //for meter readings
                            eBill = rand.nextInt((700 - 400) + 1) + 400;
                            gasBill = rand.nextInt((700 - 400) + 1) + 400;
                            waterBill = rand.nextInt((2000 - 400) + 1) + 400;
                            internetUnits = rand.nextInt((700 - 400) + 1) + 400;
                            localCallMin=rand.nextInt((700 - 400) + 1) + 400;
                            internationalCallMin=rand.nextInt((700 - 400) + 1) + 400;

                            strEUnits = String.valueOf(eBill);
                            strGasUnits = String.valueOf(gasBill);
                            strWaterUnits = String.valueOf(waterBill);
                            strInternetUnits = String.valueOf(internetUnits);
                            strLocalCallMin = String.valueOf(localCallMin);
                            strIntCallMin = String.valueOf(internationalCallMin);

                            // for name
                            int randomChar = rand.nextInt((92 - 65) + 1) + 65;
                            char nameOfCustomer = (char) randomChar;
                            String name = String.valueOf(nameOfCustomer);


                            // eUnits gUnits wUnits internetUnits localMin internationalMin
                            recordFormatString = String.format("%s  %12s  %13s  %14s  %19s  %10s  %10s  %10s ", k,name, strEUnits, strGasUnits, strWaterUnits, strInternetUnits,strLocalCallMin,strIntCallMin);
                            record[g][j][m][f][i] = recordFormatString;
                            file.write(record[g][j][m][f][i]);
                            file.write(System.lineSeparator());


                            }
                        }
                    }
                }
            }


             file.close();
         }
         catch(InputMismatchException e)
        {
            System.out.println("Please enter valid inputs");
            System.out.println("re-run the program");
        }
         catch (IOException e)
         {
             System.out.println("An IOEXCEPTION OCCURRED");
             System.out.println("re-run the program");
         }

    }


    public static void SearchRecord()
    {
        Scanner scan=new Scanner(System.in);
        //cid input
        System.out.println("Enter cid to search Record: ");
        String cid= scan.nextLine();
        String line="";
        String strFile;
        try
        {
            System.out.println("Enter file name to search Record: ");
            strFile= String.format("%s.txt",scan.nextLine());
            FileInputStream fin=new FileInputStream(strFile);
            Scanner sc=new Scanner(fin);
            while(sc.hasNextLine())
            {
                line= sc.nextLine();
                if(line.startsWith(cid))
                {
                    System.out.println(line);
                    break;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An IOEXCEPTION OCCURRED");
            System.out.println("re-run the program");
        }
    }


    public static void CalculateNextMonthBill() throws IOException
    {

            String strBuffer;
            Scanner scan=new Scanner(System.in);
            System.out.println("to calculate a month's bills, you need previous month file ");
            System.out.println("for the calculation of first month bills, use basefile as previous month file ");

            // current month file name input
            System.out.println("Enter month to calculate bills in the file");
            String strCurrentFile=String.format("%s.txt",scan.nextLine());
            //previous month file name input
            System.out.println("Enter previous month file");
            String strPreviousFile=String.format("%s.txt",scan.nextLine());


            Random rand=new Random();
            FileWriter file=new FileWriter(strCurrentFile);


            // declaring required variables
            double cubicHm3;
            final double GCV=954;
            double MMBTU;


            int prvEBILL;
            int prvGASBILL;
            int prvWATERBILL;
            int prvINTERNETBILL;
            int prvLOCALMIN;
            int prvINTERNATIONALMIN;

            int curEBILL;
            int curGASBILL;
            int curWATERBILL;
            int curINTERNETBILL;
            int curLOCALMIN;
            int curINTERNATIONALMIN;



            int unitsConsumedEBILL;
            int unitsConsumedGASBILL;
            int unitsConsumedWATERBILL;
            int unitsConsumedInternet;
            int unitsConsumedLocalMin;
            int unitsConsumedInternationalMin;


            double newEbill=1;
            double newGasBill=1;
            double GasBill=1;
            double newWaterBill=1;
            double newPhoneBill;

            try(BufferedReader reader = new BufferedReader(new FileReader(strPreviousFile)))
            {

                while ((strBuffer=reader.readLine())!=null)
                {

                    StringTokenizer stn=new StringTokenizer(strBuffer);



                    //previous month readings in string
                    String cid=stn.nextToken();
                    String name=stn.nextToken();
                    String eBill=stn.nextToken();
                    String gasBill=stn.nextToken();
                    String waterBill=stn.nextToken();
                    String internetBill=stn.nextToken();
                    String localMin=stn.nextToken();
                    String internationalMin=stn.nextToken();


                     //previous month readings in integer
                     prvEBILL=Integer.parseInt(eBill);
                     prvGASBILL=Integer.parseInt(gasBill);
                     prvWATERBILL=Integer.parseInt(waterBill);
                     prvINTERNETBILL=Integer.parseInt(internetBill);
                     prvLOCALMIN=Integer.parseInt(localMin);
                     prvINTERNATIONALMIN=Integer.parseInt(internationalMin);

                     //current month readings
                     curEBILL= rand.nextInt(((prvEBILL+1000) - (prvEBILL+1)) + 1)+(prvEBILL+1);
                     curGASBILL=rand.nextInt(((prvGASBILL+1000) - (prvGASBILL+1)) + 1)+(prvGASBILL+1);
                     curWATERBILL=rand.nextInt(((prvWATERBILL+3000) - (prvWATERBILL+1)) + 1)+(prvWATERBILL+1);
                     curINTERNETBILL= rand.nextInt(((prvINTERNETBILL+1000) - (prvINTERNETBILL+1)) + 1)+(prvINTERNETBILL+1);
                     curLOCALMIN= rand.nextInt(((prvLOCALMIN+1000) - (prvLOCALMIN+1)) + 1)+(prvLOCALMIN+1);
                     curINTERNATIONALMIN= rand.nextInt(((prvINTERNATIONALMIN+1000) - (prvINTERNATIONALMIN+1)) + 1)+(prvINTERNATIONALMIN+1);


                    //readings to calculate the bills
                     unitsConsumedEBILL =(curEBILL-prvEBILL);
                     unitsConsumedGASBILL =(curGASBILL-prvGASBILL);
                     unitsConsumedWATERBILL =(curWATERBILL-prvWATERBILL);
                     unitsConsumedInternet=(curINTERNETBILL-prvINTERNETBILL);
                     unitsConsumedLocalMin=(curLOCALMIN-prvLOCALMIN);
                     unitsConsumedInternationalMin=(curINTERNATIONALMIN-prvINTERNATIONALMIN);


                     newPhoneBill=(unitsConsumedInternet*10)+(unitsConsumedLocalMin*5)+(unitsConsumedInternationalMin*7);


                     // for gas bill
                     cubicHm3=unitsConsumedGASBILL/100.0;

                    if (cubicHm3<=0.5)
                    {
                        MMBTU = cubicHm3 * GCV / 281.7385;
                        GasBill = 121.0* MMBTU;
                    }
                    else if(cubicHm3<=1.0)
                    {
                        GasBill = 121.0*(0.5 * GCV / 281.7385);
                        GasBill += 300.0*((cubicHm3-0.5) * GCV / 281.7385);
                    }
                    else if (cubicHm3<=2.0)
                    {
                        GasBill = 300.0*(1.0 * GCV / 281.7385);
                        GasBill += 553.0*((cubicHm3-1.0) * GCV / 281.7385);
                    }
                    else if (cubicHm3<=3.0)
                    {
                        GasBill = 553.0*(2.0 * GCV / 281.7385);
                        GasBill += 738.0*((cubicHm3-2.0) * GCV / 281.7385);

                    }
                    else if (cubicHm3<=4.0)
                    {
                        GasBill = 738.0*(3.0 * GCV / 281.7385);
                        GasBill += 1107.0*((cubicHm3-3.0) * GCV / 281.7385);
                    }
                    else if (cubicHm3>4.0)
                    {
                        GasBill = 1107.0*(4.0 * GCV / 281.7385);
                        GasBill += 1460.0*((cubicHm3-4.0) * GCV / 281.7385);
                    }
                    // Gas bill with 17% GST and 20 R.s. meter rent
                    newGasBill=GasBill+20+(0.17*GasBill);




                     //for ebill
                    if(unitsConsumedEBILL<=100)
                    {
                        newEbill=unitsConsumedEBILL*10;
                    }
                    if(unitsConsumedEBILL>100 & unitsConsumedEBILL<200)
                    {
                        newEbill=unitsConsumedEBILL*15+1000;
                    }
                    if(unitsConsumedEBILL>=200 & unitsConsumedEBILL<=300)
                    {
                        newEbill=unitsConsumedEBILL*18+3000;
                    }
                    if(unitsConsumedEBILL>300)
                    {
                        newEbill=unitsConsumedEBILL*25;
                    }


                     //for water bill
                    if(unitsConsumedWATERBILL<=1000)
                    {
                        newWaterBill=400;
                    }
                    if(unitsConsumedWATERBILL >1000 & unitsConsumedWATERBILL<=2000 )
                    {
                        newWaterBill=1000;
                    }
                    if(unitsConsumedWATERBILL>2000)
                    {
                        newWaterBill=1000+unitsConsumedWATERBILL*1.5;
                    }


                    String FormatString = String.format("%s  %12s  %13s  %14s  %19s  %10s %10s %10s  %10.2f %10.2f %10.2f %10.2f",cid ,name, unitsConsumedEBILL, unitsConsumedGASBILL, unitsConsumedWATERBILL, unitsConsumedInternet,unitsConsumedLocalMin,unitsConsumedInternationalMin,newEbill,newGasBill,newWaterBill,newPhoneBill);



                    file.write(FormatString);
                    file.write(System.lineSeparator());



                }
            }
            catch(FileNotFoundException a)
            {
                System.out.println(a);
                System.out.println("re-run the program");
            }
            catch(NumberFormatException b)
            {
                System.out.println(b+"");
                System.out.println("re-run the program");
            }
            catch(IOException c)
            {
                System.out.println(c+"");
                System.out.println("re-run the program");
            }
        file.close();
        }



    public static void ReadFile()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter file name to be READ");
        String strFile=String.format("%s.txt",scan.nextLine());
        String strBuffer;

        System.out.println(String.format("%s  %12s  %13s  %14s  %19s  %10s %10s %10s  %10s %10s %10s %10s","CID" ,"NAME", "eUNITS", "gUNITS", "wUNITS", "unitsINTERNET","LocalMin","InternationalMin","newEbill","newGasBill","newWaterBill","newPhoneBill"));
        try(BufferedReader reader = new BufferedReader(new FileReader(strFile)))
        {
            while ((strBuffer=reader.readLine())!=null)
            {
                System.out.println(strBuffer);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Please enter a valid file name\nand re-run the program");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }

    }

    public static void AccessByAddress()
    {
        Scanner scan=new Scanner(System.in);

        //file name input
        System.out.println("Enter file name to be READ");
        String strFile=String.format("%s.txt",scan.nextLine());

        //file writer object
        String line=null;

        //array initialized
        record=new String[10][4][10][20][3];

        //declare new variables
        int sector;
        int subSector;
        int street;
        int house;
        int portion;



        try
        {
            FileReader fr= new FileReader(strFile);
            BufferedReader br=new BufferedReader(fr);
            int i=0,j=0,k=0,l=0,m=0;
            while ((line=br.readLine())!=null)
            {
                record[i][j][k][l][m]=line;

                m++;
                if(m==3)
                {
                    m=0;
                    l++;
                }
                if(l==20)
                {
                    m=0;
                    l=0;
                    k++;
                }
                if(k==10)
                {
                    m=0;
                    l=0;
                    k=0;
                    j++;
                }
                if(j==4)
                {
                    m=0;
                    l=0;
                    k=0;
                    j=0;
                    i++;
                }
            }
            fr.close();
            br.close();


            try
            {
                System.out.println("Enter sector in range 0-9");
                System.out.println("A=0 B=1 C=2 D=3 E=4 F=5 G=7 H=7 I=8 J=9");
                sector = scan.nextInt();
                while (sector < 0 | sector > 9)
                {
                    System.out.println("Please enter sector in range 0-9");
                    sector = scan.nextInt();
                }

                System.out.println("There are four sub-sectors 1,2,3,4 represented by 0,1,2,3");
                System.out.println("Enter sub-sector in range 0-3");
                subSector = scan.nextInt();
                while (subSector < 0 | subSector > 3)
                {
                    System.out.println("please enter sub-sector in range 0-3");
                    subSector = scan.nextInt();
                }

                System.out.println("There are 10 streets 1,2,...10 represented by 0,1,...9");
                System.out.println("Enter street in range 0-9");
                street = scan.nextInt();
                while (street < 0 | street > 9)
                {
                    System.out.println("please enter sub-sectors in range 0-3");
                    street = scan.nextInt();
                }

                System.out.println("There are 20 houses in each streets 1,2,...20 represented by 0,1,...19");
                System.out.println("Enter house in range 0-19");
                house = scan.nextInt();
                while (house < 0 | house > 19)
                {
                    System.out.println("please enter sub-sectors in range 0-3");
                    house = scan.nextInt();
                }

                System.out.println("There are 3 portions in each house 1,2,3 represented by 0,1,2");
                System.out.println("Enter portion in range 0-2");
                portion = scan.nextInt();
                while (portion < 0 | portion > 3)
                {
                    System.out.println("please enter sub-sectors in range 0-3");
                    portion = scan.nextInt();
                }

                System.out.println("Customer Record By Address:");
                System.out.println(record[sector][subSector][street][house][portion]);
            }
            catch(InputMismatchException e )
            {
                System.out.println(e);
                System.out.println("Please re-run the program");
            }



        }
        catch(FileNotFoundException s)
        {
            System.out.println(s);
            System.out.println("Please re-run the program");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.out.println("re-run the program");
        }
    }


    public static void main(String[] args) throws IOException
    {
        Scanner scan=new Scanner(System.in);
        int userChoice;

        System.out.println("MENU");
        System.out.println("Press 1 to GENERATE BILLS");
        System.out.println("Press 2 to SEARCH RECORD");
        System.out.println("Press 3 to UPDATE RECORD");
        System.out.println("Press 4 to ACCESS RECORD BY ADDRESS");
        System.out.println("Press 5 to READ FILE");
        System.out.println("Press 6 to DELETE A RECORD");
        System.out.println("Press 7 to MONTH-WISE BILLING FOR A SPECIFIC CUSTOMER");
        System.out.println("Press 8 to MONTH-WISE BILLING FOR A SPECIFIC CUSTOMER AND SPECIFIC UTILITY");
        System.out.println("Press 9 to YEARLY AND HALF-YEARLY REPORT OF SUM OF ALL UTILITIES");
        System.out.println("Press 10 to CHECK CONSUMER NOT USING ANY UTILITY");

        try
        {
            userChoice = scan.nextInt();
            while (!(userChoice>0) | !(userChoice<=10))
            {
                System.out.println("Please Enter numbers in range 1-9");
                System.out.println("Enter again:");
                userChoice = scan.nextInt();
            }
            switch (userChoice)
            {
                case 1:
                    BaseFile();
                    CalculateNextMonthBill();
                    System.out.println("FILE CREATED");
                    break;

                case 2:
                    SearchRecord();
                    break;

                case 3:
                    Update();
                    break;

                case 4:
                    AccessByAddress();
                    break;

                case 5:
                    ReadFile();
                    break;
                case 6:
                    Delete();
                    break;
                case 7:
                    Month_wiseBillingReportAllUtilities();
                    break;
                case 8:
                    Month_wiseBillingReportSpecificUtilities();
                    break;
                case 9:
                    YearlyHalf_Yearly();
                    break;
                case 10:
                    ConsumerNotUsingAUtility();
                    break;
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("Please enter an integer in range 1-10");
            System.out.println("re-run the program");
        }
    }
}
