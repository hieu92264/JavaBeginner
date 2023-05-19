package De_03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Bai4 {
    public static class MyJFrame extends JFrame {
        public MyJFrame() {
            setTitle("Kiểm tra số nguyên tố");
            setSize(600, 400);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField textfield = new JTextField();
            textfield.setBounds(250, 50, 400, 30);
            JButton button = new JButton("Kiểm tra");
            button.setBounds(300, 100, 100, 30);
            add(button);
            add(textfield);
            ActionListener event = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textfield.getText());
                    int i;
                    for(i=2; i<a; i++) {
                        if(a%i==0) break;
                    }
                    if(a==i) textfield.setText(a + " Là số nguyên tố!");
                    else textfield.setText(a + " Không là số nguyên tố!");
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
