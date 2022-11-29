import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame {
    InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton rbtn = new JButton("빨강");
        JButton bbtn = new JButton("파랑");
        JButton ybtn = new JButton("노랑");
        rbtn.addActionListener(new MyActionListener());
        bbtn.addActionListener(new MyActionListener());
        ybtn.addActionListener(new MyActionListener());

        c.add(rbtn);
        c.add(bbtn);
        c.add(ybtn);
        setSize(350, 150);
        setVisible(true);
    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            Container c = getContentPane();
            if(b.getText().equals("파랑"))
                c.setBackground(Color.blue);
            else if (b.getText().equals("빨강"))
                c.setBackground(Color.red);
            else if (b.getText().equals("노랑"))
                c.setBackground(Color.yellow);
            else
                c.setBackground(Color.white);
        }
    }

    public static void main(String [] args) {
        new InnerClassListener();
    }}

