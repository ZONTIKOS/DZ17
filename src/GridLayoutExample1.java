import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GridLayoutExample1 implements ActionListener {
    private String sign = " ";
    private double num1 = 0;
    private double num2 = 0;
    JFrame frameObj;

    GridLayoutExample1() {
        frameObj = new JFrame();
        frameObj.setTitle("Калькулятор");
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setPreferredSize(new Dimension(300, 100));
        textField.setEditable(false);

        // Кнопки
        JButton btn1 = new JButton("1");
        btn1.addActionListener(a -> {
            textField.setText(textField.getText() + "1");
        });
        JButton btn2 = new JButton("2");
        btn2.addActionListener(a -> {
            textField.setText(textField.getText() + "2");
        });
        JButton btn3 = new JButton("3");
        btn3.addActionListener(a -> {
            textField.setText(textField.getText() + "3");
        });
        JButton btn10 = new JButton("*");
        btn10.addActionListener(a -> {
            sign = "*";
            num1 = Integer.parseInt(textField.getText().trim());
            textField.setText("");
        });
        JButton btn4 = new JButton("4");
        btn4.addActionListener(a -> {
            textField.setText(textField.getText() + "4");
        });
        JButton btn5 = new JButton("5");
        btn5.addActionListener(a -> {
            textField.setText(textField.getText() + "5");
        });
        JButton btn6 = new JButton("6");
        btn6.addActionListener(a -> {
            textField.setText(textField.getText() + "6");
        });
        JButton btn11 = new JButton("-");
        btn11.addActionListener(a -> {
            sign = "-";
            num1 = Integer.parseInt(textField.getText().trim());
            textField.setText("");
        });
        JButton btn7 = new JButton("7");
        btn7.addActionListener(a -> {
            textField.setText(textField.getText() + "7");
        });
        JButton btn8 = new JButton("8");
        btn8.addActionListener(a -> {
            textField.setText(textField.getText() + "8");
        });
        JButton btn9 = new JButton("9");
        btn9.addActionListener(a -> {
            textField.setText(textField.getText() + "9");
        });
        JButton btn12 = new JButton("+");
        btn12.addActionListener(a -> {
            sign = "+";
            num1 = Integer.parseInt(textField.getText().trim());
            textField.setText("");
        });
        JButton btn14 = new JButton("С");
        btn14.addActionListener(a -> {
            num1 = 0;
            sign = "";
            textField.setText("");
        });
        JButton btn15 = new JButton("0");
        btn15.addActionListener(a -> {
            textField.setText(textField.getText() + "0");
        });
        JButton btn16 = new JButton("=");
        btn16.addActionListener(a -> {
            switch (sign){
                case "-" -> textField.setText(num1 + "-" + Integer.parseInt(textField.getText().trim()) + "=" + (num1 - Integer.parseInt(textField.getText().trim())));
                case "*" -> textField.setText(num1 + "*" + Integer.parseInt(textField.getText().trim()) + "=" + (num1 * Integer.parseInt(textField.getText().trim())));
                case "/" -> textField.setText(num1 + "/" + Integer.parseInt(textField.getText().trim()) + "=" + (num1 / Integer.parseInt(textField.getText().trim())));
                case "+" -> textField.setText(num1 + "+" + Integer.parseInt(textField.getText().trim()) + "=" + (num1 + Integer.parseInt(textField.getText().trim())));
            }
        });
        JButton btn13 = new JButton("/");
        btn13.addActionListener(a -> {
            sign = "/";
            num1 = Integer.parseInt(textField.getText().trim());
            textField.setText("");
        });
        JButton btn17 = new JButton("square");
        btn17.addActionListener(a -> {
            sign = "square";
            num1 = Integer.parseInt(textField.getText().trim());
            textField.setText(num1 + "*" + num1 + "=" + (num1 * num1));
        });;

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 25));
        buttonPanel.add(btn1);
        btn1.setBackground(Color.WHITE);
        buttonPanel.add(btn2);
        btn2.setBackground(Color.WHITE);
        buttonPanel.add(btn3);
        btn3.setBackground(Color.WHITE);
        buttonPanel.add(btn10);
        btn10.setBackground(Color.GRAY);
        buttonPanel.add(btn4);
        btn4.setBackground(Color.WHITE);
        buttonPanel.add(btn5);
        btn5.setBackground(Color.WHITE);
        buttonPanel.add(btn6);
        btn6.setBackground(Color.WHITE);
        buttonPanel.add(btn11);
        btn11.setBackground(Color.GRAY);
        buttonPanel.add(btn7);
        btn7.setBackground(Color.WHITE);
        buttonPanel.add(btn8);
        btn8.setBackground(Color.WHITE);
        buttonPanel.add(btn9);
        btn9.setBackground(Color.WHITE);
        buttonPanel.add(btn12);
        btn12.setBackground(Color.GRAY);
        buttonPanel.add(btn14);
        btn14.setBackground(Color.LIGHT_GRAY);
        buttonPanel.add(btn15);
        btn15.setBackground(Color.WHITE);
        buttonPanel.add(btn16);
        btn16.setBackground(Color.PINK);
        buttonPanel.add(btn13);
        btn13.setBackground(Color.GRAY);
        buttonPanel.add(btn17);
        btn17.setBackground(Color.darkGray);

        frameObj.setLayout(new BorderLayout());

        frameObj.add(textField, BorderLayout.NORTH);
        frameObj.add(buttonPanel, BorderLayout.CENTER);

        frameObj.setSize(300, 400);
        frameObj.setVisible(true);
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new GridLayoutExample1();
    }
}