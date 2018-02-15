import sun.security.provider.Sun;

import javax.swing.*;
import java.awt.*;


public class CreateFrame {


    public void createFrame() {

        JFrame F = new JFrame("Choose the amount and type of tickets you would like to purchase");
        JPanel P = new JPanel();
        F.setLayout(new FlowLayout());
        JTextField Standard = new JTextField("0",2);
        JTextField OAP = new JTextField("0",2);
        JTextField Student = new JTextField("0",2);
        JTextField Child = new JTextField("0",2);
        JLabel Stand = new JLabel("Standard:");
        JLabel OA = new JLabel("OAP:");
        JLabel Stdnt = new JLabel("Student:");
        JLabel Chld = new JLabel("Child:");

        JButton ConfirmBut = new JButton("Purchase tickets");
        JRadioButton MonBut = new JRadioButton("Monday",true);
        JRadioButton TueBut = new JRadioButton("Tuesday");
        JRadioButton WedBut = new JRadioButton("Wednesday");
        JRadioButton ThurBut = new JRadioButton("Thursday");
        JRadioButton FriBut = new JRadioButton("Friday");
        JRadioButton SatBut = new JRadioButton("Saturday");
        JRadioButton SunBut = new JRadioButton("Sunday");

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(MonBut);
        bg1.add(TueBut);
        bg1.add(WedBut);
        bg1.add(ThurBut);
        bg1.add(FriBut);
        bg1.add(SatBut);
        bg1.add(SunBut);
        JPanel P1 = new JPanel();
        P1.setLayout(new GridLayout(7,1));


        P.add(Stand);
        P.add(Standard);
        P.add(OA);
        P.add(OAP);
        P.add(Stdnt);
        P.add(Student);
        P.add(Chld);
        P.add(Child);
        P1.add(MonBut);
        P1.add(TueBut);
        P1.add(WedBut);
        P1.add(ThurBut);
        P1.add(FriBut);
        P1.add(SatBut);
        P1.add(SunBut);
        P.add(ConfirmBut);

        MyEvent event=new MyEvent(Standard,OAP,Student,Child,ConfirmBut,MonBut,TueBut,WedBut,ThurBut,FriBut,SatBut,SunBut);

        Standard.addActionListener(event);
        OAP.addActionListener(event);
        Student.addActionListener(event);
        Child.addActionListener(event);
        ConfirmBut.addActionListener(event);

        F.add(P);
        F.add(P1);
        F.setSize(500, 500);
        F.setVisible(true);
    }


    }

