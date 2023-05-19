package De_04;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cau4 {
    public static class MyJFrame extends JFrame {
        public MyJFrame() {
            setTitle("Tim uoc so chung");
            setSize(600, 400);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField textfield1 = new JTextField();
            textfield1.setBounds(250, 50, 400, 30);
            JTextField textfield2 = new JTextField();
            textfield2.setBounds(250, 100, 400, 30);
            JTextField textfield3 = new JTextField();
            textfield3.setBounds(250, 150, 400, 30);
            JButton button = new JButton("Tim");
            button.setBounds(300, 200, 100, 30);
            add(textfield1);
            add(textfield2);
            add(textfield3);
            add(button);
            ActionListener event = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textfield1.getText());
                    int b = Integer.parseInt(textfield2.getText());
                    if(a>b) {
                        while(b != 0) {
                            int temp = b;
                            b = a%b;
                            a = temp;
                        }
                        textfield3.setText(String.valueOf(a));
                    } else {
                        while(a != 0) {
                            int temp = a;
                            a = b%a;
                            b = temp;
                        }
                        textfield3.setText(String.valueOf(b));
                    }
                }
            };
            button.addActionListener(event);
        }
    }
    public static void main(String[] args) {
        MyJFrame jf = new MyJFrame();
        jf.setVisible(true);
    }
}
