
import javax.swing.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField input1;
    private JTextField input2;
    private JTextField result;
    private Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();
        setTitle("Calculadora");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Input 1:");
        label1.setBounds(50, 30, 100, 30);
        add(label1);

        input1 = new JTextField();
        input1.setBounds(150, 30, 200, 30);
        add(input1);

        JLabel label2 = new JLabel("Input 2:");
        label2.setBounds(50, 70, 100, 30);
        add(label2);

        input2 = new JTextField();
        input2.setBounds(150, 70, 200, 30);
        add(input2);

        JLabel label3 = new JLabel("Result:");
        label3.setBounds(50, 110, 100, 30);
        add(label3);

        result = new JTextField();
        result.setBounds(150, 110, 200, 30);
        result.setEditable(false);
        add(result);

        JButton addButton = new JButton("+");
        addButton.setBounds(50, 150, 50, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double res = calculator.add(a, b);
                result.setText(String.format("%.2f", res));
            }
        });
        add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(110, 150, 50, 30);
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double res = calculator.subtract(a, b);
                result.setText(String.format("%.2f", res));
            }
        });
        add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(170, 150, 50, 30);
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double res = calculator.multiply(a, b);
                result.setText(String.format("%.2f", res));
            }
        });
        add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(230, 150, 50, 30);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                try {
                    double res = calculator.divide(a, b);
                    result.setText(String.format("%.2f", res));
                } catch (ArithmeticException ex) {
                    result.setText("Error");
                }
            }
        });
        add(divideButton);

        JButton sqrtButton = new JButton("√");
        sqrtButton.setBounds(50, 190, 50, 30);
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double res = calculator.sqrt(a);
                result.setText(String.format("%.2f", res));
            }
        });
        add(sqrtButton);

        JButton powerButton = new JButton("^");
        powerButton.setBounds(110, 190, 50, 30);
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double res = calculator.power(a, b);
                result.setText(String.format("%.2f", res));
            }
        });
        add(powerButton);

        JButton sinButton = new JButton("sin");
        sinButton.setBounds(170, 190, 60, 30);
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double res = calculator.sin(a);
                result.setText(String.format("%.2f", res));
            }
        });
        add(sinButton);

        JButton cosButton = new JButton("cos");
        cosButton.setBounds(240, 190, 60, 30);
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double res = calculator.cos(a);
                result.setText(String.format("%.2f", res));
            }
        });
        add(cosButton);

        JButton tanButton = new JButton("tan");
        tanButton.setBounds(310, 190, 60, 30);
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(input1.getText());
                double res = calculator.tan(a);
                result.setText(String.format("%.2f", res));
            }
        });
        add(tanButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
