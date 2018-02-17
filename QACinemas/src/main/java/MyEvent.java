import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent implements ActionListener {

    private static final int twoPounds = 2;
    private static final int fourPounds = 4;
    private static final int sixPounds = 6;
    private static final int eightPounds = 8;
    private static int Childamnt;
    private static int Studentamnt;
    private static int OAPamnt; 
    private static int Standamnt;

    RadioButtons radioButtons;
    TextFields textFields;

    public MyEvent(TextFields initText, RadioButtons initRadio) {
        radioButtons = initRadio;
        textFields = initText;
    }

    public void actionPerformed(ActionEvent e) {
        int total;
        try {
            Standamnt = Integer.parseInt(textFields.Standard.getText());
            OAPamnt = Integer.parseInt(textFields.OAP.getText());
            Studentamnt = Integer.parseInt(textFields.Student.getText());
            Childamnt = Integer.parseInt(textFields.Child.getText());
            if (radioButtons.WedBut.isSelected()) {
                total = Standamnt * sixPounds + OAPamnt * fourPounds + Studentamnt * fourPounds + Childamnt * twoPounds;
            } else {
                total = Standamnt * eightPounds + OAPamnt * sixPounds + Studentamnt * sixPounds + Childamnt * fourPounds;
            }
            JOptionPane.showMessageDialog(null, "The total cost of tickets for this movie is £" + total);
        } 
        catch (NumberFormatException y) {
            JOptionPane.showMessageDialog(null, "Numbers only please. If there is an empty box please type 0 inside of it");
        }
    }
}
