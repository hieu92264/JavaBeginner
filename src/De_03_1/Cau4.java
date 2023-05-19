package De_03_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cau4 {
    public static class MyJFrame extends JFrame {
        public MyJFrame() {
            setTitle("Kiểm tra số nguyên tố");
            setSize(600, 400);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField textField = new JTextField();
            textField.setBounds(250, 50, 400, 30);
            JButton button = new JButton("Kiểm tra");
            button.setBounds(250, 100, 100, 30);
            add(textField);
            add(button);
            ActionListener event = new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textField.getText());
                    int i;
                    for(i=2; i<a; i++) {
                        if(a%i == 0) {
                            textField.setText(a + " Không phải là số nguyên tố!");
                            break;
                        }
                    }
                    if(i == a) textField.setText(a + " là số nguyên tố!");
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
