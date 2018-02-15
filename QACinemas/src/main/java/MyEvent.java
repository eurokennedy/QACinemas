import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent implements ActionListener {
    JTextField Standard,OAP,Student,Child; JButton Confirm;
    JRadioButton Mon; JRadioButton Tue;JRadioButton Wed;JRadioButton Thur;JRadioButton Fri;JRadioButton Sat;JRadioButton Sun;
    static int Childamnt,Studentamnt,OAPamnt,Standamnt;

    public MyEvent(JTextField T1,JTextField T2,JTextField T3,JTextField T4, JButton B1,JRadioButton BR1, JRadioButton BR2,
                   JRadioButton BR3, JRadioButton BR4, JRadioButton BR5, JRadioButton BR6, JRadioButton BR7){
        Standard=T1;OAP=T2;Student=T3;Child=T4;Confirm=B1;
        Mon=BR1;Tue=BR2;Wed=BR3;Thur=BR4;Fri=BR5;Sat=BR6;Sun=BR7;
    }

    public void actionPerformed(ActionEvent e) {
        JButton BTN=(JButton)e.getSource();
        if (BTN==Confirm) {
            int total=0;
            try {
                Standamnt = Integer.parseInt(Standard.getText());
                OAPamnt = Integer.parseInt(OAP.getText());
                Studentamnt = Integer.parseInt(Student.getText());
                Childamnt = Integer.parseInt(Child.getText());
                if (Wed.isSelected()) {
                    total = Standamnt * 6 + OAPamnt * 4 + Studentamnt * 4 + Childamnt * 2;
                } else {
                    total = Standamnt * 8 + OAPamnt * 6 + Studentamnt * 6 + Childamnt * 4;
                }
                JOptionPane.showMessageDialog(null, "The total cost of tickets for this movie is £" + total);
            }
            catch (NumberFormatException y){
                JOptionPane.showMessageDialog(null,"Numbers only please. If there is an empty box please type 0 inside of it");
            }
        }
    }



    public int CalcPrice() {
        int total = Standamnt*8 + OAPamnt*6 + Studentamnt*6 + Childamnt*4;
        return total;

    }
}
