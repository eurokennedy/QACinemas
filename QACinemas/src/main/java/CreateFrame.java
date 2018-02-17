import javax.swing.*;
import java.awt.*;

public class CreateFrame {

    public void createFrame() {

        JFrame frame = new JFrame("Choose the amount and type of tickets you would like to purchase");
        JPanel panel = new JPanel();
        JLabel standardLabel = new JLabel("Standard:");
        JLabel oapLabel = new JLabel("OAP:");
        JLabel studentLabel = new JLabel("Student:");
        JLabel childLabel = new JLabel("Child:");
        JButton ConfirmBut = new JButton("Purchase tickets");
        RadioButtons radioButtons = new RadioButtons();
        TextFields textFields = new TextFields();
        MyEvent event=new MyEvent(textFields,radioButtons);
        ButtonGroup bg1 = new ButtonGroup();

        frame.setLayout(new FlowLayout());

        bg1.add(radioButtons.MonBut);
        bg1.add(radioButtons.TueBut);
        bg1.add(radioButtons.WedBut);
        bg1.add(radioButtons.ThurBut);
        bg1.add(radioButtons.FriBut);
        bg1.add(radioButtons.SatBut);
        bg1.add(radioButtons.SunBut);
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(7, 1));

        panel.add(standardLabel);
        panel.add(textFields.Standard);
        panel.add(oapLabel);
        panel.add(textFields.OAP);
        panel.add(studentLabel);
        panel.add(textFields.Student);
        panel.add(childLabel);
        panel.add(textFields.Child);
        panel.add(ConfirmBut);

        radioPanel.add(radioButtons.MonBut);
        radioPanel.add(radioButtons.TueBut);
        radioPanel.add(radioButtons.WedBut);
        radioPanel.add(radioButtons.ThurBut);
        radioPanel.add(radioButtons.FriBut);
        radioPanel.add(radioButtons.SatBut);
        radioPanel.add(radioButtons.SunBut);

        ConfirmBut.addActionListener(event);

        frame.add(panel);
        frame.add(radioPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

