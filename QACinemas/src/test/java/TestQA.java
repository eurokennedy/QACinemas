import org.junit.Assert;

import javax.swing.*;

public class TestQA {
    JTextField Standard = new JTextField(2);
    JTextField OAP = new JTextField(2);
    JTextField Student = new JTextField(2);
    JTextField Child = new JTextField(2);
    JButton ConfirmBut = new JButton("Purchase tickets");
    JRadioButton MonBut = new JRadioButton("Monday");
    JRadioButton TueBut = new JRadioButton("Monday");
    JRadioButton WedBut = new JRadioButton("Monday");
    JRadioButton ThurBut = new JRadioButton("Monday");
    JRadioButton FriBut = new JRadioButton("Monday");
    JRadioButton SatBut = new JRadioButton("Monday");
    JRadioButton SunBut = new JRadioButton("Monday");
    public void CalcPriceTest(){
        MyEvent event=new MyEvent(Standard,OAP,Student,Child,ConfirmBut,MonBut,TueBut,WedBut,ThurBut,FriBut,SatBut,SunBut);
        int total = event.CalcPrice();
        Assert.assertEquals("Did not caluculate correct price",8,total);
    }
    public void CalcPriceTest2(){
        MyEvent event=new MyEvent(Standard,OAP,Student,Child,ConfirmBut,MonBut,TueBut,WedBut,ThurBut,FriBut,SatBut,SunBut);
        int total = event.CalcPrice();
        Assert.assertNotEquals("Did not caluculate correct price",8,total);
    }
}
