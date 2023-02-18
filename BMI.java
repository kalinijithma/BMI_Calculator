import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton submit;
    private JButton clear;
    private JLabel Weight;
    private JTextField textField3;
    private JPanel BMICalc;
    private JLabel Output;
    private JLabel Height;

    public BMI() {
        add(BMICalc);
        setVisible(true);
        setSize(800, 600);
        setTitle("BMI_Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double We = Double.parseDouble(textField2.getText());
                double He = Double.parseDouble(textField1.getText());
                double value = We / (He * He);
                textField3.setText(String.valueOf(value));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
    }

        public static void main (String[]args){
            BMI b = new BMI();
        }




}



