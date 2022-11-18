import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JComponent;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class GridLayoutEx extends JFrame {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JTextField t1 = new JTextField("");
    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton(".");
    JButton b11 = new JButton("+");
    JButton b12 = new JButton("-");
    JButton b13 = new JButton("*");
    JButton b18 = new JButton("=");

    GridBagLayout grid = new GridBagLayout();

    GridBagConstraints gbc = new GridBagConstraints();

    public GridLayoutEx() {
        setLayout(new GridLayout(1, 1));
        p1.setLayout(grid);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        make(t1, 0 ,0 ,4 ,1);
        make(b7, 0, 1, 1, 1);
        make(b8, 1, 1, 1, 1);
        make(b9, 2, 1, 1, 1);
        make(b13, 3, 1, 1, 1);
        make(b4, 0, 2, 1, 1);
        make(b5, 1, 2, 1, 1);
        make(b6, 2, 2, 1, 1);
        make(b12, 3, 2, 1, 1);
        make(b1, 0, 3, 1, 1);
        make(b2, 1, 3, 1, 1);
        make(b3, 2, 3, 1, 1);
        make(b11, 3, 3, 1, 1);
        make(b0, 0, 4, 2, 1); // 아래의 make함수를 지정
        make(b10, 2, 4, 1, 1);
        make(b18, 3, 4, 1, 1);
        add(p2);
        add(p1);
        p1.add(t1);
        p1.add(b0);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b18);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 프레임의 x버튼을 활성화하여 닫기버튼이 실행가능해짐
        setSize(500, 500); // 프레임 사이즈 지정
        setVisible(true); // 프레임을 보이게 함

    }
    public void make(JComponent c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        grid.setConstraints(c, gbc);
        // GridBagLayout의 GridBagConstraints의 set하는 방법
    }


    public static void main(String args[]) {

        GridLayoutEx test = new GridLayoutEx();


    }


}
