package De_02;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai4 {
    public static class MyJFrame extends JFrame {
        MyJFrame() {
            setTitle("Tinh giai thua cua so n:");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            JButton BTN_run = new JButton("Tính");
            BTN_run.setBounds(250, 150, 100, 30);
            JTextField textField = new JTextField();
            textField.setBounds(250, 50, 400, 30);
            JTextField textField1 = new JTextField();
            textField1.setBounds(250, 100, 400, 30);
            add(BTN_run);
            add(textField);
            add(textField1);
            ActionListener event = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textField.getText());
                    int s = 1;
                    for(int i =1; i<= a; i++) {
                        s *=i;
                    }
                    textField1.setText(String.valueOf(s));
                }
            };
            BTN_run.addActionListener(event);
        }
    }
    public static void main(String[] args) {
        MyJFrame jf = new MyJFrame();
        jf.setVisible(true);
    }
}
