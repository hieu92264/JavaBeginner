package De_01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Bai4 {

    public static class MyJFrame extends JFrame {

        public MyJFrame() {
            setTitle("Tim so nho nhat");
            setLocationRelativeTo(null);
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JButton BTN_Run = new JButton("Tính");
            BTN_Run.setBounds(250, 50, 100, 30);

            JTextField textField1 = new JTextField();
            textField1.setBounds(100, 100, 400, 30);

            JTextField textField2 = new JTextField();
            textField2.setBounds(100, 150, 400, 30);

            JTextField textField3 = new JTextField();
            textField3.setBounds(100, 200, 400, 30);

            JTextField textField4 = new JTextField();
            textField4.setBounds(100, 250, 400, 30);

            add(BTN_Run);
            add(textField1);
            add(textField2);
            add(textField3);
            add(textField4);

            ActionListener event = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textField1.getText());
                    int b = Integer.parseInt(textField2.getText());
                    int c = Integer.parseInt(textField3.getText());
                    int d = ((a < b ? a : b) < c) ? (a < b ? a : b) : c;
                    textField4.setText(String.valueOf(d));
                }
            };
            BTN_Run.addActionListener(event);
        }
    }

    public static void main(String[] args) {
        MyJFrame myjf = new MyJFrame();
        myjf.setVisible(true);
    }
}
