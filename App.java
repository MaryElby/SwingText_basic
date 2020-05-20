import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JPanel mainPanel;
    private JLabel myLabel;
    private JTextField myInput;

    public App() {
        myLabel.setText("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Hello World!");
                String theText =myInput.getText();
                myLabel.setText("Hello World2!");
                System.out.println(theText);
                myLabel.setText(theText);
            }
        });
    }

    public static void main(String[] args) {

        JFrame myframe = new JFrame( "App");
        myframe.setContentPane(new App().mainPanel);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.pack();
        myframe.setSize(400,400);
        myframe.setVisible(true);

    }
}
