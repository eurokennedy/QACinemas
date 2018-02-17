public class Main {

    public static void main(String[] args) {

        CreateFrame frame = new CreateFrame();
        TextFields textFields= new TextFields();
        RadioButtons radioButtons=new RadioButtons();
        MyEvent event=new MyEvent(textFields,radioButtons);

        frame.createFrame();

        textFields.Standard.addActionListener(event);
        textFields.OAP.addActionListener(event);
        textFields.Student.addActionListener(event);
        textFields.Child.addActionListener(event);

    }
}
